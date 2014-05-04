package com.heidaner.dingdang;

import com.heidaner.dingdang.eyetoeye.EyeToEyeActivity;
import com.heidaner.dingdang.me.MeActivity;
import com.heidaner.dingdang.nearby.NearbyActivity;
import com.heidaner.dingdang.plaza.PlazaActivity;

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
	private final Class[] fragments = { EyeToEyeActivity.class,
			PlazaActivity.class, NearbyActivity.class, MeActivity.class };
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
		mTabHost.setCurrentTab(0);
		mTitleTextView.setText("心有灵犀");

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId) {
		case R.id.tab_rb_1:
			mTabHost.setCurrentTab(1);
			mTitleTextView.setText("心有灵犀");
			break;
		case R.id.tab_rb_2:
			mTabHost.setCurrentTab(2);
			mTitleTextView.setText("擦肩而过");
			break;
		case R.id.tab_rb_3:
			mTabHost.setCurrentTab(3);
			mTitleTextView.setText("万里挑一");
			break;
		case R.id.tab_rb_4:
			mTabHost.setCurrentTab(4);
			mTitleTextView.setText("个人中心");
			break;

		default:
			break;
		}
	}

	/**
	 * <p>
	 * Title: onClick
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param v
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
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

}