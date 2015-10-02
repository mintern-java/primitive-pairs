/*
 * Brandon Mintern licenses this file to You under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package net.mintern.primitive.pair;

import java.io.Serializable;
import org.apache.commons.lang3.tuple.Pair;

/**
 * A primitive pair is a {@link Pair} that contains one or two primitive elements. Implementers of
 * this interface are modeled on the Apache Commons {@code Pair}s, but they allow the user to avoid
 * the penalty associated with boxing a primitive value into its corresponding {@code Number}.
 *
 * @param <L> the left element type, or its boxed type if the left element is a primitive
 * @param <R> the right element's boxed type
 * @author Brandon Mintern
 */
public interface PrimitivePair<L, R> extends Serializable {

    /**
     * Obtains the pair that results from converting the left and right elements to their boxed
     * counterparts. This allows primitive pairs to be used in contexts that expect an Apache
     * Commons pair.
     * <p>
     * Implementers will generally override this to return a pair whose mutability matches their
     * own, either an {@link org.apache.commons.lang3.tuple.ImmutablePair} or a
     * {@link org.apache.commons.lang3.tuple.MutablePair}.
     *
     * @return a new pair of boxed elements
     */
    Pair<L, R> boxed();
}
