/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.io.IOException
import java.util.Scanner;
import java.io.BufferedReader
import java.io.InputStreamReader


/**
 *
 * @author Anonym
 */
class Datar {
    private static final Scanner p = new Scanner(System.in);

    static void Luasbola() {
    double jari2, phi=3.14;
    luasbola lb = new luasbola();
    
    System.out.println("Luas Bola");
    System.out.println("Masukkan jari - jari Bola: ");
    jari2= p.nextDouble();
    
    lb.setjari2(jari2);
    lb.setLLuas();
    
    System.out.println("Luas Bola: "+ lb.df.format(lb.getLuas()));
    }

    static void LuasSegitiga() {
    double a, t, l;
    segitiga ls = new segitiga();
    
    System.out.println("SEGITIGA");
    System.out.println("Alas Segitiga: ");
    a= p.nextDouble();
    
    System.out.println("Tinggi Segitiga: ");
    t= p.nextDouble();
    
    ls.setalas(a);
    ls.settinggi(t);
    ls.setLuas();
    
    System.out.println("Alas Segitiga: "+ ls.getalas());
    System.out.println("Tinggi Segitiga: "+ ls.gettinggi());
    System.out.println("Luas Segitiga: "+ ls.df.format(ls.getLuas()));
    }

    static void LuasBujursangkar() {
    double sisi;
    bujursangkar lbj = new bujursangkar();
    
    System.out.println("Luas BujurSangkar");
    System.out.println("Masukkan Sisi Bujur Sangkar: ");
    sisi= p.nextDouble();
    
    lbj.setSisi(sisi);
    lbj.setLuas();
    
    System.out.println("Luas Bujur Sangkar: "+ lbj.df.format(lbj.getLuas()));
    }

    static void LuasLingkaran() {
    double r, phi=3.14;
    luaslingkaran ll = new luaslingkaran();
    
    System.out.println("Luas Lingkaran");
    System.out.println("Masukkan jari - jari Lingkaran: ");
    r= p.nextDouble();
    
    ll.setjari2(r);
    ll.setr();
    
    System.out.println("Luas Lingkaran: "+ ll.df.format(ll.getr()));
    }

    static void LuasPersegiPanjang() {
    double pjg, lss, luass;
    persegipanjang lspj = new persegipanjang();
    
    System.out.println("Persegi Panjang");
    System.out.println("Panjang Persegi Panjang: ");
    pjg= p.nextDouble();
    
    System.out.println("Lebar Persegi Panjang: ");
    lss= p.nextDouble();
    
    lspj.setpanjang(pjg);
    lspj.setlebar(lss);
    lspj.setLuas();
    
    System.out.println("Panjang Persegi Panjang: "+ lspj.getpanjang());
    System.out.println("Lebar Persegi Panjang: "+ lspj.getlebar());
    System.out.println("Luas Persegi Panjang: "+ lspj.df.format(lspj.getLuas()));
    }

    static void Kelompok() {
        System.out.println("************Nama Kelompok************");
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println("1. Muh Rizal ( 18083000034) 7A ");
        System.out.println("2. Moch Verdisa Ashar ( 18083000176) 7A ");
    }
    }



