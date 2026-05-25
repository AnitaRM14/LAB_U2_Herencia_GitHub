/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Audiolibro extends Material {

    private String narrador;
    private int duracionMinutos;

    public Audiolibro(int id, String titulo,
                      String narrador, int duracionMinutos) {

        super(id, titulo);

        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("----- AUDIOLIBRO -----");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Narrador: " + narrador);
        System.out.println("Duración: " + duracionMinutos + " minutos");
        System.out.println("Disponible: " + isDisponible());
    }
}