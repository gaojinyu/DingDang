/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  DDProgressDialog.java   
 * @Package com.heidaner.dingdang.base   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-5-5 下午3:51:19   
 * @version V1.0     
 */
package com.heidaner.dingdang.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;

/**
 * @ClassName: DDProgressDialog
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: gjy
 * @date: 2014-5-5 下午3:51:19
 * 
 */

public class DDProgressDialog extends ProgressDialog {

	private Context context;

	@Override
	public void setContentView(View view) {
		// TODO Auto-generated method stub
		setContentView(new Button(context));
	}

	/**
	 * @Title: DDProgressDialog
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param context
	 * @throws
	 */
	public DDProgressDialog(Context context) {
		super(context);
		this.context = context;
		// TODO Auto-generated constructor stub
	}

}
