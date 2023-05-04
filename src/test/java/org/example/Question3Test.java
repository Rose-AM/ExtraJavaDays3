package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    String first ;
    String second ;

    @BeforeEach
    void setup(){
    first = "bee";
    second = "very";
    }

   @Test
    void unique(){
       assertTrue(Question3.unique(second));
       assertFalse(Question3.unique(first));
   }
}