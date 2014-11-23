package com.sea.minxue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GeyaoFragment extends Fragment {
	public static GeyaoFragment newInstance() {
		GeyaoFragment fragment = new GeyaoFragment();
		return fragment;
	}

	public GeyaoFragment() {

	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_geyao, container, false);

		return view;
	}

}
