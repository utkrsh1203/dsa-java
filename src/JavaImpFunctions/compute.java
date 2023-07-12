package JavaImpFunctions;

import java.util.*;

public class compute {

    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        temp.add(6);
        temp.add(8);
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        mp.put(2, temp);
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(6);
        temp.add(9);
        temp.add(12);
        mp.put(3, temp);
        System.out.println(mp);
        System.out.println();

        // get method can be used to change the values of already existing keys in the
        // map but cannot add any new value if the key does not exist before
        // Therefore we can use computeIfAbsent method to modify the key that may or may
        // not exist before

        System.out.println(mp.computeIfAbsent(4, k -> new ArrayList<>()).add(10));
        // mp.computeIfAbsent(2, k -> new ArrayList<>()).add(10);
        System.out.println(mp);

        // temp = mp.get(2).add(10);
        // System.out.println(temp);
    }
}
