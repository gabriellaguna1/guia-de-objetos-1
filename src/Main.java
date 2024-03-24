import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //region EJERCICIO 1
        //. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        /*
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
        System.out.println("altura de r1: "+ r1.getAlto());
        System.out.println("ancho de r1: "+r1.getAncho());
        */
        //endregion

        //region EJERCICIO 2
        //Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        //25000
        /*
        Empleado Carlos = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        //. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Empleado Ana = new Empleado(34234123, "Ana", "Sanchez", 27500);
        //Imprima ambos objetos por pantalla
        Carlos.getEmpleado(Carlos);
        Ana.getEmpleado(Ana);

        //Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        //salario anual del mismo.
        System.out.println("nuevo salario de carlos: "+Carlos.aumentoSalario(15));
        */
        ///endregion

        //region EJERCICIO 3
        //Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
        //descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
        //total teniendo en cuenta el precio unitario y cantidad. Un método que permita
        //imprimir por pantalla los atributos del objeto de la siguiente forma:
        //ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
        //a. Inicialice el objeto con los atributos necesarios
        //b. Imprima por pantalla el objeto inicializado.
        /*
        System.out.println("ingrese el ID de producto: ");
        Scanner sc = new Scanner(System.in);
        Integer ID= sc.nextInt();
        System.out.println("Ingrese descripcion del producto: ");
        Scanner st= new Scanner(System.in);
        String descripcion = st.nextLine();
        System.out.println("Ingrese cantidad: ");
        Integer cantidad= sc.nextInt();
        System.out.println("Ingrese precio unitario: ");
        float precioUnitario= sc.nextFloat(); ///consultar por qué cuando uso numeros con coma larga error.

        ItemDeVenta i= new ItemDeVenta(ID, descripcion, cantidad, precioUnitario);
        System.out.println("precio total de articulo "+i.getDescripcion()+": "+i.getPrecioTotal(i.getCantidad(), i.getPrecioUnitario()));
        i.mostrarItem(i);
        */
        //endregion

        //region EJERCICIO 4
        //4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
        //y balance. Considere los getters, setters y constructores necesarios. Tenga en
        //cuenta los siguientes métodos.
        //a. El método crédito que representa un depósito de dinero en la cuenta. Este
        //método debe devolver el balance luego de la operación.
        //b. El método débito que representa una sustracción de dinero de la cuenta.
        //Este método debe devolver el balance luego de la operación. Si el dinero en
        //la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
        //pantalla un aviso.
        //c. Un método que imprima por pantalla las características del objeto.
        //Realice las siguientes operaciones:
        //1. Inicialice una cuenta con un monto inicial de 15000.
        //2. Realice una operación de crédito de 2500.
        //3. Realice una operación de compra de 1500.
        //4. Realice una operación de compra de 30000.
        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
        //correcto.
        /*
        System.out.println("Ingrese el id de la cuenta: ");
        Scanner sc= new Scanner(System.in);
        Integer id=sc.nextInt();
        System.out.println("ingrese el nombre: ");
        Scanner sr= new Scanner(System.in);
        String name= sr.nextLine();
        System.out.println("su cuenta comenzara con $15.000");

        cuentaDeBanco cuenta=new cuentaDeBanco(id, name, 15000);

        System.out.println("ingresando un credito a la cuenta por $2.500");
        System.out.println("Su nuevo saldo: "+cuenta.credito(2500));

        System.out.println("ingrese el monto de su compra que sera descontada de su saldo: ");
        Integer compra= sc.nextInt();
        System.out.println("su nuevo saldo luego de la compra es: "+cuenta.debito(compra));
        System.out.println("aplicando nueva compra por $30.000...");
        System.out.println("nuevo saldo: "+cuenta.debito(30000));
        System.out.println("estado de cuenta final: ");
        cuenta.getCaracteristicas(cuenta);
        */
        //endregion

        //region EJERCICIO 5
        //Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
        //Tenga en cuenta el rango de valores aceptados para cada uno de estos.
        //a. Hora: 0 … 23
        //b. Minuto: 0 … 59
        //c. Segundo: 0 … 59
        //Considere el siguiente comportamiento:
        //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
        //usando zero a la izquierda ejemplo 13:04:22 .
        //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
        //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
        //4. Instanciar el objeto y probar los métodos creados
        /*
        System.out.println("ingrese la hora");
        Scanner sr= new Scanner(System.in);
        Integer hora = sr.nextInt();
        while(hora<0 || hora>23){
            System.out.println("hora incorrecta, rango 00 - 23");
            System.out.println("intente nuevamente");
            System.out.println("ingrese la hora");
            hora = sr.nextInt();
        }

        System.out.println("Ingrese los minutos");
        Integer minutos= sr.nextInt();
        while(minutos<0 || minutos>59){
            System.out.println("minutos incorrectos, rango 00 - 59");
            System.out.println("intente nuevamente");
            System.out.println("ingrese los minutos");
            minutos = sr.nextInt();
        }
        System.out.println("ingrese los segundos: ");
        Integer segundos = sr.nextInt();
        while(segundos<0 || segundos>59){
            System.out.println("segundos incorrectos, rango 00 - 59");
            System.out.println("intente nuevamente");
            System.out.println("ingrese los segundos");
            segundos = sr.nextInt();
        }


       Hora h= new Hora(hora, minutos,segundos);
       h.getHoraCompleta(h);

        System.out.println("sumando un segundo...");
        h.setSegundoSumar(h);
        System.out.println("nueva hora: ");
        h.getHoraCompleta(h);
        System.out.println("restando un segundo...");
        h.setSegundoRestar(h);
        System.out.println("nueva hora: ");
        h.getHoraCompleta(h);
        */
        //endregion

    }

}