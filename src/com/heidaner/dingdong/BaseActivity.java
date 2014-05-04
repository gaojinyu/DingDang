/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  BaseActivity.java   
 * @Package com.example.dingdong   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-4-18 下午3:03:41   
 * @version V1.0     
 */
package com.heidaner.dingdong;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * @ClassName: BaseActivity
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: gjy
 * @date: 2014-4-18 下午3:03:41
 * 
 */

public class BaseActivity extends SlidingFragmentActivity implements
		OnClickListener, TabListener {
	protected Fragment mFrag;
	private ImageView mLeftIcon;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setBehindContentView(R.layout.menu_frame);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setCustomView(R.layout.actionbar_layout);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayShowHomeEnabled(false);
		mLeftIcon = (ImageView) findViewById(R.id.iv_left_icon);
		mLeftIcon.setOnClickListener(this);
		if (savedInstanceState == null) {
			FragmentTransaction t = this.getSupportFragmentManager()
					.beginTransaction();
			mFrag = new SettingFragment();
			t.replace(R.id.menu_frame, mFrag);

			t.commit();
		} else {
			mFrag = (ListFragment) this.getSupportFragmentManager()
					.findFragmentById(R.id.menu_frame);
		}

		// customize the SlidingMenu
		SlidingMenu sm = getSlidingMenu();
		sm.setShadowWidthRes(R.dimen.shadow_width);
		sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		sm.setFadeDegree(0.35f);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	//	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
			toggle();
			break;
		}
	}

	/**
	 * <p>
	 * Title: onTabSelected
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param tab
	 * @param ft
	 * @see com.actionbarsherlock.app.ActionBar.TabListener#onTabSelected(com.actionbarsherlock.app.ActionBar.Tab,
	 *      android.support.v4.app.FragmentTransaction)
	 */
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	/**
	 * <p>
	 * Title: onTabUnselected
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param tab
	 * @param ft
	 * @see com.actionbarsherlock.app.ActionBar.TabListener#onTabUnselected(com.actionbarsherlock.app.ActionBar.Tab,
	 *      android.support.v4.app.FragmentTransaction)
	 */
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	/**
	 * <p>
	 * Title: onTabReselected
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param tab
	 * @param ft
	 * @see com.actionbarsherlock.app.ActionBar.TabListener#onTabReselected(com.actionbarsherlock.app.ActionBar.Tab,
	 *      android.support.v4.app.FragmentTransaction)
	 */
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

}
