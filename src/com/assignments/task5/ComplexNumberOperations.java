package com.assignments.task5;
import java.util.Scanner;

class ComplexNumberOperations {
    int real;
    int imaginary;

    ComplexNumberOperations(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumberOperations add(ComplexNumberOperations other) {
        return new ComplexNumberOperations(this.real + other.real, this.imaginary + other.imaginary);
    }

    ComplexNumberOperations subtract(ComplexNumberOperations other) {
        return new ComplexNumberOperations(this.real - other.real, this.imaginary - other.imaginary);
    }

    ComplexNumberOperations multiply(ComplexNumberOperations other) {
        int realPart = this.real * other.real - this.imaginary * other.imaginary;
        int imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumberOperations(realPart, imaginaryPart);
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Enter first complex number
        System.out.print("Enter real part of first complex number: ");
		int real1 = scanner.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
		int imaginary1 = scanner.nextInt();

        ComplexNumberOperations c1 = new ComplexNumberOperations(real1, imaginary1);

        // Enter second complex number
        System.out.print("Enter real part of second complex number: ");
		int real2 = scanner.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
		int imaginary2 = scanner.nextInt();

        ComplexNumberOperations c2 = new ComplexNumberOperations(real2, imaginary2);

        ComplexNumberOperations sum = c1.add(c2);
        ComplexNumberOperations difference = c1.subtract(c2);
        ComplexNumberOperations product = c1.multiply(c2);

        System.out.print("Sum = ");
        sum.display();

        System.out.print("Difference = ");
        difference.display();

        System.out.print("Product = ");
        product.display();

		scanner.close();
    }
}

