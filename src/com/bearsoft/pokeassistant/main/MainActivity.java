package com.bearsoft.pokeassistant.main;

import com.bearsoft.pokeassistant.views.TouchImageView;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity 
{

	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
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
