package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.BeanDefinition;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Prototype {

    private int state;

    private Delegate delegate;

    public Prototype(int state) {
        this.state = state;
    }

    @PostConstruct
    public void postConstruct() {
        HashMap hm = new HashMap();
        hm.put("a", "a");
        delegate = createDelegate(hm);
    }
    
    @Lookup
	public Delegate createDelegate(Map state) {
		throw new UnsupportedOperationException("Method implemented by Spring.");
	}

    public Delegate getDelagate() {
        return delegate;
    }
    
    

}
