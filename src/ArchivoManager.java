import java.io.*;

public class ArchivoManager {

    public static void escribirArchivo(String path, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(contenido);
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void leerArchivo(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String path = "ejemplo.txt";
        escribirArchivo(path, "Hola, esta es una prueba de archivo.");
        leerArchivo(path);
    }
}

