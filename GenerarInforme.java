import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerarInforme {
    private List<String> archivos;

    public GenerarInforme() {
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

    public void generarInforme(String nombreArchivo, String informe) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(informe);
            System.out.println("Informe generado y guardado correctamente en el archivo \"" + nombreArchivo + "\"");
        } catch (IOException e) {
            System.out.println("Error al generar el informe y guardar en el archivo \"" + nombreArchivo + "\":");
            e.printStackTrace();
        }
    }

    // Otros métodos de la clase...

    public static void main(String[] args) {
        GenerarInforme generador = new GenerarInforme();

        // Ejemplo de uso: agregando archivos al ensamblador
        generador.agregarArchivo("archivo1.txt");
        generador.agregarArchivo("imagen.png");
        generador.agregarArchivo("documento.docx");

        // Ejemplo de uso: generando un informe y guardándolo en un archivo
        String nombreArchivoInforme = "informe.txt";
        String informe = "Este es un informe generado automáticamente.";
        generador.generarInforme(nombreArchivoInforme, in