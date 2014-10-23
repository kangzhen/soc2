package com.socket;

import java.awt.dnd.peer.DropTargetPeer;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMysql {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("");
		String user;
		String url;
		String pwd;
		Connection con;
		try {
			con = DriverManager.getConnection(url,user,pwd);
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		X
		}
	}

}
