package se;

import Xb.w;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20072b;
    public final /* synthetic */ String c;

    public /* synthetic */ m(w wVar, String str, int i) {
        this.f20071a = i;
        this.f20072b = wVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20071a) {
            case 0:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, numX49.tnTj78("bF3P9"));
                List<ProductV3> records = productV3Base.getRecords();
                this.f20072b.o(this.c, records);
                break;
            case 1:
                w wVar = this.f20072b;
                PayMayaError payMayaErrorF = wVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bF3W"));
                wVar.n(payMayaErrorF, this.c);
                break;
            default:
                w wVar2 = this.f20072b;
                PayMayaError payMayaErrorF2 = wVar2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, numX49.tnTj78("bF3l"));
                wVar2.n(payMayaErrorF2, this.c);
                break;
        }
    }
}
