import java.util.ArrayList;
import java.util.List;

public class AgregadorArchivos {
    private List<String> archivos;

    public AgregadorArchivos() {
        this.archivos = new ArrayList<>();
    }

    public void agregaArchivo(String nombreArchivo) {
        archivos.add(nombreArchivo);
        System.out.println("Archivo \"" + nombreArchivo + "\" agregado al ensamblador.");
    }

    // Otros métodos del ensamblador...

    public static void main(String[] args) {
        AgregadorArchivos ensamblador = new AgregadorArchivos();

        // Ejemplo de uso: agregando archivos al ensamblador
        ensamblador.agregaArchivo("archivo1.txt");
        ensamblador.agregaArchivo("imagen.png");
        ensamblador.agregaArchivo("documento.docx");
    }
}
