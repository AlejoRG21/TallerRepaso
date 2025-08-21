package gestionfiguras;
public class ClaseRectangulo extends ClaseFigura implements interface_figura {
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

    @Override
    public void autor() {
        System.out.println("Autor: Alejandro Rivera");
    }

    @Override
    public int valor() {
        return (int)(base + altura);    }

    @Override
    public String descripcion() {
        return "Rectángulo de base " + base + " y altura " + altura;
    }

    @Override
    public int numLados() {
        return 4;
    }
}