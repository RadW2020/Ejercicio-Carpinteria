package carpinteria;

/**
 * @author Raúl Jiménez Martín
 */
public class Muestra {
    /**
     * Coste de la mano de obra de cada uno de las montajes o 
     * Trabajos guardados en el vector
     * @param vector 
     */
    public static void Muestra (Carpinteria [] vector){
        System.out.println("Coste de mano de obra");
        for(Carpinteria cosa : vector){
            System.out.printf( "%-10S  %2.1f €\n" , 
                    cosa.getClass().getSimpleName(),
                    cosa.paga_trabajador());
        }
    }

}
