/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  DDlogin.java   
 * @Package com.heidaner.dingdang.ddlogin   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-5-5 下午4:09:37   
 * @version V1.0     
 */
package com.heidaner.dingdang.ddlogin;

import java.util.Collection;

import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

import android.util.Log;

/**
 * @ClassName: DDlogin
 * @Description:TODO(ddlogin class)
 * @author: gjy
 * @date: 2014-5-5 下午4:09:37
 * 
 */

public class DDlogin {

	private String user;
	private String psw;
	ConnectionConfiguration config;
	Connection connection;
	
	public static final String IP = "192.168.200.80"; // openfire server ip address
	public static final String SERVICENAME = "192.168.200.80"; // opfenfire servier name

	/**
	 * @Title: DDlogin
	 * @Description: TODO(constructor)
	 * @param: @param user //login username
	 * @param: @param psw //login passworld
	 * @throws
	 */
	public DDlogin(String user, String psw) {
		super();
		this.user = user;
		this.psw = psw;
	}

	/**
	 * @Title: login
	 * @Description: TODO(login methoud)
	 * @param:
	 * @return: void
	 * @throws
	 */
	public boolean login() {
		// TODO Auto-generated method stub
		try {
			config = new ConnectionConfiguration(IP, Integer.parseInt("5222"),
					SERVICENAME);
			config.setReconnectionAllowed(true);
			config.setSecurityMode(SecurityMode.disabled);
			config.setSASLAuthenticationEnabled(false);
			config.setCompressionEnabled(false);
			config.setSendPresence(true);
			connection = new XMPPConnection(config);
			connection.connect();
			connection.login(user, psw);
			System.out.println(connection.getUser());
			Log.d("im", "success");
		
			return true;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	/**  
	 * @Title:  getConnection <BR>  
	 * @Description: please write your description <BR>  
	 * @return: Connection <BR>  
	 */
	public Connection getConnection() {
		return connection;
	}

	/**  
	 * @Title:  setConnection <BR>  
	 * @Description: please write your description <BR>  
	 * @return: Connection <BR>  
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
