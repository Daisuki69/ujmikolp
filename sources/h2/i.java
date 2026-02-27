package h2;

import java.util.Objects;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f16868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f16869b;

    public i(t tVar, C1915b c1915b) {
        this.f16868a = tVar;
        this.f16869b = new h(c1915b);
    }

    public final void a(String str) {
        h hVar = this.f16869b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f16867b, str)) {
                h.a(hVar.f16866a, str, hVar.c);
                hVar.f16867b = str;
            }
        }
    }
}
