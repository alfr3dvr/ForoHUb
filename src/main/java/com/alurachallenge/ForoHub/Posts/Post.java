package com.alurachallenge.ForoHub.Posts;

import com.alurachallenge.ForoHub.Post.DatosActualizarPost;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;


@Table(name="topico2")
@Entity(name="Post")
@Getter
@Setter
@NoArgsConstructor(force=true)
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Titulo;
    private String Mensaje;
    private String autor;
    private String curso;
    private String Fechacreacion;
    private String Status;
    private String respuestas;

    public Post (){}

    public Post(@Valid DatosRegistroPost datosRegistroPost) {
        this.curso= datosRegistroPost.curso();
        this.Titulo= datosRegistroPost.Titulo();
        this.autor = datosRegistroPost.autor();
        this.Mensaje = datosRegistroPost.Mensaje();
        this.Fechacreacion = datosRegistroPost.FechaCreacion();
        this.Status = datosRegistroPost.status();
        this.respuestas = datosRegistroPost.respuestas();
    }


//    public void setAutor(String autor) {
//        this.autor = autor;
//    }


    public Long getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return Titulo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public String getCurso() {
        return curso;
    }

    public String getFechacreacion(){
        return Fechacreacion;
    }

    public String getStatus(){
        return Status;
    }
    public String getRespuestas(){
        return respuestas;
    }

    public void acualizarPost(@Valid DatosActualizarPost datosActualizarPost) {
if (datosActualizarPost.Titulo() != null) {
    this.Titulo = datosActualizarPost.Titulo();
}
if  (datosActualizarPost.Mensaje() != null){
        this.Mensaje = datosActualizarPost.Mensaje();}
if (datosActualizarPost.respuestas() != null){
        this.respuestas = datosActualizarPost.respuestas();}
    }
}
