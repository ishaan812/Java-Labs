import java.util.*;

class Complex {
    double realPart, imaginaryPart;

    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}

class ComplexDemo {
    public static void main(String[] args) {
        double a, b;
        Scanner s = new Scanner(System.in);
        Complex c = new Complex();
        Complex z = new Complex(24, 12.8);
        System.out.println("Initial Real Part: " + c.getRealPart());
        System.out.println("Initial Imaginary Part: " + c.getImaginaryPart());
        System.out.println("Complex number: " + c.getRealPart() + " + " + c.getImaginaryPart() + " i");
        System.out.println("For Complex number Z : " + z.getRealPart() + " + " + z.getImaginaryPart() + " i");
        System.out.println("Enter new Real Part: ");
        a = s.nextDouble();
        System.out.println("Enter new Imaginary Part: ");
        b = s.nextDouble();
        c.setRealPart(a);
        c.setImaginaryPart(b);
        System.out.println("New Real Part: " + c.getRealPart());
        System.out.println("New Imaginary Part: " + c.getImaginaryPart());
        System.out.println("New Complex number: " + c.getRealPart() + " + " + c.getImaginaryPart() + " i");
        s.close();
    }
}