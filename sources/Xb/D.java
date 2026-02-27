package Xb;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6556b;
    public final /* synthetic */ String c;

    public /* synthetic */ D(w wVar, String str, int i) {
        this.f6555a = i;
        this.f6556b = wVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6555a) {
            case 0:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, "productV3Base");
                List<ProductV3> records = productV3Base.getRecords();
                this.f6556b.o(this.c, records);
                break;
            case 1:
                w wVar = this.f6556b;
                PayMayaError payMayaErrorF = wVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                wVar.n(payMayaErrorF, this.c);
                break;
            default:
                w wVar2 = this.f6556b;
                PayMayaError payMayaErrorF2 = wVar2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                wVar2.n(payMayaErrorF2, this.c);
                break;
        }
    }
}
