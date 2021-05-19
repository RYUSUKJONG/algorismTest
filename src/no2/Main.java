package no2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {



        Set<Entry<String, Integer>> set = fruitMap.entrySet(); // entry는 입력이란 뜻이 있다  즉, 한쌍이 입력이 된다.
        // entrySet은  Entry타입이다.  Entry는 key와 value를 던져준다.
        // Entry는 통쨰로 입력해주는것이고 Set은 한쌍으로 들어가줘야 한다.
        // 즉 맵에 있는 entrySet을 이용해서  한쌍씩 set해준거가지고 set에 담겨줌
        // Set 은 순서가 없지만 Iterator 를 써서 순서를 부여한다.

        Iterator <Entry<String,Integer>> iter = set.iterator();

        while(iter.hasNext()) {  // 요소가 있으면 참
            // 요기서 entry타입으로 객체를 만들어야 한다.  entry는 Map 소속이다.
            Map.Entry<String, Integer> e = iter.next();
            // iter.next() 로 순서를 부여 해야 하기때문에  확인해보면 Entry타입이니까
            // Entry타입이라  e라는 객체에 담을 수 있는 것이다  .  이제부터 e.get 으로 데이터를 뽑아올수있다.
            System.out.println("과일 이름 : " + e.getKey() + ",가격 : " + e.getValue());
            // 내가 따로따로 분리해서 쓰고싶고 그 값들을 접근을 하고 싶을떄 hashmap을 set과 iterator를
            //통해서 가능하다 단 , value는 컬렉션타입이다 하지만 내가 key값을 뽑기위해 set과 iterator가 필요하다
            // 과일들의 평균가격 values 쓰고 과일가게 파는 그것만 필요할땐 key값만필요 keyset으로 해주면 된다.
            // iter.next() 가 string타입이 된다.  keyset과 entryset 둘다 알아둬야 한다.

            total += e.getValue(); // 총합을 누적시킨다.
        }                                                      //가격총합 나누기 개수 = 평균값                                       //총합을 개수로 나눔
        avg =Double.parseDouble(String.format("%.2f", (double) total/fruitMap.size()));
        //String.format(서식문자,오브젝트타입)  둘다 정수면  total를 double형으로 형변환 그다음 string타입이니 double형으로 parseDouble해준다.
        System.out.println("평균가역 : " + avg + "원");
    }

}

};