import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CargarArchivos extends GenerarInforme {
    public CargarArchivos() {
        super();
    }

    public String cargarArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea);
                contenido.append("\n");
            }
            System.out.println("Archivo \"" + nombreArchivo + "\" cargado correctamente");
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo \"" + nombreArchivo + "\":");
            e.printStackTrace();
        }
        return contenido.toString();
    }

    // Otros métodos de la subclase...
}
