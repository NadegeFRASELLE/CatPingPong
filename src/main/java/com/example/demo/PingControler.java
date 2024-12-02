package com.example.demo;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RequestMapping("/")
@RestController
public class PingControler {

    @GetMapping("/ping")
    String ping() {
        return "pong";
    }

    @GetMapping("/toctoc")
    String toc() {
        return "I'm In";
    }

    @GetMapping(
            value = "/cat",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    byte[] image() throws IOException {
        InputStream in = getClass()
                .getResourceAsStream("/image/hacker.jpg");
        return IOUtils.toByteArray(in);
    }
}
