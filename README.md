# 🎬 YouTube Tools - Full Stack Java Project

A powerful **YouTube utility web application** built using **Spring Boot + Thymeleaf + Tailwind CSS** to help content creators optimize, analyze, and enhance their YouTube videos.

---
## 🌐 Live Demo
  👉 [![Live Demo](https://img.shields.io/badge/Live-Demo-green)](https://youtubetools-6u2l.onrender.com/)

---

### 💡 Features Available in Live Demo:

* SEO Tag Generator
* Thumbnail Preview
* Video Data Insights

---

⚠️ Note: API usage may be limited due to YouTube quota restrictions.

## 🚀 Features

### 🔍 YouTube SEO Tag Generator

* Enter a video title
* Fetches related videos via YouTube API
* Generates SEO-friendly tags
* Improves video ranking

---

### 🖼️ YouTube Thumbnail Generator

* Input: Video URL or ID
* Displays **HD thumbnail (1280x720)**
* Clean UI preview

---

### 📊 YouTube Video Data Retriever

* Fetch complete video details:

  * Title
  * Description
  * Views
  * Likes
  * Channel Name

---

## 🖥️ User Interface

* Built using **Thymeleaf (Server-Side Rendering)**
* Styled with **Tailwind CSS**
* Responsive and clean UI design
* Dynamic data rendering using Spring Boot MVC

---

## 🛠️ Tech Stack

### Backend:

* Java
* Spring Boot
* Spring MVC

### Frontend:

* Thymeleaf
* Tailwind CSS

### API Integration:

* YouTube Data API v3

### Build Tool:

* Maven

---

## ⚙️ Configuration

### 🔐 Secure API Key Setup

⚠️ Do NOT push your API key to GitHub

Set environment variable:

```bash
YOUTUBE_API_KEY=your_api_key_here
```

Update `application.properties`:

```properties
spring.application.name=youtubeTools

youtube.api.key=${YOUTUBE_API_KEY}

youtube.api.base.url=https://www.googleapis.com/youtube/v3
youtube.api.search.url=${youtube.api.base.url}/search
youtube.api.videos.url=${youtube.api.base.url}/videos

youtube.api.max.related.videos=3
```

---

## ▶️ Run Locally

```bash
git clone https://github.com/your-username/youtube-tools.git
cd youtube-tools
export YOUTUBE_API_KEY=your_api_key
mvn spring-boot:run
```

---

## 🌐 Application Flow

1. User enters input (title / video URL) in UI
2. Thymeleaf sends request to Spring Controller
3. Spring Boot calls YouTube API
4. Data processed and returned to UI
5. Results displayed dynamically

---

## 📡 Endpoints (Internal)

* `/tags` → SEO Tags Generator
* `/thumbnail` → Thumbnail Viewer
* `/video` → Video Data

---

## 📸 Screenshots (Optional)

*Add your UI screenshots here to make your GitHub more attractive*

---

## 📈 Future Improvements

* React Frontend Integration
* AI-based Tag Suggestions
* Download Thumbnail Feature
* User Authentication

---

## 🙌 Author

**Ankit Kumar Gupta**
MCA Student | Java Full Stack Developer

---

## ⭐ Why This Project?

This project demonstrates:

* REST API integration
* Full-stack development (Spring Boot + Thymeleaf)
* Secure API handling
* Real-world problem solving

---

## 📜 License

MIT License
