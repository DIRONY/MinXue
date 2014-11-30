package com.sea.minxue.dialogue;

import com.sea.minxue.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DialogueAdapter extends BaseAdapter {
	
	private String [] categoryArray={"�Զ���","�ʺ�","��ͨ","ס��","����","����","����"};
	private LayoutInflater mInflater = null;  
	
	public DialogueAdapter(Context context) {
		super();
		mInflater = (LayoutInflater) context  
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return categoryArray.length;
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
		ViewHolder holder = null;   
		if (convertView == null) {    
            holder = new ViewHolder();    
            convertView=mInflater.inflate(R.layout.dialogue_list_item,null);
            holder.item_tv=(TextView) convertView.findViewById(R.id.item_content);
            convertView.setTag(holder);   
		}
		else{
			holder = (ViewHolder) convertView.getTag();  
		}
		holder.item_tv.setText(categoryArray[position]);
		return convertView;
	}
	private static class ViewHolder  
    {  
         TextView item_tv;    
    }
}
