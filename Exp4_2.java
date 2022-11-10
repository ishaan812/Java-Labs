import java.util.*;

interface Area {
    public void area();
}

class Circle implements Area {
    int r;
    Scanner s = new Scanner(System.in);

    public void area() {
        System.out.println("Enter the radius of Circle : ");
        r = s.nextInt();
        System.out.println("Area is " + (3.14f * r * r));
    }
}

class Triangle implements Area {
    int b, h;
    Scanner s = new Scanner(System.in);

    public void area() {
        System.out.println("Enter the Breadth : ");
        b = s.nextInt();
        System.out.println("Enter the Height : ");
        h = s.nextInt();
        System.out.println("Area is " + (0.5f * b * h));
    }
}

class Square implements Area {
    int a;
    Scanner s = new Scanner(System.in);

    public void area() {
        System.out.println("Enter the Length of Side of Square : ");
        a = s.nextInt();
        System.out.println("Area is " + (a * a));
    }
}

class Calculate {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        Triangle t = new Triangle();
        t.area();
        Square s = new Square();
        s.area();
    }
}
