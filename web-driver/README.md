# chromedriver.exe - Chrome WebDriver  

## 📌 개요  
`chromedriver.exe`는 **Google Chrome 브라우저 자동화를 위한 WebDriver 실행 파일**입니다.  
Selenium과 함께 사용되며, Chrome 브라우저를 자동으로 제어할 수 있도록 도와줍니다.  

---

## 🔹 주요 기능  
✔ **Chrome 브라우저 자동화**: 웹 테스트, 크롤링, UI 자동화 등에 활용  
✔ **Selenium WebDriver와 호환**: `Selenium`에서 Chrome 브라우저 실행 시 필요  
✔ **버전별 Chrome과 매칭 필요**: Chrome 버전에 맞는 ChromeDriver 사용  

---

## 🔹 사용 방법  
1. [공식 다운로드 페이지](https://sites.google.com/chromium.org/driver/)에서 Chrome 버전에 맞는 `chromedriver.exe` 다운로드  
2. 실행 파일을 프로젝트 폴더에 배치 (`/drivers/` 등)  
3. Selenium 코드에서 WebDriver 경로 지정 후 실행  

```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
