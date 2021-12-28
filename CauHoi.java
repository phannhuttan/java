import java.util.ArrayList;
import java.util.List;

public abstract class CauHoi {

	private static int dem=0;

	protected final String[] NHAN={"A","B","C","D"};

	private int id=++dem;
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	{
		dem++;
		id=dem;
	}

	private String deBai;

	public String getDeBai() {
		return this.deBai;
	}

	public void setDeBai(String deBai) {
		this.deBai = deBai;
	}

	protected List<DapAn> dapAn;
	{
		dapAn=new ArrayList<>();
	}

	public List<DapAn> getDapAn() {
		return this.dapAn;
	}

	public void setDapAn(List<DapAn> dapAn) {
		this.dapAn = dapAn;
	}

	private int lv;
	private String dm;

	public int getLv() {
		return this.lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getDm() {
		return this.dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}
	
	public CauHoi(String d) {
		this.deBai=d;
	}

	public CauHoi(){
		
	}

	public void themLevel(int lv){
		this.lv=lv;
	}

	public void themDanhmuc(String dm){
		this.dm=dm;
	}

	public void themDapAn(DapAn da){
		this.dapAn.add(da);
	}

	public abstract boolean iskiemTra(String da);


	public String toString() {
		String s=String.format("%s\n", this.deBai);
		for(int i=0;i<this.dapAn.size();i++)
			s+=String.format("%s.%s\n",this.NHAN[i],this.dapAn.get(i));

		return s;
	}

}
