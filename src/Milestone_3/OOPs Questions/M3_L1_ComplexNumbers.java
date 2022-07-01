package Milestone_3.OOPs;

class ComplexNumbers {
    int real;
    int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }

    public void plus(ComplexNumbers c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void multiply(ComplexNumbers c) {
        int real = this.real;
        int imaginary = this.imaginary;
        this.real = real * c.real - imaginary * c.imaginary;
        this.imaginary = real * c.imaginary + imaginary * c.real;
    }

    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
        int real = c1.real + c2.real;
        int imaginary = c1.imaginary + c2.imaginary;

        ComplexNumbers c3 = new ComplexNumbers(real, imaginary);

        return c3;
    }
}

class M3_L1_ComplexNumbers {

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(4, 5);
        ComplexNumbers c2 = new ComplexNumbers(6, 7);

        c1.print();
        c2.print();
        ComplexNumbers c3 = ComplexNumbers.add(c1, c2);
        c3.print();

        // if (choice == 1) {
        // // Add
        // c1.plus(c2);
        // c1.print();
        // } else if (choice == 2) {
        // // Multiply
        // c1.multiply(c2);
        // c1.print();
        // } else {
        // return;
        // }
    }
}