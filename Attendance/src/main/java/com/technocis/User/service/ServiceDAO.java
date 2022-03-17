package com.technocis.User.service;

import java.util.List;

import com.technocis.User.model.Attendance;

public interface ServiceDAO {
	//getallAttendance
		public List<Attendance> getAllAttendance();
	//getAttendance
		public Attendance getAttendance(int id);
	//insert new Attendance
		public Attendance insertAttendance(Attendance attendance);
	//update Attendance
		public Attendance updateAttendance(int id, Attendance attendance);
	//delete Attendance
		public Attendance deleteAttendance(int id);
}
