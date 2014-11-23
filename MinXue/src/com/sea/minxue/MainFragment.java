package com.sea.minxue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainFragment extends Fragment implements OnClickListener{

	private ImageView iv_shengmu;
	private ImageView iv_pinyin;
	private ImageView iv_shengdiao;
	private ImageView iv_biandiao;
	private ImageView iv_yunmu;
	private ImageView iv_geyao;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.zhuye_layout, null);
		iv_shengmu=(ImageView) view.findViewById(R.id.shengmu);
		iv_shengmu.setOnClickListener(this);
		
		iv_pinyin=(ImageView) view.findViewById(R.id.pinyin);
		iv_pinyin.setOnClickListener(this);
		
		iv_shengdiao=(ImageView) view.findViewById(R.id.shengdiao);
		iv_shengdiao.setOnClickListener(this);
		
		iv_biandiao=(ImageView) view.findViewById(R.id.biandiao);
		iv_biandiao.setOnClickListener(this);
		
		iv_yunmu=(ImageView) view.findViewById(R.id.yunmu);
		iv_yunmu.setOnClickListener(this);
		
		iv_geyao=(ImageView) view.findViewById(R.id.geyao);
		iv_geyao.setOnClickListener(this);
		
		return view;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.shengmu:
			Intent i_intials=new Intent(getActivity(),Intials.class);
			startActivity(i_intials);
			break;
        case R.id.pinyin:
        	Intent i_pinyin=new Intent(getActivity(),Pinyin.class);
			startActivity(i_pinyin);
			break;
        case R.id.shengdiao:
        	Intent i_tone=new Intent(getActivity(),Tone.class);
			startActivity(i_tone);
			break;
        case R.id.biandiao:
        	Intent i_mtone=new Intent(getActivity(),Mtone.class);
			startActivity(i_mtone);
			break;
        case R.id.yunmu:
        	Intent i_finals=new Intent(getActivity(),Finals.class);
			startActivity(i_finals);
			break;
        case R.id.geyao:
        	Intent i_ballad=new Intent(getActivity(),Ballad.class);
			startActivity(i_ballad);
			break;
		default:
			break;
		}
	}
	
}
