package sap.generics;

import java.util.Collection;

public class GenericMethods {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }
}
