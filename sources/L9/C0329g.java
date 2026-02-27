package L9;

import com.paymaya.domain.model.CreditAccountData;
import java.util.List;

/* JADX INFO: renamed from: L9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0329g implements Ch.g, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0329g f2888a = new C0329g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0329g f2889b = new C0329g();

    @Override // Ch.f
    public Object apply(Object obj) {
        CreditAccountData data = (CreditAccountData) obj;
        kotlin.jvm.internal.j.g(data, "data");
        return Ah.p.c(data.getCreditResponse());
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        List creditTransactions = (List) obj;
        kotlin.jvm.internal.j.g(creditTransactions, "creditTransactions");
        return !creditTransactions.isEmpty();
    }
}
