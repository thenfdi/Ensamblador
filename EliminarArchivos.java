import java.util.ArrayList;
import java.util.List;

public class EliminarArchivos {
    private List<String> archivos;

    public EliminarArchivos() {
        this.archivos = new ArrayList<>();
    }

    public void agregaArchivo(String nombreArchivo) {
        archivos.add(nombreArchivo);
        System.out.println("Archivo \"" + nombreArchivo + "\" agregado al ensamblador.");
    }

    public void eliminarArchivo(String nombreArchivo) {
        if (archivos.remove(nombreArchivo)) {
            System.out.println("Archivo \"" + nombreArchivo + "\" eliminado del ensamblador.");
        } else {
            System.out.println("El archivo \"" + nombreArchivo + "\" no existe en el ensamblador.");
        }
    }

    // Otros métodos del ensamblador...

    public static void main(String[] args) {
        EliminarArchivos eliminador = new EliminarArchivos();

        // Ejemplo de uso: agregando archivos al ensamblador
        eliminador.agregaArchivo("archivo1.txt");
        eliminador.agregaArchivo("imagen.png");
        eliminador.agregaArchivo("documento.docx");

        // Ejemplo de uso: eliminando un archivo del ensamblador
        eliminador.eliminarArchivo("imagen.png");
    }
}
