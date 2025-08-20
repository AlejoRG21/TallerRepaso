package gestionfiguras;

public class ClaseCirculo extends ClaseFigura {
    private float radio;

    public ClaseCirculo(float radio, String color) {
        super(color);
        this.radio = radio;
    }

    public float area() {
        return (float) Math.PI * radio * radio;
    }
}