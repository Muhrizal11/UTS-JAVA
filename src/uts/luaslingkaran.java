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
class luaslingkaran {
    DecimalFormat df = new DecimalFormat("#.####");
    private double r;
    private double ll;
    private final double phi=3.14;
    
    public void setjari2(double jarijari)
    {
    r = jarijari;
    }
    
    public void setr()
    {
    ll = phi * r * r;
    }
    
    public double jarijari()
    {
        return r;
    }
    
    public double getr()
    {
    return ll;
    }
}
