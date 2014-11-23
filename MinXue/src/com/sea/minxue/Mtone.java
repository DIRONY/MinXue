package com.sea.minxue;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Mtone extends Activity {

	ActionBar actionBar;
	private static CharSequence INTIALS_TITLE="变调规则";
	private TextView tv_actionbar_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.biandiao_layout);
		actionBar = getActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setCustomView(R.layout.minxue_actionbar);
		tv_actionbar_title=(TextView) actionBar.getCustomView()
				.findViewById(R.id.actionbar_title);
		tv_actionbar_title.setText(INTIALS_TITLE);
	}
}
