
package com.Alkemychallenge.Disney.repositories;

import com.Alkemychallenge.Disney.entities.Pelicula;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, String> {

    @Query("SELECT c FROM Pelicula c WHERE c.id = :id")
    public Pelicula buscarpeliculaporid(@Param("id") String id);
    
    @Query("SELECT c FROM Pelicula c")
    public List<Pelicula> listarpeliculas();
    //buscar pelicula por titulo
    @Query("SELECT c FROM Pelicula c WHERE c.titulo = :titulo")
    public Pelicula buscarPeliculaPorTitulo(@Param("titulo") String titulo);

}
