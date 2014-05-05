/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  MoreActivity.java   
 * @Package com.heidan.dingdang.more   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-5-6 下午2:22:41   
 * @version V1.0     
 */  
package com.heidaner.dingdang.more;

import com.heidaner.dingdang.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**   
 * @ClassName:  MoreActivity   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: gjy  
 * @date:   2014-5-6 下午2:22:41   
 *      
 */

public class MoreActivity extends Fragment{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_more, container,false);
	}
}
