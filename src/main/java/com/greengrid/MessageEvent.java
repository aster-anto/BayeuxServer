/**
 * 
 */
package com.greengrid;

import java.util.EventObject;

/**
 * @author user
 * 
 */
public class MessageEvent extends EventObject {

	private static final long serialVersionUID = 67068743332360452L;

	public MessageEvent() {
		this(new MessageSource());
	}

	public MessageEvent(MessageSource source) {
		super(source);
	}

}
