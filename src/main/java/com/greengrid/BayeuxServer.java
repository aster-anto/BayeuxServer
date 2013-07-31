/**
 * 
 */
package com.greengrid;

/**
 * @author user
 * 
 */
public class BayeuxServer {

	private int port;
	public static BayeuxServerBuilder builder;

	public BayeuxServer(int i) {
		setPort(i);
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public boolean start() {
		return false;
	}

}
