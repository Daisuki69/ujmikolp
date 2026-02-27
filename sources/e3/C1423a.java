package e3;

import android.content.Context;
import android.os.Bundle;
import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: renamed from: e3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1423a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f16558a;

    public C1423a(Context appContext) {
        kotlin.jvm.internal.j.g(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f16558a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // e3.t
    public final Boolean a() {
        Bundle bundle = this.f16558a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // e3.t
    public final kotlin.time.a b() {
        Bundle bundle = this.f16558a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new kotlin.time.a(kotlin.time.b.e(bundle.getInt("firebase_sessions_sessions_restart_timeout"), Aj.b.f331d));
        }
        return null;
    }

    @Override // e3.t
    public final Double c() {
        Bundle bundle = this.f16558a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // e3.t
    public final Object d(InterfaceC1526a interfaceC1526a) {
        return Unit.f18162a;
    }
}
