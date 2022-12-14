package com.mockito.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class BussinessImplMockTest {
    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private BussinessImpl bussinessImpl;
    @Test
    void test1() { // since we are using mock and injectock annotations we can optimize wring the code as this method Test1 instead of writing like Test2() method.
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {6,9});
        assertEquals(9, bussinessImpl.findTheGreatestFromAllData());
    }

    /*@Test
    void test1() {
        DataService dataServiceMock = mock(DataService.class);
        //dataServicemock.retriveAllData(); //--> new int[] {6,9}
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {6,9});
        BussinessImpl bussinessImpl = new BussinessImpl(dataServiceMock);
        assertEquals(9, bussinessImpl.findTheGreatestFromAllData());
    }*/

    @Test
    void test2() {
        DataService dataServiceMock = mock(DataService.class);
        //dataServicemock.retriveAllData(); //--> new int[] {20}
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {20});
        BussinessImpl bussinessImpl = new BussinessImpl(dataServiceMock);
        assertEquals(20, bussinessImpl.findTheGreatestFromAllData());
    }

    @Test
    void test3() {
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, bussinessImpl.findTheGreatestFromAllData());
    }
}

// instead of creating n number of stub classes we can write as many test scenarios as we want to using Mock.
// we used @mock, @InjectMocks, @ExtendWith(Mockito.class to automatic creation of mocks and injection. this way we can optimize the mocking