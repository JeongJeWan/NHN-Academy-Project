# JAVA-TIP-Thread
과제

#MartStore
생산자-소비자 솔루션을 수정하라
* 문제 1
    * 마트에서는 N개의 품목 매장이 있다.
    * 생산자는 N개의 품목을 납품할 수 있다.
    * 마트에서는 생산자가 품목을 납품하기 전까지는 어떤 품목인지 알 수 없다.
    * 소비자는 품목별로 매장을 이용할 수 있다. 즉, 여러 사람이 각기 다른 품목을 구매할 경우 동시 구매가 가능하다.
* 문제 2
    * 프로그램에서 사용되는 세미포어를 구현하여 적용하라.


#BlockBrakeGame
벽돌깨기 만들기
조건
다음 조건을 만족하도록 구성한다. 
* 벽돌의 종류는 다음과 같다
    * 한번에 깨지는 벽돌
    * 2번 이상 맞으면 깨지는 벽돌(설정은 자유)
    * 깨지지 않는 벽돌
    * 좌우로 움직이는 벽돌
        * 깨지거나 그렇지 않을 수도 있다.
    * 가속도 벽돌
        * 볼의 속도가 증가한다.
    * 제어 벽돌
        * 아래쪽에 위치한 벽돌하나는 사용자의 좌우 키로 조정할 수 있다.
    * 물체가 충돌하면 이벤트를 발생시킨다.
    * 벽돌의 종류에 따라 점수가 다를 수 있다.
* 볼
    * 게임 시작과 함께 움직인다.
    * 벽이나 벽돌에 부딪히면 뒹겨져 나온다.
    * 벽돌의 특정 영역에 부딪힐 경우 각도가 변경될 수 있다.
        * 예를 들어, 중앙에서 40%이내는 들어온 각도로 나간다. 그 바깥쪽은 +20% 정도 추가된다.
* 게임화면
    * 왼쪽, 오른쪽, 위쪽에는 벽이 있다.
* 게임
    * 벽돌이나 볼로 발생한 이벤트를 받아서 처리한다.
    * UI
        * 게임 시작
        * 게임 종류
            * 벽돌 배치를 선택할 수 있거나,
            * 램덤하게 생성한다
        * 상황판
            * 점수
            * 볼이 튕겨진 횟수
            * 남은 벽돌 수
* 공통 조건
    * 상속 관계를 만들어라
    * 특성에 맞는 타입을 정의하라
    * 움직임은 스레드를 이용하라
    * 이벤트를 정의하여 사용하라
