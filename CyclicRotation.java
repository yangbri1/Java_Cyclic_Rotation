import java.util.Scanner;

import java.util.stream.Collectors;
import java.util.stream.*;

import java.util.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CyclicRotation {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        
        // int[] ary = new int[];

        // create an ary w/ sample values
        // int[] ary = {3, 8, 9, 7, 6};
        // int[] ary = {0, 0, 0};
        int[] ary = {1, 2, 3, 4};

        // number of rotations
        int rotation = 3;

        // 'Arrays.toString()' method from java.util package to convert ary into readable 'String' rep
        // System.out.println(Arrays.toString(ary));
        String aryStr = Arrays.toString(ary);

        // ref. https://stackoverflow.com/questions/3064423/how-to-convert-an-array-to-a-set-in-java
        /* Java 8 Stream Approach */
        // Set<Integer> dupeCheck = Arrays.stream(ary).collect(Collectors.toSet());
        
        /* Pre-Java 9 Approach */
        // Set<Integer> set = new HashSet<>(Arrays.asList(ary));
        
        /* Java 9+ Immutable Set */

        // System.out.println((ary).length);

        // Set<int[]> duplicateCheck = Set.of(ary);

        /* Note: Accidentally create a Set of int[] type --- but since we only had 1 ary -> only 1 value was inserted -> .size() == 1 */
        // // System.out.println(duplicateCheck);
        // // Note: Odd how the .size() method is returning 1 ...
        // System.out.println(duplicateCheck.size());

        Set<Integer> duplicateCheck = new LinkedHashSet<>();
        
        for(int i = 0; i < ary.length; ++i){
            duplicateCheck.add(ary[i]);
        }

        if(duplicateCheck.size() == 1){
            System.out.println(aryStr);
        }

        else if(ary.length + 1 == rotation){
            System.out.println(aryStr);
        }

        else{
            int[] aryToEnd = Arrays.copyOf(ary, rotation);

            int[] aryToStart = Arrays.copyOfRange(ary, rotation - 1, ary.length);
            
            System.out.println(Arrays.toString(aryToEnd));
            System.out.println(Arrays.toString(aryToStart));
        }

    }
}
