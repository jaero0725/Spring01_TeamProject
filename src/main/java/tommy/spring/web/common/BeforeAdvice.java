package tommy.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
	@Before("PointcutCommon.allPointcut()") //이런식으로 만들어줌. 
	public void beforeLog(JoinPoint joinPoint) {
		
		/*
		 * JoinPoint 메서드
		 * 1) getSignature() : 클라이언트가 호출한 메서드의 시그니처 정보가 저장된 signature 객체를 리턴
		 * 2) getTarget() : 클라이언트가 호출한 비즈니스 메서드를 포함하는 비지니스 객체 리턴
		 * 3) getArgs()   : 클라이언트가 메서드를 호출할 떄 넘겨준 인자 목록을 Object 배열로 리턴 
		 * 
		 * ## Signautre 제공하는 메서드
		 * getName() : 클라이언트가 호출한 메서드 이름 리턴.
		 * toLongString() : 클라이언트가 호출한 메서드의 리턴타입, 이름, 매개변수를 패키지 경로까지 포함하여 리턴
		 * toShortString() : 클라이언트가 메서드를 메서드 시그니처를 축약한 문자열로 리턴. 
		 * 
		 * 
		 */
		System.out.println("사전처리 : 비지니스 로직 수행 전 동작 " + joinPoint.getSignature().getName() + " 입니다.");
	}
}
