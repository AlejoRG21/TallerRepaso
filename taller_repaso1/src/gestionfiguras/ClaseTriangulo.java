package gestionfiguras;

public class ClaseTriangulo extends ClaseFigura {
    private float base, altura;

    public ClaseTriangulo(float base, float altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public float area() {
        return (base * altura) / 2;
    }
}
