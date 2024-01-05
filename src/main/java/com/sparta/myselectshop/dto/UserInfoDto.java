package com.sparta.myselectshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserInfoDto { //client 에서 User 정보
    String username;
    boolean isAdmin;
}