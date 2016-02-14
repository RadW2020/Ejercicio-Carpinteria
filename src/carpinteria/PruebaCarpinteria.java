package carpinteria;

/**
 * @author 
 */
public class PruebaCarpinteria{
    /**
     * Clase Main
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Creamos tres trabajadores
        Trabajador operario1;
        Trabajador operario2;
        Trabajador operario3;
        
        operario1 = new Trabajador("Lola",   "1111111W");
        operario2 = new Trabajador("Pilar",  "2222222E");
        operario3 = new Trabajador("Manolo", "3333333R");
        
        // Cinco productos nuevos fabricados
        Producto_Carpinteria mueble1;
        Producto_Carpinteria mueble2;
        Producto_Carpinteria mueble3;
        Producto_Carpinteria mueble4;
        Producto_Carpinteria mueble5;
        
        mueble1 = new Estanteria("Estantería de Palisandro" , operario1, 8, 500, 4);
        mueble2 = new Armario("Armario de Cedro Libanés"    , operario2, 15, 1000, 2);
        mueble3 = new Mesa("Mesa de Arce Blanco"            , operario3, 5, 800, true);
        mueble4 = new Estanteria("Estantería de Caoba"      , operario2, 22, 500, 2);
        mueble5 = new Mesa("Mesa de Ébano"                  , operario3, 12, 500, false);
        
        // Cuatro montajes en cuatro casas
        Montaje casa1;
        Montaje casa2;
        Montaje casa3;
        Montaje casa4;
        
        casa1 = new Montaje(mueble1, operario1, 4, "Zapillo - Almeria");
        casa2 = new Montaje(mueble2, operario2, 6, "La Chana - Granada");
        casa3 = new Montaje(mueble3, operario3, 5, "Baza - Granada");
        casa4 = new Montaje(mueble4, operario1, 8, "Roquetas - Almeria");
        
        //Vector de nueve interfaces
        Carpinteria vector[] = new Carpinteria[9];
        vector[0] = casa1;
        vector[1] = casa2;
        vector[2] = casa3;
        vector[3] = casa4;
        vector[4] = mueble1;
        vector[5] = mueble2;
        vector[6] = mueble3;
        vector[7] = mueble4;
        vector[8] = mueble5;
        
        // Prueba de uso del método Muestra
        Muestra(vector);
        
        // Prueba de uso del valor Pago_Mayor
        System.out.println("Lo máximo cobrado por un trabajador es " +
                Pago_Mayor(vector) + " €");
        
        // Prueba el método Busca
        try{
            System.out.println("El gasto de Fabricacion del mueble 2 es " +
                Busca(vector, 5) + " €");
        }catch(RuntimeException e){
            System.err.println("debes introducir un número entero para el método Busca");
        } 
        

        
    }
    
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
    /**
     * Método que busca el el array de interfaces cual ha sido
     * el mayor pago a un trabajador por un montaje o fabricación
     * @param vector
     * @return 
     */
    public static double Pago_Mayor (Carpinteria [] vector){
        double temp = 0;
        for(Carpinteria cosa :  vector){
            if (cosa.paga_trabajador() > temp){
                temp = cosa.paga_trabajador();
            }
        }
        return temp;
    }
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

/*
public static double Busca (Carpinteria [] vector, int id){
        double sol = -1;
        for(Carpinteria cosa : vector){
            if (cosa instanceof Mesa){
                Mesa esMesa = (Mesa) cosa;
                if (esMesa.getId_producto() == id){
                    sol = esMesa.Coste_Fabricacion();
                }
            }else if (cosa instanceof Estanteria){
                Estanteria esUnaEstanteria = (Estanteria) cosa;
                if (esUnaEstanteria.getId_producto() == id){
                    sol = esUnaEstanteria.Coste_Fabricacion();
                }
            }else if (cosa instanceof Armario){
                Armario esArmario = (Armario) cosa;
                if (esArmario.id_producto == id){
                    sol = esArmario.Coste_Fabricacion();
                }
            } else {
                sol = -1;
                }
        }
        return sol;
    }
*/