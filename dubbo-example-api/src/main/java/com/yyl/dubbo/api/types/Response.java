package com.yyl.dubbo.api.types;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/**
 * 必须实现Serializable
 */
public class Response<T> implements Serializable {

    private String code;
    private String info;
    private T data;

}
