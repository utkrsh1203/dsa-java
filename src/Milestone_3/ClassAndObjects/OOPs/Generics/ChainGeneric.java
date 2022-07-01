package Milestone_3.ClassAndObjects.OOPs.Generics;

public class ChainGeneric {

    public static void main(String[] args) {
        Pair<Pair<Integer, Integer>, String> p = new Pair<>();
        Pair<Integer, Integer> pInner = new Pair<>(3, 4);
        p.setSecond("ab");
        p.setFirst(pInner);

        System.out.println(p.getFirst().getFirst() + " " + p.getSecond());
    }

}
