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
		System.out.println("checkAuthority ����");
		//ȣ���� �޼��� �̸� getAllUser() ����
		String methodName = joinpoint.getSignature().getName();
		System.out.println("methodName = "+methodName);
		//getAllUser�� �Ű����� ����
		Object args[] = joinpoint.getArgs();
		//getAllUser�� ù��° �Ű����� (position) ����
		String position =(String) args[0];
		System.out.println("position = " + position);
		Object ret = null;
		//position�� �����̸�
		if ("teamboss".equals(position) ){
			try {
				//������ ȣ���� �޼��� getAllUser() ����
				ret = joinpoint.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}else {
			//������ �ƴϸ� ȣ�� ����
			System.out.println("������ �ƴ϶� ȣ�� ����");
		}
		System.out.println("checkAuthority ����");
		System.out.println("============================================");
		return ret;
	}
}
