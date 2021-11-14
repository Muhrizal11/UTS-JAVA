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
class segitiga {
    DecimalFormat df = new DecimalFormat("#.####");
    private double a, t;
    private double luas;
    
    public void setalas(double alas)
    {
    a = alas;
    }
    
    public void settinggi(double tinggi)
    {
    t = tinggi;
    }
    
    public void setLuas()
    {
    luas = 0.5 * a * t;
    }
    
    public double getalas()
    {
    return a;
    }
    
    public double gettinggi()
    {
    return t;
    }
    
    public double getLuas()
    {
    return luas;
    }
}
