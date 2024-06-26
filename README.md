# WEB2_BE
> 34th NOW SOPT SOPKATHON "Nowhere, Now here" (24.05.18-19)
- 서비스 이름 : g0-100(가제)
- 소개 : 당신의 0일 탈출, 1일 시작을 위한 연애 채팅 시뮬레이터

<br>

## 🗒️ API 명세서 & 역할 분배
| Method | Name | 담당 | 
| -- | -- | -- |
| `GET` | 질문 조회 API | 민재 |
| `GET` | 답변 조회 API | 서진 |
| `GET` | 답변 가중치 값 반환 API | 서진 |
| `GET` | 최종 결과 조회 API | 민재 |

<br>

## ✨ ERD
<img width="1000" src="https://github.com/NOW-SOPT-SOPKATHON-WEB2/WEB2_BE/assets/69389288/41150a44-a82a-415e-b2ae-5607e8d8091a">

<br>

## ✍🏻 Code Convention
> 솝커톤의 특수성을 감안해, 모든 컨벤션을 따르기보다 특정 합세 때 사용한 컨벤션 규칙을 중점적으로 사용하겠습니다.

[고배기들의 코드 컨벤션이 궁금하다면?](https://naver.github.io/hackday-conventions-java/#method-verb-preposition)

<br>

## 📂 Fordering Convention
```bash
│  ├─🗂️ src  
│  │  └─🗂️ main  
│  │     └─🗂️ java  
│  │        └─🗂️ com.sopt.sopkathon  
│  │            └─🗂️ common  
│  │               └─🗂️ dto  
│  │            └─🗂️ config  
│  |            └─🗂️ controller  
│  │            └─🗂️ domain  
│  │            └─🗂️ exception  
│  │            └─🗂️ service		 		  
│  │              │  └─🗂️ dto  
│  │              │     └─🗂️ request  
│  │              │     └─🗂️ response		  
│  │            └─🗂️ repository	   
│  │            └─💽 SopkathonApplication.java  
│  │     └─🗂️ resources  
│  │        └─ application.yml  
│  └─🗂️ build.gradle   
```
