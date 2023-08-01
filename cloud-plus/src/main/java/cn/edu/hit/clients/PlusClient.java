package cn.edu.hit.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MultipleService")
public interface PlusClient {
    @GetMapping("/multiple/{multipleA}/{multipleB}/{minusB}")
    String getMultipleResult(@PathVariable("multipleA") int multipleA, @PathVariable("multipleB") int multipleB, @PathVariable("minusB") int minusB);
}
