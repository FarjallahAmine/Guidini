package netlinks.mobile.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.guidini.R;

import netlinks.mobile.adapter.ListRestaurantsAdapter.ViewHolder;
import netlinks.mobile.metier.CentreCommercial;
import netlinks.mobile.metier.Restaurant;
import netlinks.mobile.service.CentreCommercialService;

public class ListCentreCommercialAdapter extends BaseAdapter{
	
	private List<CentreCommercial> centresCommercials;
	private LayoutInflater listInflater;
	
	public ListCentreCommercialAdapter(Context context,List<CentreCommercial> centresCommercials) {
		this.listInflater = LayoutInflater.from(context);
		this.centresCommercials = centresCommercials;
	}

	@Override
	public int getCount() {
		
		return this.centresCommercials.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.centresCommercials.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public static class ViewHolder {
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
			convertView = listInflater.inflate(R.layout.centrescommercials_item, null);
			holder = new ViewHolder();
			holder.type=(TextView) convertView.findViewById(R.id.CentresCommercials_item_type);
			holder.description=(TextView) convertView.findViewById(R.id.CentresCommercials_item_description);
			holder.nom=(TextView) convertView.findViewById(R.id.CentresCommercials_item_nom);
			holder.longitude=(TextView) convertView.findViewById(R.id.CentresCommercials_item_longitude);
			holder.latitude=(TextView) convertView.findViewById(R.id.CentresCommercials_item_latitude);
		}else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.type.setText(centresCommercials.get(position).getType());
		holder.description.setText(centresCommercials.get(position).getDescription());
		holder.nom.setText(centresCommercials.get(position).getNom());
		holder.longitude.setText(new Double(centresCommercials.get(position).getLongitude()).toString());
		System.out.println(new Double(centresCommercials.get(position).getLongitude()).toString());
		holder.latitude.setText(new Double(centresCommercials.get(position).getLatitude()).toString());
		return convertView;
	}

}

