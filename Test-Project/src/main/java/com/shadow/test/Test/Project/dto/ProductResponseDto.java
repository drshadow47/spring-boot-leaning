package com.shadow.test.Test.Project.dto;

import com.shadow.test.Test.Project.entity.BaseResponse;
import com.shadow.test.Test.Project.entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto  extends BaseResponse {
    Product productDetail;
}
