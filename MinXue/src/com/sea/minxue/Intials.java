package com.sea.minxue;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Intials extends Activity implements OnClickListener, OnLoadCompleteListener {

	ActionBar actionBar;
	private static CharSequence INTIALS_TITLE="��ĸ����";
	private TextView tv_actionbar_title;
	private TextView p,ph,m,b,t,th,n,l,k,kh,g,ng,h,ts,tsh,s,j;
	private SoundPool sound;
	private float audioMaxVolumn;
	private float audioCurrentVolumn;
	private float volumnRatio;
	private int soundid;
	
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
		sound=new SoundPool(1, AudioManager.STREAM_MUSIC, 20);
		AudioManager amr=(AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
		audioMaxVolumn = amr.getStreamMaxVolume(AudioManager.STREAM_MUSIC);  
        audioCurrentVolumn = amr.getStreamVolume(AudioManager.STREAM_MUSIC);  
        volumnRatio = audioCurrentVolumn/audioMaxVolumn;
        
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
		
		ng=(TextView) findViewById(R.id.ng);
		ng.setOnClickListener(this);
		
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
			soundid=sound.load(this,R.raw.p,0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ph:
			soundid=sound.load(this, R.raw.ph, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.m:
			soundid=sound.load(this, R.raw.m, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.b:
			soundid=sound.load(this, R.raw.b, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.t:
			soundid=sound.load(this, R.raw.t, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.th:
			soundid=sound.load(this, R.raw.th, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.n:
			soundid=sound.load(this, R.raw.n, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.l:
			soundid=sound.load(this, R.raw.l, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.k:
			soundid=sound.load(this, R.raw.k, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.kh:
			soundid=sound.load(this, R.raw.kh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.g:
			soundid=sound.load(this, R.raw.g, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ng:
			soundid=sound.load(this, R.raw.ng, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.h:
			soundid=sound.load(this, R.raw.h, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ts:
			soundid=sound.load(this, R.raw.ts,0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.tsh:
			soundid=sound.load(this, R.raw.tsh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.s:
			soundid=sound.load(this, R.raw.s, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.j:
			soundid=sound.load(this, R.raw.j, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		default:
			break;
		}
	}

	@Override
	public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
		// TODO Auto-generated method stub
		sound.play(soundid, volumnRatio, volumnRatio, 0, 0, 1);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(sound!=null){
			sound.release();
		}
	}
	
	
}
