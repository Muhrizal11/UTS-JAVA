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
class persegipanjang {
    DecimalFormat df = new DecimalFormat("#.####");
    private double pjg, lss;
    private double luass;
    
    public void setpanjang(double panjang)
    {
    pjg = panjang;
    }
    
    public void setlebar(double lebar)
    {
    lss = lebar;
    }
    
    public void setLuas()
    {
    luass = pjg * lss;
    }
    
    public double getpanjang()
    {
    return pjg;
    }
    
    public double getlebar()
    {
    return lss;
    }
    
    public double getLuas()
    {
    return luass;
    }
}
