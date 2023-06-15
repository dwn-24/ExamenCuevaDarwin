package ec.edu.espe.examen.sedes.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;


@Entity
@Table(name = "OFI_SEDE")
public class Sede {
    @Id
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codigo;
    @Column(name = "COD_INSTITUCION",  precision = 3, scale = 0, nullable = false)
    private BigDecimal codigoInstitucion;
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @Column(name = "DIRECCION", length = 200, nullable = false)
    private String direccion;
    
    private Boolean principal;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", referencedColumnName = "COD_INSTITUCION", insertable = false, updatable = false, nullable = false )
    private Institucion institucion;

    public Sede() {
    }

    
    
}
