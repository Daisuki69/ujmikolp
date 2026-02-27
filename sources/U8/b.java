package U8;

import L9.C0323a;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.store.H;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements H, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0323a f5961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5962b;

    public /* synthetic */ b(C0323a c0323a, Map map) {
        this.f5961a = c0323a;
        this.f5962b = map;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // Ch.c
    public void accept(Object obj) {
        CustomerAccount it = (CustomerAccount) obj;
        j.g(it, "it");
        C0323a c0323a = this.f5961a;
        ((K) c0323a.i).c(it.getOwner().getCustomerId(), "lending", "credit-card", new b(c0323a, this.f5962b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H, Ah.q, Ah.b
    public void onError(Throwable th2) {
        ((MayaLoansCreditCardActivity) ((V8.a) this.f5961a.c.get())).Z1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.f5962b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H
    public void onSuccess() {
        ((MayaLoansCreditCardActivity) ((V8.a) this.f5961a.c.get())).Z1("MAYA_DATA_EXTRACTION_EXTRACT_SUCCESS", this.f5962b);
    }
}
