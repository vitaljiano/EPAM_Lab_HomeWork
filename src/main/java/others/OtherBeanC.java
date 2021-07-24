package others;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {
    private OtherBeanA otherBeanA;
    public OtherBeanC(@Qualifier("getOtherBeanA2") OtherBeanA myBean) {
        this.otherBeanA = myBean;
    }
}
