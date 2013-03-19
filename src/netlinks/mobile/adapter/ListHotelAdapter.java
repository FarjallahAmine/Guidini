package netlinks.mobile.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.guidini.R;

import netlinks.mobile.adapter.ListCentreCommercialAdapter.ViewHolder;
import netlinks.mobile.metier.CentreCommercial;
import netlinks.mobile.metier.Cinema;
import netlinks.mobile.metier.Hotel;
import netlinks.mobile.service.HotelService;

public class ListHotelAdapter extends BaseAdapter{
	
	private List<Hotel> hotels;
	private LayoutInflater listInflater;
	
	

	public ListHotelAdapter(Context context,List<Hotel> hotels) {
		this.hotels = hotels;
		this.listInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		
		return this.hotels.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.hotels.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public static class ViewHolder {
		TextView nbEtoile;
		TextView description;
		TextView longitude;
		TextView latitude;
		TextView nom;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView==null)
		{
			convertView = listInflater.inflate(R.layout.hotels_item, null);
			holder = new ViewHolder();
			holder.nbEtoile=(TextView) convertView.findViewById(R.id.hotels_item_nbEtoile);
			holder.description=(TextView) convertView.findViewById(R.id.hotels_item_description);
			holder.nom=(TextView) convertView.findViewById(R.id.hotels_item_nom);
			holder.longitude=(TextView) convertView.findViewById(R.id.hotels_item_longitude);
			holder.latitude=(TextView) convertView.findViewById(R.id.hotels_item_latitude);
		}else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.nbEtoile.setText(hotels.get(position).getNbEtoile().toString());
		holder.description.setText(hotels.get(position).getDescription());
		holder.nom.setText(hotels.get(position).getNom());
		holder.longitude.setText(new Double(hotels.get(position).getLongitude()).toString());
		holder.latitude.setText(new Double(hotels.get(position).getLatitude()).toString());
		return convertView;
	}

}
