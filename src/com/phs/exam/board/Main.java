package com.phs.exam.board;

/*
### TODO 리스트
* [x]시작 알림 메세지 출력
* [x]명령어 입력
* [ ]exit가 입력될 떄 까지 명령어 계속 입력받기
* [ ]새 게시물 입력받기 기능 구현
* [ ]등록시마다 게시물번호가 증가하도록
* [ ]입력받은 게시물 정보를 Article 객체에 저장 후 객체변수 출력
* [ ]toString 메서드를 오버라이드 하여, 객체를 쉽게 디버깅 하기
* [ ]매개변수있는 생성자를 추가하여, 게시물 객체를 쉽게 만들도록
* [ ]/usr/article/detail 명령으로 최근 게시물 보기
* [ ]/usr/article/list 로 입력하면 게시물리스트 출력
* [ ]테스트 게시물 생성 함수 적용
* [ ]게시물 리스트에서 출력을 최신순으로
* [ ]게시물 등록시, 마지막 게시물 번호 이후로 id 정하기
* [ ]게시물 등록시 새로 생성된 게시물을 article에 추가
* [ ]lastArticle 변수의 필요성을 제거
* [ ]ArrayList 관련 줄임표현 사용
*/


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    System.out.printf("명령 : ) ");
    String od = sc.nextLine();
    System.out.println("== 프로그램 종료 ==");
    System.out.println("== 프로그램 종료 ==");
  }
}