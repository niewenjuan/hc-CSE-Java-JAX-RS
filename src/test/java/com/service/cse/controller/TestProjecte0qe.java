package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecte0qe {

      Projecte0qeDelegate projecte0qeDelegate = new Projecte0qeDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecte0qeDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
