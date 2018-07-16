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
public class QuanLyNhanVien {

    private static NhanVien[] danhSach;

    public void hienMenu() {
        System.out.println("1.Nhap danh sach sinh vien");
        System.out.println("2.Hien Thong Tin Cac Nhan Vien");
        System.out.println("3.Tìm nhân viên theo  giới tính và sắp xếp kết quả theo tên nhân viên.  ");
        System.out.println("4.Thoat ");
    }

    public void nhapDanhSachSinhVien() {

        menuCon();
        // QuanLyNhanVien qlnv = new QuanLyNhanVien();
        int chon1 = new Scanner(System.in).nextInt();

        switch (chon1) {
            case 1:
                System.out.println("nhap so luong nhan vien");
                int soluong = new Scanner(System.in).nextInt();

                taoDanhSach(soluong);
                break;

            case 2:
                taoNhanVien();
                break;

            default:
                System.out.println("vui long chon muc 1 hoac 2");

        }
    }

    private static NhanVien[] taoDanhSach(int soluong) {
        if (danhSach != null) {
            System.out.println("so luong nhan vien da duoc tao vui long chon muc khac");
        } else {
            danhSach = new NhanVien[soluong];

        }
        return danhSach;

    }

    private static NhanVien taoNhanVien() {
        if (danhSach == null) {
            System.out.println("vui long tao so luong danh sach sinh vien truoc");
        } else {
            for (int i = 0; i < danhSach.length; i++) {
                if (danhSach[i] == null) {
                    danhSach[i] = new NhanVien();
                    danhSach[i].nhapThongTin();
                    return danhSach[i];
                }

            }
        }
        System.out.println("khong the tao them nhan vien vi vuot qua so luong cua mang");
        return null;
    }

//	class sapXepComparator implements Comparator<NhanVien>{
//
//		@Override
//		public int compare(NhanVien o1, NhanVien o2) {
//			// TODO Auto-generated method stub
//			if(o1.getTen() > o2.getTen()) {	
//				return -1;
//			}else if(o1.getTen() < o2.getTen()){
//				return 1;
//			}else
//			return 0;
//			}
//		}
//	
    public void sapXepTenTheoGioiTinh() {
        NhanVien[] danhSachNhanVienNu = new NhanVien[danhSach.length];
        NhanVien[] danhSachNhanVienNam = new NhanVien[danhSach.length];
        NhanVien[] danhSachNhanVienGioiTinhKhongXacDinh = new NhanVien[danhSach.length];
        int gioiTinhNu = 0;
        int gioiTinhNam = 0;
        int gioiTinhKhongXacDinh = 0;
        for (int i = 0; i < danhSach.length; i++) {
            if (danhSach[i] != null && danhSach[i].getGioiTinh().getMa() == 0) {
                danhSachNhanVienNu[i] = danhSach[i];
                gioiTinhNu++;

            }
            if (danhSach[i] != null && danhSach[i].getGioiTinh().getMa() == 1) {
                danhSachNhanVienNam[i] = danhSach[i];
                gioiTinhNam++;

            }
            if (danhSach[i] != null && danhSach[i].getGioiTinh().getMa() == -1) {
                danhSachNhanVienGioiTinhKhongXacDinh[i] = danhSach[i];
                gioiTinhKhongXacDinh++;
            }
        }
        System.out.println("1.Sap xep nhan vien Gioi tinh Nu");
        System.out.println("2.Sap xep nhan vien Gioi tinh Nam");
        System.out.println("3.Sap xep nhan vien Gioi tinh Khong Xac Dinh");
        int chon = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                if (gioiTinhNu > 0) {
                    for (int i = 0; i < danhSachNhanVienNu.length; i++) {

                        for (int j = i + 1; j < danhSachNhanVienNu.length; j++) {

                            if (danhSachNhanVienNu[i] != null && danhSachNhanVienNu[j] != null && danhSachNhanVienNu[i].getTen().compareToIgnoreCase(danhSachNhanVienNu[j].getTen()) > 0) {
                                NhanVien nhanVienNuTemp = danhSachNhanVienNu[i];
                                danhSachNhanVienNu[i] = danhSachNhanVienNu[j];
                                danhSachNhanVienNu[j] = nhanVienNuTemp;
                            }
                        }
                    }
                    for (int i = 0; i < danhSachNhanVienNu.length; i++) {
                        if (danhSachNhanVienNu[i] != null) {
                            danhSachNhanVienNu[i].hienThongTin();
                        }
                    }
                } else {
                    System.out.println("khong co sinh vien nao co gioi tinh nu");
                }
                break;
            case 2:
                if (gioiTinhNam > 0) {
                    for (int i = 0; i < danhSachNhanVienNam.length; i++) {
                        for (int j = i + 1; j < danhSachNhanVienNam.length; j++) {
                            if (danhSachNhanVienNam[i] != null && danhSachNhanVienNam[j] != null && danhSachNhanVienNam[i].getTen().compareToIgnoreCase(danhSachNhanVienNam[j].getTen()) > 0) {
                                NhanVien nvNamTemp = danhSachNhanVienNam[i];
                                danhSachNhanVienNam[i] = danhSachNhanVienNam[j];
                                danhSachNhanVienNam[j] = nvNamTemp;
                            }
                        }
                    }
                    for (int i = 0; i < danhSachNhanVienNam.length; i++) {
                        if (danhSachNhanVienNam[i] != null) {

                            danhSachNhanVienNam[i].hienThongTin();
                        }
                    }
                } else {
                    System.out.println("khong co sinh vien nao co gioi tinh nam");
                }
                break;
            case 3:
                if (gioiTinhKhongXacDinh > 0) {
                    for (int i = 0; i < danhSachNhanVienGioiTinhKhongXacDinh.length; i++) {

                        for (int j = i + 1; j < danhSachNhanVienGioiTinhKhongXacDinh.length; j++) {

                            if (danhSachNhanVienGioiTinhKhongXacDinh[i] != null && danhSachNhanVienGioiTinhKhongXacDinh[j] != null && danhSachNhanVienGioiTinhKhongXacDinh[i].getTen().compareToIgnoreCase(danhSachNhanVienGioiTinhKhongXacDinh[j].getTen()) > 0) {

                                NhanVien nvGioiTinhKhongXacDinh = danhSachNhanVienGioiTinhKhongXacDinh[i];

                                danhSachNhanVienGioiTinhKhongXacDinh[i] = danhSachNhanVienGioiTinhKhongXacDinh[j];
                                danhSachNhanVienGioiTinhKhongXacDinh[j] = nvGioiTinhKhongXacDinh;
                            }
                        }
                    }
                    for (int i = 0; i < danhSachNhanVienGioiTinhKhongXacDinh.length; i++) {
                        if (danhSachNhanVienGioiTinhKhongXacDinh[i] != null) {

                            danhSachNhanVienGioiTinhKhongXacDinh[i].hienThongTin();
                        }
                    }
                } else {
                    System.out.println("khong co sinh vien nao co gioi tinh khong xac dinh");
                }
                break;

        }

    }

    private static void menuCon() {
        System.out.println("1.Nhap so luong nhan vien");
        System.out.println("2.Tao Thong Tin nhan vien");
    }

    public void hienThongTinCacNhanvien() {
        int k = 0;
        if (danhSach == null) {
            System.out.println("chua co nhan vien nao vui long tao so luong nhan vien truoc");
        } else {

            for (int i = 0; i < danhSach.length; i++) {
                if (danhSach[i] != null) {
                    k++;
                }
            }

            if (k > 0) {
                for (int i = 0; i < k; i++) {
                    danhSach[i].hienThongTin();
                }
            } else {
                System.out.println("chua co thong tin nhan vien nao vui long tao thong tin nhan vien truoc da ");
            }
        }

    }

}
