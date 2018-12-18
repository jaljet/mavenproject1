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
public abstract class AbstractEntity {
    protected Integer id;
    protected String name;
    public Integer getId(){
        return this.id;
    };
    public void setId(int number){
        this.id = number;
    };
    public String getName(){
        return this.name;
    };
    public void setName(String input){
        this.name = input;
    }
}
