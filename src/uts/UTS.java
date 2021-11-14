/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import uts.Datar;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Anonym
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        //String ulg="",lagi
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" ");
        System.out.println("             MENU UTAMA             ");
        System.out.println(" Luas Permukaan Berbagai Bangun Ruang ");
        System.out.println("*************************************");
        System.out.println(" ");
        
        System.out.println("1. Luas Bola");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Bujursangkar");
        System.out.println("4. Luas Lingkaran");
        System.out.println("5. Luas Persegi Panjang");
        System.out.println("6. Nama Kelompok");
        System.out.println("7. Keluar");
        System.out.println("*************************************");
        System.out.print("Pilihan [1/2/3/4/5/6/7] = ");
        int pilih = input.nextInt();
        System.out.println("*************************************");
        switch (pilih) {
            case 1: Datar.Luasbola();break;
            case 2: Datar.LuasSegitiga(); break;
            case 3: Datar.LuasBujursangkar(); break;
            case 4: Datar.LuasLingkaran(); break;
            case 5: Datar.LuasPersegiPanjang(); break;
            case 6: Datar.Kelompok();break;
            case 7:System.exit(0);break;
            default:
                System.out.println("Maaf. Menu yang Anda Pilih Tidak Tersedia :( ");
            
            break;
        }
        System.out.println("*************************************");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }
    }
}

