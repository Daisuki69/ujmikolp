package P5;

import android.content.Context;
import android.content.res.Resources;
import cg.InterfaceC1101b;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5032b;

    public /* synthetic */ P(Object obj, InterfaceC1101b interfaceC1101b, int i) {
        this.f5031a = i;
        this.f5032b = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5031a) {
            case 0:
                Resources resources = ((Context) this.f5032b.get()).getResources();
                AbstractC1955a.d(resources);
                return resources;
            case 1:
                V5.c splitConfigurationProvider = (V5.c) this.f5032b.get();
                kotlin.jvm.internal.j.g(splitConfigurationProvider, "splitConfigurationProvider");
                return new S5.c(splitConfigurationProvider);
            case 2:
                return new W((com.paymaya.data.preference.a) this.f5032b.get(), 0);
            case 3:
                return new W((com.paymaya.data.preference.a) this.f5032b.get(), 4);
            default:
                return new com.paymaya.data.database.repository.q((L5.b) this.f5032b.get());
        }
    }
}
