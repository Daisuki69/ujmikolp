package S1;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends of.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Unsafe f5615d;
    public static final long e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f5616g;
    public static final long h;
    public static final long i;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new m());
        }
        try {
            f = unsafe.objectFieldOffset(p.class.getDeclaredField("c"));
            e = unsafe.objectFieldOffset(p.class.getDeclaredField("b"));
            f5616g = unsafe.objectFieldOffset(p.class.getDeclaredField(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY));
            h = unsafe.objectFieldOffset(o.class.getDeclaredField(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY));
            i = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            f5615d = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // of.p
    public final void A(o oVar, Thread thread) {
        f5615d.putObject(oVar, h, thread);
    }

    @Override // of.p
    public final boolean i(p pVar, C0590d c0590d, C0590d c0590d2) {
        return k.a(f5615d, pVar, e, c0590d, c0590d2);
    }

    @Override // of.p
    public final boolean j(p pVar, Object obj, Object obj2) {
        return l.a(f5615d, pVar, f5616g, obj, obj2);
    }

    @Override // of.p
    public final boolean k(p pVar, o oVar, o oVar2) {
        return j.a(f5615d, pVar, f, oVar, oVar2);
    }

    @Override // of.p
    public final C0590d q(p pVar) {
        C0590d c0590d;
        C0590d c0590d2 = C0590d.f5608d;
        do {
            c0590d = pVar.f5622b;
            if (c0590d2 == c0590d) {
                break;
            }
        } while (!i(pVar, c0590d, c0590d2));
        return c0590d;
    }

    @Override // of.p
    public final o r(p pVar) {
        o oVar;
        o oVar2 = o.c;
        do {
            oVar = pVar.c;
            if (oVar2 == oVar) {
                break;
            }
        } while (!k(pVar, oVar, oVar2));
        return oVar;
    }

    @Override // of.p
    public final void z(o oVar, o oVar2) {
        f5615d.putObject(oVar, i, oVar2);
    }
}
