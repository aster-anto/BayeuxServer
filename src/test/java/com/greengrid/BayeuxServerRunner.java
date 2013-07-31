/**
 * 
 */
package com.greengrid;

import org.testng.annotations.Test;

/**
 * @author user
 * 
 */
public class BayeuxServerRunner {

	public void run() {
		BayeuxServer bayeuxServer = BayeuxServer.builder.registerListners(
				new ChatChannelListener()).build();
		bayeuxServer.start();
	}
	
	@Test
	public void testEvent(){
		MessageSource messageSource = new MessageSource();
		MessageEvent messageEvent = new MessageEvent();
		TestMessageListener testMessageListener = new TestMessageListener();
		messageSource.addEventListener(testMessageListener);
		messageSource.fireEvent();
	}

}
