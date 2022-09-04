package shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Shape {
    protected String name;

    public void printName() {
        System.out.println(name);
    }
}

