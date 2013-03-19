package netlinks.mobile.adapter;

import java.util.List;

import netlinks.mobile.metier.Cinema;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.guidini.R;

public class ListCinemaAdapter extends BaseAdapter{

	private List<Cinema> cinemas;
	private LayoutInflater listInflater;
	
	

	public ListCinemaAdapter(Context context,List<Cinema> cinemas) {
		this.cinemas = cinemas;
		this.listInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		
		return this.cinemas.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.cinemas.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public static class ViewHolder {
		TextView capacite;
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
			convertView = listInflater.inflate(R.layout.cinema_item, null);
			holder = new ViewHolder();
			holder.capacite=(TextView) convertView.findViewById(R.id.cinemas_item_capacite);
			holder.description=(TextView) convertView.findViewById(R.id.cinemas_item_description);
			holder.nom=(TextView) convertView.findViewById(R.id.cinemas_item_nom);
			holder.longitude=(TextView) convertView.findViewById(R.id.cinemas_item_longitude);
			holder.latitude=(TextView) convertView.findViewById(R.id.cinemas_item_latitude);
		}else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.capacite.setText(cinemas.get(position).getCapacite());
		holder.description.setText(cinemas.get(position).getDescription());
		holder.nom.setText(cinemas.get(position).getNom());
		holder.longitude.setText(new Double(cinemas.get(position).getLongitude()).toString());
		holder.latitude.setText(new Double(cinemas.get(position).getLatitude()).toString());
		return convertView;
	}
	
}
