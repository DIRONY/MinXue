package com.sea.minxue.translate;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.sea.minxue.MainActivity;
import com.sea.minxue.QuestionDatabaseHelper;
import com.sea.minxue.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

@SuppressLint("HandlerLeak")
public class TraslateFragment extends Fragment implements OnClickListener {

	private Button traBtn;
	private EditText traEditText;
	private ListView traListView;
	private List<Entity>tralist=new ArrayList<Entity>();
	private TranslteAdapter tradapter;
	private QuestionDatabaseHelper questiondbhelper;
	private SQLiteDatabase questiondb;
	private Cursor trac;
	
	private Handler mHandler = new Handler(){

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			Entity e_tra=(Entity) msg.obj;
			tralist.add(e_tra);
			tradapter.notifyDataSetChanged();
			traListView.setSelection(tralist.size()-1);
		}
		
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.fanyi_layout, null);
		traBtn=(Button) view.findViewById(R.id.btn_translation);
		traBtn.setOnClickListener(this);
		
		traEditText=(EditText) view.findViewById(R.id.et_traslantion);
		traListView=(ListView) view.findViewById(R.id.li_traslation);
		
		questiondbhelper=new QuestionDatabaseHelper(getActivity());
		questiondb=questiondbhelper.getWritableDatabase();
		
		tradapter=new TranslteAdapter(getActivity(), tralist);
		traListView.setAdapter(tradapter);
		
		return view;
	}
	
	@Override
	public void onClick(View v) {
		
		final String ori=traEditText.getText().toString();
		if(ori.length()>0){
			Entity e_ori=new Entity();
			e_ori.setOri(true);
			e_ori.setText(ori);
			
			tralist.add(e_ori);
			tradapter.notifyDataSetChanged();
			traListView.setSelection(tralist.size()-1);
			traEditText.setText("");
			new Thread(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					Entity e_tra=null;
					String tra = null;
					trac=questiondb.rawQuery("select * from translation where ori_text=?", new String[]{ori});
					if(trac.moveToFirst()){
						tra=trac.getString(trac.getColumnIndex("tra_text"));
					}
					if(TextUtils.isEmpty(tra)){
						tra="�޷���";
					}
						e_tra=new Entity(tra,false);
						Message message = Message.obtain();
		                message.obj = e_tra;
		                mHandler.sendMessage(message);
				}
				
			}.start();
		}
	}
	
	
	class Entity{
		private String text;
		private boolean isOri;
		Entity(){}
		Entity(String text,boolean isOri){
			this.text=text;
			this.isOri=isOri;
		}
		
		public void setText(String text){
			this.text=text;
		}
		
		public String getText(){
			return text;
		}
		
		public void setOri(boolean isOri){
			this.isOri=isOri;
		}
		
		public boolean getOri(){
			return isOri;
		}
	}


//	@Override
//	public void onItemClick(AdapterView<?> parent, View view, int position,
//			long id) {
//		Log.i("click", "click it!!");
//		// TODO Auto-generated method stub
//		if(tradapter.getItemViewType(position)==1){
//			if(audiopath.length()>0){
//				String path=Environment.getExternalStorageDirectory()
//						.getAbsolutePath()+"/Minxue/"+audiopath+".mp3";
//				Log.i("media", path);
//				final int soundid=sound.load(path, 0);
//				sound.setOnLoadCompleteListener(new OnLoadCompleteListener() {
//					
//					@Override
//					public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
//						// TODO Auto-generated method stub
//						sound.play(soundid, volumnRatio, volumnRatio, 0, 0, 1);
//					}
//				});
//			}
//		}
//	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(!trac.isClosed()){
			trac.close();
		}
	}
	
	
}
