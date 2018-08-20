package com.nyh.app.provider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**  
 * userId校验属性
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix="heluo.userid") 
public class UserIdProperty {
    /**
     * 是否开启token验证
     */
    private boolean authEnable;
    
    /**
     * 不需要验证的请求路径
     */
    private String excludePath;
    
}
