package P5;

import android.app.Application;
import cg.InterfaceC1101b;
import com.paymaya.common.utility.C1220i;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5034b;
    public final InterfaceC1101b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1101b f5035d;
    public final InterfaceC1101b e;
    public final InterfaceC1101b f;

    public /* synthetic */ Q(Object obj, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, InterfaceC1101b interfaceC1101b3, InterfaceC1101b interfaceC1101b4, InterfaceC1101b interfaceC1101b5, int i) {
        this.f5033a = i;
        this.f5034b = interfaceC1101b;
        this.c = interfaceC1101b2;
        this.f5035d = interfaceC1101b3;
        this.e = interfaceC1101b4;
        this.f = interfaceC1101b5;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5033a) {
            case 0:
                return new B5.l((Application) this.f5034b.get(), (com.paymaya.data.preference.a) this.c.get(), (S5.c) this.f5035d.get(), (C1220i) this.e.get(), (Uh.d) this.f.get());
            default:
                B5.i flowController = (B5.i) this.f5034b.get();
                com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) this.c.get();
                com.paymaya.domain.store.K deviceStore = (com.paymaya.domain.store.K) this.f5035d.get();
                C1220i analyticsUtils = (C1220i) this.e.get();
                S5.c flagConfigurationService = (S5.c) this.f.get();
                kotlin.jvm.internal.j.g(flowController, "flowController");
                kotlin.jvm.internal.j.g(preference, "preference");
                kotlin.jvm.internal.j.g(deviceStore, "deviceStore");
                kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
                kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
                return new Le.b(flowController, preference, deviceStore, analyticsUtils, flagConfigurationService);
        }
    }
}
