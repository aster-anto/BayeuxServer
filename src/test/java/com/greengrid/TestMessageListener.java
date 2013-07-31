/**
 * 
 */
package com.greengrid;

import org.apache.log4j.Logger;

/**
 * @author user
 *
 */
public class TestMessageListener implements MessageListener{
	
	private static final Logger log = Logger.getLogger(TestMessageListener.class);

	public void messageReceived(MessageEvent event) {
		log.info("messageReceived");
	}

}
