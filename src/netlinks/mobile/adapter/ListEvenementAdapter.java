package netlinks.mobile.adapter;

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
import netlinks.mobile.metier.Evenement;
import netlinks.mobile.service.EvenementService;

public class ListEvenementAdapter extends BaseAdapter{

	private List<Evenement> evenements;
	private LayoutInflater listInflater;
	
	

	public ListEvenementAdapter(Context context,List<Evenement> centresCommercials) {
		this.evenements = centresCommercials;
		this.listInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		
		return this.evenements.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.evenements.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public static class ViewHolder {
		
		TextView dateDeb;
		TextView dateFin;
		TextView heureOuverture;
		TextView heureFermeture;
		TextView type;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView==null)
		{
			convertView = listInflater.inflate(R.layout.evenements_item, null);
			holder = new ViewHolder();
			System.out.println("111111111111111111111111111111111111111111");
			holder.type=(TextView) convertView.findViewById(R.id.evenements_item_type);
			holder.dateDeb=(TextView) convertView.findViewById(R.id.evenements_item_DateDeb);
			holder.dateFin=(TextView) convertView.findViewById(R.id.evenements_item_DateFin);
			holder.heureOuverture=(TextView) convertView.findViewById(R.id.evenements_item_HeureOuverture);
			holder.heureFermeture=(TextView) convertView.findViewById(R.id.evenements_item_HeureFermeture);
			System.out.println("222222222222222222222222222222222222222222");
		}else
		{
			System.out.println("33333333333333333333333333333333333333333");
			holder = (ViewHolder) convertView.getTag();
			System.out.println("444444444444444444444444444444444444444444");
		}
		System.out.println("5555555555555555555555555555555555555555");
		holder.type.setText(evenements.get(position).getType());
		holder.dateDeb.setText(evenements.get(position).getDateDeb());
		holder.dateFin.setText(evenements.get(position).getDateFin());
		holder.heureOuverture.setText(evenements.get(position).getHeureOuverture());
		holder.heureFermeture.setText(evenements.get(position).getHeureFermeture());
		System.out.println("66666666666666666666666666666666666666");
		return convertView;
	}
}
