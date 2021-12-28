import java.text.ParseException;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class HocVien {

	private String hoTen;

	private String queQuan;

	private String gioiTinh;

	private String ngaySinh;

	private String ngayGiaNhap;

	private List<Diem> diem;

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getQueQuan() {
		return this.queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getNgayGiaNhap() {
		return this.ngayGiaNhap;
	}

	public void setNgayGiaNhap(String ngayGiaNhap) {
		this.ngayGiaNhap = ngayGiaNhap;
	}

	public List<Diem> getDiem() {
		return this.diem;
	}

	public void setDiem(List<Diem> diem) {
		this.diem = diem;
	}
	
	{
		this.diem=new ArrayList<>();
	}

	public HocVien(String ht,String qq, String gt) {
		this.hoTen=ht;
		this.queQuan=qq;
		this.gioiTinh=gt;
	}

	public HocVien(){

	}


	public void themHocVien(Scanner sc){
		System.out.println("nhap ho ten");
		this.hoTen=sc.nextLine();
		System.out.println("nhap que quan");
		this.queQuan=sc.nextLine();
		System.out.println("nhap gioi tinh");
		this.gioiTinh=sc.nextLine();
		// System.out.println("nhap ngay sinh");
		// this.ngaySinh=sc.nextLine();
		// System.out.println("nhap ngay gia nhap");
		// this.ngayGiaNhap=sc.nextLine();

		
	}
	public void themDiem(Diem d){
		this.diem.add(d);
	}

	public void hienThi() {
		System.out.printf("Ho Ten: %s\nQuen Quan: %s\nGioi Tin: %s\n",
		this.hoTen,this.queQuan,this.gioiTinh);

		for(Diem d:this.diem)
			d.hienThi();
	}

	

}
