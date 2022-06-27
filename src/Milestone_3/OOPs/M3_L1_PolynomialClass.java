package Milestone_3.OOPs;

class Polynomial {
    Array poly = new Array();

    // public Polynomial() {
    // Array poly = new Array();
    // }

    public void setCoefficient(int i, int n) {
        poly.set(i, n);
    }

    public void print() {
        for (int i = 0; i < poly.size(); i++) {
            if (poly.get(i) != 0) {
                System.out.print(poly.get(i) + "x^" + i + " + ");
            }
        }
    }

    public Polynomial add(Polynomial p) {
        Polynomial ans = new Polynomial();
        int n = Math.max(this.poly.size(), p.poly.size());
        for (int i = 0; i < n; i++) {
            System.out.println(this.poly.get(i) + " + " + p.poly.get(i));
            ans.poly.set(i, this.poly.get(i) + p.poly.get(i));
        }
        return ans;
    }

    public Polynomial subtract(Polynomial p) {
        Polynomial ans = new Polynomial();
        int n = Math.max(this.poly.size(), p.poly.size());
        for (int i = 0; i < n; i++) {
            ans.poly.set(i, this.poly.get(i) - p.poly.get(i));
        }
        return ans;
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial ans = new Polynomial();
        // int n = Math.max(this.poly.size(), p.poly.size());
        for (int i = 0; i < this.poly.size(); i++) {
            if (this.poly.get(i) != 0) {

                for (int j = 0; j < p.poly.size(); j++) {
                    if (p.poly.get(j) != 0) {
                        ans.poly.addAtIndex(i + j, this.poly.get(i) * p.poly.get(j));
                    }
                }

            }
        }

        return ans;
    }

}

public class M3_L1_PolynomialClass {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(3, 1);
        p1.setCoefficient(1, 2);
        // p1.setCoefficient(7, 3);

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(2, 7);
        p2.setCoefficient(1, 8);

        // p1.poly.print();
        // System.out.println();
        // p2.poly.print();
        // System.out.println();

        // Polynomial p3 = p1.add(p2);
        // p3.print();

        // Polynomial p4 = p1.subtract(p2);
        // p4.print();

        Polynomial p5 = p1.multiply(p2);
        p5.print();

    }
}
