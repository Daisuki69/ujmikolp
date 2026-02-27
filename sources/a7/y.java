package A7;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f248b;

    public /* synthetic */ y(A a8, int i) {
        this.f247a = i;
        this.f248b = a8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f247a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                A a8 = this.f248b;
                PayMayaError payMayaErrorF = a8.f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (!payMayaErrorF.isSessionTimeout()) {
                    ArrayList arrayList = a8.f190q;
                    if (arrayList == null || arrayList.isEmpty()) {
                        ((MayaWalletFragment) ((F7.s) a8.c.get())).Q1();
                    }
                }
                break;
            case 1:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                this.f248b.e(it2);
                break;
            default:
                A a10 = this.f248b;
                PayMayaError payMayaErrorF2 = a10.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                a10.q(payMayaErrorF2);
                break;
        }
    }
}
