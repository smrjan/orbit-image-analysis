/**
 *
 * Copyright (c) 2009-2014 Freedomotic team
 * http://freedomotic.com
 *
 * This file is part of Freedomotic
 *
 * This Program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This Program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Freedomotic; see the file COPYING.  If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.freedomotic.util.SerialClone;

/**
 * Creates a deep copy of an object leveragin Java serialization. Don't use it
 * unless you know what you are doing and Java serialization implications.
 * Referer to the author website for more info
 * http://weblogs.java.net/blog/2007/04/04/cloning-java-objects-using-serialization
 * All credits goes to the original author of this code.
 *
 * @author http://weblogs.java.net/blog/2007/04/04/cloning-java-objects-using-serialization
 */
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class SerialClone {
    public static <T> T clone(T x) {
        try {
            return cloneX(x);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static <T> T cloneX(T x) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        CloneOutput cout = new CloneOutput(bout);
        cout.writeObject(x);
        byte[] bytes = bout.toByteArray();

        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        CloneInput cin = new CloneInput(bin, cout);

        @SuppressWarnings("unchecked")
        T clone = (T) cin.readObject();
        return clone;
    }

    private static class CloneOutput extends ObjectOutputStream {
        Queue<Class<?>> classQueue = new LinkedList<Class<?>>();

        CloneOutput(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void annotateClass(Class<?> c) {
            classQueue.add(c);
        }

        @Override
        protected void annotateProxyClass(Class<?> c) {
            classQueue.add(c);
        }
    }

    private static class CloneInput extends ObjectInputStream {
        private final CloneOutput output;

        CloneInput(InputStream in, CloneOutput output) throws IOException {
            super(in);
            this.output = output;
        }

        @Override
        protected Class<?> resolveClass(ObjectStreamClass osc)
                throws IOException, ClassNotFoundException {
            Class<?> c = output.classQueue.poll();
            String expected = osc.getName();
            String found = (c == null) ? null : c.getName();
            if (!expected.equals(found)) {
                throw new InvalidClassException("Classes desynchronized: " +
                        "found " + found + " when expecting " + expected);
            }
            return c;
        }

        @Override
        protected Class<?> resolveProxyClass(String[] interfaceNames)
                throws IOException, ClassNotFoundException {
            return output.classQueue.poll();
        }
    }
}