package l0;

import We.s;
import android.os.Handler;
import android.os.Looper;
import c1.o;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f18218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f18219b;
    public final o c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CleverTapInstanceConfig f18220d;
    public final HashMap e;

    public c(CleverTapInstanceConfig cleverTapInstanceConfig) {
        o oVar = new o();
        oVar.f9242b = new Handler(Looper.getMainLooper());
        this.f18219b = oVar;
        this.c = oVar;
        this.e = new HashMap();
        this.f18220d = cleverTapInstanceConfig;
        e eVar = new e();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        eVar.f18223a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f18218a = eVar;
    }

    public final C1915b a() {
        return d(this.f18218a, this.c, "ioTask");
    }

    public final C1915b b() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f18220d;
        return c(cleverTapInstanceConfig != null ? cleverTapInstanceConfig.f9439a : null);
    }

    public final C1915b c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Tag can't be null");
        }
        HashMap map = this.e;
        g gVar = (g) map.get(str);
        if (gVar == null) {
            gVar = new g();
            gVar.f18224a = 0L;
            gVar.f18225b = Executors.newSingleThreadExecutor();
            map.put(str, gVar);
        }
        return d(gVar, this.c, "PostAsyncSafely");
    }

    public final C1915b d(Executor executor, Executor executor2, String str) {
        if (executor == null || executor2 == null) {
            throw new IllegalArgumentException(s.j("Can't create task ", str, " with null executors"));
        }
        return new C1915b(this.f18220d, executor, executor2, str);
    }
}
