/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANAYANCY RIOS MORA
 */
public class Material {
    

    // Atributo final
    private final int id;

    // Atributos privados
    private String titulo;
    private boolean disponible;

    // Atributo static
    private static int contadorMateriales = 0;

    // Constructor
    public Material(int id, String titulo) {

        // Validación básica
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }

        this.id = id;
        this.titulo = titulo;
        this.disponible = true;

        // Incrementa el contador
        contadorMateriales++;
    }

    // Getter de id
    public int getId() {
        return id;
    }

    // Getter de titulo
    public String getTitulo() {
        return titulo;
    }

    // Getter de disponible
    public boolean isDisponible() {
        return disponible;
    }

    // Getter del contador
    public static int getContadorMateriales() {
        return contadorMateriales;
    }

    // Setter de titulo
    public void setTitulo(String titulo) {

        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("El título no puede estar vacío.");
            return;
        }

        this.titulo = titulo;
    }

    // Método que puede sobrescribirse
    public void mostrarInfo() {

        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Disponible: " + disponible);
    }

    // Método prestar
    public void prestar() {

        if (!disponible) {
            System.out.println("El material ya está prestado.");
        } else {
            disponible = false;
            System.out.println("Material prestado correctamente.");
        }
    }

    // Método devolver
    public void devolver() {

        if (disponible) {
            System.out.println("El material ya está disponible.");
        } else {
            disponible = true;
            System.out.println("Material devuelto correctamente.");
        }
    }
}