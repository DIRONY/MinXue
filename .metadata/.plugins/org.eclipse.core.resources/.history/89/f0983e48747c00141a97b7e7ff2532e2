package com.sea.minxue;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class NianyaoFragment extends Fragment implements OnClickListener {
	
	private Button arbutton,asbutton,irbutton,isbutton,
	urbutton,usbutton,erbutton,esbutton,orbutton,osbutton,
	oorbutton,oosbutton;
	private MediaPlayer player;
	
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
		
		arbutton=(Button) view.findViewById(R.id.a_read);
		arbutton.setOnClickListener(this);
		
		asbutton=(Button) view.findViewById(R.id.a_sing);
		asbutton.setOnClickListener(this);
		
		irbutton=(Button) view.findViewById(R.id.i_read);
		irbutton.setOnClickListener(this);
		
		isbutton=(Button) view.findViewById(R.id.i_sing);
		isbutton.setOnClickListener(this);
		
		urbutton=(Button) view.findViewById(R.id.u_read);
		urbutton.setOnClickListener(this);
		
		usbutton=(Button) view.findViewById(R.id.u_sing);
		usbutton.setOnClickListener(this);
		
		erbutton=(Button) view.findViewById(R.id.e_read);
		erbutton.setOnClickListener(this);
		
		esbutton=(Button) view.findViewById(R.id.e_sing);
		esbutton.setOnClickListener(this);
		
		orbutton=(Button) view.findViewById(R.id.o_read);
		orbutton.setOnClickListener(this);
		
		osbutton=(Button) view.findViewById(R.id.o_sing);
		osbutton.setOnClickListener(this);
		
		oorbutton=(Button) view.findViewById(R.id.oo_read);
		oorbutton.setOnClickListener(this);
		
		oosbutton=(Button) view.findViewById(R.id.oo_sing);
		oosbutton.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(player!=null){
			player.release();
		}
		switch (v.getId()) {
		case R.id.a_read:
			player=MediaPlayer.create(getActivity(), R.raw.aread);
			player.start();
			break;
		case R.id.a_sing:
			player=MediaPlayer.create(getActivity(), R.raw.asong);
			player.start();
			break;
		case R.id.i_read:
			player=MediaPlayer.create(getActivity(), R.raw.iread);
			player.start();
			break;
		case R.id.i_sing:
			player=MediaPlayer.create(getActivity(), R.raw.isong);
			player.start();
			break;
		case R.id.u_read:
			player=MediaPlayer.create(getActivity(), R.raw.uread);
			player.start();
			break;
		case R.id.u_sing:
			player=MediaPlayer.create(getActivity(), R.raw.usog);
			player.start();
			break;
		case R.id.e_read:
			player=MediaPlayer.create(getActivity(), R.raw.eread);
			player.start();
			break;
		case R.id.e_sing:
			player=MediaPlayer.create(getActivity(), R.raw.esong);
			player.start();
			break;
		case R.id.o_read:
			player=MediaPlayer.create(getActivity(), R.raw.oread);
			player.start();
			break;
		case R.id.o_sing:
			player=MediaPlayer.create(getActivity(), R.raw.osong);
			player.start();
			break;
		case R.id.oo_read:
			player=MediaPlayer.create(getActivity(), R.raw.ooread);
			player.start();
			break;
		case R.id.oo_sing:
			player=MediaPlayer.create(getActivity(), R.raw.oosong);
			player.start();
			break;
		default:
			break;
		}
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		player.release();
	}

	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		// TODO Auto-generated method stub
		super.setUserVisibleHint(isVisibleToUser);
		if(isVisibleToUser == false){
			if(player!=null){
				player.release();
			}
		}
	}
	
	
}
