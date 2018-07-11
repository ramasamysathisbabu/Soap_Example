package com.memorynotfound.ws;

import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class GreetingClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL wsdlUrl = new URL("http://localhost:8888/service/order?wsdl");
		QName qName = new QName("http://ws.memorynotfound.com/", "OrderServiceImplService");
		Service service = Service.create(wsdlUrl, qName);
		OrderService orderService = service.getPort(OrderService.class);
		
		System.out.println(orderService.getOrders());
		
	}

}
