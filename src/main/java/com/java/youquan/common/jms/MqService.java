package com.java.youquan.common.jms;

public interface MqService {
	void doService(String jsonStr);
	void init();
	void stop();
}
