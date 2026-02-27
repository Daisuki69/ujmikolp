package Y;

import D.c0;
import b0.InterfaceC0845a;
import cj.C1112C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.C1689a;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.y;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC0845a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1689a f6702a;

    public b(C1689a c1689a) {
        this.f6702a = c1689a;
    }

    @Override // b0.InterfaceC0845a
    public final void a(String deviceId, String accountId) {
        j.g(deviceId, "deviceId");
        j.g(accountId, "accountId");
        c0.f900a.b();
        String prefName = c0.a(2, deviceId, accountId);
        C1689a c1689a = this.f6702a;
        j.g(prefName, "prefName");
        c1689a.f17825a = prefName;
    }

    public final List b(String campaignId) {
        j.g(campaignId, "campaignId");
        String strB = this.f6702a.b("__impressions_".concat(campaignId), "");
        if (strB == null || C2576A.H(strB)) {
            return C1112C.f9377a;
        }
        List listT = C2576A.T(strB, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            Long lG = y.g((String) it.next());
            if (lG != null) {
                arrayList.add(lG);
            }
        }
        return arrayList;
    }
}
