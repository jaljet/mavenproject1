/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Classes.PersistenceFramework;

import com.mycompany.mavenproject1.Classes.AbstractEntity;
import com.mycompany.mavenproject1.Classes.Category;
import com.mycompany.mavenproject1.Classes.Good;
import com.mycompany.mavenproject1.Classes.BonusPlan;
import com.mycompany.mavenproject1.Classes.CategoryRights;

/**
 *
 * @author Solaris
 */
public class PFImpl implements PF{
    PFImpl(){
        
    }
   
    public void delete(AbstractEntity entity) {
        PFImpl pf = new PFImpl();
      if (entity instanceof Category){
        pf.deleteCategory(entity);
    }
      if (entity instanceof Good){
        pf.deleteGood(entity);
    }
      if (entity instanceof BonusPlan){
        pf.deleteBonusPlan(entity);
    }
      if (entity instanceof CategoryRights){
        pf.deleteCategoryRights(entity);
    }
       
    }
    
    public void load(AbstractEntity Entity){
        PFImpl pf = new PFImpl();
      if (entity instanceof Category){
        pf.deletCategory(entity);
    }
      if (entity instanceof Good){
        pf.deleteGood(entity);
    }
      if (entity instanceof BonusPlan){
        pf.deleteBonusPlan(entity);
    }
      if (entity instanceof CategoryRights){
        pf.deleteCategoryRights(entity);
    }
    }
    
     public void deleteCategory(Category Category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteGood(Good Good) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void deleteBonusPlan(BonusPlan BonusPlan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void deleteCategoryRights(CategoryRights CategoryRights) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
