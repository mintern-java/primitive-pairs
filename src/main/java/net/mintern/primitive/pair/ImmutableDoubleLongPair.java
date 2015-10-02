/*
 * Derived from code that was licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with Apache Commons Lang 3 for
 * additional information regarding copyright ownership.
 *
 * Brandon Mintern and the ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.  You may obtain a
 * copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package net.mintern.primitive.pair;

import org.apache.commons.lang3.tuple.ImmutablePair;

/**
 * An immutable pair consisting of a {@code double} element and a {@code long} element, providing a
 * version of {@link org.apache.commons.lang3.tuple.ImmutablePair} that avoids unnecessary
 * {@code Double} and {@code Long} boxing.
 * <p>
 * The class is {@code final}, so a subclass cannot add undesirable behavior.
 * <p>
 * #ThreadSafe#
 *
 * @author Brandon Mintern
 */
public class ImmutableDoubleLongPair extends DoubleLongPair {

    private static final long serialVersionUID = 1;

    /**
     * Obtains an immutable pair of the given {@code double} and {@code long} values.
     *
     * @param left  the left element
     * @param right  the right element
     * @return a pair formed from the two parameters, not null
     */
    public static ImmutableDoubleLongPair of(double left, long right) {
        return new ImmutableDoubleLongPair(left, right);
    }

    public final double left;
    public final long right;

    /**
     * Create a new pair instance.
     *
     * @param left  the left value
     * @param right  the right value
     */
    public ImmutableDoubleLongPair(double left, long right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double getLeft() {
        return left;
    }

    @Override
    public long getRight() {
        return right;
    }

    @Override
    public ImmutablePair<Double, Long> boxed() {
        return new ImmutablePair<>(left, right);
    }
}
