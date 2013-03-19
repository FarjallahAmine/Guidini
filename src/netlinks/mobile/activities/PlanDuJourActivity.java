package netlinks.mobile.activities;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.example.guidini.R;


public class PlanDuJourActivity extends SherlockActivity {
	
	//private ListView listViewRestaurants;
	//private ListView listViewCentresCommercials;
	//private ListView listViewHotels;
	//private ListView listViewCinemas;
	//private ListView listViewTheatres;
	//private ListView listViewEvenements;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plandujour);
		//listViewRestaurants=(ListView) findViewById(R.id.listRestaurants);
		//listViewCentresCommercials=(ListView) findViewById(R.id.listCentresCommercials);	
		//listViewHotels=(ListView) findViewById(R.id.listHotels);
		//listViewTheatres=(ListView) findViewById(R.id.listTheatres);
		//listViewEvenements=(ListView) findViewById(R.id.listEvenements);
	}

	
	@Override
	protected void onResume() {
		
		super.onResume();
		//RestaurantsAsyncTask RestaurantsAsync = new RestaurantsAsyncTask();
		//CentresCommercialsAsyncTask CentresCommercialsAsync=new CentresCommercialsAsyncTask();
		//HotelsAsyncTask HotelsAsync=new HotelsAsyncTask();
		//EvenementsAsyncTask EvenementsAsync=new EvenementsAsyncTask();
		
		//RestaurantsAsync.execute();
		//CentresCommercialsAsync.execute();
		//HotelsAsync.execute();
		//EvenementsAsync.execute();
		
	}
	
	/*private class RestaurantsAsyncTask extends AsyncTask<Void, Void, List<Restaurant>>
	{

		@Override
		protected List<Restaurant> doInBackground(Void... params) 
		{
			List<Restaurant> restaurants = null;
			try{
			RestaurantService mockRestaurant = new RestaurantMock();
			restaurants = mockRestaurant.getAll();
			} catch(Exception e) {
				cancel(false);
			}
			return restaurants;
		}
		
		@Override
		protected void onPostExecute (List<Restaurant> restaurants)
		{
			listViewRestaurants.setAdapter(new ListRestaurantsAdapter( PlanDuJourActivity.this,restaurants));
		}
		
		
	}*/
	
	/*private class CentresCommercialsAsyncTask extends AsyncTask<Void, Void, List<CentreCommercial>>
	{

		@Override
		protected List<CentreCommercial> doInBackground(Void... params) 
		{
			List<CentreCommercial> centres = null;
			try{
			CentreCommercialService mockCentres = new CentreCommercialMock();
			centres = mockCentres.getAll();
			} catch(Exception e) {
				cancel(false);
			}
			return centres;
		}
		
		@Override
		protected void onPostExecute (List<CentreCommercial> centres)
		{
			listViewCentresCommercials.setAdapter(new ListCentreCommercialAdapter( PlanDuJourActivity.this,centres));
		}
		
		
	}*/
	
	/*private class HotelsAsyncTask extends AsyncTask<Void, Void, List<Hotel>>
	{

		@Override
		protected List<Hotel> doInBackground(Void... params) 
		{
			List<Hotel> hotels = null;
			try{
			HotelService mockHotel = new HotelMock();
			hotels = mockHotel.getAll();
			} catch(Exception e) {
				cancel(false);
			}
			return hotels;
		}
		
		@Override
		protected void onPostExecute (List<Hotel> hotels)
		{
			listViewHotels.setAdapter(new ListHotelAdapter( PlanDuJourActivity.this,hotels));
		}
	}*/
	
	/*private class TheatresAsyncTask extends AsyncTask<Void, Void, List<Theatre>>
	{

		@Override
		protected List<Theatre> doInBackground(Void... params) 
		{
			List<Theatre> theatres = null;
			try{
			TheatreService mockTheatre = new TheatreMock();
			theatres = mockTheatre.getAll();
			} catch(Exception e) {
				cancel(false);
			}
			return theatres;
		}
		@Override
		protected void onPostExecute (List<Theatre> theatres)
		{
			listViewTheatres.setAdapter(new ListTheatreAdapter( PlanDuJourActivity.this,theatres));
		}
	}*/
	
	/*private class EvenementsAsyncTask extends AsyncTask<Void, Void, List<Evenement>>
	{

		@Override
		protected List<Evenement> doInBackground(Void... params) 
		{
			List<Evenement> evenements = null;
			try{
				EvenementService mockHotel = new EvenementMock();
				evenements = mockHotel.getAll();
			} catch(Exception e) {
				cancel(false);
			}
			return evenements;
		}
		@Override
		protected void onPostExecute (List<Evenement> evenements)
		{
			listViewEvenements.setAdapter(new ListEvenementAdapter( PlanDuJourActivity.this,evenements));
		}
	}*/
	
	
	
	

}
