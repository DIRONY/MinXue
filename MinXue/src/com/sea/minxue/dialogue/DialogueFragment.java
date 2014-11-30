package com.sea.minxue.dialogue;

import com.sea.minxue.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class DialogueFragment extends ListFragment {

	private DialogueAdapter adaper=null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.duihua_layout, container,false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		adaper=new DialogueAdapter(getActivity());
		setListAdapter(adaper);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Intent i=new Intent(getActivity(),CategoryActivity.class);
		i.putExtra("position", position);
		startActivity(i);
	}
}
