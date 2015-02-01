/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.sessionbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pdhs.prm.entity.MeasurmentUnit;

/**
 *
 * @author Buddhika
 */
@Stateless
public class MeasurmentUnitFacade extends AbstractFacade<MeasurmentUnit> {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MeasurmentUnitFacade() {
        super(MeasurmentUnit.class);
    }
    
}
