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
 * @date: 2014421 下午3:45:30
 * 
 */

public class DynamicActivity extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Autogenerated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Autogenerated method stub
		return inflater.inflate(R.layout.activity_dynamic, container, false);
	}
}