package ba;

import L9.C0323a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import dOYHB6.tiZVw8.numX49;
import ga.InterfaceC1514a;

/* JADX INFO: renamed from: ba.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0934e implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f8579b;

    public /* synthetic */ C0934e(C0323a c0323a, int i) {
        this.f8578a = i;
        this.f8579b = c0323a;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8578a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("buck"));
                PayMayaError payMayaErrorF = this.f8579b.f(th2, true);
                C0323a c0323a = this.f8579b;
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("bucB"));
                c0323a.u(iMErrorCode, strMSpiel, numX49.tnTj78("bucu"));
                c0323a.f(th2, true);
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).Z1();
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, numX49.tnTj78("bucZ"));
                this.f8579b.e(bVar);
                break;
        }
    }
}
