package com.sea.minxue;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Intials extends Activity implements OnClickListener {

	ActionBar actionBar;
	private static CharSequence INTIALS_TITLE="…˘ƒ∏ΩÈ…‹";
	private TextView tv_actionbar_title;
	private TextView p,ph,m,b,t,th,n,l,k,kh,g,gh,h,ts,tsh,s,j;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shengmu_layout);
		actionBar = getActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setCustomView(R.layout.minxue_actionbar);
		tv_actionbar_title=(TextView) actionBar.getCustomView()
				.findViewById(R.id.actionbar_title);
		tv_actionbar_title.setText(INTIALS_TITLE);
		
		p=(TextView) findViewById(R.id.p);
		p.setOnClickListener(this);
		
		ph=(TextView) findViewById(R.id.ph);
		ph.setOnClickListener(this);
		
		m=(TextView) findViewById(R.id.m);
		m.setOnClickListener(this);
		
		b=(TextView) findViewById(R.id.b);
		b.setOnClickListener(this);
		
		t=(TextView) findViewById(R.id.t);
		t.setOnClickListener(this);
		
		th=(TextView) findViewById(R.id.th);
		th.setOnClickListener(this);
		
		n=(TextView) findViewById(R.id.n);
		n.setOnClickListener(this);
		
		l=(TextView) findViewById(R.id.l);
		l.setOnClickListener(this);
		
		k=(TextView) findViewById(R.id.k);
		k.setOnClickListener(this);
		
		kh=(TextView) findViewById(R.id.kh);
		kh.setOnClickListener(this);
		
		g=(TextView) findViewById(R.id.g);
		g.setOnClickListener(this);
		
		gh=(TextView) findViewById(R.id.gh);
		gh.setOnClickListener(this);
		
		h=(TextView) findViewById(R.id.h);
		h.setOnClickListener(this);
		
		ts=(TextView) findViewById(R.id.ts);
		ts.setOnClickListener(this);
		
		tsh=(TextView) findViewById(R.id.tsh);
		tsh.setOnClickListener(this);
		
		s=(TextView) findViewById(R.id.s);
		s.setOnClickListener(this);
		
		j=(TextView) findViewById(R.id.j);
		j.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.p:
			break;
		case R.id.ph:
			break;
		case R.id.m:
			break;
		case R.id.b:
			break;
		case R.id.t:
			break;
		case R.id.th:
			break;
		case R.id.n:
			break;
		case R.id.l:
			break;
		case R.id.k:
			break;
		case R.id.kh:
			break;
		case R.id.g:
			break;
		case R.id.gh:
			break;
		case R.id.h:
			break;
		case R.id.ts:
			break;
		case R.id.tsh:
			break;
		case R.id.s:
			break;
		case R.id.j:
			break;
		default:
			break;
		}
	}
}
