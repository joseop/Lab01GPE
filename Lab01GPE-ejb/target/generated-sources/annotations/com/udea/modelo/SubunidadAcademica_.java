package com.udea.modelo;

import com.udea.modelo.ProgramaAcademico;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-30T21:13:22")
@StaticMetamodel(SubunidadAcademica.class)
public class SubunidadAcademica_ { 

    public static volatile SingularAttribute<SubunidadAcademica, String> descripcion;
    public static volatile SingularAttribute<SubunidadAcademica, String> tipo;
    public static volatile CollectionAttribute<SubunidadAcademica, ProgramaAcademico> programaAcademicoCollection;
    public static volatile SingularAttribute<SubunidadAcademica, String> idSubunidadAcademica;
    public static volatile SingularAttribute<SubunidadAcademica, String> nombreJefe;
    public static volatile SingularAttribute<SubunidadAcademica, String> nombre;

}