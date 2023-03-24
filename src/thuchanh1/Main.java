package thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map= new TreeMap<>();
        map.put("nam",21);
        map.put("hieu",20);
        map.put("khoa",22);
        map.put("nhan",19);
        System.out.println(map);
        map.put("hieu1",30);
        map.put("thaiphuongnam",33);
//        System.out.println(map);
        Map<String,Integer> LinkedHasMap= new LinkedHashMap<>();
        LinkedHasMap.put("dinh van khiet",30);
        LinkedHasMap.put("thai phuong nam",20);
        LinkedHasMap.put("nguyen trong nhan",21);
        LinkedHasMap.put("mai anh khoe",30);
        System.out.println(LinkedHasMap);

    }
}