package com.ek.study.demo.validata.vo;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ReqVo {

    @NotEmpty(message = "not emp")
    private String a;
    @NotEmpty(message = "not emp")
    private String b;
    @NotEmpty(message = "not emp")
    private String c;
    @NotEmpty(message = "not emp")
    private String d;
    @NotEmpty(message = "not emp")
    private String e;
    @NotEmpty(message = "not emp")
    private String f;
    @NotEmpty(message = "not emp")
    private String g;
    @NotEmpty(message = "not emp")
    private String h;

    /*@Max(value = 100, message = "too large")
    @Min(value = 80, message = "too small")
    private int aa;*/


}
