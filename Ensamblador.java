import java.util.ArrayList;
import java.util.List;
public class Ensamblador {
    private ArrayList<Cliente> clientes;
    private ArrayList<Libro> libros;
    private ArrayList<Archivo> archivos;

    public Ensamblador(List<Cliente> clientes, List<Libro> libros, List<Archivo> archivos) {
        this.clientes = (ArrayList<Cliente>) clientes;
        this.libros = (ArrayList<Libro>) libros;
        this.archivos = (ArrayList<Archivo>) archivos;
    }

    public void agregarCliente(Cliente cliente)
    {

    }
    public void eliminarCliente(Cliente cliente)
    {

    }

    public void agregarLibro(Libro libro)
    {
        for(Libro libro: libros) {
            if (libro.detallesLibro().equals(libro.detallesLibro()))
            {
                System.out.println("Este libro ya existe");
                return;
            }
        }
        libros.add(libro);
        System.out.println("Libro Registrado");
    }

    public void eliminarLibro(Libro libro){
        for (Libro libro : libros) {
            if (libro.libro.equals(libros)) {
                System.out.println("Libro eliminado con éxito.");
                libros.remove(libro);
                return;
            }
        }
        System.out.println("El libro no existe.");
    }
    public void agregarArchivo(Archivo archivo){

    }
    public void eliminarArchivo(Archivo archivo){

    }
    public void buscarClientePorNombre(String nombre){

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
