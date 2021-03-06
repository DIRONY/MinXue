package com.sea.minxue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

@SuppressLint("HandlerLeak")
public class Pinyin extends Activity implements OnClickListener {

	ActionBar actionBar;
	QuestionDatabaseHelper questiondbhelper;
	SQLiteDatabase questiondb;
	private static CharSequence INTIALS_TITLE = "拼音测试";
	private TextView tv_actionbar_title, questionview, stateview;
	private Button ansA, ansB, ansC, ansD;
	private int tr = 0;
	private int qnumber = 1;
	private static final int SUM = 10;
	private Map<String, String> mainMap = new HashMap<String, String>();
	private final static int CHANGE_QUESTION = 1;
	private Handler handler = new Handler() {

		@SuppressWarnings("unchecked")
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			switch (msg.what) {
			case CHANGE_QUESTION:
				mainMap = (Map<String, String>) msg.obj;
				stateview.setText("第" + qnumber + "题");
				questionview.setText(mainMap.get("questions"));
				ansA.setText("A." +mainMap.get("a"));
				ansB.setText("B." +mainMap.get("b"));
				ansC.setText("C." +mainMap.get("c"));
				ansD.setText("D." +mainMap.get("d"));
				break;
			default:
				break;
			}
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pinyin_layout);
		actionBar = getActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setCustomView(R.layout.minxue_actionbar);
		tv_actionbar_title = (TextView) actionBar.getCustomView().findViewById(
				R.id.actionbar_title);
		tv_actionbar_title.setText(INTIALS_TITLE);
		questionview = (TextView) findViewById(R.id.question);
		stateview = (TextView) findViewById(R.id.statusview);
		ansA = (Button) findViewById(R.id.ans_a);
		ansA.setOnClickListener(this);
		ansB = (Button) findViewById(R.id.ans_b);
		ansB.setOnClickListener(this);
		ansC = (Button) findViewById(R.id.ans_c);
		ansC.setOnClickListener(this);
		ansD = (Button) findViewById(R.id.ans_d);
		ansD.setOnClickListener(this);
		questiondbhelper = new QuestionDatabaseHelper(this);
		questiondb = questiondbhelper.getWritableDatabase();
		
		new Thread(new StartGame()).start();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.ans_a:
			if(qnumber==SUM){			
				if(mainMap.get("answer").equals("a")){
					tr++;				
				}
				GoOverGame();
			}
			else if((mainMap.get("answer").equals("a"))){
				tr++;
				qnumber++;
				new Thread(new StartGame()).start();
			}
			else{
				qnumber++;
				new Thread(new StartGame()).start();
			}
			break;
		case R.id.ans_b:
			if(qnumber==SUM){			
				if(mainMap.get("answer").equals("b")){
					tr++;				
				}
				GoOverGame();
			}
			else if(mainMap.get("answer").equals("b")){
				tr++;
				qnumber++;
				new Thread(new StartGame()).start();
			}
			else{
				qnumber++;
				new Thread(new StartGame()).start();
			}
			break;
		case R.id.ans_c:
			if(qnumber==SUM){			
				if(mainMap.get("answer").equals("c")){
					tr++;				
				}
				GoOverGame();
			}
			else if(mainMap.get("answer").equals("c")){
				tr++;
				qnumber++;
				new Thread(new StartGame()).start();
			}
			else{
				qnumber++;
				new Thread(new StartGame()).start();
			}
			break;
		case R.id.ans_d:
			if(qnumber==SUM){			
				if(mainMap.get("answer").equals("d")){
					tr++;				
				}
				GoOverGame();
			}
			else if(mainMap.get("answer").equals("d")){
				tr++;
				qnumber++;
				new Thread(new StartGame()).start();
			}
			else{
				qnumber++;
				new Thread(new StartGame()).start();
			}
			break;
		default:
			break;
		}
	}

	public class StartGame implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Cursor c = questiondb.rawQuery("SELECT * FROM question WHERE _id ="+qnumber,null);
			int colums = c.getColumnCount();
			Map<String, String> map = new HashMap<String, String>();
			while (c.moveToNext()) {
				for (int i = 0; i < colums; i++) {
					String columname = c.getColumnName(i);
					String columvalue = c
							.getString(c.getColumnIndex(columname));
					if (columvalue == null) {
						columvalue = "";
					}
					map.put(columname, columvalue);
				}
			}
			if(!c.isClosed()&&c!=null){
				c.close();
			}
			Message message = Message.obtain();
			message.obj = map; 
			message.what = CHANGE_QUESTION;
			handler.sendMessage(message); 
		}
	}
	
	private void GoOverGame(){
		AlertDialog.Builder builder=new Builder(this);
		builder.setTitle("计分牌");
		builder.setMessage("SCORE:"+tr*10);
		builder.setNegativeButton("结束",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Pinyin.this.finish();
			}
		});
		builder.setPositiveButton("重新开始",
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						new RestartGame().run();
					}
				});
		builder.setCancelable(false);
		Dialog dialog = builder.create();
		dialog.show();
	}
	
	private class RestartGame implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			qnumber=1;
			tr=0;
			new Thread(new StartGame()).start();
		}
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(questiondb.isOpen()){
			questiondb.close();
		}
	}
}
