package myBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import others.OtherBeanA;
import others.OtherBeanB;
import others.OtherBeanC;

@Component
public class OtherBeanImplA {
    @Autowired
    private OtherBeanA otherBeanA;

    private final OtherBeanB otherBeanB;
    private OtherBeanC otherBeanC;

    @Autowired
    public OtherBeanImplA(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }
    @Autowired
    public void setOtherBeanImplA(OtherBeanC otherBeanC){
        this.otherBeanC = otherBeanC;
    }

}
