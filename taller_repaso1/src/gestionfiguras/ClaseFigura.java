package gestionfiguras;

public abstract class ClaseFigura {
    public String color;

    public ClaseFigura(String color) {
        color = color;
    }

    public String getcolor() {
        return color;
    }

    public abstract float area();

}
