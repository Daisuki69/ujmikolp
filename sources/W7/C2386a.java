package w7;

import M8.A0;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.Amount;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: w7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2386a implements Ch.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2386a f20701a = new C2386a();

    @Override // Ch.b
    public final Object a(Object obj, Object obj2) {
        AccountBalance balanceResult = (AccountBalance) obj;
        AccountLimits accountLimitsResult = (AccountLimits) obj2;
        j.g(balanceResult, "balanceResult");
        j.g(accountLimitsResult, "accountLimitsResult");
        Amount amountMAvailableBalance = balanceResult.mAvailableBalance();
        j.f(amountMAvailableBalance, "mAvailableBalance(...)");
        return A0.g(amountMAvailableBalance, accountLimitsResult);
    }
}
