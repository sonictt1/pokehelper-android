package net.bearsoft.pokeassistant;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

import com.bearsoft.pokeassistant.main.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class MainActivity extends ActionBarActivity
{

	final String MY_BANNER_UNIT_ID = "ca-app-pub-1577800667746091/3361312561";
	final String MY_NOTE_3_ID = "4feab03c";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);      
    }
    
    @Override
    protected void onStart() 
    {
    	super.onStart();
    }

    private void setContent(String fragName)
    {
    	Fragment replaceWith;
    	if(fragName.equals("PokedexFragment"))
    	{
    		replaceWith = new PokedexFragment();
    	}
    	else if(fragName.equals("ChartFragment"))
    	{
    		replaceWith = new ChartFragment();
    	}
    }
    
}
