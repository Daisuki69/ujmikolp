package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.database.repository.C1239c;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5030b;

    public /* synthetic */ O(Object obj, InterfaceC1101b interfaceC1101b, int i) {
        this.f5029a = i;
        this.f5030b = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5029a) {
            case 0:
                return new com.paymaya.common.utility.P((com.paymaya.data.preference.a) this.f5030b.get());
            case 1:
                return new W((com.paymaya.data.preference.a) this.f5030b.get(), 12);
            case 2:
                return new W((com.paymaya.data.preference.a) this.f5030b.get(), 10);
            case 3:
                return new W((com.paymaya.data.preference.a) this.f5030b.get(), 13);
            case 4:
                return new C1239c((L5.a) this.f5030b.get());
            default:
                return new com.paymaya.data.database.repository.F((L5.b) this.f5030b.get());
        }
    }
}
