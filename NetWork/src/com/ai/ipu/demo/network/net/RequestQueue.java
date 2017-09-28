package com.ai.ipu.demo.network.net;

import java.util.concurrent.BlockingQueue;

import okhttp3.Request;

/**
 * @author larryjay
 * 请求队列
 */
public class RequestQueue<T> {
	private BlockingQueue<T> blockingQueue;
	
	public RequestQueue(){
		
	}
	
	public void add(T request){
		blockingQueue.add(request);
	}
	
	public void remove(){
		blockingQueue.remove();
	}
	
}
