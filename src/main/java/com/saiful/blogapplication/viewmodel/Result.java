package com.saiful.blogapplication.viewmodel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> {
    public T data;
    public String message;
    public final Boolean isSuccess;


    public Result(T data, Boolean isSuccess) {
        this.data = data;
        this.isSuccess = isSuccess;
    }

    public Result(String message, Boolean isSuccess) {
        this.message = message;
        this.isSuccess = isSuccess;
    }
}


