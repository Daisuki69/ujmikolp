package p3;

import android.content.Context;
import b2.C0859a;
import dOYHB6.yFtIp6.svM7M6;
import java.util.UUID;
import oi.C1986d;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0859a f19037b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19038a;

    static {
        K3.d dVarB = C0859a.b(k.class);
        dVarB.c(b2.h.c(g.class));
        dVarB.c(b2.h.c(Context.class));
        dVarB.f = new C1986d(1);
        f19037b = dVarB.d();
    }

    public k(Context context) {
        this.f19038a = context;
    }

    public final synchronized String a() {
        String string = svM7M6.getString(this.f19038a.getSharedPreferences("com.google.mlkit.internal", 0), "ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f19038a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
