package com.example.projectex.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersVO {
    private String name;
    private String id;
    private String pw;
    private String age;
}
