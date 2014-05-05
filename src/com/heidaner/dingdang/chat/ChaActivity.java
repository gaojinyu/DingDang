/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  EyeToEyeActivity.java   
 * @Package com.heidaner.dingdong.eyetoeye   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-4-21 下午3:38:09   
 * @version V1.0     
 */  
package com.heidaner.dingdang.chat;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heidaner.dingdang.R;

/**   
 * @ClassName:  EyeToEyeActivity   
 * @Description:TODO(心犀类)   
 * @author: gjy  
 * @date:   2014-4-21 下午3:38:09   
 *      
 */

public class ChaActivity extends Fragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_chat, container,false);
	}

	
}
