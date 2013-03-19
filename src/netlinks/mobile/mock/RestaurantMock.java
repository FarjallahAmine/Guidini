package netlinks.mobile.mock;

import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.metier.Restaurant;
import netlinks.mobile.service.RestaurantService;

public class RestaurantMock implements RestaurantService{

	@Override
	public List<Restaurant> getAll() {
		List <Restaurant> restaurants = new  ArrayList<Restaurant>();

		Restaurant r1 = new Restaurant();
		r1.setNbFourchettes(3);
		r1.setType("A la carte");
		r1.setDescription("Restaurant");
		r1.setId(000111);
		r1.setNom("Sidi Slim");
		r1.setLatitude(1065.555);
		r1.setLongitude(1558.687);
		
		Restaurant r2 = new Restaurant();
		r2.setNbFourchettes(2);
		r2.setType("A la carte");
		r2.setDescription("Restaurant");
		r2.setId(000111);
		r2.setNom("Sidi Slim");
		r2.setLatitude(1065.555);
		r2.setLongitude(1558.687);
		
		Restaurant r3 = new Restaurant();
		r3.setNbFourchettes(1);
		r3.setType("A la carte");
		r3.setDescription("Restaurant");
		r3.setId(000111);
		r3.setNom("Sidi Slim");
		r3.setLatitude(1065.555);
		r3.setLongitude(1558.687);
		
		restaurants.add(r1);
		restaurants.add(r2);
		restaurants.add(r3);
		return restaurants;
	}
}
