package printers;

import shapes.Shape;

import java.util.List;

public class ShapePrinter implements Printer {
    @Override
    public void print(Shape shape) {
        shape.printName();
    }

    @Override
    public void printAll(List<? extends Shape> list) {
        list.forEach(Shape::printName);
    }
}
