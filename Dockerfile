# 1. OpenJDK 17 이미지를 기본 이미지로 사용
FROM openjdk:17-jdk-slim

# 2. 애플리케이션 jar 파일을 컨테이너로 복사
# 빌드 후 'target' 폴더에 생성된 jar 파일을 컨테이너로 복사
COPY target/spring-cloud-azure-0.0.1-SNAPSHOT.jar app.jar

# 3. 애플리케이션 실행 시 사용할 명령어
ENTRYPOINT ["java", "-jar", "/app.jar"]
