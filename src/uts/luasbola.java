/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.text.DecimalFormat;

/**
 *
 * @author Anonym
 */
class luasbola {
    DecimalFormat df = new DecimalFormat("#.####");
    private double jari2;
    private double lb;
    private final double phi=3.14;
    
    public void setjari2(double jarijari)
    {
    jari2 = jarijari;
    }
    
    public void setLLuas()
    {
    lb = jari2*jari2*phi*4;
    }
    
    public double getjari2()
    {
        return jari2;
    }
    
    public double getLuas()
    {
    return lb;
    }
}


