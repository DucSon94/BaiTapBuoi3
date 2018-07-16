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
public enum GioiTinh {
    NU(0),NAM(1),GIOITINHKHAC(-1);
    int ma;

    private GioiTinh(int ma) {
        this.ma = ma;
    }

  
    public void nhapGioiTinh(){
        System.out.println("Nhap gioi tinh");
       int ma= new Scanner(System.in).nextInt();
       
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    
    
}

   