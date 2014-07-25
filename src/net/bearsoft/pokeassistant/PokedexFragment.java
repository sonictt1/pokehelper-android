package net.bearsoft.pokeassistant;

import java.util.ArrayList;

import net.bearsoft.pokeassistant.api.Pokedex;
import net.bearsoft.pokeassistant.api.Pokemon;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.bearsoft.pokeassistant.main.R;

public class PokedexFragment extends Fragment 
{
	private Pokedex pokemonFetcher = new Pokedex();
	private PokedexAdapter adapter = new PokedexAdapter();
	ListView pokedex;
	
	private ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_pokedex, null);
		pokedex = new ListView(this.getActivity());
		
		pokedex.setAdapter(adapter);
		return view;
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart(); 
		pokeList = pokemonFetcher.getPokemons();
		adapter.notifyDataSetChanged();
	}
	
	private class PokedexAdapter extends BaseAdapter
	{

		@Override
		public int getCount() {
			return pokeList.size();
		}

		@Override
		public Object getItem(int position) {
			return pokeList.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView == null)
			{
				LayoutInflater inflater = getActivity().getLayoutInflater();
				convertView = inflater.inflate(R.layout.list_item_view_pokedex, parent, false);
			}
			
			TextView name = (TextView) convertView.findViewById(R.id.pokemon_name);
			TextView id = (TextView) convertView.findViewById(R.id.pokemon_id);
			TextView typeOne = (TextView) convertView.findViewById(R.id.pokemon_type_one);
			TextView typeTwo = (TextView) convertView.findViewById(R.id.pokemon_type_two);
			
			name.setText(pokeList.get(position).getName());
			id.setText(pokeList.get(position).getID() + "");
			typeOne.setText(pokeList.get(position).getTypes().get(0).getName());
			if(pokeList.get(position).getTypes().size() > 1)
			{
				typeTwo.setText(pokeList.get(position).getTypes().get(1).getName());
			}
			else
			{
				typeTwo.setVisibility(View.INVISIBLE);
			}
			return null;
		}
		
		@Override
		public void notifyDataSetChanged() {
			super.notifyDataSetChanged();
		}
	}
}
