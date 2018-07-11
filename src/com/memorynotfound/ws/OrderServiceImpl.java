package com.memorynotfound.ws;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.memorynotfound.ws.OrderService")
public class OrderServiceImpl implements OrderService {

    @Override
    public String getOrders() {
        return "Graphic Card";
    }

    @Override
    public boolean addOrder(String order) {
        System.out.println("Saving new order: " + order);
        return true;
    }
}