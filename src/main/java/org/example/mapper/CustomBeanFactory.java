package org.example.mapper;

import org.example.test.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class CustomBeanFactory implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        GenericBeanDefinition indexService = (GenericBeanDefinition) beanFactory.getBeanDefinition("indexService");
        indexService.setBeanClass(UserService.class);

    }


}
