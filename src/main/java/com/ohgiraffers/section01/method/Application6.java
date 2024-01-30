package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {

        /*수업목표.메소드 리턴값을 이해하고 활용할 수 있다.*/

        System.out.println("main() 메소드 시작함....");

        /*목차1. 메소드 리턴값 확인*/
        Application6 app6=new Application6();

        app6.testMethod();
        String returnText= app6.testMethod(); //변수에 담아서 hello world를 호출할수 있음)
        System.out.println("returnText = " + returnText);

        System.out.println(app6.testMethod()); //출력 구문으로 바로 hello world 호출함







    }

    public String testMethod() {


        return "hello world!!";





    }




}
