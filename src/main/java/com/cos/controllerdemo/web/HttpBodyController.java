package com.cos.controllerdemo.web;
/*4. json 방식이 보편적으로 쓰인다.*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpBodyController {

	
	private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

	
	@PostMapping("/body1")
	public String xwwwformurlencoded(String username) {
		
		log.info(username);
		return "key=value 전송옴";
	}
	@PostMapping("/body2")
	public String plaintext(@RequestBody String data) {//평문 : 안녕~
		
		log.info(data);
		return "text/plain 전송옴";
	}
	@PostMapping("/body3")
	public String applicationjson(@RequestBody String data) {
		
		log.info(data);
		return "json 전송옴";
	}
	@PostMapping("/body4")
	public String applicationjsonToObject(@RequestBody User user) {
		// java오브젝트로 받아줘야 user.~ 처럼 데이터의 값을 바꿀수도 뽑아낼수도 있다.)
		log.info(user.getUsername());
		return "json 전송옴";
	}
}
