package bf;

import M8.A0;
import com.google.firebase.messaging.r;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: renamed from: bf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0948a extends A0 {
    public final Map c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f8645d;
    public final boolean e;

    public C0948a(Map map, boolean z4) {
        super(12);
        this.f8645d = new r(11, false);
        this.c = map;
        this.e = z4;
    }

    public final void A(ArrayList arrayList) {
        if (this.e) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        r rVar = this.f8645d;
        map2.put("code", (String) rVar.f9803b);
        map2.put("message", (String) rVar.f9804d);
        map2.put("data", (HashMap) rVar.e);
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, map2);
        arrayList.add(map);
    }

    public final void B(ArrayList arrayList) {
        if (this.e) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", (Serializable) this.f8645d.c);
        arrayList.add(map);
    }

    @Override // M8.A0
    public final Object l(String str) {
        return this.c.get(str);
    }

    @Override // M8.A0
    public final String n() {
        return (String) this.c.get(Constants.METHOD);
    }

    @Override // M8.A0
    public final boolean p() {
        return this.e;
    }

    @Override // M8.A0
    public final InterfaceC0950c q() {
        return this.f8645d;
    }

    @Override // M8.A0
    public final boolean s() {
        return this.c.containsKey("transactionId");
    }
}
