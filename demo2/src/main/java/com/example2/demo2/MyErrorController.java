package com.example2.demo2;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

public class MyErrorController  implements ErrorController {
    
    @RequestMapping("/error")

    public String  handleError (HttpServletRequest request) {

        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == HttpStatus.NOT_FOUND.value()) {
            return "error-404"; // Return custom 404 error page
        }
        // Handle other error cases if needed
        return "error";
    }
    
    public String getErrorPath() {
        return "/error";
    }
}
