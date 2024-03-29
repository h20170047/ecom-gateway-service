package com.svj.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/order")
    public ResponseEntity<String> orderFallback(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
                .body("We are facing a problem in order-service! Please contact help desk");
    }

    @GetMapping("/payment")
    public ResponseEntity<String> paymentFallback(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
                .body("We are facing a problem in payment-service! Please contact help desk");
    }

    @GetMapping("/user")
    public ResponseEntity<String> userFallback(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
                .body("We are facing a problem in user-service! Please contact help desk");
    }

    @GetMapping("/identity")
    public ResponseEntity<String> identityFallback(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
                .body("We are facing in securing your requests! Please contact help desk");
    }
}
