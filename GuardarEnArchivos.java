import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuardarEnArchivos {
    private List<String> archivos;

    public GuardarEnArchivos() {
        this.archivos = new ArrayList<>();
    }

    public void agregarArchivo(String nombreArchivo) {
        archivos.add(nombreArchivo);
        System.out.println("Archivo \"" + nombreArchivo + "\" agregado al ensamblador.");
    }

    public void guardarDatosEnArchivo(String nombreArchivo, String datos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(datos);
            System.out.println("Datos guardados correctamente en el archivo \"" + nombreArchivo + "\"");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo \"" + nombreArchivo + "\":");
            e.printStackTrace();
        }
    }

    // Otros métodos de la clase...

    public static void main(String[] args) {
        GuardarEnArchivos guardador = new GuardarEnArchivos();

        // Ejemplo de uso: agregando archivos al ensamblador
        guardador.agregarArchivo("archivo1.txt");
        guardador.agregarArchivo("imagen.png");
        guardador.agregarArchivo("documento.docx");

        // Ejemplo de uso: guardando datos en un archivo
        String nombreArchivo = "datos_guardados.txt";
        String datosAGuardar = "Estos son los datos a guardar en el archivo.";
        guardador.guardarDatosEnArchivo(nombreArchivo, datosAGuardar);
    }
}
