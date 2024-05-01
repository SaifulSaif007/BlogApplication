package com.saiful.blogapplication.viewmodel.auth.create;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRequest {
    public String email;
    public String password;
    public String displayName;
}
