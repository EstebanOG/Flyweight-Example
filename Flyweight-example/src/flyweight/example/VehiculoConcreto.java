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
public class VehiculoConcreto implements IVehiculoLigero {

    private String Marca;
    private String Modelo;
    private String Color;

    public VehiculoConcreto(String marca, String modelo, String color) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Color = color;
    }

    @Override
    public String getMarca() {
        return this.Marca;
    }

    @Override
    public String getModelo() {
        return this.Modelo;
    }

    @Override
    public String getColor() {
        return this.Color;
    }

    @Override
    public void MostrarCaracteristicas(String datosExtra) {
        System.out.println(Marca + " " + Modelo + " de color " + Color + " " + "\n" + datosExtra + "\n");
    }

}
