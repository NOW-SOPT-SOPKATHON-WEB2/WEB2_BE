# WEB2_BE
> 34th NOW SOPT SOPKATHON "Nowhere, Now here" (24.05.18-19)
- 서비스 이름 :
- 소개 :

## 🗒️ API 명세서 & 역할 분배
| Method | Name | 담당 | 
| -- | -- | -- |
| `GET` | 질문 조회 API | 민재 |
| `GET` | 답변 조회 API | 서진 |
| `GET` | 답변 가중치 값 반환 API | 서진 |
| `GET` | 최종 결과 조회 API | 민재 |

<br>

## ✨ ERD

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
<br>

## 🧑🏻‍💻 Before & After
| Before | After |
| :--: | :--: |
| <img width="500" src="https://github.com/NOW-SOPT-SOPKATHON-WEB2/WEB2_BE/assets/69389288/e917ec8f-1d08-4ec8-9a20-a5d156548ee9">  | 
