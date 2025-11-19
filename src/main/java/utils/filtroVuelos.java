package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase utilitaria que proporciona funcionalidades auxiliares
 * relacionadas con la gestión de vuelos, como filtrado y ordenación.
 */
public class filtroVuelos {
    /**
     * Filtra una lista de vuelos en función de las fechas proporcionadas.
     * <p>
     * Reglas del filtrado:
     * <ul>
     *     <li>Si {@code fechaInicio} y {@code fechaFin} son {@code null}, devuelve todos los vuelos.</li>
     *     <li>Si {@code fechaInicio} es {@code null}, devuelve vuelos con fechaSalida menor o igual a {@code fechaFin}.</li>
     *     <li>Si {@code fechaFin} es {@code null}, devuelve vuelos con fechaSalida mayor o igual a {@code fechaInicio}.</li>
     *     <li>Si ambas fechas existen, devuelve vuelos dentro del rango inclusivo.</li>
     * </ul>
     * Todos los resultados se devuelven ordenados por la fecha de salida.
     *
     * @param vuelos       Lista completa de vuelos a filtrar.
     * @param fechaInicio  Fecha mínima permitida (puede ser {@code null}).
     * @param fechaFin     Fecha máxima permitida (puede ser {@code null}).
     * @return Lista filtrada y ordenada de vuelos.
     */
    public static List<Vuelo> filtrarFechas(List<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechaFin){
        return vuelos.stream()  // Convertimos la lista en un stream
                .filter(vuelo -> {   // Aplicamos un filtro para decidir qué vuelos pasan
                    LocalDate salida = vuelo.getFechaSalida();

                    // CASO 1: No se envía ninguna fecha -> devolver todos
                    if(fechaInicio == null && fechaFin == null){
                        return true;
                    // CASO 2: Solo se envía fechaFin
                    } else if (fechaInicio == null) {
                        return  !salida.isAfter(fechaFin);
                    // CASO 3: Solo se envía fechaInicio
                    } else if (fechaFin == null) {
                        return !salida.isBefore(fechaInicio);
                    // CASO 4: Ambas fechas están enviadas → rango [inicio, fin]
                    } else {
                        return !salida.isBefore(fechaInicio) && !salida.isAfter(fechaFin);
                    }
                })
                // Ordenamos los vuelos por fecha de salida
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                // Convertimos el stream de nuevo a lista
                .collect(Collectors.toList());
    }
}
