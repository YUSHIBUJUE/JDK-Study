/*
 * 文件名：ConcurrentHashMap_Study.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ConcurrentHashMap_Study.java
 * 修改人：yunhai
 * 修改时间：2016年1月7日
 * 修改内容：新增
 */
package java1.util.concurrent;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * ConcurrentHashMap
 * 
 * @author yunhai
 */
public class ConcurrentHashMap_Study {
    @SuppressWarnings("unchecked")
    @Test
    public void test() {
        ConcurrentHashMap conMap = new ConcurrentHashMap(16, (float) 0.75, 50);
        conMap.put("a", 1);
        conMap.put("b", 1);
        conMap.put("c", 1);
        conMap.put("d", 1);
        conMap.put("e", 1);
        conMap.get("a");
        conMap.remove("a", 1);
        System.out.println(conMap);
    }
}