package com.example.board.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor  //  기본 생성자 생성
@AllArgsConstructor //  필드를 매개변수로 하는 생성자 생성
@ToString
public class MemberDto {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
