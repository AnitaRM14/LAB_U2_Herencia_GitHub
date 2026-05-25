/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Tesis extends Material {

    private String autor;
    private String universidad;
    private int anioPublicacion;

    public Tesis(int id, String titulo, String autor,
                 String universidad, int anioPublicacion) {

        super(id, titulo);

        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("----- TESIS -----");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Disponible: " + isDisponible());
    }
}