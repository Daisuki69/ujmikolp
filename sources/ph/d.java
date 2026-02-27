package Ph;

import dOYHB6.tiZVw8.numX49;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f5178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f5179b;

    static {
        d dVar = new d(numX49.tnTj78("bd3L"), 0);
        f5178a = dVar;
        f5179b = new d[]{dVar};
    }

    public static void a(AtomicReference atomicReference) {
        nk.c cVar;
        nk.c cVar2 = (nk.c) atomicReference.get();
        d dVar = f5178a;
        if (cVar2 == dVar || (cVar = (nk.c) atomicReference.getAndSet(dVar)) == dVar || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    public static boolean b(AtomicReference atomicReference, nk.c cVar) {
        Objects.requireNonNull(cVar, numX49.tnTj78("bd3r"));
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == f5178a) {
                    return false;
                }
                E1.c.k(new ProtocolViolationException(numX49.tnTj78("bd3Z")));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j) {
        if (j > 0) {
            return true;
        }
        E1.c.k(new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bd3k"))));
        return false;
    }

    public static boolean d(nk.c cVar, nk.c cVar2) {
        if (cVar2 == null) {
            E1.c.k(new NullPointerException(numX49.tnTj78("bd3B")));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        E1.c.k(new ProtocolViolationException(numX49.tnTj78("bd3u")));
        return false;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5179b.clone();
    }

    @Override // nk.c
    public final void cancel() {
    }

    @Override // nk.c
    public final void request(long j) {
    }
}
