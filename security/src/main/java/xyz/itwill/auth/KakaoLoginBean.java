package xyz.itwill.auth;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

//Kakao OpenAPI를 요청하기 위한 클래스
@Component
public class KakaoLoginBean {
	private final static String KAKAO_CLIENT_ID="3a7adab1e02df2c03e4ae296ea592619";
	private final static String KAKAO_CLIENT_SECRET="cWKTAIxwCcuBffGl302NgTwCIh1Hydxe";
	private final static String KAKAO_REDIRECT_URI="http://localhost:8000/kakao/callback";
	private final static String SESSION_STATE="kakao_oauth_state";
	//카카오 간편 로그인 후 사용자의 프로필 정보를 조회하기 위한 OpenAPI의 URL 주소
	private final static String PROFILE_API_URL="https://kapi.kakao.com/v2/user/me";
	
	/* 인증 처리 URL 주소를 생성하기 위한 메소드 */
	public String getAuthorizationUrl(HttpSession session) {
		
	}
}