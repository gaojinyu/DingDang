package com.heidaner.dingdong.ddlogin;

import com.heidaner.dingdong.HomeActivity;
import com.heidaner.dingdong.MainActivity;
import com.heidaner.dingdong.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class DDLoginActivity extends Fragment implements OnClickListener {

	private View view;
	private MainActivity ma;
	private ImageView mLeftIcon;
	private Fragment mFragment;
	private TextView mTitleTextView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.activity_login, container, false);
		initView();
		return view;
	}

	private void initView() {
		// TODO Auto-generated method stub
		ma = (MainActivity) getActivity();
		mLeftIcon = (ImageView) ma.findViewById(R.id.iv_left_icon);
		mLeftIcon.setImageResource(R.drawable.ic_launcher);
		mLeftIcon.setOnClickListener(this);
		mTitleTextView = (TextView) ma.findViewById(R.id.tv_title);
		mTitleTextView.setText("登录");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_left_icon:
			mFragment = new HomeActivity();
			switchFragment(mFragment);
			break;

		default:
			break;
		}
	}

	private void switchFragment(Fragment mFragment2) {
		// TODO Auto-generated method stub
		if (getActivity() == null)
			return;
		ma.switchContent(mFragment2);
	}

}
