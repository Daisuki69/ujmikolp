package R;

import cj.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5423b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5424d;
    public final ArrayList e;
    public final Number f;

    public k(Object obj) {
        this.f5422a = obj;
        ArrayList arrayList = null;
        this.f5423b = null;
        if (obj instanceof String) {
            String str = (String) obj;
            this.c = str;
            String lowerCase = C2576A.b0(str).toString().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
            this.f5424d = lowerCase;
            return;
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            this.c = String.valueOf(bool.booleanValue());
            String lowerCase2 = C2576A.b0(String.valueOf(bool.booleanValue())).toString().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
            this.f5424d = lowerCase2;
            return;
        }
        if (obj instanceof Number) {
            this.f = (Number) obj;
            return;
        }
        if (obj instanceof List) {
            this.f5423b = (List) obj;
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(t.l(iterable, 10));
            for (Object lowerCase3 : iterable) {
                if (lowerCase3 instanceof String) {
                    lowerCase3 = C2576A.b0((String) lowerCase3).toString().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.j.f(lowerCase3, "toLowerCase(...)");
                }
                arrayList2.add(lowerCase3);
            }
            this.e = arrayList2;
            return;
        }
        if (obj instanceof JSONArray) {
            ArrayList arrayListS = x3.d.s((JSONArray) obj);
            this.f5423b = arrayListS;
            if (arrayListS != null) {
                arrayList = new ArrayList(t.l(arrayListS, 10));
                for (Object lowerCase4 : arrayListS) {
                    if (lowerCase4 instanceof String) {
                        lowerCase4 = C2576A.b0((String) lowerCase4).toString().toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.f(lowerCase4, "toLowerCase(...)");
                    }
                    arrayList.add(lowerCase4);
                }
            }
            this.e = arrayList;
        }
    }

    public final boolean a() {
        return this.f5423b != null;
    }
}
