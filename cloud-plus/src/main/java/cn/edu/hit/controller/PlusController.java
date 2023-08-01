package cn.edu.hit.controller;

import cn.edu.hit.clients.PlusClient;
import cn.edu.hit.service.CloudPlusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PlusController {
    @Resource
    CloudPlusService cloudPlusService;

//    @Resource
//    RestTemplate restTemplate;

    @Resource
    PlusClient plusClient;

    @GetMapping("/plus/{plusA}/{plusB}/{multipleB}/{minusB}")
    public String returnPlusResult(@PathVariable("plusA") int plusA, @PathVariable("plusB") int plusB, @PathVariable("multipleB") int multipleB, @PathVariable("minusB") int minusB) {
        int multipleA = cloudPlusService.getPlusResult(plusA, plusB);
//        String multipleResult = plusClient.getMultipleResult(multipleA, multipleB);
//        String url = "http://MultipleService/multiple/" + multipleA + "/" + multipleB + "/" + minusB;
//        String multipleResult = restTemplate.getForObject(url, String.class);
//        int result = cloudPlusService.getPlusResult(multipleA, multipleB);
        String multipleResult = plusClient.getMultipleResult(multipleA, multipleB, minusB);
        return "(" + plusA + " + " + plusB + ") " + multipleResult;
    }
}
