package t9;

import A7.j;
import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20202b;

    public /* synthetic */ i(j jVar, int i) {
        this.f20201a = i;
        this.f20202b = jVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20201a) {
            case 0:
                j jVar = this.f20202b;
                PayMayaError payMayaErrorF = jVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                jVar.f0(payMayaErrorF);
                break;
            default:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                j jVar2 = this.f20202b;
                PayMayaError payMayaErrorF2 = jVar2.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                jVar2.g0(payMayaErrorF2);
                break;
        }
    }
}
