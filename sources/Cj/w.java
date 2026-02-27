package cj;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w extends v {
    public static void n(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void o(List list, Comparator comparator) {
        kotlin.jvm.internal.j.g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
