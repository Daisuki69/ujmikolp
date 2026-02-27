package P5;

import android.app.Application;
import android.content.Context;
import cg.InterfaceC1101b;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5021b;

    public /* synthetic */ L(Object obj, InterfaceC1101b interfaceC1101b, int i) {
        this.f5020a = i;
        this.f5021b = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5020a) {
            case 0:
                Application application = (Application) this.f5021b.get();
                AbstractC1955a.d(application);
                return application;
            case 1:
                return new com.paymaya.common.utility.e0((Context) this.f5021b.get());
            case 2:
                V5.c splitConfigurationProvider = (V5.c) this.f5021b.get();
                kotlin.jvm.internal.j.g(splitConfigurationProvider, "splitConfigurationProvider");
                return new S5.a(splitConfigurationProvider);
            case 3:
                return new W((com.paymaya.data.preference.a) this.f5021b.get(), 14);
            case 4:
                return new W((com.paymaya.data.preference.a) this.f5021b.get(), 6);
            default:
                return new com.paymaya.data.database.repository.o((L5.b) this.f5021b.get());
        }
    }
}
