
package com.Alkemychallenge.Disney.repositories;

import com.Alkemychallenge.Disney.entities.Genero;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, String> {

    @Query("SELECT c FROM Genero c WHERE c.id = :id")
    public Genero buscargeneroporid(@Param("id") String id);

    @Query("SELECT c FROM Genero c")
    public List<Genero> listargeneros();
    //buscar genero por nombre
    @Query("SELECT c FROM Genero c WHERE c.nombre = :nombre")
    public Genero buscarGeneroPorNombre(@Param("nombre") String nombre);

}
