package com.sea.minxue;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Finals extends Activity implements OnClickListener, OnLoadCompleteListener {

	ActionBar actionBar;
	private static CharSequence INTIALS_TITLE="‘œƒ∏ΩÈ…‹";
	private TextView tv_actionbar_title;
	private TextView a,i,u,e,o,oo,ai,au,ia,iu,io,ua,ui,
	ue,iau,uai,m,ng,am,an,ang,im,in,ing,iam,ian,iang,un,
	iong,uan,ong,uang,ann,inn,unn,enn,onn,ainn,aunn,iann,
	iunn,uinn,iaunn,uann,uainn,ah,ih,uh,eh,oh,auh,iah,iuh,
	ioh,uah,uih,ueh,iauh,uaih,ap,ip,iap,at,it,ut,iat,ak,ik,
	ok,iak,iok;
	private SoundPool sound;
	private float audioMaxVolumn;
	private float audioCurrentVolumn;
	private float volumnRatio;
	private int soundid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yunmu_layout);
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
        
		a=(TextView) findViewById(R.id.a);
		a.setOnClickListener(this);
		
		i=(TextView) findViewById(R.id.i);
		i.setOnClickListener(this);
		
		u=(TextView) findViewById(R.id.u);
		u.setOnClickListener(this);
		
		e=(TextView) findViewById(R.id.e);
		e.setOnClickListener(this);
		
		o=(TextView) findViewById(R.id.o);
		o.setOnClickListener(this);
		
		oo=(TextView) findViewById(R.id.oo);
		oo.setOnClickListener(this);
		
		ai=(TextView) findViewById(R.id.ai);
		ai.setOnClickListener(this);
		
		au=(TextView) findViewById(R.id.au);
		au.setOnClickListener(this);
		
		ia=(TextView) findViewById(R.id.ia);
		ia.setOnClickListener(this);
		
		iu=(TextView) findViewById(R.id.iu);
		iu.setOnClickListener(this);
		
		io=(TextView) findViewById(R.id.io);
		io.setOnClickListener(this);
		
		ua=(TextView) findViewById(R.id.ua);
		ua.setOnClickListener(this);
		
		ui=(TextView) findViewById(R.id.ui);
		ui.setOnClickListener(this);
		
		ue=(TextView) findViewById(R.id.ue);
		ue.setOnClickListener(this);
		
		iau=(TextView) findViewById(R.id.iau);
		iau.setOnClickListener(this);
		
		uai=(TextView) findViewById(R.id.uai);
		uai.setOnClickListener(this);
		
		m=(TextView) findViewById(R.id.m);
		m.setOnClickListener(this);
		
		ng=(TextView) findViewById(R.id.ng);
		ng.setOnClickListener(this);
		
		am=(TextView) findViewById(R.id.am);
		am.setOnClickListener(this);
		
		an=(TextView) findViewById(R.id.an);
		an.setOnClickListener(this);
		
		ang=(TextView) findViewById(R.id.ang);
		ang.setOnClickListener(this);
		
		im=(TextView) findViewById(R.id.im);
		im.setOnClickListener(this);
		
		in=(TextView) findViewById(R.id.in);
		in.setOnClickListener(this);
		
		ing=(TextView) findViewById(R.id.ing);
		ing.setOnClickListener(this);
		
		iam=(TextView) findViewById(R.id.iam);
		iam.setOnClickListener(this);
		
		ian=(TextView) findViewById(R.id.ian);
		ian.setOnClickListener(this);
		
		iang=(TextView) findViewById(R.id.iang);
		iang.setOnClickListener(this);
		
		un=(TextView) findViewById(R.id.un);
		un.setOnClickListener(this);
		
		iong=(TextView) findViewById(R.id.iong);
		iong.setOnClickListener(this);
		
		uan=(TextView) findViewById(R.id.uan);
		uan.setOnClickListener(this);
		
		ong=(TextView) findViewById(R.id.ong);
		ong.setOnClickListener(this);
		
		uang=(TextView) findViewById(R.id.uang);
		uang.setOnClickListener(this);
		
		ann=(TextView) findViewById(R.id.ann);
		ann.setOnClickListener(this);
		
		inn=(TextView) findViewById(R.id.inn);
		inn.setOnClickListener(this);
		
		unn=(TextView) findViewById(R.id.unn);
		unn.setOnClickListener(this);
		
		enn=(TextView) findViewById(R.id.enn);
		enn.setOnClickListener(this);
		
		onn=(TextView) findViewById(R.id.onn);
		onn.setOnClickListener(this);
		
		ainn=(TextView) findViewById(R.id.ainn);
		ainn.setOnClickListener(this);
		
		aunn=(TextView) findViewById(R.id.aunn);
		aunn.setOnClickListener(this);
		
		iann=(TextView) findViewById(R.id.iann);
		iann.setOnClickListener(this);
		
		iunn=(TextView) findViewById(R.id.iunn);
		iunn.setOnClickListener(this);
		
		uinn=(TextView) findViewById(R.id.uinn);
		uinn.setOnClickListener(this);
		
		iaunn=(TextView) findViewById(R.id.iaunn);
		iaunn.setOnClickListener(this);
		
		uann=(TextView) findViewById(R.id.uann);
		uann.setOnClickListener(this);
		
		uainn=(TextView) findViewById(R.id.uainn);
		uainn.setOnClickListener(this);
		
		ah=(TextView) findViewById(R.id.ah);
		ah.setOnClickListener(this);
		
		ih=(TextView) findViewById(R.id.ih);
		ih.setOnClickListener(this);
		
		uh=(TextView) findViewById(R.id.uh);
		uh.setOnClickListener(this);
		
		eh=(TextView) findViewById(R.id.eh);
		eh.setOnClickListener(this);
		
		oh=(TextView) findViewById(R.id.oh);
		oh.setOnClickListener(this);
		
		auh=(TextView) findViewById(R.id.auh);
		auh.setOnClickListener(this);
		
		iah=(TextView) findViewById(R.id.iah);
		iah.setOnClickListener(this);
		
		iuh=(TextView) findViewById(R.id.iuh);
		iuh.setOnClickListener(this);
		
		ioh=(TextView) findViewById(R.id.ioh);
		ioh.setOnClickListener(this);
		
		uah=(TextView) findViewById(R.id.uah);
		uah.setOnClickListener(this);
		
		uih=(TextView) findViewById(R.id.uih);
		uih.setOnClickListener(this);
		
		ueh=(TextView) findViewById(R.id.ueh);
		ueh.setOnClickListener(this);
		
		iauh=(TextView) findViewById(R.id.iauh);
		iauh.setOnClickListener(this);
		
		uaih=(TextView) findViewById(R.id.uaih);
		uaih.setOnClickListener(this);
		
		ap=(TextView) findViewById(R.id.ap);
		ap.setOnClickListener(this);
		
		ip=(TextView) findViewById(R.id.ip);
		ip.setOnClickListener(this);
		
		iap=(TextView) findViewById(R.id.iap);
		iap.setOnClickListener(this);
		
		at=(TextView) findViewById(R.id.at);
		at.setOnClickListener(this);
		
		it=(TextView) findViewById(R.id.it);
		it.setOnClickListener(this);
		
		ut=(TextView) findViewById(R.id.ut);
		ut.setOnClickListener(this);
		
		iat=(TextView) findViewById(R.id.iat);
		iat.setOnClickListener(this);
		
		ak=(TextView) findViewById(R.id.ak);
		ak.setOnClickListener(this);
		
		ik=(TextView) findViewById(R.id.ik);
		ik.setOnClickListener(this);
		
		ok=(TextView) findViewById(R.id.ok);
		ok.setOnClickListener(this);
		
		iak=(TextView) findViewById(R.id.iak);
		iak.setOnClickListener(this);
		
		iok=(TextView) findViewById(R.id.iok);
		iok.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.a:
			soundid=sound.load(this, R.raw.a, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.i:
			soundid=sound.load(this, R.raw.i, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.u:
			soundid=sound.load(this, R.raw.u, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.e:
			soundid=sound.load(this, R.raw.e, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.o:
			soundid=sound.load(this, R.raw.o, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.oo:
			soundid=sound.load(this, R.raw.oo, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ai:
			soundid=sound.load(this, R.raw.ai, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.au:
			soundid=sound.load(this, R.raw.au, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ia:
			soundid=sound.load(this, R.raw.ia, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iu:
			soundid=sound.load(this, R.raw.iu, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.io:
			soundid=sound.load(this, R.raw.io, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ua:
			soundid=sound.load(this, R.raw.ua, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ui:
			soundid=sound.load(this, R.raw.ui, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ue:
			soundid=sound.load(this, R.raw.ue, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iau:
			soundid=sound.load(this, R.raw.iau, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uai:
			soundid=sound.load(this, R.raw.uai, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.m:
			soundid=sound.load(this, R.raw.m, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ng:
			soundid=sound.load(this, R.raw.ng, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.am:
			soundid=sound.load(this, R.raw.am, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.an:
			soundid=sound.load(this, R.raw.an, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ang:
			soundid=sound.load(this, R.raw.ang, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.im:
			soundid=sound.load(this, R.raw.im, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.in:
			soundid=sound.load(this, R.raw.in, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ing:
			soundid=sound.load(this, R.raw.ing, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iam:
			soundid=sound.load(this, R.raw.iam, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ian:
			soundid=sound.load(this, R.raw.ian, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iang:
			soundid=sound.load(this, R.raw.iang, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.un:
			soundid=sound.load(this, R.raw.un, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iong:
			soundid=sound.load(this, R.raw.iong, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uan:
			soundid=sound.load(this, R.raw.uan, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ong:
			soundid=sound.load(this, R.raw.ong, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uang:
			soundid=sound.load(this, R.raw.uang, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ann:
			soundid=sound.load(this, R.raw.ann, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.inn:
			soundid=sound.load(this, R.raw.inn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.unn:
			soundid=sound.load(this, R.raw.unn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.enn:
			soundid=sound.load(this, R.raw.enn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.onn:
			soundid=sound.load(this, R.raw.onn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ainn:
			soundid=sound.load(this, R.raw.ainn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.aunn:
			soundid=sound.load(this, R.raw.aunn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iann:
			soundid=sound.load(this, R.raw.iann, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iunn:
			soundid=sound.load(this, R.raw.iunn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uinn:
			soundid=sound.load(this, R.raw.uinn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iaunn:
			soundid=sound.load(this, R.raw.iaunn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uann:
			soundid=sound.load(this, R.raw.uann, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uainn:
			soundid=sound.load(this, R.raw.uainn, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ah:
			soundid=sound.load(this, R.raw.ah, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ih:
			soundid=sound.load(this, R.raw.ih, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uh:
			soundid=sound.load(this, R.raw.uh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.eh:
			soundid=sound.load(this, R.raw.eh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.oh:
			soundid=sound.load(this, R.raw.oh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.auh:
			soundid=sound.load(this, R.raw.auh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iah:
			soundid=sound.load(this, R.raw.iah, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iuh:
			soundid=sound.load(this, R.raw.iuh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ioh:
			soundid=sound.load(this, R.raw.ioh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uah:
			soundid=sound.load(this, R.raw.uah, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uih:
			soundid=sound.load(this, R.raw.uih, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ueh:
			soundid=sound.load(this, R.raw.ueh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iauh:
			soundid=sound.load(this, R.raw.iauh, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.uaih:
			soundid=sound.load(this, R.raw.uaih, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ap:
			soundid=sound.load(this, R.raw.ap, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ip:
			soundid=sound.load(this, R.raw.ip, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iap:
			soundid=sound.load(this, R.raw.iap, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.at:
			soundid=sound.load(this, R.raw.at, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.it:
			soundid=sound.load(this, R.raw.it, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ut:
			soundid=sound.load(this, R.raw.ut, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iat:
			soundid=sound.load(this, R.raw.iat, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ak:
			soundid=sound.load(this, R.raw.ak, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ik:
			soundid=sound.load(this, R.raw.ik, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.ok:
			soundid=sound.load(this, R.raw.ok, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iak:
			soundid=sound.load(this, R.raw.iak, 0);
			sound.setOnLoadCompleteListener(this);
			break;
		case R.id.iok:
			soundid=sound.load(this, R.raw.iok, 0);
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
	
}
