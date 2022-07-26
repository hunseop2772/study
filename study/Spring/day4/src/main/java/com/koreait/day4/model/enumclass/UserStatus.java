package com.koreait.day4.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

//enum클래스 만들기
@AllArgsConstructor
@Getter
public enum UserStatus {
    REGISTERED(0, "가입","사용자 가입상태"),
    UNREGISTERED(1, "탈퇴","사용자 탈퇴상태");

    private Integer id;
    private String title;
    private String description;

}
