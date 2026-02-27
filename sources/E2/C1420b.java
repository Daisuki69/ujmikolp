package e2;

import a3.AbstractC0628e;
import a3.C0626c;
import a3.C0627d;
import android.util.Log;
import cj.t;
import gf.g;
import i2.e;
import j2.C1663b;
import j2.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n2.C1915b;
import o6.C1967a;

/* JADX INFO: renamed from: e2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1420b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1915b f16553a;

    public C1420b(C1915b c1915b) {
        this.f16553a = c1915b;
    }

    public final void a(C0627d c0627d) {
        int i = 3;
        C1915b c1915b = this.f16553a;
        HashSet hashSet = c0627d.f6991a;
        ArrayList arrayList = new ArrayList(t.l(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C0626c c0626c = (C0626c) ((AbstractC0628e) it.next());
            String str = c0626c.f6989b;
            String str2 = c0626c.f6990d;
            String strSubstring = c0626c.e;
            String str3 = c0626c.c;
            long j = c0626c.f;
            C1967a c1967a = n.f17693a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new C1663b(str, str2, strSubstring, str3, j));
        }
        synchronized (((g) c1915b.f18589g)) {
            try {
                if (((g) c1915b.f18589g).b(arrayList)) {
                    ((e) c1915b.f18588d).f17093b.a(new io.flutter.plugins.firebase.core.a(i, c1915b, ((g) c1915b.f18589g).a()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
