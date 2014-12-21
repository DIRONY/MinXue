package com.sea.minxue.usercenter;

import com.sea.minxue.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class UsercenterFragment extends Fragment implements OnClickListener {
	TextView ziliao,tailuo,minxue;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.yonghu_layout, null);
		ziliao=(TextView) view.findViewById(R.id.content);
		ziliao.setOnClickListener(this);
		tailuo=(TextView) view.findViewById(R.id.secondcontent);
		tailuo.setOnClickListener(this);
		minxue=(TextView) view.findViewById(R.id.thirdcontent);
		minxue.setOnClickListener(this);
		return view;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.content:
			Intent i_more=new Intent(getActivity(),MoreActivity.class);
			startActivity(i_more);
			break;
		case R.id.secondcontent:
			Intent i_tailuo=new Intent(getActivity(),ZiliaoActivity.class);
			startActivity(i_tailuo);
			break;
		case R.id.thirdcontent:
			Intent i_about=new Intent(getActivity(),AboutActivity.class);
			startActivity(i_about);
			break;
		default:
			break;
		}
	}
}
