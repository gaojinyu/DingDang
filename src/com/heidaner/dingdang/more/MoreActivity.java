package com.heidaner.dingdang.more;

import com.heidaner.dingdang.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @ClassName: MoreActivity
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: gjy
 * @date: 201456 下午2:22:41
 * 
 */

public class MoreActivity extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Autogenerated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Autogenerated method stub
		return inflater.inflate(R.layout.activity_more, container, false);
	}
}