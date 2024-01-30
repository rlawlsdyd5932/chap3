package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.*/
        /*필기.
        * 메소드란?
        * 메소드(method)란 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main() 시작됨...");

        /*목차1. main method 밖에 하단에 MethodA라는 메소드를 추가한다.*/
        /*목차2. 작성한 메소드를 호출하는 부분을 작성한다.*/
        /*필기.
        * 메소드 호출 방법
        * 클래스명 사용할이름=new 클래스명(); //객체 생성
        * 사용할이름.메소드명()  //메소드 호출
        * */
    Application1 app1 =new Application1();
    app1.methodA(); //main method 에서 methodA()를 호출함

    }

    /*목차1-1. method 작성*/
    public void methodA() {

        System.out.println("methodA() 호출함...");

        methodB(); //methodA()에서 methodB()를 호출함

        System.out.println("methodA() 종료됨...");

    }

    public void methodB() {

            System.out.println("methodB() 호출함...");

            methodC();

            System.out.println("methodB() 종료됨...");

        }

    public void methodC() {

        System.out.println("methodC() 호출함...");

        System.out.println("methodC() 종료됨...");


    }



}
