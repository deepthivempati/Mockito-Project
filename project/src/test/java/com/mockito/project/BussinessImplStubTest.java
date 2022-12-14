package com.mockito.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BussinessImplStubTest {
    @Test
    void test1() {
        DataService dataServiceStub = new DataServiceStub1();
        BussinessImpl bussinessImpl = new BussinessImpl(dataServiceStub);
        int theGreatestFromAllData = bussinessImpl.findTheGreatestFromAllData();
        assertEquals(9, theGreatestFromAllData);
    }

    @Test
    void test2() {
        DataService dataServiceStub = new DataServiceStub2();
        BussinessImpl bussinessImpl = new BussinessImpl(dataServiceStub);
        int result = bussinessImpl.findTheGreatestFromAllData();
        assertEquals(20, result);
    }
}

    class DataServiceStub1 implements DataService {

        @Override
        public int[] retriveAllData() {
            return new int[]{6, 9};
        }

    }
        class DataServiceStub2 implements DataService {
            @Override
            public int[] retriveAllData() {
                return new int[]{20};
            }
        }


