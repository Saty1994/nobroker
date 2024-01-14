package com.nobroker.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private long id;

    private String name;

    private String email;

    private String mobile;

    private String password;

}
