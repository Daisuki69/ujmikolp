package o6;

import com.paymaya.domain.model.PayMayaError;
import java.util.List;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Ch.f, Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f18798b;

    public /* synthetic */ h(n nVar, int i) {
        this.f18797a = i;
        this.f18798b = nVar;
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f18797a) {
            case 0:
                n nVar = this.f18798b;
                nVar.o(nVar.f(th2, true));
                return (List) new C2342a(null);
            default:
                n nVar2 = this.f18798b;
                PayMayaError payMayaErrorF = nVar2.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                nVar2.l(payMayaErrorF);
                return new C2342a(null);
        }
    }

    @Override // Ch.a
    public void run() {
        this.f18798b.h = false;
    }
}
