package c1;

import a1.C0620a;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import l1.InterfaceC1797a;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static volatile j e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1797a f9248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1797a f9249b;
    public final h1.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.f f9250d;

    public s(InterfaceC1797a interfaceC1797a, InterfaceC1797a interfaceC1797a2, h1.b bVar, i1.f fVar, i1.g gVar) {
        this.f9248a = interfaceC1797a;
        this.f9249b = interfaceC1797a2;
        this.c = bVar;
        this.f9250d = fVar;
        gVar.getClass();
        gVar.f17082a.execute(new androidx.window.layout.adapter.extensions.a(gVar, 15));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        E1.e eVar = new E1.e();
                        context.getClass();
                        eVar.f1229a = context;
                        e = eVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final q c(C0620a c0620a) {
        Set setSingleton;
        byte[] bytes;
        if (c0620a != null) {
            c0620a.getClass();
            setSingleton = Collections.unmodifiableSet(C0620a.f6974d);
        } else {
            setSingleton = Collections.singleton(new Z0.c("proto"));
        }
        Z0.e eVar = Z0.e.f6874a;
        c0620a.getClass();
        String str = c0620a.f6975a;
        String str2 = c0620a.f6976b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            bytes = We.s.k("1$", str, "\\", str2 != null ? str2 : "").getBytes(Charset.forName("UTF-8"));
        }
        return new q(setSingleton, new i("cct", bytes, eVar), this);
    }
}
