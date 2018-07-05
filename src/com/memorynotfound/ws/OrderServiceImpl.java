package com.memorynotfound.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.memorynotfound.ws.OrderService")
public class OrderServiceImpl implements OrderService {

    @Override
    public String[] getOrders() {
        return new String[]{"SSD", "Graphic Card", "GPU"};
    }

    @Override
    public boolean addOrder(String order) {
        System.out.println("Saving new order: " + order);
        return true;
    }
}