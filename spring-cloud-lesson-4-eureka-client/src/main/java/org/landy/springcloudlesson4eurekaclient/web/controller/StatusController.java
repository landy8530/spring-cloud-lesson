package org.landy.springcloudlesson4eurekaclient.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 状态 控制器
 *
 * @author <a href="mailto:landy8530@gmail.com">Landy</a>
 * @since 1.0.0
 */
@RestController
public class StatusController {

    @GetMapping("/status")
    public String status() {
        return "OK";
    }

}
