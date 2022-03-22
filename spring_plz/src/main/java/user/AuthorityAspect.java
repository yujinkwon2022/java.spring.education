package user;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AuthorityAspect {
	@Around("execution( *  *.getAllUser(*))")
	public Object checkAuthority(ProceedingJoinPoint joinpoint) {
		System.out.println("============================================");
		System.out.println("checkAuthority 시작");
		//호출한 메서드 이름 getAllUser() 리턴
		String methodName = joinpoint.getSignature().getName();
		System.out.println("methodName = "+methodName);
		//getAllUser의 매개변수 리턴
		Object args[] = joinpoint.getArgs();
		//getAllUser의 첫번째 매개변수 (position) 리턴
		String position =(String) args[0];
		System.out.println("position = " + position);
		Object ret = null;
		//position이 팀장이면
		if ("teamboss".equals(position) ){
			try {
				//실제로 호출한 메서드 getAllUser() 실행
				ret = joinpoint.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}else {
			//팀장이 아니면 호출 안함
			System.out.println("팀장이 아니라서 호출 못함");
		}
		System.out.println("checkAuthority 종료");
		System.out.println("============================================");
		return ret;
	}
}
