public class Rectangulo {
    private float ancho;
    private float alto;

    public Rectangulo(){
        alto= 1;
        ancho= 1;
    }
    public float getAncho() {
        return ancho;
    }
    public float getAlto() {
        return alto;
    }
    public float getArea(float ancho, float alto ){
        return ancho * alto;
    }
    public float getPerimetro(float ancho, float alto){
        return(2*ancho)+(2*alto);
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

}
