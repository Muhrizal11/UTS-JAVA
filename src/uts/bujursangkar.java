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
class bujursangkar {
    DecimalFormat df = new DecimalFormat("#.####");
    private double sisi;
    private double lbj;
    
    public void setSisi(double sisibj)
    {
    sisi = sisibj;
    }
    
    public void setLuas()
    {
    lbj = sisi * sisi;
    }
    
    public double getSisi()
    {
        return sisi;
    }
    
    public double getLuas()
    {
    return lbj;
    }
}
