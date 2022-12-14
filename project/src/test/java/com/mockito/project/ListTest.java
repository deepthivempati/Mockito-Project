package com.mockito.project;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    void test1(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(6);
        assertEquals(6, listMock.size());
        assertEquals(6, listMock.size());

    }

    @Test
    void test2(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(6).thenReturn(9);
        assertEquals(6, listMock.size());
        assertEquals(9, listMock.size());
    }

    @Test
    void test3(){ // mock a method with specific parameters. ex: if 0th element then someString, if 1st element then null
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("someStringValue");
        assertEquals("someStringValue", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void test4(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("someStringValue"); // whatever the int the value should be someStringValue.
        assertEquals("someStringValue", listMock.get(0));
        assertEquals("someStringValue", listMock.get(1));
    }

}
