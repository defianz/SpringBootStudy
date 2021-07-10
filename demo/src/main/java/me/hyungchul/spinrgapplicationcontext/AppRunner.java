package me.hyungchul.spinrgapplicationcontext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

//@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    int value;

    @Value("#{'hello' + ' world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("#{${my.value} eq 100}")
    boolean test;

    @Value("#{'spring'}")
    String spring;

    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("value = " + value);
        System.out.println("greeting = " + greeting);
        System.out.println("trueOrFalse = " + trueOrFalse);
        System.out.println("test = " + test);
        System.out.println("spring = " + spring);
        System.out.println("sampleData = " + sampleData);

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("2+100");
        System.out.println("exp.getValue() = " + exp.getValue());

    }
}
