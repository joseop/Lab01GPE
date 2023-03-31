/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.modelo.ProgramaAcademico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */
@Stateless
public class ProgramaAcademicoManager implements ProgramaAcademicoManagerLocal {

    @PersistenceContext(unitName = "com.udea_Lab01GPE-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<ProgramaAcademico> getAllProgramasAcademicos() {
        Query query = em.createNamedQuery("ProgramaAcademico.findAll");
        return query.getResultList();
    }

    @Override
    public ProgramaAcademico upate(ProgramaAcademico programaAcademico) {
        return em.merge(programaAcademico);
    }
    

    
}
