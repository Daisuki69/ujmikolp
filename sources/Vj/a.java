package Vj;

import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import zj.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6134a;

    static {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.f(property, "getProperty(...)");
            objA = y.f(property);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        Integer num = (Integer) objA;
        f6134a = num != null ? num.intValue() : 2097152;
    }
}
