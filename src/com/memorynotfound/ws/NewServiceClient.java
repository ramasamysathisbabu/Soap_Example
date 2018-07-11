package com.memorynotfound.ws;

import java.net.MalformedURLException;
import java.net.URL;

import com.thejavageek.client.OrderService;
import com.thejavageek.client.OrderServiceImplService;

public class NewServiceClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:9555/service/order?wsdl");
		OrderServiceImplService newService = new OrderServiceImplService(url);
		OrderService servicePort = newService.getOrderServiceImplPort();
		
		System.out.println(servicePort.getOrders());
		
	}

}
