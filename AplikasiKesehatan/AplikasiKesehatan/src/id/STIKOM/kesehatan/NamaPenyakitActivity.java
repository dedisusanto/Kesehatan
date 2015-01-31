package id.STIKOM.kesehatan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NamaPenyakitActivity extends Activity {
	//Deklarasi Listview
     ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nama_penyakit);
		//Deklarasi Listview
		list = (ListView)findViewById(R.id.list_namapenyakit);
		
		//Dapatkan String array
				String[] pm = getResources().getStringArray(R.array.nama_penyakit);
				//Membuat adapter
				ArrayAdapter<String> aa = new ArrayAdapter<String>(getApplicationContext(), R.layout.listview,
						R.id.txtketeranganpenyakit, pm);
				list.setAdapter(aa);
				list.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {
						// TODO Auto-generated method stub
						if (position == 0){
							Intent aa = new Intent(getApplicationContext(),BatukActivity.class);
							startActivity(aa);
							//untuk inten yang pertaman
						}else if(position == 1){
							Intent bb = new Intent(getApplicationContext(),CacarActivity.class);
							startActivity(bb);
						}else if (position == 2){
							Intent bb = new Intent (getApplicationContext(),CacinganActivity.class);
							startActivity(bb);
						}else if (position == 3){
						
							Intent bb = new Intent (getApplicationContext(),CampakActivity.class);
							startActivity(bb);
						}else if (position == 4){
							Intent bb = new Intent (getApplicationContext(),DemanActivity.class);
							startActivity(bb);
						}else if (position == 5){
							Intent bb = new Intent (getApplicationContext(),DiareActivity.class);
							startActivity(bb);
						}else if (position == 6){
							Intent bb = new Intent (getApplicationContext(),FluActivity.class);
							startActivity(bb);
						}else if (position == 7){
							
							//untuk inten yang selanjutnya
							
						}
					}
				});
	
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nama_penyakit, menu);
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
