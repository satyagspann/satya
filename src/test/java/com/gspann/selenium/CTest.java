package com.gspann.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CTest {

	@Test
	public void t1(){
		System.out.println("Hi am test 1");
		Assert.assertTrue(true,"");
	}

	@Test
	public void t2(){
		System.out.println("Hi am test 2");
		Assert.assertTrue(false,"");
	}
	
	@Test
	public void t3(){
		System.out.println("Hi am test 3");
		Assert.assertTrue(true,"");
	}
	}

