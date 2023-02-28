package com.taco.tacocloud.beans;

import java.util.List;
import java.util.ArrayList;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
public class TacoOrder {

    @NotBlank(message = "请填写姓名")
    private String deliveryName;
    @NotBlank(message = "请填写地址")
    private String deliveryStreet;
    @NotBlank(message = "请填写城市")
    private String deliveryCity;
    @NotBlank(message = "请填写省份")
    private String deliveryState;
    @NotBlank(message = "请填写邮编")
    private String deliveryZip;
    @CreditCardNumber(message = "不是合法的信用卡卡号")
    private String ccNumber;
    @Pattern(regexp = "^(0[0-9]|1[0-2])([\\/])([2-9][0-9])$", message = "必须是月份/年份的格式")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "无效的验证码")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}