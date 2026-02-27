package rc;

import com.paymaya.common.base.MayaBaseFragment;
import dOYHB6.tiZVw8.numX49;
import pc.EnumC2032a;
import wc.InterfaceC2393d;

/* JADX INFO: renamed from: rc.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2199f implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19895b;

    public /* synthetic */ C2199f(i iVar, int i) {
        this.f19894a = i;
        this.f19895b = iVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String strTnTj78 = numX49.tnTj78("bFoM");
        switch (this.f19894a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, strTnTj78);
                ((MayaBaseFragment) ((InterfaceC2393d) this.f19895b.c.get())).w1();
                this.f19895b.n(th2, EnumC2032a.f19084b, true);
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, strTnTj78);
                this.f19895b.e(bVar);
                break;
        }
    }
}
