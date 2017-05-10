package com.selam;

import com.selam.web.i18n.I18nService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) //When a class is annotated with @RunWith or extends a class annotated with @RunWith ,
// JUnit will invoke the class it references to run the tests in that class instead of the runner built into JUnit.
@ContextConfiguration(classes = SelamDemoApplication.class)
//@SpringBootTest
@WebAppConfiguration
public class SelamDemoApplicationTests {

    @Autowired
    private I18nService i18nService;

	@Test
	public void testMessageByLocalService() throws Exception	{
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18nService.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);

	}


}

