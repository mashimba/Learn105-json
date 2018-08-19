import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.*;

import java.io.IOException;
import java.net.URL;

public class LearnJson {
    public static void main(String args[]){

        ObjectMapper objectMapper = new ObjectMapper();
//        String url = "https://api.myjson.com/bins/i63xw";
//        String url = "https://api.myjson.com/bins/rkras";
        String url = "https://api.myjson.com/bins/i03w4";
        try {
//            Data myData = objectMapper.readValue(new URL(url),Data.class);
//            String [] dataArray;
//            printline(""+myData.getId());

//            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            Employees employees = objectMapper.readValue(new URL(url),Employees.class);

            for (Employee employee: employees.getEmployee()){
                printline(""+employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printline(String msg) {

        System.out.println(msg);

    }
}

