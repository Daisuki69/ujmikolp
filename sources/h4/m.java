package H4;

import Bj.H;
import Bj.U;
import K4.C0271b;
import K4.C0272c;
import M8.A0;
import com.maya.raven.data.RavenNetworkException;
import defpackage.Extractor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2138b;
    public A5.j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gj.c f2139d = H.c(U.f603a);

    public m(String str, String str2) {
        this.f2137a = str;
        this.f2138b = str2;
    }

    public static final A0 a(m mVar, Throwable th2, String str) {
        mVar.getClass();
        return th2 instanceof RavenNetworkException ? new C0272c(((RavenNetworkException) th2).f10199a) : new C0271b(str);
    }

    public static final ArrayList b(m mVar, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Extractor((String) entry.getKey(), (Long) entry.getValue(), null, 4, null));
        }
        return arrayList;
    }

    public static final void c(m mVar, G4.a aVar, A0 a02) {
        Gj.c cVar = mVar.f2139d;
        Ij.e eVar = U.f603a;
        H.w(cVar, Gj.m.f2024a, null, new g(a02, aVar, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(H4.m r9, java.lang.String r10, java.lang.String r11, G4.a r12, ij.AbstractC1609c r13) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.m.d(H4.m, java.lang.String, java.lang.String, G4.a, ij.c):java.lang.Object");
    }
}
