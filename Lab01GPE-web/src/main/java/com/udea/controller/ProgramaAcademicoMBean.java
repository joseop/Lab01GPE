/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.ejb.ProgramaAcademicoManagerLocal;
import com.udea.ejb.SubunidadAcademicaManagerLocal;
import com.udea.modelo.ProgramaAcademico;
import com.udea.modelo.SubunidadAcademica;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author User
 */
public class ProgramaAcademicoMBean {

    @EJB
    private SubunidadAcademicaManagerLocal subunidadAcademicaManager;

    @EJB
    private ProgramaAcademicoManagerLocal programaAcademicoManager;

    private ProgramaAcademico programaAcademico;
    
    
    private List<ProgramaAcademico> programasAcademicos;
    
    public ProgramaAcademicoMBean() {
    }
    
    public List<ProgramaAcademico> getProgramasAcademicos(){
        if ((programasAcademicos==null)||(programasAcademicos.isEmpty())) 
            refresh();
        return programasAcademicos;
    }
    
    public ProgramaAcademico getDetails(){
        return programaAcademico;
    }

    public String showDetails(ProgramaAcademico programaAcademico){
        this.programaAcademico=programaAcademico;
        return "DETAILS";
    }
    
    public String update(){
        programaAcademico=programaAcademicoManager.upate(programaAcademico);
        return "SAVED";
    }
    
    public String list(){
        return "LIST";
    }

    private void refresh() {
        programasAcademicos=programaAcademicoManager.getAllProgramasAcademicos(); 
    }
    
}
