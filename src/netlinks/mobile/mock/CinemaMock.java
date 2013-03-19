package netlinks.mobile.mock;

import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.metier.Cinema;
import netlinks.mobile.metier.Restaurant;
import netlinks.mobile.service.CinemaService;

public class CinemaMock implements CinemaService{

	@Override
	public List<Cinema> getAll() {
		List <Cinema> cinemas = new  ArrayList<Cinema>();

		Cinema c1 = new Cinema();
		c1.setCapacite(200);
		c1.setDescription("Cinema");
		c1.setId(000111);
		c1.setNom("Sidi Slim");
		c1.setLatitude(1065.555);
		c1.setLongitude(1558.687);
		
		Cinema c2 = new Cinema();
		c1.setCapacite(200);
		c1.setDescription("Cinema");
		c1.setId(000111);
		c1.setNom("colisé");
		c1.setLatitude(1065.555);
		c1.setLongitude(1558.687);
		
		Cinema c3 = new Cinema();
		c1.setCapacite(200);
		c1.setDescription("Cinema");
		c1.setId(000111);
		c1.setNom("manar");
		c1.setLatitude(1065.555);
		c1.setLongitude(1558.687);
		
		cinemas.add(c1);
		cinemas.add(c2);
		cinemas.add(c3);
		return cinemas;
	}
	
}
