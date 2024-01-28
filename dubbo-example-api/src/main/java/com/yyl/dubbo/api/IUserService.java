package com.yyl.dubbo.api;

import com.yyl.dubbo.api.dto.UserReqDTO;
import com.yyl.dubbo.api.dto.UserResDTO;
import com.yyl.dubbo.api.types.Response;

public interface IUserService {

    Response<UserResDTO> queryUserInfo(UserReqDTO userReqDTO);

}
