package com.sy.example.consumer.feign;


import com.sy.example.consumer.feign.fallback.ProviderFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider", value = "provider", fallback = ProviderFeignClientFallback.class)
public interface ProviderFeignClient {
    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable String string);
}
