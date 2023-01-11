import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHelloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld secondHelloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat firstCatBean = applicationContext.getBean("cat", Cat.class);
        Cat secondCatBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(firstHelloWorldBean.getMessage());

        System.out.println("Are firstHelloWorldBean and secondHelloWorldBean same objects? - "
                + (firstHelloWorldBean == secondHelloWorldBean));
        System.out.println("Are firstCatBean and secondCatBean same objects? - "
                + (firstCatBean == secondCatBean));
        System.out.println();
    }
}