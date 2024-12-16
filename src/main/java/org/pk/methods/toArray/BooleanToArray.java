package org.pk.methods.toArray;

import java.util.Arrays;
import java.util.List;

public class BooleanToArray {
    public static void main(String[] args) {
        List<Boolean> list = Arrays.asList(true, false, true);
        Boolean[] arr = list.toArray(new Boolean[0]);
        System.out.println("To convert"+Arrays.toString(arr));
    }
}
