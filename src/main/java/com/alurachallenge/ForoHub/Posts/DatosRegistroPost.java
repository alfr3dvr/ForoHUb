package com.alurachallenge.ForoHub.Posts;

import jakarta.validation.constraints.NotBlank;


public record DatosRegistroPost(
        @NotBlank
        String Titulo,
        @NotBlank
        String Mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @NotBlank
        String FechaCreacion,
        @NotBlank
        String status,
        @NotBlank
        String respuestas) {
}
