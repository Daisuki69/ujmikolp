package P5;

import android.content.Context;
import cg.InterfaceC1101b;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f5039b;
    public final InterfaceC1101b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1101b f5040d;

    public /* synthetic */ U(S s9, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, int i) {
        this.f5038a = i;
        this.f5039b = s9;
        this.c = interfaceC1101b;
        this.f5040d = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5038a) {
            case 0:
                Context context = (Context) this.c.get();
                com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) this.f5040d.get();
                this.f5039b.getClass();
                L5.c cVar = new L5.c(context, "PayMayaResource.db", null, 70);
                cVar.m = "PayMayaResource.db";
                cVar.f2813l = context.getDatabasePath("PayMayaResource.db").getPath();
                cVar.f2814n = context;
                cVar.f2815o = aVar;
                return cVar;
            default:
                Context context2 = (Context) this.c.get();
                com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) this.f5040d.get();
                this.f5039b.getClass();
                return new L5.d(context2, "PayMayaRecode.db", aVar2.f(), null, 70, 0, null, new z2.d(11), true);
        }
    }
}
