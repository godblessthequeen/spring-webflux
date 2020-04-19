package com.lh.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created on 2020/4/19.
 *
 * @author hao
 */
@RestController
public class HelloController {

//	@GetMapping("/hello")
//	public String hello() {
//		return "Welcome to reactive world ~";
//	}

	@GetMapping("/hello")
	public Mono<String> hello() {   // 【改】返回类型为Mono<String>
		return Mono.just("Welcome to reactive world ~");     // 【改】使用Mono.just生成响应式数据
	}
}
