package com.springcore;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class House implements InitializingBean, DisposableBean {
    private int price;

    public House(int price) {
        this.price = price;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void destroy() throws Exception {
        System.out.println("House destroyed");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("House Init");
    }
}
