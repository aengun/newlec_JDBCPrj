package com.newlecture.web;

import java.util.List;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;

public class Program {

	public static void main(String[] args) {

//		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
//		String sql = "SELECT * FROM MEMBER";
//
//		try {
//			Connection con = DriverManager.getConnection(url, "NEWLEC", "11111");
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sql);
//			
//			String[] nicnames = new String[2];
//			
//			if(rs.next()) {
//				nicnames[0] = rs.getNString("NICNAME");
//			}
//			
//			if(rs.next()) {
//				nicnames[1] = rs.getNString("NICNAME");
//			}
//			
//			System.out.println("nickname : "+nicnames[0]);
//			System.out.println("nickname : "+nicnames[1]);
//
//			rs.close();
//			st.close();
//			con.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("hello");

		MemberService service = new MemberService();

		List<Member> list = service.getList();

		for (Member m : list)
			System.out.printf("id : %d, nicname : %s, name : %s\n", m.getId(), m.getNicname(), m.getName());

	}

}
