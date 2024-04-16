package Ensamblador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ensamblador {
    Scanner sc=new Scanner(System.in);
    private ArrayList<Cliente> clientes;
    private ArrayList<Libros> libros;
    private ArrayList<Archivo> archivos;

    public Ensamblador(List<Cliente> clientes, List<Libros> libros, List<Archivo> archivos) {
        this.clientes = (ArrayList<Cliente>) clientes;
        this.libros = (ArrayList<Libros>) libros;
        this.archivos = (ArrayList<Archivo>) archivos;
    }

    public void add(Cliente cliente)
    {
        Cliente.add(cliente);
    }
    public static void remove(Cliente cliente)
    {
        Cliente.remove(cliente);
    }
    public void agregarLibro(Libros libro)
    {

    }

    public void eliminarLibro(Libros libro){

    }
    public void agregarArchivo(Archivo archivo){

    }
    public void eliminarArchivo(Archivo archivo){

    }
    public void buscarClientePorNombre(Scanner sc){
        System.out.println("Dame el nombre que quieres buscar: ");
        String Nombre=sc.nextLine();
        for (Cliente clientes: clientes){
            if (clientes.getNombre().equals(Nombre)){
                System.out.println("El cliente buscado es"+clientes.getNombre());
            }
        }

    }
    public void buscarLibroPorTitulo(String titulo) {

    }
    public void guardarDatosEnArchivo(Archivo archivo) {

    }
    public void cargarDatosDesdeArchivo(Archivo archivo) {

    }
    public void generarInforme() {

    }


}

