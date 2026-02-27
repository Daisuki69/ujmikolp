package qi;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import ki.h;
import oi.C1988f;

/* JADX INFO: renamed from: qi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2177c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1781b f19794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19795b;
    public final C1988f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.split.android.client.storage.attributes.b f19796d;
    public final AtomicBoolean e;

    public C2177c(C1781b c1781b, h hVar, C1988f c1988f, io.split.android.client.storage.attributes.b bVar, boolean z4) {
        this.f19794a = c1781b;
        this.f19795b = hVar;
        this.c = c1988f;
        this.f19796d = bVar;
        this.e = new AtomicBoolean(z4);
    }

    @Override // qi.g
    public final void a(fi.b bVar) {
        this.c.b(bVar.f16762d, bVar.f16761b);
        io.split.android.client.storage.attributes.b bVar2 = this.f19796d;
        String str = bVar.f16760a;
        String str2 = bVar.f16761b;
        bVar2.getClass();
        if (str2 != null) {
            synchronized (bVar2.f17616b) {
                try {
                    if (!bVar2.f17615a.containsKey(str)) {
                        bVar2.f17615a.put(str, new HashSet());
                    }
                    ((Set) bVar2.f17615a.get(str)).add(str2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f19796d.f17615a.size() < 30000 || !this.e.get()) {
            return;
        }
        this.f19794a.l(new Bi.a((Ki.d) this.f19795b.f18141b.m, this.f19796d.a()), null);
    }
}
