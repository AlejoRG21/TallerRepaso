package gestionfiguras;

public class ClaseTriangulo extends ClaseFigura implements interface_figura{
    private float base, altura;

    public ClaseTriangulo(float base, float altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public float area() {
        return (base * altura) / 2;
    }
    @Override
    public void autor(){
        System.out.println("Autor: Alejandro Rivera");
    }

    @Override
    public int valor() {
        return (int)(base + altura);    }

    @Override
    public String descripcion() {
        return "Triángulo de base " + base + " y altura " + altura;
    }

    @Override
    public int numLados() {
        return 3;
    }


}
