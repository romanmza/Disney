package com.Alkemychallenge.Disney.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    private String imagen;
    private String titulo;
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    private Integer calificacion;
    @ManyToMany
    private Personaje personajesAsociados;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the calificacion
     */
    public Integer getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the personajesAsociados
     */
    public Personaje getPersonajesAsociados() {
        return personajesAsociados;
    }

    /**
     * @param personajesAsociados the personajesAsociados to set
     */
    public void setPersonajesAsociados(Personaje personajesAsociados) {
        this.personajesAsociados = personajesAsociados;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", imagen=" + imagen + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", calificacion=" + calificacion + ", personajesAsociados=" + personajesAsociados + '}';
    }

}
