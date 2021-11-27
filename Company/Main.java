package Company;

import Company.*;
import Kosmetica.Kosmetica;
import New2.Animal;
import New2.Insect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
  
        Service[] services = {
                new SeeService(40,1,"ООО", (byte) 8, new LowSkilledWorker(),1),
                new UseRegression(200,5,"ОАО",(byte) 127,new IntermediateSkilledWorker(),2),
                new UseNeuralNetworks(500,100,"",(byte)500,new HighlySkilledWorker(),4)};
        for (Service service:services){
          service.provideServices();
        }


    }
}
