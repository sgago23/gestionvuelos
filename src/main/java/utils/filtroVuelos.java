package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class filtroVuelos {
    public static List<Vuelo> filtrarFechas(List<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechaFin){
        return vuelos.stream()
                .filter(vuelo -> {
                    LocalDate salida = vuelo.getFechaSalida();

                    if(fechaInicio == null && fechaFin == null){
                        return true;
                    } else if (fechaInicio == null) {
                        return  !salida.isAfter(fechaFin);
                    } else if (fechaFin == null) {
                        return !salida.isBefore(fechaInicio);
                    } else {
                        return !salida.isBefore(fechaInicio) && !salida.isAfter(fechaFin);
                    }
                })
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }
}
