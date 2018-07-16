/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Scanner;

/**
 *
 * @author ducso
 */
public class NhanVien {
    private static int ma=0;
    private int maHienTai;
    private String ten;
    private GioiTinh gioiTinh;

    public NhanVien() {
        this.maHienTai =++ma;
        
    }

    
    public int getMaHienTai() {
        return maHienTai;
    }

    public void setMaHienTai(int maHienTai) {
        this.maHienTai = maHienTai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public void nhapThongTin(){
        System.out.println("nhap ten: ");
        this.ten = new Scanner(System.in).nextLine();
        boolean check=true;
        while(check){
            System.out.println("Vui Long chon gioi tinh cua ban:");
            System.out.println("0. Gioi tinh Nu");
            System.out.println("1. Gioi tinh Nam");
            System.out.println("-1. Gioi tinh Khac");
            
        int ma= new Scanner(System.in).nextInt();
            if(ma==0){
                 this.gioiTinh = GioiTinh.NU;
                check=false;
                
            }else if(ma==1){
               
            
                 this.gioiTinh = GioiTinh.NAM;
                check=false;
            }
               
            else if(ma==-1){
               this.gioiTinh = GioiTinh.GIOITINHKHAC;
                check=false;
            } 
            else{
                System.out.println("vui Long chon lai gioi tinh: 0 hoac 1 hoac -1");
            check=true;
            }
        }
               
                
        
    }
    
    public void hienThongTin(){
        
        System.out.println("Ma: " + this.getMaHienTai()+"\t Ten: " + this.getTen() + "\t GioiTinh: " + this.getGioiTinh().getTenGioiTinh());
        
    }
    

    public NhanVien(int maHienTai, String ten, GioiTinh gioiTinh) {
        this.maHienTai = maHienTai;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }
    
    
}
