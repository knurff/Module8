package shapes;

import lombok.Getter;


@Getter
public class Circle extends TwoDimensionalShape {
    private final double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double countArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
