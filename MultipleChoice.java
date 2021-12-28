public class MultipleChoice extends CauHoi {

    public MultipleChoice(String d) {
        super(d);
    }

    @Override
    public void themDanhmuc(String dm) {
        super.themDanhmuc(dm);
    }

    @Override
    public void themLevel(int lv) {
        
        super.themLevel(lv);
    }

    @Override
    public void themDapAn(DapAn da) {
        super.themDapAn(da);
        
    }
    @Override
    public boolean iskiemTra(String da) {
        da=da.toUpperCase();
		for(int i=0;i<this.dapAn.size();i++){
			if( this.dapAn.get(i).isDung()==true && NHAN[i].equals(da)==true ){
					return true;
			}
		}
		return false;	
    }

}
