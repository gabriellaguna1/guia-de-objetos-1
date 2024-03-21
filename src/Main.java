

public class Main {
    public static void main(String[] args) {
        //region EJERCICIO 1
        //. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        Rectangulo r= new Rectangulo();
        // Imprimir por pantalla el alto y ancho.

        System.out.println("alto: "+ r.getAlto());
        System.out.println("ancho: "+ r.getAncho());

        //Imprimir por pantalla el área y perímetro.
        System.out.println("area: "+ r.getArea(r.getAncho(), r.getAlto()));
        System.out.println("perimetro: "+ r.getPerimetro(r.getAncho(),r.getAlto()));

        //Modificar el alto y el ancho de la instancia.
        r.setAlto(2);
        r.setAncho(5);

        //Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println("nuevo perimetro: "+ r.getPerimetro(r.getAncho(), r.getAlto()));
        System.out.println("nueva area: "+ r.getArea(r.getAncho(), r.getAlto()));

        Rectangulo r1= new Rectangulo();

        //endregion


    }
}