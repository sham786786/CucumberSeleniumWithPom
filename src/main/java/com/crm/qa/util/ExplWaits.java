package com.crm.qa.util;

public class ExplWaits {
	
	public void wait(int mills) {

        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
