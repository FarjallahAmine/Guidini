package netlinks.mobile.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.guidini.R;

import netlinks.mobile.adapter.ListHotelAdapter.ViewHolder;
import netlinks.mobile.metier.Hotel;
import netlinks.mobile.metier.Theatre;
import netlinks.mobile.service.TheatreService;

public class ListTheatreAdapter extends BaseAdapter {

	private List<Theatre> theatres;
	private LayoutInflater listInflater;

	public ListTheatreAdapter(Context context, List<Theatre> theatres) {
		this.theatres = theatres;
		this.listInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {

		return this.theatres.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.theatres.get(arg0);
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
		if (convertView == null) {
			convertView = listInflater.inflate(R.layout.theatres_item, null);
			holder = new ViewHolder();
			holder.capacite = (TextView) convertView.findViewById(R.id.theatres_item_capacite);
			holder.description = (TextView) convertView.findViewById(R.id.theatres_item_description);
			holder.nom = (TextView) convertView.findViewById(R.id.theatres_item_nom);
			holder.longitude = (TextView) convertView.findViewById(R.id.theatres_item_longitude);
			holder.latitude = (TextView) convertView.findViewById(R.id.theatres_item_latitude);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.capacite.setText(theatres.get(position).getCapacite().toString());
		holder.description.setText(theatres.get(position).getDescription());
		holder.nom.setText(theatres.get(position).getNom());
		holder.longitude.setText(new Double(theatres.get(position).getLongitude()).toString());
		holder.latitude.setText(new Double(theatres.get(position).getLatitude()).toString());
		return convertView;
	}

}
