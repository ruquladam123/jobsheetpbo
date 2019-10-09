/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author DKID
 */
public class datadiri {
    public static void main(String [] args){
        Scanner dam = new Scanner (System.in);
        Scanner p = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("===--><Program data diri><--===");
        System.out.println("===============================");
        System.out.print(">>Masukkan nama :");
        String nama = dam.nextLine();
        System.out.print(">>Masukan NIS :");
        int nis = dam.nextInt();
        System.out.print(">>Masukkan tempat lahir :");
        String lahir = p.nextLine();
        System.out.print(">>Masukkan tanggal lahir :");
        int tempat = p.nextInt();
        System.out.print(">>Masukkan jenis kelamin :");
        String kelamin = k.nextLine();
        System.out.print(">>Masukkan alamat di Malang :");
        String alamat = k.nextLine();
        System.out.print(">>QUOTES FOR MY LIFE :");
        String q = k.nextLine();
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("===-<OUTPUT DATA DIRI ANDA>-==");
        System.out.println("==============================");
        System.out.println(">>Nama :" + nama);
        System.out.println(">>NIS :" + nis);
        System.out.println(">>Tempat lahir :" + tempat);
        System.out.println(">>Tanggal lahir :" + lahir);
        System.out.println(">>Jenis kelamin :" + kelamin);
        System.out.println(">>Alamat :" + alamat);
        System.out.println(">>QUOTES :" + q);
    }
    
}
