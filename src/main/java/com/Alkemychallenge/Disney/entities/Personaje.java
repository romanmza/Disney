


package com.Alkemychallenge.Disney.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Personaje {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;    
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List <Pelicula> peliculasAsociadas;

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
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the historia
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * @param historia the historia to set
     */
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    /**
     * @return the peliculasAsociadas
     */
    public List <Pelicula> getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    /**
     * @param peliculasAsociadas the peliculasAsociadas to set
     */
    public void setPeliculasAsociadas(List <Pelicula> peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }

    @Override
    public String toString() {
        return "Personaje{" + "id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", historia=" + historia + ", peliculasAsociadas=" + peliculasAsociadas + '}';
    }

   

}
