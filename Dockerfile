# Build stage
FROM gradle:7.6.1-jdk11 AS build
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon

# Run stage
FROM openjdk:11-jre-slim
WORKDIR /app

# 보안을 위한 non-root 사용자 생성
RUN addgroup --system javauser && adduser --system --no-create-home --ingroup javauser javauser

# 빌드된 jar 파일만 복사
COPY --from=build /app/build/libs/*.jar app.jar

# 권한 설정
RUN chown -R javauser:javauser /app
USER javauser

# 헬스체크를 위한 포트 노출
EXPOSE 8080

# JVM 옵션 최적화
ENV JAVA_OPTS="-Xms512m -Xmx512m -XX:+UseG1GC -Djava.security.egd=file:/dev/./urandom"

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]