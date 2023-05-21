package com.example.codegen;

import com.example.codegen.integration.api.TestTagApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "test", url = "http://localhost:8080/")
public interface TestTagApiImpl extends TestTagApi {

}
