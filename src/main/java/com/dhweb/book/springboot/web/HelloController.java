package com.dhweb.book.springboot.web;

import com.dhweb.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController : 컨트롤러를 JSON 으로 반환하는 컨트롤러를 만들어 줍니다.
// 이전에는 @ResponseBody 를 각 메소드마다 선언을 해줬어야 했는데, 이를 개선 함.
@RestController
public class HelloController {

    // @GetMapping : HTTP Method 인 Get 요청을 받을 수 있는 API 를 만들어 줍니다.
    // 이전에는 @RequestMapping(method = RequestMethod.GET) 으로 사용했었음.
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
