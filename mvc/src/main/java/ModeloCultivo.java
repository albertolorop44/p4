package edu.comillas.icai.gitt.pat.spring.mvc;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ModeloCultivo(
        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @NotBlank(message = "El tipo de riego es obligatorio")
        String tipoRiego,

        @NotNull(message = "Las hectáreas son obligatorias")
        Double hectareas
)
{}

