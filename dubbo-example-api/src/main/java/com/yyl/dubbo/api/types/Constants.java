package com.yyl.dubbo.api.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Constants {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode{
        SUCCESS("0000", "成功"),
        ERROR("0001", "失败"),
        ILLEGAL_PARAMETER("0002", "非法参数")
        ;
        private String code;
        private String info;
    }
}
