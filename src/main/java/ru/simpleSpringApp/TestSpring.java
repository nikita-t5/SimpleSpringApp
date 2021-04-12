package ru.simpleSpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); //создание app context по xml файлу. И создание бинов, прописаных в нём
        TestBean testBean = context.getBean("testBean", TestBean.class); //получить созданный бин из appContext
        System.out.println(testBean.getName());
        context.close(); //закрытие appContext
    }
}
