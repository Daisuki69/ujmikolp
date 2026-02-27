package P5;

import a5.C0631c;
import android.content.Context;
import android.provider.Settings;
import cg.InterfaceC1101b;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.api.ApigeeApi;
import com.paymaya.data.api.SuspendApi;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.U0;
import x5.C2467a;

/* JADX INFO: renamed from: P5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0533b implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5051b;
    public final InterfaceC1101b c;

    public /* synthetic */ C0533b(Object obj, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, int i) {
        this.f5050a = i;
        this.f5051b = interfaceC1101b;
        this.c = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5050a) {
            case 0:
                Context context = (Context) this.f5051b.get();
                C2467a callback = (C2467a) this.c.get();
                kotlin.jvm.internal.j.g(context, "context");
                kotlin.jvm.internal.j.g(callback, "callback");
                return new C0631c(context, callback);
            case 1:
                S5.a flagConfigurationManager = (S5.a) this.f5051b.get();
                C1220i analyticsUtils = (C1220i) this.c.get();
                kotlin.jvm.internal.j.g(flagConfigurationManager, "flagConfigurationManager");
                kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
                return new A5.m(flagConfigurationManager, analyticsUtils);
            case 2:
                Context context2 = (Context) this.f5051b.get();
                com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) this.c.get();
                kotlin.jvm.internal.j.g(context2, "context");
                kotlin.jvm.internal.j.g(preference, "preference");
                String string = Settings.Secure.getString(context2.getContentResolver(), "android_id");
                kotlin.jvm.internal.j.f(string, "getString(...)");
                return new V5.c(context2, preference.e().mSplitMaxTimeoutDuration(), string);
            case 3:
                com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) this.f5051b.get();
                return new W(aVar, 8);
            case 4:
                ApigeeApi apigeeApi = (ApigeeApi) this.f5051b.get();
                com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) this.c.get();
                C1261h c1261h = new C1261h();
                c1261h.f11444b = apigeeApi;
                c1261h.c = aVar2;
                return c1261h;
            default:
                return new U0((com.paymaya.data.preference.a) this.c.get(), (SuspendApi) this.f5051b.get());
        }
    }
}
