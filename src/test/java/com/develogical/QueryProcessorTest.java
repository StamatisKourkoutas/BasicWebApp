package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutStamatis() throws Exception {
        assertThat(queryProcessor.process("stamatis"), containsString("Kourkoutas"));
    }

    @Test
    public void doesSum1() throws Exception {
        assertThat(queryProcessor.process("what is 20 plus 2"), containsString("22"));
    }

    @Test
    public void eiffel() throws Exception {
        assertThat(queryProcessor.process("in which city is the Eiffel tower"), containsString("Paris"));
    }

    @Test
    public void doesSum2() throws Exception {
        assertThat(queryProcessor.process("what is 3274981 plus 1"), containsString("3274982"));
    }

    @Test
    public void knowsAdd() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest:5678 23"), containsString("5678"));
    }
    
    @Test
    public void returnNoneWhichNubmerisCubeAndSquare() throws Exception {
        assertThat(queryProcessor.process("which  of  the  following  numbers  is  both  a  square  and  a  cube:  753,  784"), containsString(""));
    }
    
    @Test
    public void returnCorrectWhichNubmerisCubeAndSquare() throws Exception {
        assertThat(queryProcessor.process("which  of  the  following  numbers  is  both  a  square  and  a  cube:  753,  64"), containsString("2"));
    }
}
