


package com.Alkemychallenge.Disney.entities;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;


public class Genero {
    
     @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    private String nombre;
    private String imagen;
    @ManyToMany
    private Pelicula peliculasAsociadas;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the peliculasAsociadas
     */
    public Pelicula getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    /**
     * @param peliculasAsociadas the peliculasAsociadas to set
     */
    public void setPeliculasAsociadas(Pelicula peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", peliculasAsociadas=" + peliculasAsociadas + '}';
    }
    
    
    
    
    

}
