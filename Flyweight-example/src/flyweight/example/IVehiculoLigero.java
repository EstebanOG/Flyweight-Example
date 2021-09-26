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
public interface IVehiculoLigero {

    public String getMarca();


    public String getModelo();


    public String getColor();
 
    public void MostrarCaracteristicas(String datosExtra);
}
