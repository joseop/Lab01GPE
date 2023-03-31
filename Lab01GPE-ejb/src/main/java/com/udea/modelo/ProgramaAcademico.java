/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "programa_academico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProgramaAcademico.findAll", query = "SELECT p FROM ProgramaAcademico p")
    , @NamedQuery(name = "ProgramaAcademico.findByIdProgramaAcademico", query = "SELECT p FROM ProgramaAcademico p WHERE p.idProgramaAcademico = :idProgramaAcademico")
    , @NamedQuery(name = "ProgramaAcademico.findByNombre", query = "SELECT p FROM ProgramaAcademico p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "ProgramaAcademico.findByCodigoIcfes", query = "SELECT p FROM ProgramaAcademico p WHERE p.codigoIcfes = :codigoIcfes")
    , @NamedQuery(name = "ProgramaAcademico.findByModalidad", query = "SELECT p FROM ProgramaAcademico p WHERE p.modalidad = :modalidad")
    , @NamedQuery(name = "ProgramaAcademico.findByEncargadoPrograma", query = "SELECT p FROM ProgramaAcademico p WHERE p.encargadoPrograma = :encargadoPrograma")
    , @NamedQuery(name = "ProgramaAcademico.findByDescripcion", query = "SELECT p FROM ProgramaAcademico p WHERE p.descripcion = :descripcion")})
public class ProgramaAcademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id_programa_academico")
    private String idProgramaAcademico;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo_icfes")
    private String codigoIcfes;
    @Size(max = 20)
    @Column(name = "modalidad")
    private String modalidad;
    @Size(max = 20)
    @Column(name = "encargado_programa")
    private String encargadoPrograma;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_subunidad_academica", referencedColumnName = "id_subunidad_academica")
    @ManyToOne
    private SubunidadAcademica idSubunidadAcademica;

    public ProgramaAcademico() {
    }

    public ProgramaAcademico(String idProgramaAcademico) {
        this.idProgramaAcademico = idProgramaAcademico;
    }

    public String getIdProgramaAcademico() {
        return idProgramaAcademico;
    }
    
    public String getIdSubAca(){
        return this.idSubunidadAcademica.getIdSubunidadAcademica();
    }
    
    public void setIdSubAca(String id){
        this.idSubunidadAcademica=new SubunidadAcademica(id);
    }

    public void setIdProgramaAcademico(String idProgramaAcademico) {
        this.idProgramaAcademico = idProgramaAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoIcfes() {
        return codigoIcfes;
    }

    public void setCodigoIcfes(String codigoIcfes) {
        this.codigoIcfes = codigoIcfes;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getEncargadoPrograma() {
        return encargadoPrograma;
    }

    public void setEncargadoPrograma(String encargadoPrograma) {
        this.encargadoPrograma = encargadoPrograma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SubunidadAcademica getIdSubunidadAcademica() {
        return idSubunidadAcademica;
    }

    public void setIdSubunidadAcademica(SubunidadAcademica idSubunidadAcademica) {
        this.idSubunidadAcademica = idSubunidadAcademica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProgramaAcademico != null ? idProgramaAcademico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaAcademico)) {
            return false;
        }
        ProgramaAcademico other = (ProgramaAcademico) object;
        if ((this.idProgramaAcademico == null && other.idProgramaAcademico != null) || (this.idProgramaAcademico != null && !this.idProgramaAcademico.equals(other.idProgramaAcademico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.modelo.ProgramaAcademico[ idProgramaAcademico=" + idProgramaAcademico + " ]";
    }
    
}
