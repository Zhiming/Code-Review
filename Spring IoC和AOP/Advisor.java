package ac.nz.unitec.spring.spring_review;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advisor {
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("===========around before advice");
		Object retVal = pjp.proceed();
		retVal = pjp.proceed(new Object[] { "【环绕通知】" });
		System.out.println("===========around after advice");
	}

	public void throwM() {
		System.out.println("throw method in advisor");
	}

	public void beforeM() {
		System.out.println("before method in advisor");
	}
}
