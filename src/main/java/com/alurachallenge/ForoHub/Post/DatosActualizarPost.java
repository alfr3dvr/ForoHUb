package com.alurachallenge.ForoHub.Post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarPost(
//        @NotNull
//                                    Long Id,

                                  String Titulo,

                                  String Mensaje,


                                  String respuestas) {
}
