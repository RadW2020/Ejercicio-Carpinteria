package carpinteria;

/**
 * @author 
 */
public abstract class Producto_Carpinteria implements Carpinteria{
    
    private String descripcion; //descripcion del producto
    private int horas_trabajadas; //horas trabajadas en cada producto
    private static int numero_de_articulos = 0; //conteo de muebles fabricados
    
    private int id_producto; //número de id de cada producto
    private double precio_material; //precio de los materiales
    //
    private Trabajador trabajador;
    
    protected double Coste_Fabricacion(){
        double costeFab;
        costeFab = Producto_Carpinteria.this.Coste_Producto() 
                +  Producto_Carpinteria.this.paga_trabajador();
        return costeFab;
    };
    
    abstract double Coste_Producto();
    /**
     * Metodo abstracto de los productos construidos en la carpinteria
     * @param desc
     * @param traba
     * @param horas 
     */
    public Producto_Carpinteria(String desc, Trabajador traba, int horas){
        this.horas_trabajadas = horas;
        this.descripcion = desc;
        this.trabajador = traba;
        
        this.numero_de_articulos++;
        //añadimos el valor a id_producto
        this.setId_producto(getNumero_de_articulos());
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    private int getNumero_de_articulos() {
        return numero_de_articulos;
    }

    public void setNumero_de_articulos(int numero_de_articulos) {
        this.numero_de_articulos = numero_de_articulos;
    }

    public int getId_producto() {
        return id_producto;
    }

    public final void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrecio_material() {
        return precio_material;
    }

    public void setPrecio_material(double precio_material) {
        this.precio_material = precio_material;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

}
