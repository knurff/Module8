package printers;

import shapes.Shape;

import java.util.List;

public interface Printer {
    void print(Shape shape);
    void printAll(List<? extends Shape> list);
}
