package com.heidaner.dingdang.ddlogin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.heidaner.dingdang.HomeActivity;
import com.heidaner.dingdang.MainActivity;
import com.heidaner.dingdang.R;
import com.heidaner.dingdang.base.DDProgressDialog;
import com.heidaner.dingdang.friend.FriendActivity;

public class DDLoginActivity extends Fragment implements OnClickListener {

	private View view;
	private MainActivity ma;
	private ImageView mLeftIcon;
	private HomeActivity mFragment;
	private TextView mTitleTextView;
	private EditText dd_login_user_edit, dd_login_psw_edit;
	private Button dd_login_login_btn;
	private Context context;
	private DDProgressDialog ddProgressDialog;

	private Handler ddLoginHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
			ddProgressDialog.dismiss();
			switch (msg.what) {
			case 1:
				Toast.makeText(context, "login sucess", Toast.LENGTH_SHORT)
						.show();
				mFragment = new HomeActivity();
				switchFragment(mFragment);
				break;
			case 2:
				Toast.makeText(context, "login failure", Toast.LENGTH_SHORT)
						.show();
				break;
			default:
				break;
			}

		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("DDLoginActivity", "------oncreateView------");
		view = inflater.inflate(R.layout.activity_login, container, false);
		initView();
		return view;
	}

	/**
	 * @Title: initView
	 * @Description: TODO(Initialize the view)
	 * @param:
	 * @return: void
	 * @throws
	 */
	private void initView() {
		// TODO Auto-generated method stub
		ma = (MainActivity) getActivity();
		context = ma;
		ddProgressDialog = new DDProgressDialog(context);
		mLeftIcon = (ImageView) ma.findViewById(R.id.iv_left_icon);
		mLeftIcon.setImageResource(R.drawable.ic_launcher);
		mLeftIcon.setOnClickListener(this);
		mTitleTextView = (TextView) ma.findViewById(R.id.tv_title);
		mTitleTextView.setText("登录");
		dd_login_user_edit = (EditText) view.findViewById(R.id.login_user_edit);
		dd_login_psw_edit = (EditText) view.findViewById(R.id.login_psw_edit);
		dd_login_login_btn = (Button) view.findViewById(R.id.dd_login_btn);
		dd_login_login_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_left_icon:
			mFragment = new HomeActivity();
			switchFragment(mFragment);
			break;
		case R.id.dd_login_btn:
			ddLogin();
		default:
			break;
		}
	}

	/**
	 * @Title: ddLogin
	 * @Description: TODO(login Methoud)
	 * @param:
	 * @return: void
	 * @throws
	 */
	@SuppressLint("NewApi")
	private void ddLogin() {
		// TODO Auto-generated method stub
		final String dd_login_user_str = String.valueOf(
				dd_login_user_edit.getText()).trim();
		final String dd_login_psw_str = String.valueOf(
				dd_login_psw_edit.getText()).trim();
		if (dd_login_user_str.isEmpty()) {
			Toast.makeText(context, "User name cannot be empty",
					Toast.LENGTH_SHORT).show();
		} else if (dd_login_psw_str.isEmpty()) {
			Toast.makeText(context, "passworld cannot be empty",
					Toast.LENGTH_SHORT).show();
		} else {
			ddProgressDialog.show();
			new Thread() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

					DDlogin login = new DDlogin(dd_login_user_str,
							dd_login_psw_str);
					if (login.login()) {
						Message msg = new Message();
						msg.what = 1;
						ddLoginHandler.sendMessage(msg);
					} else {
						Message msg = new Message();
						msg.what = 2;
						ddLoginHandler.sendMessage(msg);
					}

				}

			}.start();
		}

	}

	private void switchFragment(Fragment mFragment2) {
		// TODO Auto-generated method stub
		if (getActivity() == null)
			return;
		ma.switchContent(mFragment2);
	}

}
