/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damur
 */
public class Libro extends Material {
    // Atributos propios
    private String autor;
    private int cantidadPaginas;
    private Genero genero;

    // Constructor
    public Libro(int id,
                 String titulo,
                 String autor,
                 int cantidadPaginas,
                 Genero genero) {

        // Constructor de la superclase
        super(id, titulo);

        // Inicializar atributos propios
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.genero = genero;
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Sobrescribir método mostrarInfo
    @Override
    public void mostrarInfo() {

        System.out.println("===== LIBRO =====");

        // Información heredada
        super.mostrarInfo();

        // Información propia
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de páginas: " + cantidadPaginas);
        System.out.println("Género: " + genero);
    }
}
