package com.technocis.User.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.User.model.Attendance;

public class AttendanceDAOImpl implements AttendanceDAO {
	public String SelectallAttendance = "select id,UName,status,date,Iname from attendance";
	public String selectAttendance = "select id,UName,status,date,Iname from attendance where id=?";
	public String insertAttendance = "insert into attendance (id,UName,status,date,Iname) values(?,?,?,?,?)";
	public String updateAttendance = "update into attendance set id=?,UName=?,status=?,date=?,Iname=? where id=?";
	public String deleteAttendance = "delete from attendance where id=?";
	private int Id;

	public List<Attendance> getAllAttendance() {

		Connection con = ConnectionUtill.getDBConnect();
		List <Attendance> resList=new ArrayList<Attendance>();
		try {
			PreparedStatement pstmt = con.prepareStatement(SelectallAttendance);
			ResultSet res = pstmt.executeQuery();
			while (res.next())
			{
				Attendance attendance1 = new Attendance(res.getInt(0), res.getString(1), res.getString(2),
						res.getString(3), res.getString(4));

				resList.add(attendance1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resList;
	}

	public Attendance getAttendance(int id) {
		Connection con = ConnectionUtill.getDBConnect();
		Attendance attendance = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(selectAttendance);
			pstmt.setInt(1, Id);
			ResultSet res = pstmt.executeQuery();
			if (res.next())
			{
			attendance = new Attendance(res.getInt(0), res.getString(1), res.getString(2),
						res.getString(3), res.getString(4));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return attendance;
	}

	public Attendance insertAttendance(Attendance attendance) {
		Connection con=ConnectionUtill.getDBConnect();
		
		return null;
	}

	public Attendance updateAttendance(int id, Attendance attendance) {
		return null;
	}

	public Attendance deleteAttendance(int id) {
		return null;
	}

}
