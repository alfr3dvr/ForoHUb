package com.alurachallenge.ForoHub.Controller;


import com.alurachallenge.ForoHub.Post.DatosActualizarPost;
import com.alurachallenge.ForoHub.Posts.DatosListadoPost;
import com.alurachallenge.ForoHub.Posts.DatosRegistroPost;
import com.alurachallenge.ForoHub.Posts.Post;
import com.alurachallenge.ForoHub.Posts.PostRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/topicos")

public class PostControl {

    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public void resgistrarPost(@RequestBody @Valid DatosRegistroPost datosRegistroPost){
        postRepository.save(new Post(datosRegistroPost)); //Estoy haciendo un constyructor de Post

    }

    @GetMapping
    public List<DatosListadoPost> listadopost(){
        return postRepository.findAll().stream().map(DatosListadoPost ::new).toList();
    }

    @PutMapping ("/{id}")
    @Transactional
    //public void actualizarPost(@RequestBody @Valid DatosActualizarPost datosActualizarPost){
     public void actualizarPost(@PathVariable Long id, @RequestBody DatosActualizarPost datosActualizarPost ){
//Post post = postRepository.getReferenceById(datosActualizarPost.Id());
        Post post = postRepository.getReferenceById(id);
        post.acualizarPost(datosActualizarPost);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void borrarPost(@PathVariable Long id ) {
        Post post = postRepository.getReferenceById(id);
        postRepository.delete(post);
            }

}
