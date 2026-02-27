package Z;

import D.C0178k;
import D.S;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.Iterator;
import n2.C1915b;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H.b f6847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6848b;
    public final Object c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6849d;
    public final boolean e;
    public final C0178k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D.r f6850g;
    public final CleverTapInstanceConfig h;

    public p(CleverTapInstanceConfig cleverTapInstanceConfig, String str, H.b bVar, C0178k c0178k, D.r rVar, boolean z4) {
        this.f6849d = str;
        this.f6847a = bVar;
        this.f6848b = bVar.k(str);
        this.e = z4;
        this.f = c0178k;
        this.f6850g = rVar;
        this.h = cleverTapInstanceConfig;
    }

    public final void a(String str) {
        v vVarC = c(str);
        if (vVarC == null) {
            return;
        }
        synchronized (this.c) {
            this.f6848b.remove(vVarC);
        }
        l0.b.a(this.h).b().k("RunDeleteMessage", new o(this, str, 0));
    }

    public final boolean b(String str) {
        v vVarC = c(str);
        if (vVarC == null) {
            return false;
        }
        synchronized (this.c) {
            vVarC.f = true;
        }
        C1915b c1915bB = l0.b.a(this.h).b();
        c1915bB.e(new Xa.c(this, 8));
        c1915bB.d(new m(str, 0));
        c1915bB.k("RunMarkMessageRead", new o(this, str, 1));
        return true;
    }

    public final v c(String str) {
        synchronized (this.c) {
            try {
                for (v vVar : this.f6848b) {
                    if (vVar.f6862d.equals(str)) {
                        return vVar;
                    }
                }
                S.l("Inbox Message for message id - " + str + " not found");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ArrayList d() {
        ArrayList arrayList;
        synchronized (this.c) {
            e();
            arrayList = this.f6848b;
        }
        return arrayList;
    }

    public final void e() {
        S.l("CTInboxController:trimMessages() called");
        ArrayList arrayList = new ArrayList();
        synchronized (this.c) {
            try {
                for (v vVar : this.f6848b) {
                    if (this.e || !vVar.a()) {
                        long j = vVar.c;
                        if (j > 0 && System.currentTimeMillis() / 1000 > j) {
                            S.l("Inbox Message: " + vVar.f6862d + " is expired - removing");
                            arrayList.add(vVar);
                        }
                    } else {
                        S.b("Removing inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                        arrayList.add(vVar);
                    }
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a(((v) it.next()).f6862d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(JSONArray jSONArray) {
        S.l("CTInboxController:updateMessages() called");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                v vVarB = v.b(this.f6849d, jSONArray.getJSONObject(i));
                if (vVarB != null) {
                    if (this.e || !vVarB.a()) {
                        arrayList.add(vVarB);
                        S.l("Inbox Message for message id - " + vVarB.f6862d + " added");
                    } else {
                        S.b("Dropping inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    }
                }
            } catch (JSONException e) {
                S.b("Unable to update notification inbox messages - " + e.getLocalizedMessage());
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        this.f6847a.q(arrayList);
        S.l("New Notification Inbox messages added");
        synchronized (this.c) {
            this.f6848b = this.f6847a.k(this.f6849d);
            e();
        }
        return true;
    }
}
