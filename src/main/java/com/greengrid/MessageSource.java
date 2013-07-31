/**
 * 
 */
package com.greengrid;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author user
 * 
 */
public class MessageSource {

	private List<MessageListener> listeners = new CopyOnWriteArrayList<MessageListener>();

	public synchronized void addEventListener(MessageListener listener) {
		listeners.add(listener);
	}

	public synchronized void removeEventListener(MessageListener listener) {
		listeners.remove(listener);
	}

	public synchronized void fireEvent() {
		MessageEvent event = new MessageEvent(this);
		Iterator<MessageListener> i = listeners.iterator();
		while (i.hasNext()) {
			((MessageListener) i.next()).messageReceived(event);
		}
	}

}
