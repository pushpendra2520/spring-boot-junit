package com.stest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stest.model.User;

@SpringBootTest
class SimpleSpringwithjunitApplicationTests {

	@Autowired
	private User lg;
	
	
	@Test
	void test1() {
		
		assertEquals(lg.getYourUserid(),lg.getUserId(),"User id is Invalid");
		assertEquals(lg.getYourPassword(),lg.getPass(),"Password is Invalid");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Test Case :1 (Checking : UserId And Password Is Correct)");
		System.out.println("First Test Case");
		System.out.println("Valid Userid :Push@123 ");
		System.out.println("Valid Password :123456 ");
		System.out.println("you can login");
		System.out.println("--------------------------------------------------------------------------");
	}

	@Test
	void test2() {
		System.out.println("Test Case :2 (Checking : UserId is Invalid And Password is Valid)");	
		assertNotEquals(lg.getYourUserid(),lg.getUserId1(),"User id is Invalid");
		assertEquals(lg.getYourPassword(),lg.getPass1(),"Password is Invalid");
		
		System.out.println("Second Test Case");
		System.out.println("Invalid Userid :Push@12");
		System.out.println("Valid Password :123456 ");
		System.out.println("Userid is Invalid");
		System.out.println("--------------------------------------------------------------------------");
	}
	@Test
	void test3() {
		System.out.println("Test Case :3 (Checking : UserId Valid And Password is Invalid)");
		assertEquals(lg.getYourUserid(),lg.getUserId2(),"User id is Invalid");
		assertNotEquals(lg.getYourPassword(),lg.getPass2(),"Password is Invalid");
		
		System.out.println("Third Test Case");
		System.out.println("Valid User id :Push@123 ");
		System.out.println("Invalid Password :123456 ");
		System.out.println("Password is Invalid");
		System.out.println("--------------------------------------------------------------------------");
	}
	@Test
	void test4() {
		System.out.println("Test Case :4 (Checking : UserId  And Password are  Invalid)");
		assertNotEquals(lg.getYourUserid(),lg.getUserId3(),"User id is Invalid");
		assertNotEquals(lg.getYourPassword(),lg.getPass3(),"Password is Invalid");
		
		System.out.println("Fourth Test Case");
		System.out.println("Invalid Userid :Push@ ");
		System.out.println("Invalid Password :123 ");
		System.out.println("User Id and Password are Invalid");
		System.out.println("--------------------------------------------------------------------------");
	}
	@Test
	void test5() {
		System.out.println("Test Case :5 (Checking : All EntryFiled Are Null or Empty)");
		assertNull(lg.getUserId4(),"User id can not be Null");
		assertNull(lg.getPass4(),"Password can not be Null");
		
		System.out.println("Fifth Test Case");
		System.out.println("Null Userid : ");
		System.out.println("Null Password : ");
		System.out.println("User Id and Password can not be Null");
		System.out.println("--------------------------------------------------------------------------");
	}

}
