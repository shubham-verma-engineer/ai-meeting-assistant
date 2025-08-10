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


# 🤖 AI Meeting Assistant and Task Follow-Up Agent

## Overview

The **AI Meeting Assistant and Task Follow-Up Agent** is an intelligent, end-to-end automation tool that enhances meeting productivity by automatically joining virtual meetings, transcribing conversations, generating structured Minutes of Meeting (MoM), assigning follow-up tasks, and tracking their completion. It also provides end-of-day (EOD) and on-demand progress reports.

Built using **Java and Spring Boot**, this modular and scalable system seamlessly integrates with calendar systems, video conferencing platforms, and team communication tools.

---

## 🔑 Key Features

### ✅ Auto-Join Meetings
- Parses Google/Outlook calendar invites
- Automatically joins Zoom, Google Meet, or MS Teams using a bot client
- Starts recording and transcription

### ✅ Transcription & MoM Generation
- Uses Whisper or other STT engines to transcribe recorded audio
- Sends transcript to GPT-4 (or equivalent) to extract:
  - Meeting summary
  - Key decisions
  - Action items with assignees and due dates

### ✅ Task Assignment & Notifications
- Assigns tasks to relevant members
- Sends task details via Email, Slack, or Microsoft Teams

### ✅ Automated Follow-Up
- Tracks due dates and sends reminder notifications
- Updates task statuses based on user response or command

### ✅ EOD & On-Demand Reporting
- Sends daily summary of task status to all stakeholders
- Responds to real-time queries via chat or dashboard

---

## 🛠 Tech Stack

- **Backend**: Java 17, Spring Boot 3.x
- **AI Integration**: OpenAI GPT-4 API, Whisper
- **Scheduler**: Spring Scheduler / Quartz
- **Database**: PostgreSQL / MongoDB
- **Notifications**: JavaMail, Slack API, MS Teams API
- **Calendar Integration**: Google Calendar API / Microsoft Graph API
- **Bot Automation**: Zoom SDK / Selenium (for Google Meet)

---

## 📦 Modules

- `mom-generator-service`: Transcribes & summarizes meetings
- `task-service`: Assigns tasks, schedules follow-ups
- `notification-service`: Sends emails & chat messages
- `meeting-agent`: Handles invite parsing and meeting attendance
- `report-service`: Generates EOD and on-demand reports

---


