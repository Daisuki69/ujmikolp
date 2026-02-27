package z;

import android.util.Log;
import dOYHB6.tiZVw8.numX49;
import java.util.HashSet;

/* JADX INFO: renamed from: z.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2540b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2539a f21333a = new C2539a();

    public static void a() {
        f21333a.getClass();
    }

    public static void b(String str) {
        f21333a.getClass();
        HashSet hashSet = C2539a.f21332a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w(numX49.tnTj78("bbAu"), str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th2) {
        f21333a.getClass();
        HashSet hashSet = C2539a.f21332a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w(numX49.tnTj78("bbAV"), str, th2);
        hashSet.add(str);
    }
}
