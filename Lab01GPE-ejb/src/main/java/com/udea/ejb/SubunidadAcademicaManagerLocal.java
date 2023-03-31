/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.modelo.SubunidadAcademica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface SubunidadAcademicaManagerLocal {

    List<SubunidadAcademica> getSubunidadesAcademicas();
    
}
