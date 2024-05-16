import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide106Chuong4 {
    public static void main(String[] args) {
        // Khai bao 1 TreeMap co ten la treeMap
        // kieu du lieu cua key la integer
        // va value la character
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        // Them value vao trong tree Map voi key tuong ung
        // su dung phuong thuc put()
        // va doi so thu 2 la value co kieu la character
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');

        // tao 1 Set co ten la setTreeMap
        // chua toan bo cac entry ( vua key vua value)
        // cua treeMap
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        // cac entry trong setTreeMap se duoc sap xep tang dan theo khoa
        System.out.println("Cac entry co trong setTreeMap:");
        System.out.println(setTreeMap);
    }
}
