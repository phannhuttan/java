import java.text.ParseException;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        dsCauHoi ds=new dsCauHoi();
       CauHoi c1=new Incomplete("tan","Tan phan");
       CauHoi c2=new Incomplete("phan","Tan phan");
       CauHoi c3=new Conversation("Phan TAn","Phan nhut tan");
      
       DapAn d1=new DapAn("tan", false);
       DapAn d2=new DapAn("tan", true);
       DapAn d3=new DapAn("tan", false);

       c1.themDapAn(d1);
       c1.themDapAn(d2);
       c1.themDapAn(d3);

       c2.themDapAn(d1);
       c2.themDapAn(d2);
       c2.themDapAn(d3);

       c3.themDapAn(d1);
       c3.themDapAn(d2);
       c3.themDapAn(d3);

       ds.add(c1);
       ds.add(c2);
       ds.add(c3);

       
     
        

     

    
      

   
       
        


  
    }

    
}
