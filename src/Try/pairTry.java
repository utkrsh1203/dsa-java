package Try;

import java.util.HashSet;

import java.util.*;
import javafx.util.Pair;

class Pair {
    int i;
    String s;

    Pair(int i, String s) {
        this.i = i;
        this.s = s;
    }
}

public class pairTry {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        HashSet<Pair> hs = new HashSet<>();
        hs.add(new Pair(0, "Hello"));
        hs.add(new Pair(0, "Hello"));
        // hs.add(new Pair<Integer,String>(0,"Hello"));
        Pair<Integer, String> p = new Pair<Integer, String>(10, "Hello Geeks!");
        System.out.println(hs);
        System.out.println(p);
    }
}
