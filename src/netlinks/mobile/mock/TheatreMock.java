package netlinks.mobile.mock;

import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.metier.Cinema;
import netlinks.mobile.metier.Theatre;
import netlinks.mobile.service.TheatreService;

public class TheatreMock implements TheatreService {

	@Override
	public List<Theatre> getAll() {
		List<Theatre> Theatres = new ArrayList<Theatre>();

		Theatre t1 = new Theatre();
		t1.setCapacite(200);
		t1.setDescription("Theatre");
		t1.setId(000111);
		t1.setNom("Sidi Slim");
		t1.setLatitude(1065.555);
		t1.setLongitude(1558.687);

		Theatre t2 = new Theatre();
		t2.setCapacite(200);
		t2.setDescription("Theatre");
		t2.setId(000111);
		t2.setNom("colisé");
		t2.setLatitude(1065.555);
		t2.setLongitude(1558.687);

		Theatre t3 = new Theatre();
		t3.setCapacite(200);
		t3.setDescription("Theatre");
		t3.setId(000111);
		t3.setNom("manar");
		t3.setLatitude(1065.555);
		t3.setLongitude(1558.687);

		Theatres.add(t1);
		Theatres.add(t2);
		Theatres.add(t3);
		return Theatres;
	}
}
