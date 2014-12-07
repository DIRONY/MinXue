package com.sea.minxue.translate;

import java.util.List;

import com.sea.minxue.QuestionDatabaseHelper;
import com.sea.minxue.R;
import com.sea.minxue.translate.TraslateFragment.Entity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TranslteAdapter extends BaseAdapter {

	private Context context;
	private List<Entity> list;
	private LayoutInflater inflater;
	private QuestionDatabaseHelper questiondbhelper;
	private SQLiteDatabase questiondb;
	private Cursor trac;
	private SoundPool sound;
	private float audioMaxVolumn;
	private float audioCurrentVolumn;
	private float volumnRatio;
	private String audiopath;

	public TranslteAdapter(Context context, List<Entity> list) {
		super();
		// TODO Auto-generated constructor stub
		this.context = context;
		this.list = list;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		questiondbhelper = new QuestionDatabaseHelper(context);
		questiondb = questiondbhelper.getWritableDatabase();

		sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 20);
		AudioManager amr = (AudioManager) context
				.getSystemService(Context.AUDIO_SERVICE);
		audioMaxVolumn = amr.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
		audioCurrentVolumn = amr.getStreamVolume(AudioManager.STREAM_MUSIC);
		volumnRatio = audioCurrentVolumn / audioMaxVolumn;
	}

	@Override
	public int getItemViewType(int position) {
		// TODO Auto-generated method stub
		Entity data = list.get(position);
		if (data.getOri()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Entity data = list.get(position);
		boolean isori = data.getOri();
		String tra_text = data.getText();

		trac = questiondb.rawQuery(
				"select * from translation where ori_text=?",
				new String[] { tra_text });
		if (trac.moveToFirst()) {
			audiopath = trac.getString(trac.getColumnIndex("voice"));
		}
		ViewHolder viewholder = null;
		if (convertView == null) {
			if (isori) {
				convertView = inflater.inflate(
						R.layout.right_original_text_item_view, null);
			} else {
				convertView = inflater.inflate(R.layout.left_mr_text_item_view,
						null);
			}
			viewholder = new ViewHolder();
			viewholder.content = (TextView) convertView
					.findViewById(R.id.tv_trascontent);
			viewholder.isOriginal = isori;
			convertView.setTag(viewholder);
		} else {
			viewholder = (ViewHolder) convertView.getTag();
		}
		viewholder.content.setText(tra_text);

		if (getItemViewType(position) == 1) {
			if (audiopath.length() > 0) {

				viewholder.content.setOnClickListener(new OnClickListener() {

					String path = Environment.getExternalStorageDirectory()
							.getAbsolutePath()
							+ "/Minxue/"
							+ audiopath
							+ ".mp3";

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						final int soundid = sound.load(path, 0);
						sound.setOnLoadCompleteListener(new OnLoadCompleteListener() {

							@Override
							public void onLoadComplete(SoundPool soundPool,
									int sampleId, int status) {
								// TODO Auto-generated method stub
								sound.play(soundid, volumnRatio, volumnRatio,
										0, 0, 1);
							}
						});
					}
				});

			}
		}

		return convertView;
	}
	
	
	static class ViewHolder {
		public TextView content;
		public boolean isOriginal;
	}
}
