package ec.edu.espe.examen.sedes.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;



@Entity
@Table(name = "OFI_INSTITUCION")
public class Institucion {
    @Id
    @Column(name = "COD_INSTITUCION", precision = 3, scale = 0, nullable = false)
    private BigDecimal codigo;
    @Column(name = "RUC", length = 13, nullable = false)
    private String razonSocial;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;
    public Institucion() {
    }
    public Institucion(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public BigDecimal getCodigo() {
        return codigo;
    }
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        Institucion other = (Institucion) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Institucion [codigo=" + codigo + ", razonSocial=" + razonSocial + ", version=" + version + "]";
    }
    
    
    
}
