package carpinteria;

/**
 * @author 
 */
public final class Armario extends Producto_Carpinteria{
    
    private static int numero_armarios = 0;
    private int numero_puertas = 0;
    
    public Armario(String desc, Trabajador traba, int horas, double precio, int numero_puertas ) {
        super(desc, traba, horas);
        
        setNumero_puertas( (byte) numero_puertas );
        setPrecio_material(precio);
        numero_armarios++;
        
        double paga;
        paga = traba.getTotal_paga() + Armario.this.paga_trabajador();
        traba.setTotal_paga(paga);// la paga total del trabajador aumenta con cada Armario que fabrica
        
    }
    @Override
    double Coste_Producto() {
        double costeProd;
        costeProd = Armario.this.getPrecio_material()
                + (Armario.this.numero_puertas * 20);
        return costeProd;
    }
    
    @Override
    public double paga_trabajador() {
        double paga;
        paga = (Armario.this.getHoras_trabajadas() * 15 ) + 10;
        return paga;
    }
    
    public int getNumero_armarios() {
        return numero_armarios;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(byte numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

}
