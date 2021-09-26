/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class FabricaVehiculos {

    static Map<String, VehiculoConcreto> vehiculos = new HashMap<>();

    public FabricaVehiculos() {
        this.vehiculos = new HashMap();
    }

    public static IVehiculoLigero getVehiculo(String marca, String modelo, String color) {
        VehiculoConcreto v = null;

        // Si el modelo ya ha sido creado anteriormente, se recupera del arreglo
        if (vehiculos.containsKey(marca + " " + modelo + " " + color)) {
            v = vehiculos.get(marca + " " + modelo + " " + color);
            System.out.println("\t* Recuperando del arreglo el vehiculo " + marca + " " + modelo + " " + color);
        } else {
            v = new VehiculoConcreto(marca, modelo, color);

            // Se añade el objeto al arreglo: las sucesivas llamadas usarán este objeto en lugar de
            // instanciar uno nuevo
            vehiculos.put(marca + " " + modelo + " " + color, v);
            System.out.println("\t* Insertando en el arreglo el vehiculo " + marca + " " + modelo + " " + color);
        }

        // En caso de que no exista, se instancia un nuevo objeto y se añade al pool.
        // Las próximas ocasiones en las que el objeto sea utilizado, se devolverá una referencia
        // al objeto existente, evitando ocupar más memoria en crear una nueva instancia
        return v;
    }
}
