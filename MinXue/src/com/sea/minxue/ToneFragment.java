package com.sea.minxue;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A fragment with a Google +1 button. Activities that contain this fragment
 * must implement the {@link ToneFragment.OnFragmentInteractionListener}
 * interface to handle interaction events. Use the
 * {@link ToneFragment#newInstance} factory method to create an instance of this
 * fragment.
 * 
 */
public class ToneFragment extends Fragment {
	
	public static ToneFragment newInstance() {
		ToneFragment fragment = new ToneFragment();
		return fragment;
	}

	public ToneFragment() {
		
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_tone, container, false);

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
