package D;

import android.content.Context;
import dOYHB6.tiZVw8.numX49;
import k0.C1689a;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0180m f900a = new C0180m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c0 f901b;

    public static String a(int i, String str, String str2) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PekC"));
        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("Pek4"));
        if (i == 1) {
            return numX49.tnTj78("Pekm") + str + ':' + str2;
        }
        if (i == 2) {
            return numX49.tnTj78("Pekc") + str + ':' + str2;
        }
        if (i != 3) {
            if (i == 4) {
                return numX49.tnTj78("PekK").concat(str2);
            }
            if (i == 5) {
                return numX49.tnTj78("Peko").concat(str2);
            }
        }
        return numX49.tnTj78("Pekw");
    }

    public static /* synthetic */ String b(int i, int i4, String str) {
        int i6 = i4 & 4;
        String strTnTj78 = numX49.tnTj78("PekD");
        if (i6 != 0) {
            str = strTnTj78;
        }
        return a(i, strTnTj78, str);
    }

    public static C1689a c(Context context, String str) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("Pekh"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PekM"));
        return new C1689a(context, str);
    }

    public static Y.d d(Context context, Cg.c cVar, String str, String str2) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("PekN"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("Pek6"));
        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("Peka"));
        return new Y.d(c(context, a(1, str, str2)), cVar);
    }
}
