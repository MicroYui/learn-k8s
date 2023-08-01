package cn.edu.hit.controller;

import cn.edu.hit.clients.MultipleClient;
import cn.edu.hit.service.CloudMultipleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MultipleController {
    @Resource
    CloudMultipleService cloudMultipleService;

    @Resource
    MultipleClient multipleClient;

    @GetMapping("/multiple/{multipleA}/{multipleB}/{minusB}")
    public String returnMultipleResult(@PathVariable("multipleA") int multipleA, @PathVariable("multipleB") int multipleB, @PathVariable("minusB") int minusB) {
        int minusA = cloudMultipleService.getMultipleResult(multipleA, multipleB);
        String MinusResult = multipleClient.getMinusResult(minusA, minusB);
        return "* " + multipleB + MinusResult;
    }
}
