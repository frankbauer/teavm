/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.classlib.java.util;

import org.teavm.classlib.java.util.function.TConsumer;
import org.teavm.classlib.java.util.function.TUnaryOperator;

public interface TList<E> extends TCollection<E> {
    boolean addAll(int index, TCollection<? extends E> c);

    E get(int index);

    E set(int index, E element);

    void add(int index, E element);

    E remove(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    TListIterator<E> listIterator();

    TListIterator<E> listIterator(int index);

    TList<E> subList(int fromIndex, int toIndex);

    default void replaceAll(TUnaryOperator<E> operator) {
        TListIterator<E> iter = listIterator();
        while (iter.hasNext()) {
            iter.set(operator.apply(iter.next()));
        }
    }

    default void forEach(TConsumer<? super E> action) {
        TListIterator<E> iter = listIterator();
        while (iter.hasNext()) {
            action.accept(iter.next());
        }
    }

    default void sort(TComparator<? super E> c) {
        TCollections.sort(this, c);
    }
}
