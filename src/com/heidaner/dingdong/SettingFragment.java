package com.heidaner.dingdong;

import com.heidaner.dingdong.ddlogin.DDLoginActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingFragment extends Fragment implements OnClickListener {

	private View view;
	private Fragment dd_login_fragment;
	private Button dingdang_login_btn;
	private MainActivity ma;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.setting_layout, container, false);
		initView();
		return view;
	}

	private void initView() {
		// TODO Auto-generated method stub
		ma = (MainActivity) getActivity();
		dingdang_login_btn = (Button) view
				.findViewById(R.id.dingdang_login_btn);
		dingdang_login_btn.setOnClickListener(this);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		setupViews();
	}

	private void setupViews() {

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.dingdang_login_btn:
			dd_login_fragment = new DDLoginActivity();
			switchFragment(dd_login_fragment);
			break;

		default:
			break;
		}
	}

	private void switchFragment(Fragment dd_login_fragment2) {
		// TODO Auto-generated method stub
		if (getActivity() == null)
			return;
		ma.switchContent(dd_login_fragment2);
	}
}
