


package com.Alkemychallenge.Disney.services;

import com.Alkemychallenge.Disney.entities.Pelicula;
import com.Alkemychallenge.Disney.repositories.PeliculaRepositorio;
import com.Alkemychallenge.Disney.errors.ServiceError;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PeliculaServicio {

    @Autowired
    private PeliculaRepositorio pelicularepositorio;

    //Métodos CRUD:
    //Crear una pelicula:
    @Transactional
    public void crearpelicula(String imagen, String titulo, String fechaCreacion, Integer calificacion)throws ServiceError {
      
        Pelicula pelicula1 = new Pelicula();

        validacion(imagen, titulo, fechaCreacion, calificacion);
        
        
        pelicula1.setImagen(imagen);
        pelicula1.setTitulo(titulo);
        //acá va pelicula1.setfecha
        pelicula1.setCalificacion(calificacion);

        
        
//        String encriptada = new BCryptPasswordEncoder().encode(clave);
//        pelicula1.setClave(encriptada);

        System.out.println("Pelicula :" + pelicula1);


        pelicularepositorio.save(pelicula1);
        //Mostramos  por consola el contenido del objeto Pelicula persistido.
        System.out.println(pelicula1);

    }

    //Método para listar peliculas:
    public List<Pelicula> listarPeliculas() {
        List<Pelicula> peliculas = pelicularepositorio.listarpeliculas();
        return peliculas;
    }

//    public Pelicula buscarpeliculaporid(String id) {
//        Pelicula pelicula = pelicularepositorio.buscarPeliculaPorId(id);
//        return pelicula;
//    }
//
//    public Pelicula buscarpeliculaporisbn(String isbn) {
//        Pelicula pelicula = pelicularepositorio.buscarpeliculaporisbn(isbn);
//        return pelicula;
//    }
//
//    //servicio para dar de baja un pelicula:
//    @Transactional
//    public void baja(String id) {
//        Optional<Pelicula> respuesta = pelicularepositorio.findById(id);
//        if (respuesta.isPresent()) {
//            Pelicula pelicula = respuesta.get();
//            pelicula.setAlta(false);
//
//            pelicularepositorio.save(pelicula);
//        }
//    }
//    //servicio para dar de alta un pelicula:
//
//    @Transactional
//    public void alta(String id) {
//        Optional<Pelicula> respuesta = pelicularepositorio.findById(id);
//        if (respuesta.isPresent()) {
//            Pelicula pelicula = respuesta.get();
//            pelicula.setAlta(true);
//
//            pelicularepositorio.save(pelicula);
//        }
//    }
//
////Método para modificar un pelicula:
//    @Transactional
//
//    public void modificarpelicula(String id, Long isbn, String titulo, Integer anio, Integer ejemplares, String nombreautor, String nombreeditorial) throws ServiceError {
//
//        Optional<Pelicula> respuesta = pelicularepositorio.findById(id);
//
//        if (respuesta.isPresent()) {
//            Pelicula pelicula = respuesta.get();
//
//            validacion(isbn, titulo, anio, ejemplares, nombreautor, nombreeditorial);
//
//            pelicula.setIsbn(isbn);
//            pelicula.setTitulo(titulo);
//            pelicula.setAnio(anio);
//            pelicula.setEjemplares(ejemplares);
//            
//            System.out.println(pelicula);
//
//            Autor autor = autorrepositorio.buscarAutorPorNombre(nombreautor);     
//            Editorial editorial = editorialrepositorio.buscarEditorialPorNombre(nombreeditorial);
//            
//            pelicula.setAutor(autor);
//            pelicula.setEditorial(editorial);
//
//            //Persistimos el nuevo objeto pelicula (que incluye los dos nuevos objetos Autor y Editorial)
//            pelicularepositorio.save(pelicula);
//        } else {
//            throw new ServiceError("Error de base de datos");
//        }
//
//    }

    private void validacion (String imagen, String titulo, String fechaCreacion, Integer calificacion) throws ServiceError {

        if (titulo == null || titulo.isEmpty()) {
            throw new ServiceError("El título no puede estar vacío o nulo.");
        }

        if (imagen == null || imagen.isEmpty()) {
            throw new ServiceError("El link de imagen no puede estar vacío o nulo");
        }
        
        if (fechaCreacion == null || fechaCreacion.isEmpty()) {
            throw new ServiceError("La fecha no puede estar vací o nulo");
        }

        if (calificacion == null || calificacion == 0) {
            throw new ServiceError("La calificación debe ser mayor a cero.");
        }

       
    }

}
