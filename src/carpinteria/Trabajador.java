package carpinteria;

/**
 * @author 
 */
public class Trabajador  {
    
    private String nombre;// Nombre del trabajador
    private String NIF;// nif del trabajador
    private double total_paga = 0;// Paga inicial del trabajador
    /**
     * Constructor de Trabajador
     * @param nombre
     * @param NIF 
     */
    public Trabajador(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }
    /**
     * Metodo GET nombre del trabajador
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo SET nombre del trabajador
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo GET del nif del trabajador
     * @return nif del trabajador
     */
    public String getNIF() {
        return NIF;
    }
    /**
     * Metodo SET del nif del trabajador
     * @param NIF 
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    /**
     * Metodo GET de la paga total acumulada del trabajador
     * @return 
     */
    public double getTotal_paga() {
        return total_paga;
    }
    /**
     * Metodo SET de la paga total acumulada del trabajador
     * @param total_paga 
     */
    public void setTotal_paga(double total_paga) {
        this.total_paga = total_paga;
    }
    
}
