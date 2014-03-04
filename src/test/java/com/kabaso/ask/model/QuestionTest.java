package com.kabaso.ask.model;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boniface on 2014/03/03.
 */
public class QuestionTest {
    @BeforeMethod
    public void setUp() throws Exception {


    }

    @Test
    public void testCreation() throws Exception {
        Question q = new Question.Builder("Why is java so hard?").id("10").build();
        Assert.assertEquals(q.getQuestion(),"Why is java so hard?");
        Assert.assertEquals(q.getId(),"10");


    }

    @Test
    public void testUpdate() throws Exception {
        Question q = new Question.Builder("Why is java so hard?").id("10").build();





    }
}
