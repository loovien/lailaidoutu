package com.sexymmei.controllers.android;

import com.sexymmei.constants.AppCodeEnum;
import com.sexymmei.dto.Result;
import com.sexymmei.dto.User;
import com.sexymmei.utils.ResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by luowen on 2017/5/14.
 */
@RestController
public class LoginController extends AndroidController{

    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping(value = "/login")
    public Result<User> login(@Valid User user, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()) {
            logger.info("User entity {}", user);
            return ResponseUtils.validateError(AppCodeEnum.VALIDATE_ERROR, bindingResult);
        }
        return ResponseUtils.success();
    }

}
