package com.heidaner.dingdong.plaza;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heidaner.dingdong.R;

/**
 * @ClassName: PlazaActivity
 * @Description:TODO("广场"类)
 * @author: gjy
 * @date: 2014-4-21 下午3:44:46
 * 
 */

public class PlazaActivity extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_plaza, container, false);
	}

}
