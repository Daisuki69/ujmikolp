package n;

import android.os.Handler;
import android.os.Looper;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import z.AbstractC2540b;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final ExecutorService e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f18534a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f18535b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w f18536d = null;

    public y(Callable callable, boolean z4) {
        if (!z4) {
            e.execute(new x(this, callable));
            return;
        }
        try {
            e((w) callable.call());
        } catch (Throwable th2) {
            e(new w(th2));
        }
    }

    public static void a(y yVar, Throwable th2) {
        synchronized (yVar) {
            ArrayList arrayList = new ArrayList(yVar.f18535b);
            if (arrayList.isEmpty()) {
                AbstractC2540b.c("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((u) it.next()).onResult(th2);
            }
        }
    }

    public final synchronized void b(u uVar) {
        try {
            if (this.f18536d != null && this.f18536d.f18532b != null) {
                uVar.onResult(this.f18536d.f18532b);
            }
            this.f18535b.add(uVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(u uVar) {
        try {
            if (this.f18536d != null && this.f18536d.f18531a != null) {
                uVar.onResult(this.f18536d.f18531a);
            }
            this.f18534a.add(uVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(C1878e c1878e) {
        this.f18535b.remove(c1878e);
    }

    public final void e(w wVar) {
        if (this.f18536d != null) {
            throw new IllegalStateException(numX49.tnTj78("b24P"));
        }
        this.f18536d = wVar;
        this.c.post(new C.h(this, 26));
    }
}
