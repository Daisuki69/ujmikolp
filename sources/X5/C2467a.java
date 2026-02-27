package x5;

import B5.i;
import S5.c;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: x5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2467a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1220i f20931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20932b;
    public final c c;

    public C2467a(i iVar, c cVar, C1220i c1220i) {
        this.f20931a = c1220i;
        this.f20932b = iVar;
        this.c = cVar;
    }

    public final void a(String str, LinkedHashMap linkedHashMap) {
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        this.f20931a.b(c1219hE);
    }
}
