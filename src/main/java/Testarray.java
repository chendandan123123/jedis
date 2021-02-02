import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.*;

public class Testarray {


//        Jedis jedis=new Jedis("192.168.6.129",6379);
//        String ping = jedis.ping();
//        System.out.println(ping);
//        jedis.lpush("lkey1","1","2","3","4");
//        List<String> l1 = jedis.lrange("lkey1", 0, -1);
//        System.out.println(l1);

//数组
    @org.junit.Test
    public void test() {
        int[] value = {1, 3, 5, 2, 4, 6, 2, 3};
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < value.length; i++) {
            if (a.contains(value[i])) {
                System.out.println(value[i]);
                return;
            }
            System.out.println(value[i]);
            a.add(value[i]);
        }


    }

    @org.junit.Test
    public void test1() {
        int[] value = {1, 3, 5, 2, 4, 6, 2, 3};
        Arrays.sort(value);//变成有序数组
        for (int i = 1; i <= value.length; i++) {
            if (value[i] == value[i - 1]) {
                System.out.println("重复的元素为" + value[i]);
                return;
            }
            System.out.println(value[i]);
        }


    }

    @org.junit.Test
    public void test2() {
        int[] value = {1, 5, 4, 2, 3, 6, 2, 3};
        for (int i = 0; i < value.length-1; i++) {
            int num = value[i];
            for (int j = i+1; j < value.length; j++) {
                if (num == value[j]) {
                    System.out.println("重复的元素为" + value[j]);
                    return;
                }

            }
            System.out.println(num);
        }
    }
    @org.junit.Test
    public  void test3(){
        List list=new ArrayList();
        int[] test={1,4,2,3,6,3,5,4};//打印没有出现的数字
        for (int i=0;i<test.length;i++){
            int a=Math.abs(test[i]);//求绝对值
            int inddex=a-1;
            if (test[inddex]>0){
                test[inddex]=-test[inddex];
            }
        }
        for (int j=0;j<test.length;j++){
            if (test[j]>0){
                list.add(j+1);
            }
        }
        System.out.println(list);
    }
    @org.junit.Test
    public  void test4(){
        List list=new ArrayList();
        Set set=new HashSet();
        int[] test={1,4,2,3,6,3,5,4,2};
        for (int num:test){
              set.add(num);
        }
        for (int i=1;i<=test.length;i++){
            if (!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);

    }


    @org.junit.Test
    //求元素出现次数最多的元素
    public void test5(){
        int[] a={1,2,2,2,2,3,4,4,4,4,4,5,6,7,8,9};
        Map <Integer,Integer>map=new HashMap();

        for(int i=0;i<a.length;i++) {
            int count=1;
           int value = a[i];
            if (map.containsKey(value)){
               count= map.get(value);
                count++;
            }
            map.put(value,count);
        }
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
                   int bb=0;
                   int keys=0;
        while (iterator.hasNext()){
            int  key= (Integer)iterator.next();
              int  valuea=(Integer) map.get(key);
               if (valuea>bb){
                   bb=valuea;
                   keys=key;
               }

        }
        System.out.println(keys);










    }


    //稀疏数组
    @Test
    public  void test6(){
        int[][] array=new int[10][10];
        array[1][2]=1;
        array[3][1]=2;
        array[2][2]=2;
          for (int[] a:array){
              for (int aa:a){
                  System.out.print(aa+"\t");

              }
              System.out.println();
          }
        System.out.println("原始前");


    }

    //双指针 链表结构
    @Test
    public  void test7(){
        int [] arr={1,2,3,2,4,5,3};
        int a=arr.length-1;//记录索引的位置
        for (int i=0;i<a;i++){
            if (arr[i]==2){
                arr[i]=arr[a];
                a--;
            }
        }
        for (int aa:arr){
            System.out.print(aa);
        }

    }

    @Test
    //双向链表
    public void test8() {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        int val = 0;//记录有效的个数
        int len = arr.length;
        while (true) {
            if (val >= len) {
                System.out.println(val);
                break;
            }
            if (arr[val] == 2) {
                arr[val] = arr[len - 1];
                arr[len-1]=2;
                len--;
                val--;
            }
            val++;

        }
        for (int aa:arr){
            System.out.print(aa);
        }


    }
    }











