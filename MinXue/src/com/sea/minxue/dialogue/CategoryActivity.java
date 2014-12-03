package com.sea.minxue.dialogue;

import com.sea.minxue.QuestionDatabaseHelper;
import com.sea.minxue.R;

import android.app.ExpandableListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.os.Bundle;

public class CategoryActivity extends ExpandableListActivity {
	
	private int sql_code;
	QuestionDatabaseHelper questiondbhelper;
	SQLiteDatabase questiondb;
	CategoryAdapter cateadapter=null;
	Cursor cursor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category);
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		
		sql_code=getIntent().getIntExtra("position", 0);
		questiondbhelper=new QuestionDatabaseHelper(this);
		questiondb=questiondbhelper.getWritableDatabase();
		if(sql_code!=0){
			cursor=questiondb.rawQuery("select * from scene where cat = "+sql_code, null);
		}
		else{
			cursor=questiondb.rawQuery("select * from scene where flag = 1", null);
		}
		cateadapter=new CategoryAdapter(this,cursor,sql_code);
		setListAdapter(cateadapter);
	}
	
}
