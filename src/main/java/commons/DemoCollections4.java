package commons;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class DemoCollections4 {
    public static void main(String[] args) {
        String str = null;
        List list1 = Arrays.asList(new String[]{"1", "2", "3"});
        List list2 = Arrays.asList(new String[]{"1", "2", "4"});
        // 判断是否为空（null或空list都为true）
        CollectionUtils.isEmpty(list1);
        // 添加元素（忽略null元素）
        CollectionUtils.addIgnoreNull(list1, str);
        // list是否包含subList中的所有元素
        CollectionUtils.containsAll(list1, list2); // false
        // list是否包含subList中的任意一个元素
        CollectionUtils.containsAny(list1, list2); // true
        // list1 减去 list2
        CollectionUtils.subtract(list1, list2); // ["3"]
        // 合并两个list并去重
        CollectionUtils.union(list1, list2); //["1", "2", "3", "4"]
        // 取两个list同时存在的元素
        CollectionUtils.intersection(list1, list2); // [1", "2"]
    }

}
