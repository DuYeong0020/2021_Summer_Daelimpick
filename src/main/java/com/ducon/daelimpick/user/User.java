package com.ducon.daelimpick.user;

import lombok.Getter;

@Getter
public class User {

    private String userId; // 아이디
    private String userName; // 이름
    private String userInviteCode; // 가입 코드
    private String userRgstDate; // 가입 일자

    public User(String userId, String userName, String userInviteCode, String userRgstDate) {
        this.userId = userId;
        this.userName = userName;
        this.userInviteCode = userInviteCode;
        this.userRgstDate = userRgstDate;
    }
}
