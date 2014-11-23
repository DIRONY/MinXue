package com.sea.minxue;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PinyinFragment extends Fragment {
	public static PinyinFragment newInstance() {
		PinyinFragment fragment = new PinyinFragment();
		return fragment;
	}

	public PinyinFragment() {
		
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_pinyin, container, false);

		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
	
	}


	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}

	@Override
	public void onDetach() {
		super.onDetach();		
	}
}
