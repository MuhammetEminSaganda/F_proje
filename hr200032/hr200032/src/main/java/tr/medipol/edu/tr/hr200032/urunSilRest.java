package tr.medipol.edu.tr.hr200032;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urunler")
public class urunSilRest {

	@GetMapping("/listele")
	public List<urunEkleRest> sil(){
		return urunListeleRest.urunleriGetir();
	}
	
	@PostMapping("/ekle")
	public urunEkleRest Ekle (@RequestBody urunEkleRest urunler) {
		urunListeleRest.urunEkle(urunler);
		return urunler;
	}
	
}
