import printers.Printer;
import printers.ShapePrinter;
import shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("circle", 5));
        shapes.add(new Parallelepiped("parallelepiped", 5, new Rectangle("rectangle", 4, 7.5)));
        shapes.add(new Rectangle("rectangle", 4, 7.5));
        shapes.add(new Sphere("sphere", 7));
        shapes.add(new Triangle("triangle", 4, 5, 7));
        Printer printer = new ShapePrinter();
        printer.printAll(shapes);
    }
}
