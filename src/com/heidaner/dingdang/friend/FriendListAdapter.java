/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  FriendListAdapter.java   
 * @Package com.heidaner.dingdang.friend   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-5-7 上午10:10:34   
 * @version V1.0     
 */  
package com.heidaner.dingdang.friend;

import java.util.Collection;

import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smackx.packet.VCard;

import com.heidaner.dingdang.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**   
 * @ClassName:  FriendListAdapter   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: gjy  
 * @date:   2014-5-7 上午10:10:34   
 *      
 */

public class FriendListAdapter extends BaseAdapter{

	private Context context;
	private Object[] objects;
	/**   
	 * @Title:  FriendListAdapter   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param context
	 * @param:  @param rosterEntries  
	 * @throws   
	 */  
	public FriendListAdapter(Context context,
			Object[] objects) {
		// TODO Auto-generated constructor stub
		this.context=context;
		this.objects=objects;
	}

	/**   
	 * <p>Title: getCount</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see android.widget.Adapter#getCount()   
	 */  
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
	
		return objects.length;
	}

	/**   
	 * <p>Title: getItem</p>   
	 * <p>Description: </p>   
	 * @param position
	 * @return   
	 * @see android.widget.Adapter#getItem(int)   
	 */  
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return objects[position];
	}

	/**   
	 * <p>Title: getItemId</p>   
	 * <p>Description: </p>   
	 * @param position
	 * @return   
	 * @see android.widget.Adapter#getItemId(int)   
	 */  
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	/**   
	 * <p>Title: getView</p>   
	 * <p>Description: </p>   
	 * @param position
	 * @param convertView
	 * @param parent
	 * @return   
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)   
	 */  
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder;
		if(convertView==null){
			convertView=LayoutInflater.from(context).inflate(R.layout.list_item_friend,null);
			viewHolder=new ViewHolder();
			viewHolder.name=(TextView)convertView.findViewById(R.id.name);
			convertView.setTag(viewHolder);
		}else{
			viewHolder=(ViewHolder)convertView.getTag();
		}
		RosterEntry rosterEntry=(RosterEntry) objects[position];
		VCard vCard=new VCard();
		
		viewHolder.name.setText(rosterEntry.getName());
		
		return convertView;
	}

	class ViewHolder{
		TextView name;
	}
}
