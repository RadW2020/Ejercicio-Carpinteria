package carpinteria;
/**
 * @author 
 */
public class Mesa extends Producto_Carpinteria {

    private static int numero_mesas = 0;
    private boolean formica;
    
    public Mesa(String desc, Trabajador traba, int horas, double precio, boolean formica) {
        super(desc, traba, horas);
        
        setPrecio_material(precio);
        setFormica(formica); //booleano sobre is la mesa tiene formica o no
        numero_mesas++; //Levamos la cuenta de las mesas creadas
        
        double paga;
        paga = traba.getTotal_paga() + Mesa.this.paga_trabajador();
        traba.setTotal_paga(paga);
    }

    @Override
    double Coste_Producto() {
        double costeProd;
        if (this.formica = true){
            costeProd = Mesa.this.getPrecio_material() + 40;
        }else {
            costeProd = Mesa.this.getPrecio_material();
        }
        return costeProd;
    }
    
    @Override
    public double paga_trabajador() {
        double paga;
        paga = (Mesa.this.getHoras_trabajadas() * 15 );
        return paga;
    }

    public int getNumero_mesas() {
        return numero_mesas;
    }
    
    public boolean isFormica() {
        return formica;
    }

    private void setFormica(boolean formica) {
        this.formica = formica;
    }
}
