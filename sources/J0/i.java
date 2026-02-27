package j0;

import D.A;
import D.B;
import D.H;
import D.S;
import D.b0;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import b1.t;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.firebase.messaging.r;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17651b = 1;
    public final CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f17652d;
    public final Object e;
    public final Object f;

    public i(CleverTapInstanceConfig cleverTapInstanceConfig, H h, Qd.a aVar) {
        this.c = cleverTapInstanceConfig;
        this.f17652d = cleverTapInstanceConfig.c();
        this.e = h;
        this.f = aVar;
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        switch (this.f17651b) {
            case 0:
                Qd.a aVar = (Qd.a) this.f;
                CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
                S s9 = this.f17652d;
                try {
                    if (jSONObject.has("g")) {
                        String string = jSONObject.getString("g");
                        ((H) this.e).b(string);
                        s9.getClass();
                        S.s(cleverTapInstanceConfig.f9439a, "Got a new device ID: " + string);
                    }
                } catch (Throwable th2) {
                    String str2 = cleverTapInstanceConfig.f9439a;
                    s9.getClass();
                    S.t(str2, "Failed to update device ID!", th2);
                }
                try {
                    if (jSONObject.has("_i")) {
                        long j = jSONObject.getLong("_i");
                        aVar.getClass();
                        kotlin.jvm.internal.j.g(context, "context");
                        SharedPreferences.Editor editorEdit = b0.f(context, "IJ").edit();
                        editorEdit.putLong(b0.o(((CleverTapInstanceConfig) aVar.f5354b).f9439a, "comms_i"), j);
                        b0.i(editorEdit);
                    }
                    break;
                } catch (Throwable unused) {
                }
                try {
                    if (jSONObject.has("_j")) {
                        long j6 = jSONObject.getLong("_j");
                        aVar.getClass();
                        kotlin.jvm.internal.j.g(context, "context");
                        SharedPreferences.Editor editorEdit2 = b0.f(context, "IJ").edit();
                        editorEdit2.putLong(b0.o(((CleverTapInstanceConfig) aVar.f5354b).f9439a, "comms_j"), j6);
                        b0.i(editorEdit2);
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            default:
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.c;
                String str3 = cleverTapInstanceConfig2.f9439a;
                this.f17652d.getClass();
                S.s(str3, "Processing Product Config response...");
                if (cleverTapInstanceConfig2.h) {
                    S.s(cleverTapInstanceConfig2.f9439a, "CleverTap instance is configured to analytics only, not processing Product Config response");
                } else if (jSONObject == null) {
                    S.s(cleverTapInstanceConfig2.f9439a, "Product Config : Can't parse Product Config Response, JSON response object is null");
                    b();
                } else if (!jSONObject.has("pc_notifs")) {
                    S.s(cleverTapInstanceConfig2.f9439a, "Product Config : JSON object doesn't contain the Product Config key");
                    b();
                } else {
                    try {
                        S.s(cleverTapInstanceConfig2.f9439a, "Product Config : Processing Product Config response");
                        c(jSONObject.getJSONObject("pc_notifs"));
                    } catch (Throwable th3) {
                        b();
                        S.t(cleverTapInstanceConfig2.f9439a, "Product Config : Failed to parse Product Config response", th3);
                    }
                }
                break;
        }
    }

    public void b() {
        ((B) this.e).getClass();
    }

    public void c(JSONObject jSONObject) {
        t tVar;
        if (jSONObject.getJSONArray("kv") == null || (tVar = (t) ((A) this.f).f794g) == null) {
            b();
            return;
        }
        if (TextUtils.isEmpty((String) ((r) tVar.h).f9803b)) {
            return;
        }
        synchronized (tVar) {
            try {
                tVar.l(jSONObject);
                ((n0.d) tVar.f8335d).c(new JSONObject((Map) tVar.i), tVar.g(), "activated.json");
                S sC = ((CleverTapInstanceConfig) tVar.e).c();
                String strL = jk.b.l((CleverTapInstanceConfig) tVar.e);
                String str = "Fetch file-[" + tVar.e() + "] write success: " + ((Map) tVar.i);
                sC.getClass();
                S.s(strL, str);
                l0.c cVarA = l0.b.a((CleverTapInstanceConfig) tVar.e);
                cVarA.d(cVarA.f18219b, cVarA.c, "Main").k("sendPCFetchSuccessCallback", new f0.b(tVar, 1));
            } catch (Exception e) {
                e.printStackTrace();
                S sC2 = ((CleverTapInstanceConfig) tVar.e).c();
                String strL2 = jk.b.l((CleverTapInstanceConfig) tVar.e);
                sC2.getClass();
                S.s(strL2, "Product Config: fetch Failed");
                tVar.m(2);
                ((AtomicBoolean) tVar.f).compareAndSet(true, false);
            }
            if (((AtomicBoolean) tVar.f).getAndSet(false)) {
                tVar.b();
            }
        }
    }

    public i(CleverTapInstanceConfig cleverTapInstanceConfig, B b8, A a8) {
        this.c = cleverTapInstanceConfig;
        this.f17652d = cleverTapInstanceConfig.c();
        this.e = b8;
        this.f = a8;
    }
}
