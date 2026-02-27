package S1;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dynatrace.android.agent.Global;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends T1.a implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5619d;
    public static final x e;
    public static final of.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f5620g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f5621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C0590d f5622b;
    public volatile o c;

    static {
        boolean z4;
        Throwable th2;
        of.p c0593g;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f5619d = z4;
        e = new x();
        Throwable th3 = null;
        try {
            c0593g = new n();
            th2 = null;
        } catch (Error | Exception e7) {
            th2 = e7;
            try {
                c0593g = new C0591e(AtomicReferenceFieldUpdater.newUpdater(o.class, Thread.class, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(o.class, o.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p.class, o.class, "c"), AtomicReferenceFieldUpdater.newUpdater(p.class, C0590d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY));
            } catch (Error | Exception e10) {
                th3 = e10;
                c0593g = new C0593g();
            }
        }
        f = c0593g;
        if (th3 != null) {
            x xVar = e;
            Logger loggerA = xVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            xVar.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        f5620g = new Object();
    }

    public static void d(p pVar, boolean z4) {
        C0590d c0590d = null;
        while (true) {
            pVar.getClass();
            for (o oVarR = f.r(pVar); oVarR != null; oVarR = oVarR.f5618b) {
                Thread thread = oVarR.f5617a;
                if (thread != null) {
                    oVarR.f5617a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z4) {
                z4 = false;
            }
            pVar.b();
            C0590d c0590d2 = c0590d;
            C0590d c0590dQ = f.q(pVar);
            C0590d c0590d3 = c0590d2;
            while (c0590dQ != null) {
                C0590d c0590d4 = c0590dQ.c;
                c0590dQ.c = c0590d3;
                c0590d3 = c0590dQ;
                c0590dQ = c0590d4;
            }
            while (c0590d3 != null) {
                c0590d = c0590d3.c;
                Runnable runnable = c0590d3.f5609a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0592f) {
                    RunnableC0592f runnableC0592f = (RunnableC0592f) runnable;
                    pVar = runnableC0592f.f5613a;
                    if (pVar.f5621a == runnableC0592f) {
                        if (f.j(pVar, runnableC0592f, g(runnableC0592f.f5614b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0590d3.f5610b;
                    Objects.requireNonNull(executor);
                    e(runnable, executor);
                }
                c0590d3 = c0590d;
            }
            return;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof C0587a) {
            RuntimeException runtimeException = ((C0587a) obj).f5605b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C0589c) {
            throw new ExecutionException(((C0589c) obj).f5607a);
        }
        if (obj == f5620g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(S1.y r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.p.g(S1.y):java.lang.Object");
    }

    public static Object h(y yVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = yVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            c(sb2, objH);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e7.getCause());
            sb2.append("]");
        } catch (Exception e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // S1.y
    public void addListener(Runnable runnable, Executor executor) {
        C0590d c0590d;
        C0590d c0590d2;
        qk.i.l(runnable, "Runnable was null.");
        qk.i.l(executor, "Executor was null.");
        if (!isDone() && (c0590d = this.f5622b) != (c0590d2 = C0590d.f5608d)) {
            C0590d c0590d3 = new C0590d(runnable, executor);
            do {
                c0590d3.c = c0590d;
                if (f.i(this, c0590d, c0590d3)) {
                    return;
                } else {
                    c0590d = this.f5622b;
                }
            } while (c0590d != c0590d2);
        }
        e(runnable, executor);
    }

    public void b() {
    }

    public final void c(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        C0587a c0587a;
        Object obj = this.f5621a;
        if (!(obj == null) && !(obj instanceof RunnableC0592f)) {
            return false;
        }
        if (f5619d) {
            c0587a = new C0587a(z4, new CancellationException("Future.cancel() was called."));
        } else {
            c0587a = z4 ? C0587a.c : C0587a.f5603d;
            Objects.requireNonNull(c0587a);
        }
        p pVar = this;
        boolean z5 = false;
        while (true) {
            if (f.j(pVar, obj, c0587a)) {
                d(pVar, z4);
                if (!(obj instanceof RunnableC0592f)) {
                    break;
                }
                y yVar = ((RunnableC0592f) obj).f5614b;
                if (!(yVar instanceof h)) {
                    yVar.cancel(z4);
                    break;
                }
                pVar = (p) yVar;
                obj = pVar.f5621a;
                if (!(obj == null) && !(obj instanceof RunnableC0592f)) {
                    break;
                }
                z5 = true;
            } else {
                obj = pVar.f5621a;
                if (!(obj instanceof RunnableC0592f)) {
                    return z5;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z4;
        long j6;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5621a;
        if ((obj != null) && (!(obj instanceof RunnableC0592f))) {
            return f(obj);
        }
        long j7 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o oVar = this.c;
            o oVar2 = o.c;
            if (oVar != oVar2) {
                o oVar3 = new o();
                z4 = true;
                while (true) {
                    of.p pVar = f;
                    pVar.z(oVar3, oVar);
                    if (pVar.k(this, oVar, oVar3)) {
                        j6 = j7;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(oVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5621a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0592f))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(oVar3);
                    } else {
                        long j9 = j7;
                        oVar = this.c;
                        if (oVar == oVar2) {
                            break;
                        }
                        j7 = j9;
                    }
                }
            }
            Object obj3 = this.f5621a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        z4 = true;
        j6 = 0;
        while (nanos > j6) {
            Object obj4 = this.f5621a;
            if ((obj4 != null ? z4 : false) && (!(obj4 instanceof RunnableC0592f))) {
                return f(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbS = androidx.camera.core.impl.a.s(j, "Waited ", Global.BLANK);
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < j6) {
            String strI = We.s.i(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z5 = (jConvert == j6 || nanos2 > 1000) ? z4 : false;
            if (jConvert > j6) {
                String strI2 = strI + jConvert + Global.BLANK + lowerCase;
                if (z5) {
                    strI2 = We.s.i(strI2, ",");
                }
                strI = We.s.i(strI2, Global.BLANK);
            }
            if (z5) {
                strI = strI + nanos2 + " nanoseconds ";
            }
            string3 = We.s.i(strI, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(We.s.i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(androidx.camera.core.impl.a.j(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean isCancelled() {
        return this.f5621a instanceof C0587a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof RunnableC0592f)) & (this.f5621a != null);
    }

    public final void j(o oVar) {
        oVar.f5617a = null;
        while (true) {
            o oVar2 = this.c;
            if (oVar2 == o.c) {
                return;
            }
            o oVar3 = null;
            while (oVar2 != null) {
                o oVar4 = oVar2.f5618b;
                if (oVar2.f5617a != null) {
                    oVar3 = oVar2;
                } else if (oVar3 != null) {
                    oVar3.f5618b = oVar4;
                    if (oVar3.f5617a == null) {
                        break;
                    }
                } else if (!f.k(this, oVar2, oVar4)) {
                    break;
                }
                oVar2 = oVar4;
            }
            return;
        }
    }

    public boolean k(Throwable th2) {
        if (!f.j(this, null, new C0589c(th2))) {
            return false;
        }
        d(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.p.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5621a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0592f))) {
                return f(obj2);
            }
            o oVar = this.c;
            o oVar2 = o.c;
            if (oVar != oVar2) {
                o oVar3 = new o();
                do {
                    of.p pVar = f;
                    pVar.z(oVar3, oVar);
                    if (pVar.k(this, oVar, oVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5621a;
                            } else {
                                j(oVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0592f))));
                        return f(obj);
                    }
                    oVar = this.c;
                } while (oVar != oVar2);
            }
            Object obj3 = this.f5621a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new InterruptedException();
    }
}
