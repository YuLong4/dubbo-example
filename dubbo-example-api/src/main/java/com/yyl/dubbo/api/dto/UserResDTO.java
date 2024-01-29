package com.yyl.dubbo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
/**
 * 必须实现Serializable
 */
public class UserResDTO implements Serializable {

    private String userId;
    private String userName;
    private Integer userAge;

}
