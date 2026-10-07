# Spring Study

Servlet/JSP부터 MVC, REST API, Spring Boot까지 웹 백엔드 개발 과정을 학습하며 작성한 실습 코드를 정리한 저장소입니다.

## Repository Structure

### `01-servlet-jsp-mvc/jwbook2`
Java Web 기초부터 MVC 및 REST API까지 단계적으로 실습한 프로젝트입니다.

- Servlet
- JSP / JSTL
- MVC 구조
- Controller / Service / DAO
- H2 Database
- Filter / Listener
- REST API (Jersey)

주요 실습 패키지:

| 패키지 | 내용 |
|---|---|
| `ch05` | Servlet 기초 |
| `ch07` | JSP / Calculator |
| `ch08` | MVC, Controller, Service |
| `ch09` | Student DAO |
| `ch10` | News CRUD |
| `ch11` | Filter / Listener |
| `ch12` | REST API |

### `02-spring-boot/spring_study`
Spring Boot 기반 MVC / REST 실습 프로젝트입니다.

- Spring Boot
- Spring MVC
- JSP View
- REST Controller
- H2 Database
- News CRUD

## 정리 기준

- Eclipse/STS 워크스페이스의 `.metadata`, `.settings`, `target`, `Servers` 등 개발 환경 파일은 제외했습니다.
- `JobRadar` 관련 코드는 독립 프로젝트 성격이 강해 이 학습 저장소에서는 제외했습니다.
- 학습 당시 작성한 코드는 가능한 한 원형을 유지했습니다.
- 로컬 PC에 종속되던 이미지 경로는 저장소에서도 사용할 수 있도록 상대경로로 변경했습니다.

## Development Environment

- Java
- Eclipse / Spring Tool Suite
- Apache Tomcat 9
- Maven
- Spring Boot
- JSP / JSTL
- H2 Database

> 이 저장소는 Servlet/JSP부터 Spring Boot까지 백엔드 웹 개발 학습 과정을 기록하기 위한 저장소입니다.

## 실행 전 확인

- DB 연결 계정과 비밀번호는 `YOUR_DB_USER`, `YOUR_DB_PASSWORD`로 교체했습니다. 실행 전에 본인의 로컬 DB 설정으로 변경하세요.
- 각 하위 프로젝트는 독립된 학습 예제입니다. 전체 저장소를 하나의 프로젝트로 실행하지 않습니다.
- DB 스키마와 외부 라이브러리는 별도 준비가 필요합니다. 이번 정리는 소스 업로드이며 전체 실행 검증은 포함하지 않습니다.
