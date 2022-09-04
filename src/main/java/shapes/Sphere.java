package shapes;

import lombok.Getter;

@Getter
public class Sphere extends ThreeDimensionalShape {
    private final double R;

    public Sphere(String name, double r) {
        super(name);
        R = r;
    }

    @Override
    public double countVolume() {
        return (4 * Math.PI * Math.pow(R, 3)) / 3;
    }
}
