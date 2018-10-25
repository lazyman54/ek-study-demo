package com.ek.study.demo.validata.controller;

import com.ek.study.demo.validata.vo.ReqVo;
import com.oppo.pay.common.domain.rsp.IResponse;
import com.oppo.pay.common.domain.rsp.ResponseBuilder;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ValidataController {

    @RequestMapping("/validata")
    public IResponse<String> validata(@Valid ReqVo reqVo) {

        return ResponseBuilder.success("OK " + reqVo.getA());
    }

    @RequestMapping("/validata1")
    public IResponse<String> validata1(String a, String b, String c, String d, String e, String f, String g, String h) {
        if (null == a || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == b || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == c || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == d || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == e || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == f || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == g || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }
        if (null == h || "".equalsIgnoreCase(a)) {
            return ResponseBuilder.failure("a", "b");
        }

        return ResponseBuilder.success("OK " + a);
    }

}
