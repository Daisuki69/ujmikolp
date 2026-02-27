package G0;

import B5.g;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.j;
import pg.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final Handler c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f1694d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1696b;

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8);
        j.f(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        f1694d = executorServiceNewFixedThreadPool;
    }

    public d(t tVar) {
        this.f1695a = tVar;
    }

    public final void a(Serializable serializable) {
        if (this.f1696b) {
            return;
        }
        this.f1696b = true;
        t tVar = this.f1695a;
        this.f1695a = null;
        c.post(new g(2, tVar, serializable));
    }
}
