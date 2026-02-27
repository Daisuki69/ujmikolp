package Y;

import D.c0;
import b0.InterfaceC0845a;
import k0.C1689a;
import kotlin.jvm.internal.j;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements InterfaceC0845a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1689a f6704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cg.c f6705b;
    public JSONArray c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f6706d;
    public String e;

    public d(C1689a c1689a, Cg.c cVar) {
        this.f6704a = c1689a;
        this.f6705b = cVar;
    }

    @Override // b0.InterfaceC0845a
    public final void a(String deviceId, String accountId) {
        j.g(deviceId, "deviceId");
        j.g(accountId, "accountId");
        c0.f900a.b();
        String prefName = c0.a(1, deviceId, accountId);
        C1689a c1689a = this.f6704a;
        j.g(prefName, "prefName");
        c1689a.f17825a = prefName;
    }

    public final void b(JSONArray jSONArray) {
        this.f6706d = jSONArray;
        String string = jSONArray.toString();
        j.f(string, "toString(...)");
        Cg.c cVar = this.f6705b;
        F.e eVar = F.e.f1495a;
        String strG = cVar.g(string);
        if (strG != null) {
            this.f6704a.f("inApp", strG);
        }
    }
}
