package tr.medipol.edu.tr.hr200032;

import java.util.*;


public class urunListeleRest {

	
	private static final List<urunEkleRest> Urunler = new ArrayList<>();
	
	static {
		Urunler.add(new urunEkleRest("ulker", "10.12.2020","10.12.2024"));
		Urunler.add(new urunEkleRest("eti",   "10.12.2021","10.12.2022"));
		Urunler.add(new urunEkleRest("torku", "10.12.2022","10.12.2023"));
		
	}
	
	private urunListeleRest() {
		
	}
	
	public static List<urunEkleRest> urunleriGetir() {
		return Urunler;
		
	}
	
	public static List<urunEkleRest> urunEkle(urunEkleRest urun) {
		Urunler.add(urun);
		return Urunler;
		
	}
	public static List<urunEkleRest> urunSil(String ad) {
		for (urunEkleRest o : Urunler) {
			if(o.getMarka().equals(ad)) {
				Urunler.remove(o);
			}
		}
		return Urunler;
		
	}
}
