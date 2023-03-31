package com.udea.modelo;

import com.udea.modelo.SubunidadAcademica;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-30T21:13:22")
@StaticMetamodel(ProgramaAcademico.class)
public class ProgramaAcademico_ { 

    public static volatile SingularAttribute<ProgramaAcademico, String> descripcion;
    public static volatile SingularAttribute<ProgramaAcademico, String> modalidad;
    public static volatile SingularAttribute<ProgramaAcademico, SubunidadAcademica> idSubunidadAcademica;
    public static volatile SingularAttribute<ProgramaAcademico, String> encargadoPrograma;
    public static volatile SingularAttribute<ProgramaAcademico, String> idProgramaAcademico;
    public static volatile SingularAttribute<ProgramaAcademico, String> nombre;
    public static volatile SingularAttribute<ProgramaAcademico, String> codigoIcfes;

}