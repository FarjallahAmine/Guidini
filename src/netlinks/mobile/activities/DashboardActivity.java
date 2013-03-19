package netlinks.mobile.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.example.guidini.R;

public class DashboardActivity extends SherlockActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		ActionBar actionBar = getSupportActionBar() ;
		actionBar.setDisplayHomeAsUpEnabled(true) ;

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.itemAbout:
			Toast.makeText(DashboardActivity.this, "About", Toast.LENGTH_SHORT)
					.show();
			return true;
		case R.id.itemNew:
			Toast.makeText(DashboardActivity.this, "New", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.itemRefresh:
			Toast.makeText(DashboardActivity.this, "Refresh", Toast.LENGTH_SHORT)
					.show();
			return true;
		case android.R.id.home:
			Toast.makeText(DashboardActivity.this, "Home", Toast.LENGTH_SHORT)
					.show();
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void onClickPlan (View v)
	{
		startActivity(new Intent(DashboardActivity.this, PlanDuJourActivity.class));
	}
	
	
}