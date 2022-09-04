package shapes;

import lombok.Getter;

@Getter
public class Rectangle extends TwoDimensionalShape {
    private final double a;
    private final double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double countArea() {
        return a * b;
    }
}
