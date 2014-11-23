package com.sea.minxue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NianyaoFragment extends Fragment {
	public static NianyaoFragment newInstance() {
		NianyaoFragment fragment = new NianyaoFragment();
		return fragment;
	}

	public NianyaoFragment() {

	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_nianyao, container, false);

		return view;
	}
}
