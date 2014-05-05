package com.heidaner.dingdang;

import com.heidaner.dingdang.chat.ChaActivity;
import com.heidaner.dingdang.dynamic.DynamicActivity;
import com.heidaner.dingdang.friend.FriendActivity;
import com.heidaner.dingdang.more.MoreActivity;
import com.heidaner.dingdang.nearby.NearbyActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class HomeActivity extends Fragment implements OnCheckedChangeListener,
		OnClickListener {
	private FragmentTabHost mTabHost;
	private RadioGroup mTabRg;
	private final Class[] fragments = { NearbyActivity.class,
			ChaActivity.class, DynamicActivity.class, FriendActivity.class,
			MoreActivity.class };
	private TextView mTitleTextView;
	private View view;
	private MainActivity ma;
	private ImageView mLeftIcon;

	

	// /
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.activity_main, container, false);
		initView();
		return view;
	}

	private void initView() {
		// TODO Auto-generated method stub
		ma = (MainActivity) getActivity();
		mTitleTextView = (TextView) ma.findViewById(R.id.tv_title);
		mLeftIcon = (ImageView) ma.findViewById(R.id.iv_left_icon);
		mLeftIcon.setImageResource(R.drawable.ic_launcher);
		mLeftIcon.setOnClickListener(this);
		mTabHost = (FragmentTabHost) view.findViewById(android.R.id.tabhost);
		mTabHost.setup(ma.getApplicationContext(), getChildFragmentManager(),
				R.id.realtabcontent);
		int count = fragments.length;
		for (int i = 0; i < count; i++) {
			// 为每一个Tab按钮设置图标、文字和内容
			TabSpec tabSpec = mTabHost.newTabSpec(i + "").setIndicator(i + "");
			// 将Tab按钮添加进Tab选项卡中
			mTabHost.addTab(tabSpec, fragments[i], null);

		}
		mTabRg = (RadioGroup) view.findViewById(R.id.tab_rg_menu);
		mTabRg.setOnCheckedChangeListener(this);
		swichTab(0,"附近");

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId) {
		case R.id.tab_rb_1:
			swichTab(0, "附近");
			break;
		case R.id.tab_rb_2:
			swichTab(1, "对话");
			break;
		case R.id.tab_rb_3:
			swichTab(2, "动态");
			break;
		case R.id.tab_rb_4:
			swichTab(3, "好友");
			break;
		case R.id.tab_rb_5:
			swichTab(4, "更多");
			break;
		default:
			break;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_left_icon:
			ma.toggle();
			break;

		default:
			break;
		}
	}

	/**   
	 * @Title: swichTab   
	 * @Description: TODO(swich tab )   
	 * @param: @param Num	(tab num)
	 * @param: @param text (tab title)     
	 * @return: void      
	 * @throws   
	 */  
	public void swichTab(int num, String text) {
		mTabHost.setCurrentTab(num);
		mTitleTextView.setText(text);
	}


}
