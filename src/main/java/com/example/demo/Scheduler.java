
package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Scheduler {
    private static final long ONE_SECOND = 1 * 1000;
    
    @Scheduled(initialDelay = 2, fixedDelay = 2)
	public void trigger() {
		Prototype prototype= createPrototype(5);
        System.out.println(prototype.getDelagate().getState().entrySet());
	}
    
    @Lookup
	public Prototype createPrototype(int state) {
		throw new UnsupportedOperationException("Method implemented by Spring.");
	}
}
