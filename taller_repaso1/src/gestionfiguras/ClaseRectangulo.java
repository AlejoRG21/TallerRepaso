package gestionfiguras;
public class ClaseRectangulo extends ClaseFigura {
    private float base, altura;

    public ClaseRectangulo(float base, float altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return base * altura;
    }
}