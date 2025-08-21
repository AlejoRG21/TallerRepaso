package gestionfiguras;

public class ClaseCirculo extends ClaseFigura implements interface_figura{
    private float radio;

    public ClaseCirculo(float radio, String color) {
        super(color);
        this.radio = radio;
    }

    public float area() {
        return (float) Math.PI * radio * radio;
    }

    @Override
    public void autor() {
        System.out.println("Autor: Alejandro Rivera");
    }

    @Override
    public int valor() {
        return (int)radio;
    }

    @Override
    public String descripcion() {
        return "Círculo con radio " + radio;
    }

    @Override
    public int numLados() {
        return 0;
    }
}