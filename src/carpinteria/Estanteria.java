package carpinteria;

/**
 * @author 
 */
public class Estanteria extends Producto_Carpinteria {
    
    private static int numero_estanterias = 0;
    private int numero_patas;

    public Estanteria(String desc, Trabajador traba, int horas, double precio, int patas ) {
        super(desc, traba, horas);
        
        setNumero_patas(patas);
        setPrecio_material(precio);
        numero_estanterias++; // Llevamos la cuenta de la estanterías creadas

        double paga;
        paga = traba.getTotal_paga() + Estanteria.this.paga_trabajador();
        traba.setTotal_paga(paga);
    }

    @Override
    public double paga_trabajador() {
        double paga;
        paga = (Estanteria.this.getHoras_trabajadas() * 15 );
        return paga;
    }

    @Override
    double Coste_Producto() {
        double costeProd;
        costeProd = Estanteria.this.getPrecio_material()
                + (Estanteria.this.numero_patas * 10);
        return costeProd;
    }
    
    public int getNumero_estanterias() {
        return numero_estanterias;
    }

    public void setNumero_estanterias(int numero_estanterias) {
        this.numero_estanterias = numero_estanterias;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    private void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }
    
}
