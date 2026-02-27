package n;

import android.content.Context;
import w.C2360b;
import w.C2361c;

/* JADX INFO: renamed from: n.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1876c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f18453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C2361c f18454b;
    public static volatile C2360b c;

    public static void a() {
        int i = f18453a;
        if (i > 0) {
            f18453a = i - 1;
        }
    }

    public static C2360b b(Context context) {
        C2360b c2360b;
        Context applicationContext = context.getApplicationContext();
        C2360b c2360b2 = c;
        if (c2360b2 != null) {
            return c2360b2;
        }
        synchronized (C2360b.class) {
            try {
                c2360b = c;
                if (c2360b == null) {
                    c2360b = new C2360b(new E1.e(applicationContext), 0);
                    c = c2360b;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2360b;
    }
}
