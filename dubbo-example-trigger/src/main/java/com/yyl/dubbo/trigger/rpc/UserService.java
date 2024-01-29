package com.yyl.dubbo.trigger.rpc;

import com.alibaba.fastjson.JSON;
import com.yyl.dubbo.api.IUserService;
import com.yyl.dubbo.api.dto.UserReqDTO;
import com.yyl.dubbo.api.dto.UserResDTO;
import com.yyl.dubbo.api.types.Constants;
import com.yyl.dubbo.api.types.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService(version = "1.0.0")    //纳入dubbo管理
public class UserService implements IUserService {

    @Override
    public Response<UserResDTO> queryUserInfo(UserReqDTO userReqDTO) {
        log.info("查询用户信息 userId: {} reqStr: {}", userReqDTO.getUserId(), JSON.toJSONString(userReqDTO));
        try {
            // 1. 模拟查询【你可以从数据库或者Redis缓存获取数据】
            UserResDTO resDTO = UserResDTO.builder()
                    .userId(userReqDTO.getUserId())
                    .userName("Yulong")
                    .userAge(20)
                    .build();

            log.info("将返回信息：" + resDTO);
            // 2. 返回结果
            return Response.<UserResDTO>builder()
                    .code(Constants.ResponseCode.SUCCESS.getCode())
                    .info(Constants.ResponseCode.SUCCESS.getInfo())
                    .data(resDTO).build();
        } catch (Exception e) {
            log.error("查询用户信息失败 userId: {} reqStr: {}", userReqDTO.getUserId(), JSON.toJSONString(userReqDTO), e);
            return Response.<UserResDTO>builder()
                    .code(Constants.ResponseCode.ERROR.getCode())
                    .info(Constants.ResponseCode.ERROR.getInfo())
                    .build();
        }
    }
}
