/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.example;

/**
 *
 * @author Usuario
 */
public class Vehiculo {

    // Datos implicitos
    private IVehiculoLigero datosImplicitos;

    // Datos explícitos
    public String matricula;
    public String fechaMatriculacion;
    public String dniTitular;

    // Propiedades de acceso a los elementos implícitos.
    // Recordemos que estos datos no deberían variar con el tiempo (son comunes a todas las
    // instancias) y, si lo hicieran, afectarían a todas las instancias.
    public String marca;
    public String modelo;
    public String color;

    // Constructor del vehículo
    // Hace uso de la factoría para obtener (o generar, en caso de que no exista) la parte implícita de
    // los datos del vehículo (marca, modelo y color)
    public Vehiculo(String marca, String modelo, String color,String matricula, String fechaMatriculacion, String dniTitular ) // Datos explícitos
    {
        // Instanciamos o referenciamos los datos implícitos a través de la factoría
        this.datosImplicitos = FabricaVehiculos.getVehiculo(marca, modelo, color);

        // Asignamos los datos propios, exclusivos de este objeto
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.dniTitular = dniTitular;
    }

    // Método que accede tanto a datos implícitos como a datos explícitos
    public void MostrarInformacionVehiculo() {
        datosImplicitos.MostrarCaracteristicas(" con matricula " + matricula
                + " (" + fechaMatriculacion
                + ") registrado por " + dniTitular);
    }

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Seat", "Ibiza sport", "Amarillo", "1234-CCA", "10-03-2021", "71000011A");
        Vehiculo v2 = new Vehiculo("Seat", "Ibiza sport", "Rojo", "1235-CCA", "10-03-2021", "71000012A");
        Vehiculo v3 = new Vehiculo("Peugeot", "406", "Verde", "1236-CCA", "10-03-2021", "71000013A");
        Vehiculo v4 = new Vehiculo("Renault", "Clio sport", "Amarillo", "1237-CCA", "10-03-2021", "71000014A");
        Vehiculo v5 = new Vehiculo("Seat", "Ibiza sport", "Amarillo", "1238-CCA", "10-03-2021", "71000015A");

        v1.MostrarInformacionVehiculo();
        v2.MostrarInformacionVehiculo();
        v3.MostrarInformacionVehiculo();
        v4.MostrarInformacionVehiculo();
        v5.MostrarInformacionVehiculo();
    }
}
