/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
		System.out.println("3.Sap xep ten nhan vien theo gioi tinh nam ");
		System.out.println("4.Sap xep ten nhan vien theo gioi tinh nu ");
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

	public static NhanVien[] taoDanhSach(int soluong) {
		if (danhSach != null) {
			System.out.println("so luong nhan vien da duoc tao vui long chon muc khac");
		} else {
			danhSach = new NhanVien[soluong];

		}
		return danhSach;

	}

	public static NhanVien taoNhanVien() {
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
//	public void sapXepTenThaoGioiTinh() {
//		NhanVien[] danhSachNhanVienNu = new NhanVien[danhSach.length];
//		NhanVien[] danhSachNhanVienNam = new NhanVien[danhSach.length];
//		NhanVien[] danhSachNhanVienGioiTinhKhongXacDinh = new NhanVien[danhSach.length];
//		int gioiTinhNu=0;
//		int gioiTinhNam=0;
//		int gioiTinhKhongXacDinh=0;
//		for(int i=0; i<danhSach.length; i++) {
//			if(danhSach[i].getGioiTinh().getMa()==0) {
//				danhSachNhanVienNu[i] = danhSach[i];
//				gioiTinhNu++;
//				
//			}else if(danhSach[i].getGioiTinh().getMa()==1) { 
//				danhSachNhanVienNam[i] = danhSach[i];
//				gioiTinhNam++;
//				
//			}else {
//				danhSachNhanVienGioiTinhKhongXacDinh[i]= danhSach[i];
//				gioiTinhKhongXacDinh++;
//			}
//		}
//		System.out.println("1.Sap xep nhan vien Gioi tinh Nu");
//		System.out.println("2.Sap xep nhan vien Gioi tinh Nam");
//		System.out.println("3.Sap xep nhan vien Gioi tinh Khong Xac Dinh");
//		int chon = new Scanner(System.in).nextInt();
//		switch(chon) {
//		case 1:
//			Collections.sort(danhSachNhanVienNu, new Comparator<Nhanvien>() {
//			});
//		
//		}
//		
//	}

	public static void menuCon() {
		System.out.println("1.Nhap so luong nhan vien");
		System.out.println("2.Tao Thong Tin nhan vien");
	}

	public void hienThongTinCacNhanvien() {
		
		if (danhSach == null) {
			System.out.println("chua co nhan vien nao vui long tao nhan vien truoc");
		} else {
					
			for (int i = 0; i < danhSach.length; i++) {
				if (danhSach[i] != null) {
					danhSach[i].hienThongTin();
				}else {
					System.out.println("vui long tao nhan vien truoc");
					break;
				}
			}
		}
		
		
	}
	
public void hienThongTinCacNhanvien1() {
			int k=0;
		if (danhSach == null) {
			System.out.println("chua co nhan vien nao vui long tao so luong nhan vien truoc");
		} else {
					
			for ( int i = 0; i < danhSach.length; i++) {
				if (danhSach[i] != null) {
					k++;
				}	
			}
			
			
			if(k>0) {
				for(int i=0; i<k; i++) {
					danhSach[i].hienThongTin();
				}
			}else {
				System.out.println("chua co thong tin nhan vien nao vui long tao thong tin nhan vien truoc da ");
			}
		}
		
}


	}
	


