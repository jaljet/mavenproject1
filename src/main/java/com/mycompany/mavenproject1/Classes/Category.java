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
public class Category extends AbstractEntity {
    public Category(){
        
    }
    private Integer parentid;
    private String ExtendedDescr;
    private CategoryRights CategoryRights;
    private BonusPlan BonusPlan;
    
    public String getExtendedDescr(){
        return this.ExtendedDescr;
    };
    public void setExtendedDescr(String ExtendedDescr){
        this.ExtendedDescr = ExtendedDescr;
    };
    
    public CategoryRights getCategoryRights(){
        return this.CategoryRights;
    };
    public void setCategoryRights(CategoryRights a){
        this.CategoryRights = a;
    };
    
     public BonusPlan getBonusPlan(){
        return this.BonusPlan;
    };
    public void setBonusPlan(BonusPlan a){
        
        this.BonusPlan = a;
    };
}
