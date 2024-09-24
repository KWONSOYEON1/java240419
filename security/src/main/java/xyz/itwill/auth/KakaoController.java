package xyz.itwill.auth;

//OAuth2.0 기능을 사용한 인증 처리
// => Google, Kakao, Naver 등의 Social 로그인 기능을 사용한 인증 처리

//카카오의 로그인 OpenAPI를 사용해 간편 로그인 하는 방법
//1.Kakao Developers 페이지 접속 - Kakao 로그인
//2.[내 애플리케이션] >> [애플리케이션 추가하기] >> 앱 이름, 회사명, 카테고리 입력 >> 저장
//3.생성된 애플리케이션 >> [플랫폼] >> [Web 플랫폼 등록] >> 사이트 도메인 추가 >> 저장 
//4.생성된 애플리케이션 >> [앱키] >> [REST API 키] 복사 
//5.생성된 애플리케이션 >> [카카오 로그인] >> [활성화 설정]의 상태를 [ON]으로 변경
//  >> [Redirect URI 등록] >> Redirect URI 주소 입력 >> 저장
// => Redirect URI 주소 : http://localhost:8000/security/kakao/callback
//6.생성된 애플리케이션 >> [카카오 로그인] >> [동의 항목] >> 응답 받을 개인 정보 설정
//7.생성된 애플리케이션 >> [카카오 로그인] >> [보안] >> Client Secret 코드 발급 및 복사 
// >> 활성화 상태로 변경
//8.scribejava-apis 라이브러리와 json-simple 라이브러리를 프로젝트에 빌드 처리 - 메이븐 : pom.xml
//9.로그인 관련 OpenAPI를 요청하기 위한 KakaoLoginApi 클래스와 KaKaoLoginBean 클래스 작성


public class KakaoController {

}