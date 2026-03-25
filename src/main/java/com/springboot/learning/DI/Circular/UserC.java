package com.springboot.learning.DI.Circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserC {
    @Autowired
    @Lazy
    OrderC orderC;
}
