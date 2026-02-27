package se;

import Xb.w;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20067b;
    public final /* synthetic */ String c;

    public /* synthetic */ j(w wVar, String str, int i) {
        this.f20066a = i;
        this.f20067b = wVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20066a) {
            case 0:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, numX49.tnTj78("bF3PU"));
                List<ProductV3> records = productV3Base.getRecords();
                this.f20067b.o(this.c, records);
                break;
            case 1:
                w wVar = this.f20067b;
                PayMayaError payMayaErrorF = wVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bF3Pt"));
                wVar.n(payMayaErrorF, this.c);
                break;
            default:
                w wVar2 = this.f20067b;
                PayMayaError payMayaErrorF2 = wVar2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, numX49.tnTj78("bF3PQ"));
                wVar2.n(payMayaErrorF2, this.c);
                break;
        }
    }
}
