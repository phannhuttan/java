import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dsCauHoi {


	private List<CauHoi> ds=new ArrayList<>();

	public List<CauHoi> getDs() {
		return this.ds;
	}

	public void setDs(List<CauHoi> ds) {
		this.ds = ds;
	}




	public void add(CauHoi ch){
		ds.add(ch);
	}

	public CauHoi search(String kw){
		String a=kw.toUpperCase();
		for(CauHoi s:this.ds)
			if ((s.getDeBai()).equals(kw)) 
				return s;
				
		return null;
	}

	public List<CauHoi> searchLv(int lv){
		List<CauHoi> kq=new ArrayList<>();
		for(CauHoi s:this.ds)
			if ((s.getLv ())==lv) {
			 kq.add(s);	
			}
				
		return kq;
	}
	public List<CauHoi> ListDang(int dang){
		List<CauHoi> kq=new ArrayList<>();
		switch (dang) {
			case 1:
				for(CauHoi ch:this.ds)
				if(ch instanceof MultipleChoice){
					kq.add(ch);
				}
				break;
				case 2:
				for(CauHoi ch:this.ds)
				if(ch instanceof Incomplete){
					kq.add(ch);
				}
					
				break;
				case 3:
				for(CauHoi ch:this.ds)
				if(ch instanceof Conversation){
					kq.add(ch);
				}
				break;
		
		}

		return kq;
	}


	public double Diem(int dang){

		return	10/ListDang(dang).size();
	}


	
	public double LuyenTap(int dang){
		double sum=0;
		Scanner sc=new Scanner(System.in);
		String [ ] DA=new String [ListDang(dang).size()];

		this.ListDang(dang).forEach(t->System.out.println(t.toString()));
		for(int i=0;i<ListDang(dang).size();i++){
			System.out.printf("nhap dap dan cau %d\n",i+1);
			DA[i]=sc.nextLine();
		}

	for(int i=0;i<ListDang(dang).size();i++){
		if(ListDang(dang).get(i).iskiemTra(DA[i])){
			System.out.println("dung");
			sum +=Diem(dang);
			
		}
		else{
			System.out.println("sai");
		}
	}
		
		return sum;
	}

	public void hienThi(){
		ds.forEach(t->System.out.println(t.toString()));
	}

}
