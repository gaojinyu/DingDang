package com.heidaner.dingdang.friend;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.heidaner.dingdang.R;

/**
 * @ClassName: FriendActivity
 * @Description:TODO(好友类)
 * @author: gjy
 * @date: 2014-5-6 下午3:32:10
 * 
 */
public class FriendActivity extends Fragment implements OnRefreshListener {
	private ListView friend_list;
	private View view;
	private SwipeRefreshLayout swipeRefreshLayout;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.activity_friend, container, false);
		initView();
		return view;
	}

	/**
	 * @Title: initView
	 * @Description: TODO(初始化视图)
	 * @param:
	 * @return: void
	 * @throws
	 */
	private void initView() {
		// TODO Auto-generated method stub

	}

	/**
	 * <p>
	 * Title: onRefresh
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener#onRefresh()
	 */
	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub

	}

}
