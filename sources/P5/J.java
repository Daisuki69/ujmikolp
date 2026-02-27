package P5;

import D.C0187u;
import android.app.Application;
import android.content.Context;
import cg.InterfaceC1101b;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5017b;

    public /* synthetic */ J(Object obj, InterfaceC1101b interfaceC1101b, int i) {
        this.f5016a = i;
        this.f5017b = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        K5.b bVar;
        switch (this.f5016a) {
            case 0:
                C0187u c0187uF = C0187u.f((Application) this.f5017b.get());
                AbstractC1955a.d(c0187uF);
                return c0187uF;
            case 1:
                Context context = (Context) this.f5017b.get();
                synchronized (K5.b.class) {
                    bVar = K5.b.c;
                    if (bVar == null) {
                        bVar = new K5.b(context);
                        K5.b.c = bVar;
                    }
                }
                return bVar;
            case 2:
                return new W((com.paymaya.data.preference.a) this.f5017b.get(), 2);
            case 3:
                return new W((com.paymaya.data.preference.a) this.f5017b.get(), 3);
            case 4:
                return new W((com.paymaya.data.preference.a) this.f5017b.get(), 9);
            case 5:
                return new com.paymaya.data.database.repository.m((L5.a) this.f5017b.get());
            default:
                return new com.paymaya.data.database.repository.B((L5.a) this.f5017b.get());
        }
    }
}
