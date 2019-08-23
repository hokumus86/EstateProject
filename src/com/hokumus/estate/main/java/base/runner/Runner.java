package com.hokumus.estate.main.java.base.runner;

import java.sql.Date;
import java.util.Calendar;

import com.hokumus.estate.main.java.dao.member.MemberDAO;
import com.hokumus.estate.main.java.model.Member;
import com.hokumus.estate.main.java.model.MemberType;

public class Runner {

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("h�seyin okumu�");
		m.setEmail("sdfjdslkfj");
		m.setOpTime(new Date(Calendar.getInstance().YEAR, Calendar.getInstance().MONTH,
				Calendar.getInstance().DAY_OF_MONTH));
		m.setPasword("123");
		m.setType(MemberType.ADMIN);
		m.setUsername("hokumus");
		MemberDAO dao = new MemberDAO();
		if (dao.kaydet(m))
			System.out.println("i�lem ba�ar�l�");
		else
			System.out.println("ba�ar�s�z");
	}

}
