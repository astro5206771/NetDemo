package com.ai.ipu.demo.network.net.http;

import java.util.concurrent.BlockingQueue;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * http请求执行，从网络请求队列中循环读取请求并且执行
 * @author larryjay
 */
public class HttpExecutor extends Thread{
	/** 
     * 网络请求队列 
     */  
    private BlockingQueue<Request> queue;
    
    private OkHttpClient mHttpClient;
    

}
