


package com.Alkemychallenge.Disney.repositories;

import com.Alkemychallenge.Disney.entities.Personaje;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonajeRepositorio extends JpaRepository<Personaje, String> {

//    @Query("SELECT c FROM Personaje c WHERE c.id = :id")
//    public Personaje buscarpersonajeporid(@Param("id") String id);
//
//    @Query("SELECT c FROM Personaje c")
//    public List<Personaje> listarpersonajes();

//    //buscar personaje por nombre
//    @Query("SELECT c FROM Personaje c WHERE c.nombre = :nombre")
//    public Personaje buscarPersonajePorNombre(@Param("nombre") String nombre);

}