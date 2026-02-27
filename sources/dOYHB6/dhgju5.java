package dOYHB6;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class dhgju5 {

    public class s3BdS0 {
        public s3BdS0() {
        }

        public static <K, V> V dbht22(Map<K, V> map, K k8, V v7) {
            return map.put(k8, v7);
        }

        public static <K, V> Map ekoM83() {
            return new ConcurrentHashMap();
        }

        public static <K, V> boolean m2aSD3(Map<K, V> map, K k8) {
            return map.containsKey(k8);
        }

        public static <K, V> int prkVL5(Map<K, V> map) {
            return map.size();
        }

        public static <K, V> V wEbX23(Map<K, V> map, K k8) {
            return map.get(k8);
        }
    }

    public class w0rgj5 {
        public w0rgj5() {
        }

        public static String[] aI4Yd9(String str, String str2) {
            return str.split(str2);
        }

        public static char nOf4o6(String str, int i) {
            return str.charAt(i);
        }

        public static String nVRnM1(String str, int i) {
            return str.substring(i);
        }

        public static String nVRnM1(String str, int i, int i4) {
            return str.substring(i, i4);
        }

        public static char[] nfd4k1(String str) {
            return str.toCharArray();
        }

        public static int xUiAj1(String str) {
            return str.length();
        }
    }
}
