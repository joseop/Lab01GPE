/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "subunidad_academica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubunidadAcademica.findAll", query = "SELECT s FROM SubunidadAcademica s")
    , @NamedQuery(name = "SubunidadAcademica.findByIdSubunidadAcademica", query = "SELECT s FROM SubunidadAcademica s WHERE s.idSubunidadAcademica = :idSubunidadAcademica")
    , @NamedQuery(name = "SubunidadAcademica.findByNombre", query = "SELECT s FROM SubunidadAcademica s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "SubunidadAcademica.findByTipo", query = "SELECT s FROM SubunidadAcademica s WHERE s.tipo = :tipo")
    , @NamedQuery(name = "SubunidadAcademica.findByNombreJefe", query = "SELECT s FROM SubunidadAcademica s WHERE s.nombreJefe = :nombreJefe")
    , @NamedQuery(name = "SubunidadAcademica.findByDescripcion", query = "SELECT s FROM SubunidadAcademica s WHERE s.descripcion = :descripcion")})
public class SubunidadAcademica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id_subunidad_academica")
    private String idSubunidadAcademica;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 20)
    @Column(name = "nombre_jefe")
    private String nombreJefe;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idSubunidadAcademica")
    private Collection<ProgramaAcademico> programaAcademicoCollection;

    public SubunidadAcademica() {
    }

    public SubunidadAcademica(String idSubunidadAcademica) {
        this.idSubunidadAcademica = idSubunidadAcademica;
    }

    public String getIdSubunidadAcademica() {
        return idSubunidadAcademica;
    }

    public void setIdSubunidadAcademica(String idSubunidadAcademica) {
        this.idSubunidadAcademica = idSubunidadAcademica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<ProgramaAcademico> getProgramaAcademicoCollection() {
        return programaAcademicoCollection;
    }

    public void setProgramaAcademicoCollection(Collection<ProgramaAcademico> programaAcademicoCollection) {
        this.programaAcademicoCollection = programaAcademicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubunidadAcademica != null ? idSubunidadAcademica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubunidadAcademica)) {
            return false;
        }
        SubunidadAcademica other = (SubunidadAcademica) object;
        if ((this.idSubunidadAcademica == null && other.idSubunidadAcademica != null) || (this.idSubunidadAcademica != null && !this.idSubunidadAcademica.equals(other.idSubunidadAcademica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.modelo.SubunidadAcademica[ idSubunidadAcademica=" + idSubunidadAcademica + " ]";
    }
    
}
