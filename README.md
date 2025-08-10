AI Meeting Assistant - project skeleton
=======================================

This archive contains a Maven multi-module skeleton:
- backend: Spring Boot app (H2 in-memory for dev), simple Meeting API
- frontend-macos: JavaFX skeleton
- whisper-service: Flask stub
- meeting-bot: README placeholder
- infra: Dockerfile and k8s samples

How to run backend (dev):
- cd backend
- mvn spring-boot:run

How to run whisper stub:
- cd whisper-service
- python3 -m venv venv
- source venv/bin/activate
- pip install -r requirements.txt
- python app.py

