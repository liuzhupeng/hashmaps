import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Test {
    public static void main(String[] args){
        Ihashmap<String,String> lmap = new hMap<String,String>();
        Long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            lmap.put("key"+i,"value"+i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("key:"+"key"+i + "   value:"+lmap.get("key"+i));
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("手写实现haspmap耗时："+(t2-t1));
        System.out.println("--------------hashMap--------------");

        Map<String,String> map = new HashMap<String,String>();
        Long t3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            lmap.put("key"+i,"value"+i);
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("key:"+"key"+i + "  value:"+lmap.get("key"+i));
        }
        Long t4 = System.currentTimeMillis();
        System.out.println("JDK实现haspmap耗时："+(t4-t3));
        System.out.println("手写实现haspmap耗时："+(t2-t1));
    }
}
