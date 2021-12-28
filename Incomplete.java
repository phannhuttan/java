import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Incomplete extends CauHoi {

    private String doanVan;


    public Incomplete(String d,String dv) {
        super(d);
        this.doanVan=dv;
       
    }

    

    @Override
    public void themDapAn(DapAn da) {
        super.themDapAn(da);
        
    }

    @Override
    public boolean iskiemTra(String da) {
        da=da.toUpperCase();
		for(int i=0;i<this.dapAn.size();i++){
			if( this.dapAn.get(i).isDung()==true && NHAN[i].equals(da)
             ){
					return true;
			}
		}
		return false;	
    }
    @Override
    public String toString() {
        return  super.toString();
    }

}
