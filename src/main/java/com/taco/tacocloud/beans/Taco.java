package com.taco.tacocloud.beans;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Taco {
    @NonNull
    @Size(min = 2, message = "姓名至少有两个字")
    private String name;
    @NonNull
    @Size(min = 1, message = "至少选择一个品种")
    private List<Ingredient> ingredients;
}
