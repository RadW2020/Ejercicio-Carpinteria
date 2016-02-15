package carpinteria;

public class Busca {
    
    /**
     * Devuelve el coste de fabricación de un producto dado
     * su numero id. Si el id está fuera de rango devuelve -1
     * 
     * @param vector
     * @param id
     * @return el coste de fabricación del producto
     */
    public static double Busca (Carpinteria [] vector, int id){
      
        double sol = -1;
        for(Carpinteria cosa : vector){
            if (cosa instanceof Mesa){
                Mesa esMesa = (Mesa) cosa; //Casting
                if (esMesa.getId_producto() == id){
                    sol = esMesa.Coste_Fabricacion();
                }
            }else if (cosa instanceof Estanteria){
                Estanteria esUnaEstanteria = (Estanteria) cosa; //Casting
                if (esUnaEstanteria.getId_producto() == id){
                    sol = esUnaEstanteria.Coste_Fabricacion();
                }
            }else if (cosa instanceof Armario){
                Armario esArmario = (Armario) cosa; //Casting
                if (esArmario.getId_producto() == id){
                    sol = esArmario.Coste_Fabricacion();
                }
            } else {  sol = -1; }
        }
        return sol;
    }
    

}
