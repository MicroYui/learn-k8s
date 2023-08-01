package cn.edu.hit.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MinusService")
public interface MultipleClient {
    @GetMapping("/minus/{minusA}/{minusB}")
    String getMinusResult(@PathVariable("minusA") int minusA, @PathVariable("minusB") int minusB);
}
