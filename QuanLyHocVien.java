
import java.util.List;
import java.util.Scanner;

public class QuanLyHocVien {

	private List<HocVien> ds;

	public void themHocVien(HocVien hv) {
		this.ds.add(hv);
	}

	public void remove(HocVien hv){
		ds.remove(hv);
	}

	public void nhapHocvien(Scanner sc){
		HocVien h=new HocVien();
		h.themHocVien(sc);
		this.themHocVien(h);
	}


	public void hienThi() {
		for(HocVien h:this.ds)
			h.hienThi() ;
			
	}

}
