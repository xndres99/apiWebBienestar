
package com.devdrez.apiAnunciosWeb.AnunciosController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anuncios")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Anuncio {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
     
     String estado,fecha,tipoImg;
     byte[] img;

    public Anuncio(long id, String estado, String fecha, byte[] img,String tipoImg) {
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
        this.img = img;
        this.tipoImg=tipoImg;
    }
    
    public Anuncio(){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getTipoImg() {
        return tipoImg;
    }

    public void setTipoImg(String tipoImg) {
        this.tipoImg = tipoImg;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "id=" + id + ", estado=" + estado + ", fecha=" + fecha + ", tipoImg=" + tipoImg + ", img=" + img + '}';
    }

    
     
     
    
    
}
