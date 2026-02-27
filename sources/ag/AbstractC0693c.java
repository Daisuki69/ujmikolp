package ag;

import android.content.Context;
import android.os.Build;
import bg.C0960E;
import bg.C1006j0;
import cj.C1110A;
import cj.C1112C;
import cj.G;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;

/* JADX INFO: renamed from: ag.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0693c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7198b;

    public AbstractC0693c(Context context, int i) {
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(context, numX49.tnTj78("bueu"));
                this.f7198b = context;
                this.f7197a = new ArrayList();
                break;
            default:
                this.f7198b = context;
                this.f7197a = new ArrayList();
                break;
        }
    }

    public static void b(AbstractC0693c abstractC0693c, C0702l c0702l, Function1 function1) {
        kotlin.jvm.internal.j.h(c0702l, numX49.tnTj78("bueV"));
        int i = Build.VERSION.SDK_INT;
        if (i < c0702l.f7215d || i >= c0702l.f) {
            return;
        }
        ArrayList arrayList = abstractC0693c.f7197a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : c0702l.c) {
            if (abstractC0693c.e(abstractC0693c.f7198b, (String) obj)) {
                arrayList2.add(obj);
            }
        }
        D.d(1, function1);
        C1112C c1112c = c0702l.f7214b;
        kotlin.jvm.internal.j.h(c1112c, numX49.tnTj78("bueS"));
        arrayList.add(new C0702l(c0702l.f7213a, c1112c, arrayList2, c0702l.f7215d, function1, c0702l.f));
    }

    public static /* synthetic */ void c(AbstractC0693c abstractC0693c, C0960E c0960e, Function1 function1, Function1 function12, int i) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        abstractC0693c.d(c0960e, function1, function12);
    }

    public C0703m a() {
        ArrayList arrayList = this.f7197a;
        Map mapA = G.a(new C0692b(0, arrayList));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new C0703m(arrayList, g(), 0);
        }
        throw new IllegalArgumentException(g().d() + numX49.tnTj78("buej") + C1110A.F(linkedHashMap.keySet(), numX49.tnTj78("bued"), null, null, null, 62));
    }

    public void d(C0960E c0960e, Function1 function1, Function1 function12) {
        kotlin.jvm.internal.j.h(c0960e, numX49.tnTj78("buei"));
        int i = Build.VERSION.SDK_INT;
        if (i < c0960e.f8727d || i >= c0960e.f8728g) {
            return;
        }
        ArrayList arrayList = this.f7197a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : c0960e.c) {
            kotlin.jvm.internal.j.h(this.f7198b, numX49.tnTj78("bueE"));
            arrayList2.add(obj);
        }
        D.d(1, function12);
        List list = c0960e.f8726b;
        kotlin.jvm.internal.j.h(list, numX49.tnTj78("bueF"));
        arrayList.add(new C0960E(c0960e.f8725a, list, arrayList2, c0960e.f8727d, function12, function1, c0960e.f8728g));
    }

    public boolean e(Context context, String str) {
        return true;
    }

    public C0703m f() {
        ArrayList arrayList = this.f7197a;
        Map mapA = G.a(new C1006j0(arrayList));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new C0703m(arrayList, g(), 1);
        }
        throw new IllegalArgumentException(g().d() + numX49.tnTj78("bueH") + C1110A.F(linkedHashMap.keySet(), numX49.tnTj78("bueO"), null, null, null, 62));
    }

    public abstract Xf.a g();
}
