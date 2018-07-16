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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("nhap gioi tinh");
//        int ma= new Scanner(System.in).nextInt();
//        switch(ma){
//            case 1:
//                GioiTinh gt1 = GioiTinh.NU;
//                break;
//            case 2:
//                GioiTinh gt2 = GioiTinh.NAM;
//                break;
//            case 3:
//                GioiTinh gt3 = GioiTinh.GIOITINHKHAC;
//                
//                break;
//                
//        }
//        GioiTinh gt1 = GioiTinh.NAM;
//                System.out.println(gt1.getMa());
//            NhanVien nv1 = new NhanVien();
//            nv1.nhapThongTin();
//            nv1.hienThongTin();
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        boolean check = true;
        while(check){
            qlnv.hienMenu();
            int chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    while(true){
                   qlnv.menuCon();
                   int chon1 = new Scanner(System.in).nextInt();
                    switch(chon1){
                        case 1:
                            System.out.println("nhap so luong nhan vien");
                            int soluong = new Scanner(System.in).nextInt();
                            qlnv.taoDanhSach(soluong);
                            break;
                        case 2:
                            qlnv.taoNhanVien();
                            break;
                        default:
                            System.out.println("vui long chon muc 1 hoac 2");
                            break;
                    }
                    break;
                        
                    }
                case 2:
                    qlnv.hienThongTinCacNhanvien();
                    break;
                     case 3:
            check=false;
                   
            }
           
        }
    }
    
}
