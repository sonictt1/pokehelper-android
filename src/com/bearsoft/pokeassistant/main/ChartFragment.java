package com.bearsoft.pokeassistant.main;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bearsoft.pokeassistant.views.TouchImageView;

public class ChartFragment extends Fragment 
{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		ActionBar actionBar = MainActivity.actionBar;
		View chart = inflater.inflate(R.layout.fragment_chart, container);
		final TouchImageView typeChart = (TouchImageView) chart.findViewById(R.id.type_chart);
		
		
		Toast.makeText(getActivity(), "Type charts curtousy of Bulbapedia.", Toast.LENGTH_LONG).show();
		
		
		ActionBar.Tab generationOne = actionBar.newTab();
		generationOne.setText("Gen 1");
		generationOne.setTabListener(new TabListener() 
		{
			
			@Override
			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) 
			{
				
				
			}
			
			@Override
			public void onTabSelected(Tab arg0, FragmentTransaction arg1) 
			{
				
				typeChart.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.gen_one_type_chart));
				
			}
			
			@Override
			public void onTabReselected(Tab arg0, FragmentTransaction arg1) 
			{
				typeChart.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.gen_one_type_chart));
				
			}
		});
    	
		ActionBar.Tab generationTwo = actionBar.newTab();
		generationTwo.setText("Gen 2-5");
		generationTwo.setTabListener(new TabListener() 
		{
			
			@Override
			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) 
			{
				
				
			}
			
			@Override
			public void onTabSelected(Tab arg0, FragmentTransaction arg1) 
			{
				
				typeChart.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.gen_two_through_five_type_chart));
				
			}
			
			@Override
			public void onTabReselected(Tab arg0, FragmentTransaction arg1) 
			{
				typeChart.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.gen_two_through_five_type_chart));
				
			}
		});
		
		ActionBar.Tab generationSix = actionBar.newTab();
		generationSix.setText("Gen 6");
		generationSix.setTabListener(new TabListener() 
		{
			
			@Override
			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) 
			{
				
				
			}
			
			@Override
			public void onTabSelected(Tab arg0, FragmentTransaction arg1) 
			{
				
				typeChart.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.gen_six_type_chart));
				
			}
			
			@Override
			public void onTabReselected(Tab arg0, FragmentTransaction arg1) 
			{
				typeChart.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.gen_six_type_chart));
				
			}
		});
		
		actionBar.addTab(generationOne);
		actionBar.addTab(generationTwo);
		actionBar.addTab(generationSix);
		
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	
}
