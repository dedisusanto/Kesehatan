package id.STIKOM.kesehatan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class TidakmenularActivity extends Activity {
	ListView list2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);
		list2 = (ListView)findViewById(R.id.list_tidakmenular);
		
		//Dapatkan String array
				String[] ptm = getResources().getStringArray(R.array.penyakit_tm);
				//Membuat adapter
				ArrayAdapter<String> bb = new ArrayAdapter<String>(getApplicationContext(), R.layout.listview,
						R.id.txtketeranganpenyakit, ptm);
				list2.setAdapter(bb);
				list2.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {
						// TODO Auto-generated method stub
						if (position == 0){
							Intent aa = new Intent(getApplicationContext(),AmandelActivity.class);
							startActivity(aa);
						}else if (position == 1){
							Intent aa = new Intent(getApplicationContext(),AsamActivity.class);
							startActivity(aa);
						}else if (position == 2){
							Intent aa = new Intent(getApplicationContext(),AsmaActivity.class);
							startActivity(aa);
						}else if (position == 3){
							Intent aa = new Intent(getApplicationContext(),DarahrendahActivity.class);
							startActivity(aa);
						}else if (position == 4){
							Intent aa = new Intent(getApplicationContext(),DarahTinggiActivity.class);
							startActivity(aa);
						}else if (position == 5){
							Intent aa = new Intent(getApplicationContext(),GagalGinjalActivity.class);
							startActivity(aa);
						}else if (position == 6){
							Intent aa = new Intent(getApplicationContext(),KankerOtakActivity.class);
							startActivity(aa);
						}else if (position == 7){
							Intent aa = new Intent(getApplicationContext(),LiverActivity.class);
							startActivity(aa);
						}else if (position == 8){
							Intent aa = new Intent(getApplicationContext(),MaagActivity.class);
							startActivity(aa);
						}else if (position == 9){
							Intent aa = new Intent(getApplicationContext(),MigrenActivity.class);
							startActivity(aa);
						}else if (position == 10){
							Intent aa = new Intent(getApplicationContext(),PanuActivity.class);
							startActivity(aa);
						}else if (position == 11){
							Intent aa = new Intent(getApplicationContext(),PenyakitjantungActivity.class);
							startActivity(aa);
						}else if (position == 12){
							Intent aa = new Intent(getApplicationContext(),RematikActivity.class);
							startActivity(aa);
						}else if (position == 13){
							Intent aa = new Intent(getApplicationContext(),SakitgigiActivity.class);
							startActivity(aa);
						}else if (position == 14){
							Intent aa = new Intent(getApplicationContext(),SakitPinggangActivity.class);
							startActivity(aa);
						}else if (position == 15){
							Intent aa = new Intent(getApplicationContext(),SariawanActivity.class);
							startActivity(aa);
						}else if (position == 16){
							Intent aa = new Intent(getApplicationContext(),StrokeActivity.class);
							startActivity(aa);
						}else if (position == 17){
							
						}
					}
				});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tidakmenular, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
