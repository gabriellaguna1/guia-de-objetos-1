public class ItemDeVenta {

    private Integer identificador;
    private String descripcion;
    private Integer cantidad;
    private float precioUnitario;

    public ItemDeVenta(Integer identificador, String descripcion, Integer cantidad, float precioUnitario){
        this.identificador=identificador;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }
    public float getPrecioTotal(Integer cantidad, float precioUnitario){
        return cantidad*precioUnitario;
    }
    public void mostrarItem(ItemDeVenta e){
        System.out.println("Item Venta [ID: "+e.identificador+", descripcion: "+e.descripcion+", cantidad: "+e.cantidad+" precio unitario: "+e.precioUnitario+ ", total: "+getPrecioTotal(e.cantidad,e.precioUnitario));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }
}
