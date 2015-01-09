package com.bearsoft.pokeassistant;

import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerTabStrip;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bearsoft.pokeassistant.views.TouchImageView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ChartFragment extends Fragment 
{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		
		View chart = inflater.inflate(R.layout.fragment_chart, container, false);
		final TouchImageView typeChart = (TouchImageView) chart.findViewById(R.id.type_chart);

        AdView adView = (AdView) chart.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

                ((ActionBarActivity) getActivity()).getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		Toast.makeText(getActivity(), "Type charts curtousy of Bulbapedia.", Toast.LENGTH_LONG).show();
		setHasOptionsMenu(true);
		
		Tab generationOne = ((ActionBarActivity) getActivity()).getSupportActionBar().newTab();
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

		ActionBar.Tab generationTwo = ((ActionBarActivity) getActivity()).getSupportActionBar().newTab();
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
		
		ActionBar.Tab generationSix = ((ActionBarActivity) getActivity()).getSupportActionBar().newTab();
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
		
		((ActionBarActivity) getActivity()).getSupportActionBar().addTab(generationOne);
		((ActionBarActivity) getActivity()).getSupportActionBar().addTab(generationTwo);
		((ActionBarActivity) getActivity()).getSupportActionBar().addTab(generationSix);
		return chart;
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) 
	{
		
		//menu.clear();
		inflater.inflate(R.menu.type_chart, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{	
		switch (item.getItemId())
		{
			case R.id.game_info_box:
				final Dialog games = new Dialog(getActivity());
				games.setContentView(R.layout.games_dialog);
				TextView gamesDialog = (TextView) games.findViewById(R.id.games);
				Button done = (Button) games.findViewById(R.id.ok);
				String title = "";
				String dialog = "";
				
				if(((ActionBarActivity) getActivity()).getSupportActionBar().getSelectedTab().getText().equals(new String("Gen 1")))
				{
					title = "Generation 1 games.";
					dialog = "Red, Blue, and Yellow versions.";
				}
				else if (((ActionBarActivity) getActivity()).getSupportActionBar().getSelectedTab().getText().equals(new String("Gen 2-5")))
				{
					title = "Generation 2-5 games.";
					dialog = "Gold, Silver, Crystal, Ruby, Sapphire, Emerald, FireRed, LeafGreen, Diamond, Pearl, Platinum, Black 1 & 2, White 1 & 2, HeartGold, and SoulSilver.";
				}
				else if (((ActionBarActivity) getActivity()).getSupportActionBar().getSelectedTab().getText().equals(new String("Gen 6")))
				{
					title = "Generation 6+ games.";
					dialog = "X, Y, Omega Ruby, Alpha Sapphire";
				}
				
				games.setTitle(title);
				gamesDialog.setText(dialog);
				
				done.setOnClickListener(new OnClickListener() 
				{
					
					@Override
					public void onClick(View v) 
					{
						games.dismiss();
					}

					
				});
				games.show();
				
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
