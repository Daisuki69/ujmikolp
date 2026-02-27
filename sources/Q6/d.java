package Q6;

import L9.C0323a;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.store.C1247a;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0323a f5267a;

    public /* synthetic */ d(C0323a c0323a) {
        this.f5267a = c0323a;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
        kotlin.jvm.internal.j.g(it, "it");
        this.f5267a.e(it);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Throwable throwable = (Throwable) obj;
        kotlin.jvm.internal.j.g(throwable, "throwable");
        AccountBalance accountBalanceB = ((C1247a) this.f5267a.f2878g).b();
        return accountBalanceB != null ? Ah.p.c(accountBalanceB) : Ah.p.b(throwable);
    }
}
