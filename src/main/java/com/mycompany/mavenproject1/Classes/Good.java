/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Classes;

/**
 *
 * @author Solaris
 */
public class Good extends AbstractEntity {
    Good(){
        
    }
    private Category category;
    
    public Category getCategory(){
        return this.category;
    };
    public void setCategory(Category a){
        this.category = a;
    };
}
