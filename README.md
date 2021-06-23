![](https://user-images.githubusercontent.com/37062292/123032299-ac518e00-d420-11eb-8641-f2ba8c28ca59.png)


## 로그인 과정 정리

1. 클라이언트 사용자가 로그인 요청 (HTTP Request)
2. `http.addFilterBefore` 로 등록한 Custom Filter 가 동작하여 `JWT Filter` 의 doFilter 함수가 동작함 , Request Header 에 있는 토큰 정보를 읽는다.
3. 유효한 토큰 존재 X
4. `UsernamePasswordAuthenticationFilter` 가 Request 를 가져와`UsernamePasswordAuthenticationToken` 객채를 만들게 된다.
5. `AuthenticationManager` 를 통해 `AuthenticationProvider` 에 `UsernamePasswordAuthenticationToken` 객체를 전달한다.
6. authenticate() 메소드를 통해 `CustomUserDetailsService` 에 사용자 정보를 전달해준다. 
7.  `CustomUserDetailsService` 의 `loadUserByUsername` 메소드를 통해 사용자 정보를 비교하여 가져온다
8. 사용자 정보는 스프링 시큐리티가 제공하는  `UserDetails` 반환하여 `Authentication` 생성
9. `Authentication` 객채를 `SecurityContextHolder` 저장
10. `Authentication` 객채를 바탕으로 유효한 토큰 생성
11. 생성한 토큰을 HTTP Header , 토큰 정보를 Body 에 담아서 Response 해준다.
