/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  MeActivity.java   
 * @Package com.heidaner.dingdong.me   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-4-21 下午3:45:30   
 * @version V1.0     
 */
package com.heidaner.dingdang.dynamic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heidaner.dingdang.R;

/**
 * @ClassName: MeActivity
 * @Description:TODO("我"类)
 * @author: gjy
 * @date: 2014-4-21 下午3:45:30
 * 
 */

public class DynamicActivity extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_dynamic, container, false);
	}

}
