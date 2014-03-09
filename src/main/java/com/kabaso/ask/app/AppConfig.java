package com.kabaso.ask.app;

import com.kabaso.ask.services.crud.AuthorCrudservice;
import com.kabaso.ask.services.crud.Impl.AuthorCrudServiceImpl;
import com.kabaso.ask.services.crud.Impl.QuestionCrudServiceImpl;
import com.kabaso.ask.services.crud.QuestionCrudservice;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by boniface on 2014/03/03.
 */
@Configurable
public class AppConfig {
    @Bean(name = "questionCrudService")
    public  QuestionCrudservice getQuestionCrudService(){
        return new QuestionCrudServiceImpl();
    }
    @Bean(name="authorCrudService")
    public AuthorCrudservice getAuthorCrudService(){
        return new AuthorCrudServiceImpl();
    }
}
