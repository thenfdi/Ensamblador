package Ensamblador;

import java.util.List;

    public class Libros {
        private String titulo;
        private String autor;
        private String genero;
        private double precio;

        // Constructor
        public Libros(String titulo, String autor, String genero, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.genero = genero;
            this.precio = precio;
        }

        // Métodos getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getGenero() {
            return genero;
        }

        public double getPrecio() {
            return precio;
        }

        // Método toString
        @Override
        public String toString() {
            return "Libro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", genero='" + genero + '\'' +
                    ", precio=" + precio +
                    '}';
        }

        // Método para calcular el precio con descuento
        public double calcularPrecioConDescuento(double descuento) {
            return precio - (precio * descuento / 100);
        }

        // Método para buscar libros por autor
        public static void buscarPorAutor(List<Libros> libros, String autor) {
            libros.stream()
                    .filter(libro -> libro.getAutor().equals(autor))
                    .forEach(System.out::println);
        }

        // Método para filtrar libros por género
        public static void filtrarPorGenero(List<Libros> libros, String genero) {
            libros.stream()
                    .filter(libro -> libro.getGenero().equals(genero))
                    .forEach(System.out::println);
        }
    }

