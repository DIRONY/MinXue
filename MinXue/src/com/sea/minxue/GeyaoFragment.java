package com.sea.minxue;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class GeyaoFragment extends Fragment implements OnClickListener {
	
	private Button playbtn;
	private MediaPlayer player;
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
		playbtn=(Button) view.findViewById(R.id.sing_btn);
		playbtn.setOnClickListener(this);
		player=MediaPlayer.create(getActivity(), R.raw.music);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub	
		if(player!=null){
			player.start();
		}
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(player!=null){
			player.release();
		}
	}

	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		// TODO Auto-generated method stub
		super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser == false) {
        	if(player!=null&&player.isPlaying()){
        		player.pause();
        	}
        }
	}
	
	
}
