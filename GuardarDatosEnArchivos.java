import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarDatoEnArchivo extends GenerarInforme {
    public GuardarDatoEnArchivo() {
        super();
    }

    public void guardarDato(String nombreArchivo, String dato) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(dato);
            writer.newLine();
            System.out.println("Dato guardado correctamente en el archivo \"" + nombreArchivo + "\"");
        } catch (IOException e) {
            System.out.println("Error al guardar el dato en el archivo \"" + nombreArchivo + "\":");
            e.printStackTrace();
        }
    }

    // Otros métodos de la subclase...
}
