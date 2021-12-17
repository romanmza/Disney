


package com.Alkemychallenge.Disney.controllers;

import com.Alkemychallenge.Disney.entities.Pelicula;
import com.Alkemychallenge.Disney.services.PeliculaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/movies")
public class PeliculaControlador {

    @Autowired
    private PeliculaServicio peliculaservicio;


    @GetMapping("/new") //localhost:8080/movies/new
    public String formulario(ModelMap modelo) {
        
//        //traemos todos los autores para el comando select
//        List <Autor> listaautores = autorservicio.listarAutores();        
//        modelo.addAttribute("autorSelect", listaautores);  
//        //traemos todas las editoriales para el comando select
//        List <Editorial> listaeditoriales = editorialervicio.listarEditoriales();
//        modelo.addAttribute("editorialSelect", listaeditoriales); 

        return "form-pelicula";
    }

    @PostMapping("/new")
    public String guardar(ModelMap modelo,
            @RequestParam String imagen,
            @RequestParam String titulo,
            @RequestParam String fechaCreacion,
            @RequestParam Integer calificacion

    ) {

        try {
            
            peliculaservicio.crearpelicula( imagen,  titulo,  fechaCreacion,  calificacion);

            modelo.put("exito", "Registro exitoso");

            return "form-pelicula";

        } catch (Exception e) {

            modelo.put("error", "Falto algun dato");
            return "form-pelicula";
        }
    }

    //controlador para listar peliculas
    @GetMapping("/list") //localhost:8080/movies/lista

    public String lista(ModelMap modelo) {
        List<Pelicula> listaPeliculas = peliculaservicio.listarPeliculas();
        modelo.addAttribute("peliculas", listaPeliculas);
        return "list-pelicula";
    }
    
    
    
//    @GetMapping("/") //localhost:8080/autor/lista
//
//    public String autoresSelect(ModelMap modelo) {
//        List<Autor> listaAutores = autorservicio.listarAutores();
//        modelo.addAttribute("autoresSelect", listaAutores);
//
//        return "lista";
//    }
    


////Donde se envia el valor seleccionado
//    @PostMapping("/search")
//    public String departamentosPost(@ModelAttribute("departamentos") Departamento departamentos) {
//        LOGGER.info("Has elegido: "+departamentos);
//        return "search";
//    }
//    
    
    
//    
//    
//
//    //controlador para dar de baja un pelicula
//    @GetMapping("/baja/{id}")
//    public String baja(ModelMap modelo, @PathVariable String id) {
//        try {
//            peliculaservicio.baja(id);
//            List<Pelicula> listaPeliculas = peliculaservicio.listarPeliculas();
//            modelo.addAttribute("peliculas", listaPeliculas);
//            modelo.put("exito", "Modificación exitosa.");
//            return "list-pelicula";
//
//        } catch (Exception e) {
//            modelo.put("error", "Error al modificar atributo.");
//            return "form-pelicula";
//        }
//
//    }
//
//    //controlador para dar de alta un pelicula
//    @GetMapping("/alta/{id}")
//    public String alta(ModelMap modelo, @PathVariable String id) {
//        try {
//            peliculaservicio.alta(id);
//            List<Pelicula> listaPeliculas = peliculaservicio.listarPeliculas();
//            modelo.addAttribute("peliculas", listaPeliculas);
//            modelo.put("exito", "Modificación exitosa.");
//            return "list-pelicula";
//
//        } catch (Exception e) {
//            modelo.put("error", "Error al modificar atributo.");
//            return "form-pelicula";
//        }
//
//    }
//
//    //controlador para modificar un pelicula existente
//    @GetMapping("/modificar/{id}") //PATHVARIABLE
//    public String modificar(ModelMap modelo, @PathVariable String id) {
//
//        //traemos todos los atributos del pelicula según el ID elegido
//        modelo.addAttribute("pelicula", peliculaservicio.buscarpeliculaporid(id));
//  
//        //traemos todos los autores para el comando select
//        List <Autor> listaautores = autorservicio.listarAutores();        
//        modelo.addAttribute("autorSelect", listaautores);  
//        //traemos todas las editoriales para el comando select
//        List <Editorial> listaeditoriales = editorialervicio.listarEditoriales();
//        modelo.addAttribute("editorialSelect", listaeditoriales); 
//
//
//        return "form-pelicula-modif";
//    }
//    
//    
//    
//    
//
//    @PostMapping("/modificar/{id}")
//    public String modificar(ModelMap modelo,
//            @RequestParam String id,
//            @RequestParam Long isbn,
//            @RequestParam String titulo,
//            @RequestParam Integer anio,
//            @RequestParam Integer ejemplares,
//            @RequestParam String nombreautor,
//            @RequestParam String nombreeditorial
//    ) {
//        try {
//            peliculaservicio.modificarpelicula(id, isbn, titulo, anio, ejemplares, nombreautor, nombreeditorial);
//            //una vez modificado, volvemos a mostrar la lista de peliculas
//            List<Pelicula> listaPeliculas = peliculaservicio.listarPeliculas();
//            modelo.addAttribute("peliculas", listaPeliculas);
//            modelo.put("exito", "Modificación exitosa.");
//            return "list-pelicula";
//            
//        } catch (Exception e) {
//            modelo.put("error", "Falto algun dato");
//            return "list-pelicula";
//        }
//    }

}

