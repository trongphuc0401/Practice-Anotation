package vn.nttu.fuchs.Demo_Project.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Oauth -
 *
 * @param
 * @return
 * @throws
 */
@RestController
@RequestMapping("/api/v1/demo")
public class Oauth {
    @GetMapping("/login")
    public ResponseEntity<String> hello() {
     return ResponseEntity.ok("Hello") ;
    }
}
