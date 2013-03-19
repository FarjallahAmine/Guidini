package netlinks.mobile.adapter;

import java.util.List;

import com.example.guidini.R;

import netlinks.mobile.metier.Restaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListRestaurantsAdapter extends BaseAdapter{
	
	private List<Restaurant> restaurants;
	private LayoutInflater listInflater;
	
	

	public ListRestaurantsAdapter(Context context,List<Restaurant> restaurants) {
		this.restaurants = restaurants;
		this.listInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		
		return this.restaurants.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.restaurants.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public static class ViewHolder {
		TextView nbFourchettes;
		TextView type;
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
			convertView = listInflater.inflate(R.layout.restaurants_item, null);
			holder = new ViewHolder();
			holder.nbFourchettes=(TextView) convertView.findViewById(R.id.restaurants_item_nbFourchettes);
			holder.type=(TextView) convertView.findViewById(R.id.restaurants_item_type);
			holder.description=(TextView) convertView.findViewById(R.id.restaurants_item_description);
			holder.nom=(TextView) convertView.findViewById(R.id.restaurants_item_nom);
			holder.longitude=(TextView) convertView.findViewById(R.id.restaurants_item_longitude);
			holder.latitude=(TextView) convertView.findViewById(R.id.restaurants_item_latitude);
		}else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.nbFourchettes.setText(restaurants.get(position).getNbFourchettes().toString());
		holder.type.setText(restaurants.get(position).getType());
		holder.description.setText(restaurants.get(position).getDescription());
		holder.nom.setText(restaurants.get(position).getNom());
		holder.longitude.setText(new Double(restaurants.get(position).getLongitude()).toString());
		holder.latitude.setText(new Double(restaurants.get(position).getLatitude()).toString());
		return convertView;
	}

}
