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

        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        boolean check = true;
        while (check) {
            qlnv.hienMenu();
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {

                case 1:
                    qlnv.nhapDanhSachSinhVien();
                    break;

                case 2:
                    qlnv.hienThongTinCacNhanvien();
                    break;
                case 3:
                    qlnv.sapXepTenTheoGioiTinh();

                    break;
                case 4:
                    System.out.println("Cam on ban da su dung phan mem");
                    check = false;
                default:
                    System.out.println("vui long chon muc 1 , hoac 2 hoac 3 hoac 4");
                    break;

            }

        }
    }

}
