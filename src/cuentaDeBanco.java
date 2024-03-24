public class cuentaDeBanco {
    private  Integer ID;
    private String name;
    private double balance;

    public cuentaDeBanco(Integer ID, String name, double balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }
    public void setBalance(double balance) {
        this.balance=balance;

    }
    public double credito(Integer deposito){
        this.balance+=deposito;
        return balance;
    }
    public double debito(Integer sustraccion){
        if(sustraccion>balance){
            System.out.println("el importe a retirar es superior al disponible");
        }
        else{
            this.balance-=sustraccion;
        }
        return balance;
    }
    public void getCaracteristicas(cuentaDeBanco a){
        System.out.println("Cuenta bancaria: ID: "+a.ID+" nombre: "+ a.name+" Balance: "+a.balance);
    }

    public double getBalance() {

        return balance;
    }


}
