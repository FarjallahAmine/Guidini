package netlinks.mobile.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.example.guidini.R;

public class LauncherActivity extends Activity {
	public boolean isBackPressed = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setFullscreen();
		setContentView(R.layout.launcher);
	}

	public void setFullscreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}

	@Override
	protected void onResume() {
		super.onResume();

		new Handler().postDelayed(new Runnable() {

			public void run() {
				if (!isBackPressed) {

					final Intent mainIntent = new Intent(LauncherActivity.this,
							DashboardActivity.class);
					startActivityForResult(mainIntent, 1);
					finish();
				}

			}
		}, 3000);
	}
}
