package Ff;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf.d f1578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1579b;

    public b(yf.d dVar) {
        this.f1578a = dVar;
        h hVar = h.f1587b;
        Class cls = (Class) hVar.f1588a.get(dVar.z(yf.j.m0));
        g gVar = null;
        if (cls != null) {
            try {
                gVar = (g) cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e7) {
                throw new RuntimeException(e7);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
        this.f1579b = gVar;
    }

    public final Df.h a(yf.j jVar) {
        yf.b bVarQ = this.f1578a.q(yf.j.f21169B);
        if (!(bVarQ instanceof yf.d)) {
            return null;
        }
        yf.b bVarQ2 = ((yf.d) bVarQ).q(jVar);
        if (!(bVarQ2 instanceof yf.d)) {
            return null;
        }
        Df.h hVar = new Df.h();
        hVar.f1133b = (yf.d) bVarQ2;
        return hVar;
    }

    public final int b() {
        return this.f1578a.t(yf.j.f21177F0, null, 40);
    }

    @Override // Df.c
    public final yf.b c() {
        return this.f1578a;
    }

    public final g d() throws IOException {
        g gVar = this.f1579b;
        if (gVar != null) {
            return gVar;
        }
        throw new IOException("No security handler for filter " + this.f1578a.z(yf.j.m0));
    }

    public final int e() {
        return this.f1578a.t(yf.j.f21168A1, null, 0);
    }

    public final boolean f() {
        yf.b bVarQ = this.f1578a.q(yf.j.f21230k0);
        if (bVarQ instanceof yf.c) {
            return ((yf.c) bVarQ).f21153a;
        }
        return true;
    }
}
