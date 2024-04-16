package Ensamblador;

import Ensamblador.Libros;

import java.time.LocalDate;
import java.util.List;

public class Ventas {

    // Numero de ventas realizadas?

    LocalDate fechaVenta;
    List<Libros> librosVendidos;
    // List<Venta> ventas;
    // List<Vendedor> vendedores;
    List<Cliente> clientes;

    public Ventas(LocalDate fechaVenta, List<Libros> librosVendidos, List<Cliente> clientes) {
        this.fechaVenta = fechaVenta;
        this.librosVendidos = librosVendidos;
        this.clientes = clientes;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public List<Libros> getLibrosVendidos() {
        return librosVendidos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void mostrarCliente() {
        for (Cliente clientes : clientes) {
            System.out.println(clientes.toString());
        }
    }
    public void mostrarLibrosVendidos(){
        for (Libros librosVendidos : librosVendidos){
            System.out.println(librosVendidos.toString());
        }
    }


    public double calcularTotal() {
        double total = 0;
        for (Libros libro : librosVendidos) {
            total += libro.getPrecio();
        }
        return total;
    }
}
