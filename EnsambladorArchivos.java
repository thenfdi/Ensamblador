import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnsambladorArchivosa {
    private String ubicacionArchivos;

    public EnsambladorArchivos(String ubicacionArchivos) {
        this.ubicacionArchivos = ubicacionArchivos;
    }

    public void guardarDatosDeArchivos(String datos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ubicacionArchivos))) {
            writer.write(datos);
            System.out.println("Datos guardados correctamente en " + ubicacionArchivos);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en " + ubicacionArchivos);
            e.printStackTrace();
        }
    }

    public String cargarDatosDesdeArchivos() {
        StringBuilder datos = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(ubicacionArchivos))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                datos.append(linea);
                datos.append("\n");
            }
            System.out.println("Datos cargados correctamente desde " + ubicacionArchivos);
        } catch (IOException e) {
            System.out.println("Error al cargar los datos desde " + ubicacionArchivos);
            e.printStackTrace();
        }
        return datos.toString();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String ubicacionArchivos = "datos_tienda_libros.txt";
        EnsambladorArchivos ensamblador = new EnsambladorArchivos(ubicacionArchivos);

        // Ejemplo de guardar datos
        String datosTienda = "Datos de la tienda de libros...";
        ensamblador.guardarDatosDeArchivos(datosTienda);

        // Ejemplo de cargar datos
        String datosCargados = ensamblador.cargarDatosDesdeArchivos();
        System.out.println("Datos cargados desde archivos: \n" + datosCargados);
    }
}

