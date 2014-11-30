package com.sea.minxue.dialogue;

import com.sea.minxue.QuestionDatabaseHelper;
import com.sea.minxue.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CategoryAdapter extends BaseExpandableListAdapter {

	private LayoutInflater mInflater = null;
	private String ori,tra,pin,aud;
	private Cursor cursor;
	private int cate;
	private Context context;
	private SoundPool sound;
	QuestionDatabaseHelper questiondbhelper;
	SQLiteDatabase questiondb;
	public CategoryAdapter(Context context, Cursor c,int cate) {
		super();
		mInflater = (LayoutInflater) context  
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.cursor=c;
		this.cate=cate;
		this.context=context;
		questiondbhelper=new QuestionDatabaseHelper(context);
		questiondb=questiondbhelper.getWritableDatabase();
		sound=new SoundPool(1, AudioManager.STREAM_MUSIC, 20);
	}
	
	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return cursor.getCount();
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressLint("ShowToast")
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView==null){
			convertView=mInflater.inflate(R.layout.cate_group_item_view,null);
		}
		
		TextView group=(TextView) convertView.findViewById(R.id.group);
		ImageView collect=(ImageView) convertView.findViewById(R.id.collect);
		if(cursor.moveToPosition(groupPosition)){
			ori=cursor.getString(cursor.getColumnIndex("original"));
			group.setText(ori);
			collect.setOnClickListener(new OnClickListener() {
				
				@SuppressLint("ShowToast")
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(cate!=0){
						questiondb.execSQL("update scene set flag = 1 where original = '"+ori+"'");
						Toast.makeText(context,"�ղسɹ�", Toast.LENGTH_SHORT).show();
					}
					else{
						questiondb.execSQL("update scene set flag = 0 where original = '"+ori+"'");
						Toast.makeText(context,"ȡ���ղسɹ�", Toast.LENGTH_SHORT).show();
					}
				}
			});
		}
		return convertView;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView==null){
			convertView=mInflater.inflate(R.layout.cate_children_item_view, null);
		}
		TextView child=(TextView) convertView.findViewById(R.id.fschild);
		TextView pinyin=(TextView) convertView.findViewById(R.id.scchild);
		ImageView horn=(ImageView) convertView.findViewById(R.id.horn);
		if(cursor.moveToPosition(groupPosition)){
			tra=cursor.getString(cursor.getColumnIndex("translate"));
			pin=cursor.getString(cursor.getColumnIndex("pinyin"));
			aud=cursor.getString(cursor.getColumnIndex("audio"));		
			child.setText(tra);
			pinyin.setText(pin);
			horn.setOnClickListener(new OnClickListener() {
				
				Resources res = context.getResources();
				final String packageName = context.getPackageName();
				int soundId=res.getIdentifier(aud, "raw", packageName);
				
				AudioManager amr=(AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
				float audioMaxVolumn = amr.getStreamMaxVolume(AudioManager.STREAM_MUSIC);  
		        float audioCurrentVolumn = amr.getStreamVolume(AudioManager.STREAM_MUSIC);  
		        float volumnRatio = audioCurrentVolumn/audioMaxVolumn;
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					final int playId=sound.load(context, soundId, 0);	
					sound.setOnLoadCompleteListener(new OnLoadCompleteListener() {
						
						@Override
						public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
							// TODO Auto-generated method stub
							sound.play(playId, volumnRatio, volumnRatio, 0, 0, 1);
						}
					});
					
				}
			});
		}
		return convertView;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}