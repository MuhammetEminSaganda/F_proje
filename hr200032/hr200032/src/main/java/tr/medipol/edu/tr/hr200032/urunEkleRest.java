package tr.medipol.edu.tr.hr200032;

public class urunEkleRest {
	private String marka;
	private String uretimTarihi;
	private String sonKullanmaTarihi;
	
	public urunEkleRest(String marka, String uretimTarihi, String sonKullanmaTarihi) {
		super();
		this.marka = marka;
		this.uretimTarihi = uretimTarihi;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getUretimTarihi() {
		return uretimTarihi;
	}
	public void setUretimTarihi(String uretimTarihi) {
		this.uretimTarihi = uretimTarihi;
	}
	public String getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}
	public void setSonKullanmaTarihi(String sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	

}
