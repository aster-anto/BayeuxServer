/**
 * 
 */
package com.greengrid;

/**
 * @author user
 * 
 */
public class BayeuxServerBuilder {

	public BayeuxServer build() {
		return new BayeuxServer(8080);
	}

	public BayeuxServerBuilder registerListners(MessageListener... listeners) {
		return null;
	}

}
