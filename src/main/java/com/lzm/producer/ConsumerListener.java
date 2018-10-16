package com.lzm.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ConsumerListener implements MessageListener {
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		TextMessage textMessage=(TextMessage)message;
		try {
			System.out.println("收到消息:"+textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
}
