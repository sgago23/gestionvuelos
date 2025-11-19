import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Vuelo;
import utils.filtroVuelos;
/**
 * Clase principal del programa. Contiene las constantes de fecha usadas
 * para filtrar los vuelos y ejecuta toda la lógica principal:
 * <ul>
 *     <li>Crear una lista de vuelos de prueba</li>
 *     <li>Mostrar todos los vuelos</li>
 *     <li>Filtrarlos según las fechas definidas {@link filtroVuelos}</li>
 *     <li>Imprimir los resultados filtrados</li>
 * </ul>
 */
public class Main {
    /** Fecha mínima del filtro (puede ser null). */
    private static final LocalDate FECHA_INICIO = LocalDate.of(2025, 5, 18);
    /** Fecha máxima del filtro (puede ser null). */
    private static final LocalDate FECHA_FIN = LocalDate.of(2025, 5, 25);
    /**
     * Método de entrada del programa.
     * <p>
     * Realiza los siguientes pasos:
     * <ol>
     *     <li>Crea una lista de 10 vuelos de prueba.</li>
     *     <li>Imprime todos los vuelos en la consola.</li>
     *     <li>Filtra la lista de vuelos según las constantes {@link #FECHA_INICIO} y {@link #FECHA_FIN}.</li>
     *     <li>Muestra los vuelos filtrados en la consola.</li>
     * </ol>
     *
     * @param args Argumentos del programa (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        // 1. Crear la lista de 10 vuelos de prueba
        List<Vuelo> vuelos = crearVuelos();

        System.out.println("=== TODOS LOS VUELOS ===");
        vuelos.forEach(System.out::println);

        // 2. Filtrar usando las fechas definidas en constantes
        List<Vuelo> vuelosFiltrados = filtroVuelos.filtrarFechas(vuelos, FECHA_INICIO, FECHA_FIN);

        System.out.println("\n=== VUELOS FILTRADOS ===");
        System.out.println("Fecha inicio: " + FECHA_INICIO);
        System.out.println("Fecha fin   : " + FECHA_FIN + "\n");

        // 3. Imprimir por consola
        vuelosFiltrados.forEach(System.out::println);
    }
    /**
     * Crea y devuelve una lista de 10 vuelos de prueba con datos ficticios.
     * <p>
     * Los vuelos incluyen distintas aerolíneas, ciudades de salida y llegada,
     * así como diversas fechas de salida y llegada. Esta lista se utiliza
     * para probar la funcionalidad de filtrado del programa.
     *
     * @return una {@link List} de objetos {@link Vuelo} con datos de ejemplo.
     */
    private static List<Vuelo> crearVuelos() {
        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo(1, "H001-V", "Iberia",   "Madrid",      "Buenos Aires",
                LocalDate.of(2025, 5, 18), LocalDate.of(2025, 5, 19)));
        vuelos.add(new Vuelo(2, "H002-V", "Turkish",  "Barcelona",   "Estambul",
                LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 21)));
        vuelos.add(new Vuelo(3, "H003-V", "Ryanair",  "Madrid",      "Londres",
                LocalDate.of(2025, 5, 22), LocalDate.of(2025, 5, 22)));
        vuelos.add(new Vuelo(4, "H004-V", "AirFrance","París",       "Nueva York",
                LocalDate.of(2025, 5, 25), LocalDate.of(2025, 5, 26)));
        vuelos.add(new Vuelo(5, "H005-V", "Lufthansa","Berlín",      "Madrid",
                LocalDate.of(2025, 5, 28), LocalDate.of(2025, 5, 28)));
        vuelos.add(new Vuelo(6, "H006-V", "Iberia",   "Barcelona",   "Roma",
                LocalDate.of(2025, 6, 1),  LocalDate.of(2025, 6, 1)));
        vuelos.add(new Vuelo(7, "H007-V", "Vueling",  "Madrid",      "París",
                LocalDate.of(2025, 6, 5),  LocalDate.of(2025, 6, 5)));
        vuelos.add(new Vuelo(8, "H008-V", "Emirates", "Madrid",      "Dubái",
                LocalDate.of(2025, 6, 10), LocalDate.of(2025, 6, 11)));
        vuelos.add(new Vuelo(9, "H009-V", "Iberia",   "Madrid",      "Lisboa",
                LocalDate.of(2025, 6, 15), LocalDate.of(2025, 6, 15)));
        vuelos.add(new Vuelo(10,"H010-V", "Qatar",    "Barcelona",   "Doha",
                LocalDate.of(2025, 6, 20), LocalDate.of(2025, 6, 21)));

        return vuelos;
    }
}
