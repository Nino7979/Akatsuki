/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dh.demo;

/**
 *
 * @author Latitude 7420
 */
class AB implements IA, IB{

    @Override
    public String Show() {
        return "AAA";
    }
    @Override 
    public void Show(String s) {
        System.out.println(s);
    }
 
}
