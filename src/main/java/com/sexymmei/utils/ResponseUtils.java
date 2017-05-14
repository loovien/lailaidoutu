package com.sexymmei.utils;

import com.sexymmei.constants.AppCodeEnum;
import com.sexymmei.dto.Result;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * Created by luowen on 2017/5/14.
 */
public class ResponseUtils {

    /**
     * success method
     * @param data
     * @return
     */
    public static Result success(Object data)
    {
        Result result = new Result();

        result.setCode(0);
        result.setMessage("success");
        result.setData(data);

        return result;
    }

    /**
     * return success response without parameters
     *
     * @return
     */
    public static Result success()
    {
        return success("");
    }

    public static Result error (String message)
    {
        Result result = new Result();
        result.setCode(-1);
        result.setMessage(message);
        result.setData("");

        return result;
    }

    /**
     * validate error response
     *
     * @param appCodeEnum
     * @param bindingResult
     * @return
     */
    public static Result validateError (AppCodeEnum appCodeEnum, BindingResult bindingResult)
    {
        Result result = new Result();
        result.setCode(appCodeEnum.getCode());
        result.setMessage(appCodeEnum.getMessage());
        result.setData(bindingResult.getFieldError().getDefaultMessage());

        return result;
    }

}
