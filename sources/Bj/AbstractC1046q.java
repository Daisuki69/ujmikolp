package bj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import zj.C2579a;

/* JADX INFO: renamed from: bj.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1046q implements Comparable<AbstractC1046q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9177a = new a(null);

    /* JADX INFO: renamed from: bj.q$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static String a(long j) {
        if (j >= 0) {
            C2579a.a(10);
            String string = Long.toString(j, 10);
            kotlin.jvm.internal.j.f(string, "toString(...)");
            return string;
        }
        long j6 = 10;
        long j7 = ((j >>> 1) / j6) << 1;
        long j9 = j - (j7 * j6);
        if (j9 >= j6) {
            j9 -= j6;
            j7++;
        }
        C2579a.a(10);
        String string2 = Long.toString(j7, 10);
        kotlin.jvm.internal.j.f(string2, "toString(...)");
        C2579a.a(10);
        String string3 = Long.toString(j9, 10);
        kotlin.jvm.internal.j.f(string3, "toString(...)");
        return string2.concat(string3);
    }
}
