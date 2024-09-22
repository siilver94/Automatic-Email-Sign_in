# Project : 이메일 자동 로그인(Automatic E-mail Sign in)

![image](https://github.com/user-attachments/assets/27634e99-c672-473a-90db-c90ba54d57aa)

<br/>

## 프로젝트 소개

이번 프로젝트에서는 프로그램을 실행하면 Chrome 브라우저가 자동으로 실행되고, '다음' 웹사이트에 접속하여 자동 로그인을 한 후 받은 메일함을 확인할 수 있는 자동화 시스템을 구축합니다. 이 프로젝트는 원시적인 방법(Robot)과 Selenium 프레임워크를 활용한 두 가지 접근 방식을 다룹니다.




<br/>

## 프로젝트 구조

1. Robot 라이브러리를 사용한 자동화
첫 번째 방법은 JAVA의 Robot 라이브러리를 사용하여 키보드와 마우스를 제어하는 방식입니다. Robot 클래스는 키보드 키 입력, 마우스 움직임 및 클릭을 시뮬레이션할 수 있어, 사용자가 직접 수행하는 것처럼 로그인 과정을 자동화합니다.

2. Selenium 프레임워크를 사용한 자동화
두 번째 방법은 Selenium 프레임워크를 사용하여 보다 정교하게 브라우저를 제어하는 방식입니다. Selenium은 웹 브라우저를 자동화하고 웹 애플리케이션을 테스트하는 데 널리 사용되는 도구로, 웹 페이지의 요소를 제어하고 조작할 수 있습니다.

<br/>

## Selenium

Selenium은 브라우저 자동화와 크롤링에 관련된 강력한 라이브러리입니다. 다음과 같은 기능을 제공합니다:

웹 페이지 접속 및 조작: 특정 웹사이트에 접속하고, 스크롤을 하거나 버튼을 누르는 등의 작업을 자동으로 수행합니다.
로그인 자동화: 사용자의 로그인 정보를 입력하고 로그인 버튼을 누르는 과정을 자동화합니다.
웹 요소 제어: 웹 페이지 내의 특정 요소를 클릭하거나 텍스트를 입력하는 등의 작업을 수행할 수 있습니다.
크롤링 및 매크로: 웹 페이지의 데이터를 자동으로 수집하거나 반복적인 작업을 매크로로 자동화할 수 있습니다.
Selenium은 Chrome, Firefox 등 다양한 브라우저에서 작동하며, 브라우저별로 제공되는 웹드라이버를 통해 제어합니다.
<br/>

## 사용기술

이번 프로젝트에서는 다음과 같은 기술을 사용합니다:

- **Java**: 프로그램의 주요 언어로 사용하여 자동화 기능을 구현합니다.
- **Eclipse**: Java 개발을 위한 통합 개발 환경(IDE)으로 사용합니다.
- **Selenium**: 웹 브라우저 자동화를 위한 프레임워크로 사용합니다.
- **Robot** 클래스: 키보드와 마우스를 제어하여 원시적인 자동화 방법을 구현합니다.


<br/>

## 리뷰

#### 코딩을 다른 측면에서 바라본 경험

이번 프로젝트를 통해 코딩에 대해 새로운 관점에서 생각해보게 되었습니다. 간단한 계산이나 알고리즘을 해결하기 위해 코딩을 사용하면서, 아날로그 방식과 비교하여 효율성을 고민하게 되었습니다. 예를 들어, 단순한 문제를 암산이나 종이에 계산할 때는 30분이면 충분한 반면, 이를 코딩으로 해결하려고 하니 2시간 이상이 걸리기도 했습니다. 이 과정에서 시간 대비 효율이 떨어진다고 느꼈습니다.

 
#### 자동화의 가치

하지만, 이러한 자동화 시스템의 가치는 반복적인 작업에서 더욱 빛을 발합니다. 예를 들어, 매일 5번씩, 몇 년 동안 반복해야 하는 작업을 자동화한다면, 초기에는 시간이 오래 걸리더라도 장기적으로는 엄청난 효율을 가져올 수 있습니다. 특히, 이 자동화 시스템을 다른 사람들이 사용할 수 있게 된다면 그 가치와 효율성은 더욱 커질 것입니다.

 

#### 이메일 자동 로그인 프로젝트의 경험

이번 프로젝트에서는 이메일을 로그인하고 받은 메일함을 확인하는 작업을 자동화했습니다. 수동으로 이메일을 로그인하고 확인하는 데는 20초도 걸리지 않지만, 이를 매크로를 활용해 자동화하면 초기에는 비효율적으로 보일 수 있습니다. 그러나 장기적으로 보면 자동화의 가치는 매우 큽니다.

 

#### 매크로(Macro)와 자동화의 중요성

매크로란 사용자가 정해놓은 일련의 과정을 자동으로 수행하는 것을 의미합니다. 저는 Java의 내장 라이브러리인 Robot을 사용하여 원시적인 방법으로 매크로를 구현해 보았습니다. 더 나아가 Selenium을 사용하여 브라우저를 자동화하고 많은 작업을 눈 깜짝할 새에 끝낼 수 있었습니다. 이러한 경험을 통해 프로그래밍의 가치를 다시 한번 생각해보게 되었습니다.

<br/> 

#### 프로젝트에서 배운 점

1. **반복적인 작업의 자동화:** 초기에는 시간이 오래 걸리더라도 장기적인 효율성을 고려할 때 자동화의 가치는 매우 큽니다.
2. **자동화 도구의 활용:** Java의 Robot 클래스와 Selenium을 사용하여 자동화를 구현해 보면서, 각각의 도구의 장단점을 파악할 수 있었습니다.
3. **프로그래밍의 가치:** 반복적인 작업을 자동화하여 시간과 노력을 절약할 수 있음을 깨달았습니다.
 

#### 어려웠던 점과 해결 방법

- **Robot 클래스의 한계:** 원시적인 방법으로 키보드와 마우스를 제어하다 보니 정교한 제어가 어려웠습니다. 이를 극복하기 위해 Selenium을 사용하여 브라우저를 보다 정교하게 제어하였습니다.
  
- **Selenium 설정의 복잡성:** Selenium을 처음 설정하고 사용하는 과정에서 어려움을 겪었지만, 다양한 튜토리얼과 문서를 참고하여 문제를 해결할 수 있었습니다.
