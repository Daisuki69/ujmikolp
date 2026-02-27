package ba;

import com.paymaya.domain.model.PayMayaError;
import dOYHB6.tiZVw8.numX49;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8600b;

    public /* synthetic */ q(s sVar, int i) {
        this.f8599a = i;
        this.f8600b = sVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8599a) {
            case 0:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, numX49.tnTj78("bucZP"));
                this.f8600b.A(pair);
                break;
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucrW"));
                s sVar = this.f8600b;
                PayMayaError payMayaErrorF = sVar.f(th2, true);
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("bucZ9"));
                sVar.u(iMErrorCode, strMSpiel);
                sVar.z(payMayaErrorF);
                break;
        }
    }
}
