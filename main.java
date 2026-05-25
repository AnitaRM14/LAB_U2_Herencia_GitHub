/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcion;

        do {

            System.out.println("\n===== MENÚ BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar materiales");
            System.out.println("3. Buscar material por ID");
            System.out.println("4. Prestar material");
            System.out.println("5. Devolver material");
            System.out.println("6. Mostrar total materiales");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    try {

                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Cantidad de páginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();

                        Libro nuevoLibro = new Libro(
                                id,
                                titulo,
                                autor,
                                paginas,
                                Genero.PROGRAMACION
                        );

                        biblioteca.agregarMaterial(nuevoLibro);

                    } catch (Exception e) {

                        System.out.println("Error al ingresar datos.");
                        sc.nextLine();
                    }

                    break;

                case 2:

                    biblioteca.listarMateriales();

                    break;

                case 3:

                    System.out.print("Ingrese ID: ");
                    int idBuscar = sc.nextInt();

                    Material material = biblioteca.buscarPorId(idBuscar);

                    if (material != null) {
                        material.mostrarInfo();
                    } else {
                        System.out.println("Material no encontrado.");
                    }

                    break;

                case 4:

                    System.out.print("Ingrese ID del material: ");
                    int idPrestamo = sc.nextInt();

                    biblioteca.prestarMaterial(idPrestamo);

                    break;

                case 5:

                    System.out.print("Ingrese ID del material: ");
                    int idDevolver = sc.nextInt();

                    biblioteca.devolverMaterial(idDevolver);

                    break;

                case 6:

                    biblioteca.mostrarTotalMateriales();

                    break;

                case 7:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }  
    
    
}
