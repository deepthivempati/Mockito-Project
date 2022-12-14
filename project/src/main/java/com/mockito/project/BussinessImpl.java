package com.mockito.project;


public class BussinessImpl {
    public BussinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public BussinessImpl() {
        super();
        this.dataService = dataService;
    }

    private DataService dataService;
    public int findTheGreatestFromAllData(){
        int [] data = dataService.retriveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int value:data){
            if(value>greatestValue)
                greatestValue = value;
        }
        return  greatestValue;
    }

}
interface DataService{
    int[] retriveAllData();

}
//if we use new methods in interface need to provide implementation for that methods