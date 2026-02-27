package ai;

import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ai.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0715d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f7240a;

    public final io.split.android.client.utils.a a(EnumC0712a enumC0712a) {
        io.split.android.client.utils.a aVar = (io.split.android.client.utils.a) this.f7240a.get(enumC0712a);
        if (aVar != null) {
            return aVar;
        }
        int i = AbstractC0714c.f7239a[enumC0712a.ordinal()];
        if (i == 1) {
            return new C0713b(0);
        }
        if (i == 2) {
            return new C0713b(1);
        }
        if (i == 3) {
            return new C0713b(2);
        }
        Ri.a.d(numX49.tnTj78("buCL") + enumC0712a);
        return null;
    }
}
