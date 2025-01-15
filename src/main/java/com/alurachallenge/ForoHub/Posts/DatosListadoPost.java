package com.alurachallenge.ForoHub.Posts;

import org.jetbrains.annotations.NotNull;

public record DatosListadoPost(
        Long Id,

                               String Titulo,

                               String Mensaje,

                               String autor,

                               String curso,

                               String FechaCreacion,

                               String status,

                               String respuestas) {

    public DatosListadoPost(Post post) {

                this(post.getId(), post.getTitulo(), post.getMensaje(), post.getAutor(), post.getCurso(),
                post.getFechacreacion(),post.getStatus(),post.getRespuestas());

    }
}


