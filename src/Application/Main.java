package Application;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Enuns.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + "data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char x = scan.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scan.next());

            if(x == 'r') {
                System.out.print("Width: ");
                double w = scan.nextDouble();
                System.out.print("Height: ");
                double h = scan.nextDouble();
                list.add(new Rectangle(color, w, h));
            } else if (x == 'c') {
                System.out.print("Radius: ");
                double r = scan.nextDouble();
                list.add(new Circle(color, r));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : list) {
            System.out.printf("%.2f\n", shape.area());
        }
        scan.close();
    }
}
