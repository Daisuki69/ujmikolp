package cj;

import dj.C1406d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r {
    public static C1406d a(C1406d c1406d) {
        c1406d.e();
        c1406d.c = true;
        return c1406d.f16519b > 0 ? c1406d : C1406d.f16517d;
    }

    public static C1406d b() {
        return new C1406d((Object) null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.j.f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
