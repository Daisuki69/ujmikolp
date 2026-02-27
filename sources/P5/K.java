package P5;

import D.C0187u;
import android.content.Context;
import cg.InterfaceC1101b;
import com.paymaya.common.utility.C1232v;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5019b;

    public /* synthetic */ K(Object obj, InterfaceC1101b interfaceC1101b, int i) {
        this.f5018a = i;
        this.f5019b = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5018a) {
            case 0:
                return new C1232v((C0187u) this.f5019b.get());
            case 1:
                com.paymaya.data.preference.a aVarJ = com.paymaya.data.preference.a.j((Context) this.f5019b.get());
                AbstractC1955a.d(aVarJ);
                return aVarJ;
            case 2:
                return new W((com.paymaya.data.preference.a) this.f5019b.get(), 11);
            case 3:
                return new W((com.paymaya.data.preference.a) this.f5019b.get(), 7);
            case 4:
                return new W((com.paymaya.data.preference.a) this.f5019b.get(), 1);
            case 5:
                return new com.paymaya.data.database.repository.n((L5.a) this.f5019b.get());
            default:
                return new com.paymaya.data.database.repository.C((L5.a) this.f5019b.get());
        }
    }
}
