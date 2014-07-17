package com.bearsoft.pokeassistant.main;



import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
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
        
//    	// Lookup R.layout.main
//    	RelativeLayout layout = (RelativeLayout)findViewById(R.id.ad);
//
//    	// Create the adView
//    	// Please replace MY_BANNER_UNIT_ID with your AdMob Publisher ID
//    	AdView adView = new AdView(this);
//    	adView.setAdSize(AdSize.BANNER);
//    	adView.setAdUnitId(MY_BANNER_UNIT_ID);
//
//    	// Add the adView to it
//    	layout.addView(adView);
//
//    	// Initiate a generic request to load it with an ad
//    	adView.loadAd(new AdRequest.Builder().addTestDevice(MY_NOTE_3_ID).build());
        
    }
    
    @Override
    protected void onStart() 
    {
    	// TODO Auto-generated method stub
    	
    	super.onStart();
//    	FragmentManager fragManage = getSupportFragmentManager();
//        FragmentTransaction fragTrans = fragManage.beginTransaction();
//       
//        fragTrans.add(R.id.fragment_chart, new ChartFragment());
//        fragTrans.commit();
    	
//final TouchImageView typeChart = (TouchImageView) findViewById(R.id.type_chart);
//		
//		
//		Toast.makeText(this, "Type charts curtousy of Bulbapedia.", Toast.LENGTH_LONG).show();
//		
//		
//		Tab generationOne = getSupportActionBar().newTab();
//		generationOne.setText("Gen 1");
//		generationOne.setTabListener(new TabListener() 
//		{
//			
//			@Override
//			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) 
//			{
//				
//				
//			}
//			
//			@Override
//			public void onTabSelected(Tab arg0, FragmentTransaction arg1) 
//			{
//				
//				typeChart.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.gen_one_type_chart));
//				
//			}
//			
//			@Override
//			public void onTabReselected(Tab arg0, FragmentTransaction arg1) 
//			{
//				typeChart.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.gen_one_type_chart));
//				
//			}
//		});
//    	
//		ActionBar.Tab generationTwo = getSupportActionBar().newTab();
//		generationTwo.setText("Gen 2-5");
//		generationTwo.setTabListener(new TabListener() 
//		{
//			
//			@Override
//			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) 
//			{
//				
//				
//			}
//			
//			@Override
//			public void onTabSelected(Tab arg0, FragmentTransaction arg1) 
//			{
//				
//				typeChart.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.gen_two_through_five_type_chart));
//				
//			}
//			
//			@Override
//			public void onTabReselected(Tab arg0, FragmentTransaction arg1) 
//			{
//				typeChart.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.gen_two_through_five_type_chart));
//				
//			}
//		});
//		
//		ActionBar.Tab generationSix = getSupportActionBar().newTab();
//		generationSix.setText("Gen 6");
//		generationSix.setTabListener(new TabListener() 
//		{
//			
//			@Override
//			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) 
//			{
//				
//				
//			}
//			
//			@Override
//			public void onTabSelected(Tab arg0, FragmentTransaction arg1) 
//			{
//				
//				typeChart.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.gen_six_type_chart));
//				
//			}
//			
//			@Override
//			public void onTabReselected(Tab arg0, FragmentTransaction arg1) 
//			{
//				typeChart.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.gen_six_type_chart));
//				
//			}
//		});
//		
//		getSupportActionBar().addTab(generationOne);
//		getSupportActionBar().addTab(generationTwo);
//		getSupportActionBar().addTab(generationSix);
    }


    
}
