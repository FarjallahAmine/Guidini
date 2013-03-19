package netlinks.mobile.mock;

import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.metier.Hotel;
import netlinks.mobile.service.HotelService;

public class HotelMock implements HotelService{

	@Override
	public List<Hotel> getAll() {
		List <Hotel> hotels = new  ArrayList<Hotel>();

		Hotel h1 = new Hotel();
		h1.setNbEtoile(5);
		h1.setDescription("Hotel");
		h1.setId(000111);
		h1.setNom("Russelior");
		h1.setLatitude(1065.555);
		h1.setLongitude(1558.687);
		
		Hotel h2 = new Hotel();
		h2.setNbEtoile(5);
		h2.setDescription("Hotel");
		h2.setId(000111);
		h2.setNom("Sadrabaal");
		h2.setLatitude(1065.555);
		h2.setLongitude(1558.687);
		
		Hotel h3 = new Hotel();
		h3.setNbEtoile(5);
		h3.setDescription("Hotel");
		h3.setId(000111);
		h3.setNom("Mehari");
		h3.setLatitude(1065.555);
		h3.setLongitude(1558.687);
		
		hotels.add(h1);
		hotels.add(h2);
		hotels.add(h3);
		return hotels;
	}
}
