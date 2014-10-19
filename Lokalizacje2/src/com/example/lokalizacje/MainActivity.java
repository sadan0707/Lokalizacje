package com.example.lokalizacje;

import java.util.ArrayList;
import java.util.List;



import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
 
public class MainActivity extends Activity {
	
	Button zapisz;
	Button pokaz;
	EditText nazwa_jednotki;
	EditText nazwa_pomieszczenia;
	TextView wyswietlam;
	String wypisz;
	Context context;
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		wyswietlanie();
    	
		
	}
	
	private void wyswietlanie() {
		Button zapisz = (Button)findViewById(R.id.button1);
		Button pokaz = (Button)findViewById(R.id.button2);
		final EditText nazwa_jednotki = (EditText)findViewById(R.id.autoCompleteTextView1);
		EditText nazwa_pomiesczenia = (EditText)findViewById(R.id.autoCompleteTextView8);
		final TextView wyswietlam = (TextView)findViewById(R.id.textView1);
		
		
		zapisz.setOnClickListener(new OnClickListener () {
			public void onClick(View v) {
				final String wypisz = nazwa_jednotki.getText().toString();
				wyswietlam.setText(wypisz);
					
								
			}
		});
			
		
	
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
		
	
