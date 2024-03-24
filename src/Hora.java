////Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
//        //Tenga en cuenta el rango de valores aceptados para cada uno de estos.
//        //a. Hora: 0 … 23
//        //b. Minuto: 0 … 59
//        //c. Segundo: 0 … 59
//        //Considere el siguiente comportamiento:
//        //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
//        //usando zero a la izquierda ejemplo 13:04:22 .
//        //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
//        //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
//        //4. Instanciar el objeto y probar los métodos creados

public class Hora {
    private Integer hora;
    private Integer minuto;
    private Integer segundo;

    public Hora(Integer hora, Integer minuto, Integer segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setHora(Integer hora) {
            this.hora = hora;
    }

    public void setMinuto(Integer minuto) {
            this.minuto = minuto;
    }

    public void setSegundoSumar(Hora h) {
        if(h.segundo==59){
            h.segundo=0;
            h.minuto+=1;
            if(h.minuto>59) {
                h.minuto=0;
                h.hora++;
                if(h.hora>23){
                h.hora=0;
                }
            }
        }else{
            this.segundo = h.segundo+1;
        }

    }

    public void setSegundoRestar(Hora h){
        if(h.segundo==0){
            h.segundo=59;
            h.minuto-=1;
            if(h.minuto<0) {
                h.minuto=59;
                h.hora--;
                if(h.hora<0){
                    h.hora=23;
                }
            }
        }else{
            this.segundo = h.segundo-1;
        }
    }
    public void getHoraCompleta(Hora h){
        String hora=h.hora.toString(h.hora);
        String minuto = h.minuto.toString(h.minuto);
        String segundo= h.segundo.toString(h.segundo);

        if(h.hora<10){
            String hor= h.hora.toString(h.hora);
            hora= "0"+hor;
        }
        if(h.minuto<10){
            String min= h.minuto.toString(h.minuto);
            minuto="0"+min;
        }
        if(h.segundo<10){
            String seg= h.segundo.toString(h.segundo);
            segundo= "0"+seg;
        }

        System.out.println("HORA: "+hora+":"+minuto+":"+segundo);
    }
}
