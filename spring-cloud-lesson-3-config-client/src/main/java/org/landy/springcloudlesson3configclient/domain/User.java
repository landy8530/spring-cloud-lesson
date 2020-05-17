package org.landy.springcloudlesson3configclient.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 用户模型
 *
 * @author <a href="mailto:landy8530@gmail.com">Landy</a>
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "sf.user")
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
