package h2;

import android.util.Log;
import java.io.IOException;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f16865d = new g(0);
    public static final A7.l e = new A7.l(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1915b f16866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16867b = null;
    public String c = null;

    public h(C1915b c1915b) {
        this.f16866a = c1915b;
    }

    public static void a(C1915b c1915b, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c1915b.m(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e7);
        }
    }
}
