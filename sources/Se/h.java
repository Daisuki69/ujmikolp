package se;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f20064b;

    public /* synthetic */ h(i iVar, int i) {
        this.f20063a = i;
        this.f20064b = iVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20063a) {
            case 0:
                List list = (List) obj;
                kotlin.jvm.internal.j.g(list, numX49.tnTj78("bF3PO"));
                ((ShopV3ProviderProductsListFragment) ((ve.f) this.f20064b.c.get())).f14840i0 = 1;
                this.f20064b.l(list);
                ((ShopV3ProviderProductsListFragment) ((ve.f) this.f20064b.c.get())).f14839h0 = true;
                break;
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bF3PF"));
                i iVar = this.f20064b;
                PayMayaError payMayaErrorF = iVar.f(th2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bF3PH"));
                iVar.m(payMayaErrorF);
                break;
        }
    }
}
