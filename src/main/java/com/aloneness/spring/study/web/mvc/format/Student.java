package com.aloneness.spring.study.web.mvc.format;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * 1. @DatetimeFormat(pattern=“yyyy-MM-dd”)是将String转换成Date，一般前台给后台传值时用
 * 2. @JsonFormat(pattern=“yyyy-MM-dd”) 将Date转换成String 一般后台传值给前台时
 * 此处注意：@JsonFormat会让时间以0区时间显示。如果直接使用会少了8小时（我所在的是北京时区）修改为
 * 3. @JsonFormat(pattern=“yyyy-MM-dd”,timezone=“GMT+8”)
 * 4. @NumberFormat(pattern="#,###") 用来格式化货币（这样前端得传形如1,000。而不能是1000了哟，其实这个用得一般还比较少一点）
 *
 * @author aloneness
 * @date 2020/6/20
 */
public class Student {

    private Long id;

    private String username;

    private Date birthDay;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birth;

    @NumberFormat(pattern = "#,###")
    private BigDecimal salary;
}
