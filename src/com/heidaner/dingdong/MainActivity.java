package com.heidaner.dingdong;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends BaseActivity {
	private Fragment mContent;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if (savedInstanceState != null)
			mContent = getSupportFragmentManager().getFragment(
					savedInstanceState, "mContent");
		if (mContent == null)
			mContent = new HomeActivity();
		setContentView(R.layout.content_frame);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.content_frame, mContent).commit();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		getSupportFragmentManager().putFragment(outState, "mContent", mContent);
	}

	public void switchContent(Fragment dd_login_fragment2) {
		// TODO Auto-generated method stub
		mContent = dd_login_fragment2;
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.content_frame, dd_login_fragment2).commit();
		getSlidingMenu().showContent();
	}

}
