/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Biblioteca {
  private ArrayList<Material> materiales;

    // Constructor
    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    // Agregar material
    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material agregado .");
    }

    // Listar materiales
    public void listarMateriales() {

        if (materiales.isEmpty()) {
            System.out.println("No hay materiales registrados.");
            return;
        }

        for (Material m : materiales) {
            m.mostrarInfo();
            System.out.println("------------------------");
        }
    }

    // Buscar por ID
    public Material buscarPorId(int id) {

        for (Material m : materiales) {

            if (m.getId() == id) {
                return m;
            }
        }

        return null;
    }

    // Buscar por título
    public void buscarPorTitulo(String titulo) {

        boolean encontrado = false;

        for (Material m : materiales) {

            if (m.getTitulo().equalsIgnoreCase(titulo)) {

                m.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el material.");
        }
    }

    // Prestar material
    public void prestarMaterial(int id) {

        Material material = buscarPorId(id);

        if (material != null) {
            material.prestar();
        } else {
            System.out.println("El material no fue encontrado.");
        }
    }

    // Devolver material
    public void devolverMaterial(int id) {

        Material material = buscarPorId(id);

        if (material != null) {
            material.devolver();
        } else {
            System.out.println("El material no fue encontrado.");
        }
    }

    // Mostrar total
    public void mostrarTotalMateriales() {

        System.out.println("Total de materiales: "
                + Material.getContadorMateriales());
    }  
}