public class DapAn {

	private int loai;

	private String noiDung;

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	private boolean dung = false;

	public boolean isDung()
	{
		return this.dung;
	}

	public void setDunge(boolean dung)
	{
		this.dung = dung;
	}

	private String giaiThich;

	public DapAn(String nd, boolean d) {
		this.noiDung=nd;
		this.dung=d;
	}

	public DapAn(String nd, boolean d,CauHoi ch) {
		this.noiDung=nd;
		this.dung=d;
		this.loai=ch.getId();
		
	}

	@Override
	public String toString() {
		
		return this.noiDung;
	}

	public DapAn(String nd, boolean d, String gt) {
		this.noiDung=nd;
		this.dung=d;
		this.giaiThich=gt;
	}

}
