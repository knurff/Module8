package shapes;

import lombok.Getter;

@Getter
public class Parallelepiped extends ThreeDimensionalShape {
    private final double h;
    private final Rectangle rectangle;

    public Parallelepiped(String name, double h, Rectangle rectangle) {
        super(name);
        this.h = h;
        this.rectangle = rectangle;
    }

    @Override
    public double countVolume() {
        return rectangle.countArea() * h;
    }
}
