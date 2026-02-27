package P5;

import android.content.Context;
import cg.InterfaceC1101b;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.data.database.repository.C1238b;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5013b;

    public /* synthetic */ H(Object obj, InterfaceC1101b interfaceC1101b, int i) {
        this.f5012a = i;
        this.f5013b = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5012a) {
            case 0:
                return new C1229s((C1220i) this.f5013b.get());
            case 1:
                return new com.paymaya.common.utility.F((Context) this.f5013b.get());
            case 2:
                B5.i flowController = (B5.i) this.f5013b.get();
                kotlin.jvm.internal.j.g(flowController, "flowController");
                return new Le.g();
            case 3:
                return new W((com.paymaya.data.preference.a) this.f5013b.get(), 5);
            case 4:
                return new C1238b((L5.b) this.f5013b.get());
            default:
                return new com.paymaya.data.database.repository.A((L5.a) this.f5013b.get());
        }
    }
}
