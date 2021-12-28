import java.util.List;
import java.util.Scanner;

public class LuyenTap {

    private dsCauHoi ds;
    
    

    public LuyenTap(dsCauHoi ds){
        this.ds=ds;
    }

    public Diem baiLam(){
        Scanner sc=new Scanner(System.in);
        int dang=sc.nextInt();
        return new Diem( this.ds.LuyenTap(dang));
    }



    

    
	
}
