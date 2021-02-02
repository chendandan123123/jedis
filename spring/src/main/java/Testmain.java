import com.aiguigu.service.MyBeanPostProcessor;
import com.aiguigu.service.Service02;
import com.aiguigu.service.service;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {




    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Spring.xml");
           Service02 yewu= classPathXmlApplicationContext.getBean(Service02.class);
           yewu.aa();
        System.out.println("工厂被创建了");
        yewu.aa();






    }
}
