/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  NearbyActivity.java   
 * @Package com.heidaner.dingdong.nearby   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-4-21 下午3:43:38   
 * @version V1.0     
 */
package com.heidaner.dingdong.nearby;

import com.heidaner.dingdong.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @ClassName: NearbyActivity
 * @Description:TODO("附近类")
 * @author: gjy
 * @date: 2014-4-21 下午3:43:38
 * 
 */

public class NearbyActivity extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_nearby, container,false);
	}

	
}
