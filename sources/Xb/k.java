package Xb;

import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6576b;

    public /* synthetic */ k(o oVar, int i) {
        this.f6575a = i;
        this.f6576b = oVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6575a) {
            case 0:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                o oVar = this.f6576b;
                PayMayaError payMayaErrorF = oVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                oVar.v(payMayaErrorF);
                break;
            default:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                o oVar2 = this.f6576b;
                PayMayaError payMayaErrorF2 = oVar2.f(throwable2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                oVar2.v(payMayaErrorF2);
                break;
        }
    }
}
