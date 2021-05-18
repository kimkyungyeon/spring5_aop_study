package spring5_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring5_aop_study.config.AppCtx;

public class MainAspect {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppCtx.class);){
			Calculator cal = ctx.getBean("calculator",Calculator.class);
			long fiveFact = cal.factorial(5);
			System.out.printf("cal.factorial(5) = %d%n", fiveFact);
			System.out.println(cal.getClass().getName());
		}
	}
}
