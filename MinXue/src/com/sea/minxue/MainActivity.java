package com.sea.minxue;

import com.sea.minxue.dialogue.DialogueFragment;
import com.sea.minxue.translate.TraslateFragment;
import com.sea.minxue.usercenter.UsercenterFragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class MainActivity extends ActionBarActivity {

	private FragmentTabHost mTabHost;

	private Class fragmentArray[] = { MainFragment.class,
			DialogueFragment.class, TraslateFragment.class,
			UsercenterFragment.class };

	private CharSequence mTextviewArray[] = { "闽语学习", "情景对话", "汉闽翻译", "用户中心" };

	private int mImageViewArray[] = { R.drawable.tab_zhuye,
			R.drawable.tab_duihua, R.drawable.tab_fanyi, R.drawable.tab_yonghu };

	@SuppressLint("InflateParams")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		for (int i = 0; i < fragmentArray.length; i++) {

			View view = getLayoutInflater().inflate(
					R.layout.minxue_tab_item_view, null);

			ImageView minxue_tab_icon = (ImageView) view
					.findViewById(R.id.minxue_tab_icon);
			minxue_tab_icon.setImageResource(mImageViewArray[i]);
			TextView minxue_tab_text = (TextView) view
					.findViewById(R.id.minxue_tab_text);
			minxue_tab_text.setText(mTextviewArray[i]);

			TabSpec minxue_tab_spec = mTabHost.newTabSpec(
					(String) mTextviewArray[i]).setIndicator(view);
			mTabHost.addTab(minxue_tab_spec, fragmentArray[i], null);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
