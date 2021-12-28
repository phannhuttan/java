import java.security.PublicKey;

import javax.swing.UIDefaults.ProxyLazyValue;

public class Diem {

  private double diem;

  public   double getDiem() {
      return diem;
  } 

  public void setDiem(double diem) {
      this.diem = diem;
  }



    public Diem(double diem){
        this.diem=diem;
    }

   public void hienThi(){
    System.out.println(this.diem);
  }
}
