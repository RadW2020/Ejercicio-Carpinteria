package carpinteria;
/**
 * @author 
 */
public class Montaje implements Carpinteria{

    private final Producto_Carpinteria producto; //Definimos objetos de otras clases
    private Trabajador trabajador;
    
    private int horas_trabajadas;//Definimos variables de clase
    private static int numero_montajes = 0;
    private String direccion;
    /**
     * Clase Montaje 
     * @param producto
     * @param trabajador
     * @param horas_trabajadas
     * @param direccion 
     */
    public Montaje(Producto_Carpinteria producto, Trabajador trabajador
                    , int horas_trabajadas, String direccion) {
        this.producto = producto;
        this.trabajador = trabajador;
        this.horas_trabajadas = horas_trabajadas;
        this.direccion = direccion;
        numero_montajes++; //aumenta en uno cada vez que se isntancia un montaje
        
        double horas = trabajador.getTotal_paga() + Montaje.this.paga_trabajador();
        trabajador.setTotal_paga(horas);//total_paga += Montaje.this.paga_trabajador();//la paga total aumenta con cada montaje
    }

    @Override
    public double paga_trabajador() {
        double paga;
        paga = (Montaje.this.horas_trabajadas * 10) + 10;
        return paga;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getNumero_montajes() {
        return numero_montajes;
    }

    public void setNumero_montajes(int numero_montajes) {
        this.numero_montajes = numero_montajes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
