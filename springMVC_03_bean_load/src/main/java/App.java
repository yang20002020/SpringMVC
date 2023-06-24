import com.fuyu.config.SpringConfig;
import com.fuyu.config.SpringMvcConfig;
import com.fuyu.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //SpringMvcConfig  //SpringConfig.class
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMvcConfig.class);
        System.out.println(ctx.getBean(UserController.class));
        System.out.println("*******************************");
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx1.getBean(UserController.class));
    }
}
