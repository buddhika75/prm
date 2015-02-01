/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.sessionbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pdhs.prm.entity.ItemEntity;

/**
 *
 * @author Buddhika
 */
@Stateless
public class ItemEntityFacade extends AbstractFacade<ItemEntity> {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemEntityFacade() {
        super(ItemEntity.class);
    }
    
}
