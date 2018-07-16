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
    NU(0,"Nữ"),NAM(1,"Nam"),GIOITINHKHAC(-1,"Không xác Định ");
    int ma;
    String tenGioiTinh;

    private GioiTinh(int ma) {
        this.ma = ma;
    }
    

  
public String getTenGioiTinh() {
		return tenGioiTinh;
	}



	public void setTenGioiTinh(String tenGioiTinh) {
		this.tenGioiTinh = tenGioiTinh;
	}



private GioiTinh(int ma, String tenGioiTinh) {
		this.ma = ma;
		this.tenGioiTinh = tenGioiTinh;
	}



//    public void nhapGioiTinh(){
//        System.out.println("Nhap gioi tinh");
//       int ma= new Scanner(System.in).nextInt();
//       
//    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    
    
}

   