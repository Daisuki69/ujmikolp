package Xb;

import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: renamed from: Xb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0615d implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6566b;

    public /* synthetic */ C0615d(f fVar, int i) {
        this.f6565a = i;
        this.f6566b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6565a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                f fVar = this.f6566b;
                PayMayaError payMayaErrorF = fVar.f(it, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                fVar.o(iMErrorCode, strMSpiel);
                break;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                f fVar2 = this.f6566b;
                PayMayaError payMayaErrorF2 = fVar2.f(it2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                int iMErrorCode2 = payMayaErrorF2.mErrorCode();
                String strMSpiel2 = payMayaErrorF2.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
                fVar2.o(iMErrorCode2, strMSpiel2);
                break;
        }
    }
}
