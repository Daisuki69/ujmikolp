package Q6;

import L9.C0323a;
import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f5273b;
    public final /* synthetic */ pg.t c;

    public /* synthetic */ f(C0323a c0323a, pg.t tVar, int i) {
        this.f5272a = i;
        this.f5273b = c0323a;
        this.c = tVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f5272a) {
            case 0:
                String balanceJson = (String) obj;
                kotlin.jvm.internal.j.g(balanceJson, "balanceJson");
                ">>>> Flutter call: getBalance= ".concat(balanceJson);
                yk.a.a();
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getBalance");
                this.c.success(balanceJson);
                break;
            case 1:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getBalance");
                C0323a c0323a = this.f5273b;
                PayMayaError payMayaErrorF = c0323a.f(throwable, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                c0323a.r(payMayaErrorF, this.c, "getBalance");
                break;
            case 2:
                String balanceAndLimitsJSON = (String) obj;
                kotlin.jvm.internal.j.g(balanceAndLimitsJSON, "balanceAndLimitsJSON");
                ">>>> Flutter call: getBalanceAndLimits = ".concat(balanceAndLimitsJSON);
                yk.a.a();
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getBalanceAndLimits");
                this.c.success(balanceAndLimitsJSON);
                break;
            case 3:
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getBalanceAndLimits");
                C0323a c0323a2 = this.f5273b;
                PayMayaError payMayaErrorF2 = c0323a2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                c0323a2.r(payMayaErrorF2, this.c, "getBalanceAndLimits");
                break;
            case 4:
                String accountLimitsJson = (String) obj;
                kotlin.jvm.internal.j.g(accountLimitsJson, "accountLimitsJson");
                ">>>> Flutter call: getAccountLimits = ".concat(accountLimitsJson);
                yk.a.a();
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getAccountLimits");
                this.c.success(accountLimitsJson);
                break;
            case 5:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getAccountLimits");
                C0323a c0323a3 = this.f5273b;
                PayMayaError payMayaErrorF3 = c0323a3.f(throwable2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                c0323a3.r(payMayaErrorF3, this.c, "getAccountLimits");
                break;
            case 6:
                String customerAccessTokenJSON = (String) obj;
                kotlin.jvm.internal.j.g(customerAccessTokenJSON, "customerAccessTokenJSON");
                ">>>> Flutter call: getCustomerAccessToken = ".concat(customerAccessTokenJSON);
                yk.a.a();
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getCustomerAccessToken");
                this.c.success(customerAccessTokenJSON);
                break;
            case 7:
                Throwable throwable3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable3, "throwable");
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getCustomerAccessToken");
                C0323a c0323a4 = this.f5273b;
                PayMayaError payMayaErrorF4 = c0323a4.f(throwable3, false);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "paymayaErrorHandling(...)");
                c0323a4.r(payMayaErrorF4, this.c, "getCustomerAccessToken");
                break;
            case 8:
                String profileAndTokenJSON = (String) obj;
                kotlin.jvm.internal.j.g(profileAndTokenJSON, "profileAndTokenJSON");
                ">>>> Flutter call: getProfileAndToken = ".concat(profileAndTokenJSON);
                yk.a.a();
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getProfileAndToken");
                this.c.success(profileAndTokenJSON);
                break;
            default:
                Throwable throwable4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable4, "throwable");
                ((T6.a) ((S6.a) this.f5273b.c.get())).v1("getProfileAndToken");
                C0323a c0323a5 = this.f5273b;
                PayMayaError payMayaErrorF5 = c0323a5.f(throwable4, false);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                c0323a5.r(payMayaErrorF5, this.c, "getProfileAndToken");
                break;
        }
    }
}
