package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc= new Scanner(System.in);


		Class.forName("com.mysql.cj.jdbc.Driver");
		//		System.out.println("Enter your url \n in Format Protocol:dbvendor://IP:portname/database");
		//		//String url= sc.nextLine();
		//
		//		System.out.println("Enter the Username");
		//		String Username= sc.next();
		//
		//		System.out.println("Enter the Password");
		//		String pwd= sc.next();
		Connection con=null;
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Mitesh21@7");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement st=null;
		String query ="Select name from product";
		ResultSet rs=null;
		try {

			st= con.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs= st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There iS some Error");
			e.printStackTrace();
		}

		ArrayList<String> pname = new ArrayList<String>();
		try {
			while(rs.next()) {
				pname.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry no data present");
			e.printStackTrace();
		}

		for(int i=0;i<pname.size();i++)
		{
			System.out.println(pname.get(i));
		}

		System.out.println("The total element in the product are "+ pname.size());
		System.out.println("Enter name to find Product");
		String check= sc.nextLine();
		int conn=0;


		for(int i=0;i<pname.size();i++)
		{
			if(check.equals(pname.get(i)))
				conn++;
		}
		if(conn>0)
			System.out.println("product is Present");
		else
			System.out.println("no product in the list");
		
		DemoApplication obj = new DemoApplication();
		obj.insert();

	}
	
	    // insert method
		public  void insert() throws ClassNotFoundException {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			//		System.out.println("Enter your url \n in Format Protocol:dbvendor://IP:portname/database");
			//		//String url= sc.nextLine();
			//
			//		System.out.println("Enter the Username");
			//		String Username= sc.next();
			//
			//		System.out.println("Enter the Password");
			//		String pwd= sc.next();
			Connection con=null;
			try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Mitesh21@7");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PreparedStatement pst =null;
			try {
				pst = con.prepareStatement("insert into product values (default,?,?)");
				
				sc.nextLine();
				System.out.println("Enter name : ");
				String name = sc.nextLine();
				pst.setString(1, name);
				
				System.out.println("Enter cost : ");
				int cost = sc.nextInt();
				pst.setInt(2, cost);
				
				pst.executeUpdate();
				
				System.out.println("Enter successfully..");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("insert failed..");
			}
		}
		
		/*public void Update() throws ClassNotFoundException {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			//		System.out.println("Enter your url \n in Format Protocol:dbvendor://IP:portname/database");
			//		//String url= sc.nextLine();
			//
			//		System.out.println("Enter the Username");
			//		String Username= sc.next();
			//
			//		System.out.println("Enter the Password");
			//		String pwd= sc.next();
			Connection con=null;
			try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Mitesh21@7");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PreparedStatement pst = null;
			try {
				 pst = con.prepareStatement("alter table product where id = ?");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
}
