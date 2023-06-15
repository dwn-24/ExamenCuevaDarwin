package ec.edu.espe.examen.sedes.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class EdificioPK implements Serializable{
     @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codigo;
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String sede;
    public EdificioPK() {
    }
    public EdificioPK(String codigo, String sede) {
        this.codigo = codigo;
        this.sede = sede;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    @Override
    public String toString() {
        return "EdificioPK [codigo=" + codigo + ", sede=" + sede + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((sede == null) ? 0 : sede.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EdificioPK other = (EdificioPK) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (sede == null) {
            if (other.sede != null)
                return false;
        } else if (!sede.equals(other.sede))
            return false;
        return true;
    }
    
    
}
