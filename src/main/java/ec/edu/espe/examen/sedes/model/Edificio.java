package ec.edu.espe.examen.sedes.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;


@Entity
@Table(name = "OFI_EDIFICIO")
public class Edificio {

    @EmbeddedId
    private EdificioPK edificioPK;
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "PISOS",  precision = 2, scale = 0, nullable = false)
    private BigDecimal pisos;
    @Column(name = "SUPERFICIE",  precision = 7, scale = 2, nullable = false)
    private BigDecimal superficie;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false, nullable = false )
    private Sede sede;

    public Edificio() {
    }
    public Edificio(EdificioPK edificioPK) {
        this.edificioPK = edificioPK;
    }
    public EdificioPK getEdificioPK() {
        return edificioPK;
    }
    public void setEdificioPK(EdificioPK edificioPK) {
        this.edificioPK = edificioPK;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getPisos() {
        return pisos;
    }
    public void setPisos(BigDecimal pisos) {
        this.pisos = pisos;
    }
    public BigDecimal getSuperficie() {
        return superficie;
    }
    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((edificioPK == null) ? 0 : edificioPK.hashCode());
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
        Edificio other = (Edificio) obj;
        if (edificioPK == null) {
            if (other.edificioPK != null)
                return false;
        } else if (!edificioPK.equals(other.edificioPK))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Edificio [edificioPK=" + edificioPK + ", nombre=" + nombre + ", pisos=" + pisos + ", superficie="
                + superficie + ", version=" + version + "]";
    }
    

    
}
