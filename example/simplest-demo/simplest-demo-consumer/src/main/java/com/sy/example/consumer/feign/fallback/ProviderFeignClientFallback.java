package com.sy.example.consumer.feign.fallback;

import com.sy.example.consumer.feign.ProviderFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ProviderFeignClientFallback implements FallbackFactory<ProviderFeignClient> {
    @Override
    public ProviderFeignClient create(Throwable cause) {
        return new ProviderFeignClient() {
            @Override
            public String echo(@PathVariable String string) {
                return "调用echo服务失败";
            }
        };
    }
}
