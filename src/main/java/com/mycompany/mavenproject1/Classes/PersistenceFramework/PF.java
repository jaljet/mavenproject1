/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Classes.PersistenceFramework;

import com.mycompany.mavenproject1.Classes.AbstractEntity;


/**
 *
 * @author Solaris
 */
public interface PF {

    public void load(AbstractEntity Entity);

    public void delete(AbstractEntity Entity);

}
