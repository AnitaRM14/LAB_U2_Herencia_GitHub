/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damur
 */
public class Revista extends Material {
   // Atributos propios
    private int numeroEdicion;
    private String mesPublicacion;

    // Constructor
    public Revista(int id,
                   String titulo,
                   int numeroEdicion,
                   String mesPublicacion) {

        // Constructor de Material
        super(id, titulo);

        // Inicializar atributos
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    // Getters y Setters
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    // Sobrescribir método mostrarInfo
    @Override
    public void mostrarInfo() {

        System.out.println("===== REVISTA =====");

        // Información heredada
        super.mostrarInfo();

        // Información propia
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
    } 
 
}
