package Ensamblador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EnsambladorVentas extends Ensamblador{
    private List<Ventas> ventas;

    public EnsambladorVentas(List<Cliente> clientes, List<Libros> libros, List<Archivo> archivos, List<Ventas> ventas) {
        super(clientes, libros, archivos);
        this.ventas = ventas;
    }

    public static void add(Ventas ventas){
    }

    public static Ventas agregarVenta(LocalDate fechaVenta, List<Libros> librosVendidos, List<Cliente> clientes) {
        return new Ventas(fechaVenta, librosVendidos, clientes);
    }

}
