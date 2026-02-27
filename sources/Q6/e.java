package Q6;

import M8.A0;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.CustomerAccessToken;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Ch.f, Ch.b, Ch.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f5268b = new e(0);
    public static final e c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f5269d = new e(2);
    public static final e e = new e(3);
    public static final e f = new e(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f5270g = new e(5);
    public static final e h = new e(6);
    public static final e i = new e(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5271a;

    public /* synthetic */ e(int i4) {
        this.f5271a = i4;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        AccountBalance balanceResult = (AccountBalance) obj;
        AccountLimits accountLimitsResult = (AccountLimits) obj2;
        kotlin.jvm.internal.j.g(balanceResult, "balanceResult");
        kotlin.jvm.internal.j.g(accountLimitsResult, "accountLimitsResult");
        Amount amountMAvailableBalance = balanceResult.mAvailableBalance();
        kotlin.jvm.internal.j.f(amountMAvailableBalance, "mAvailableBalance(...)");
        return A0.g(amountMAvailableBalance, accountLimitsResult);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f5271a) {
            case 4:
                break;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f5271a) {
            case 0:
                AccountBalance it = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(it, "it");
                Amount amountMAvailableBalance = it.mAvailableBalance();
                kotlin.jvm.internal.j.f(amountMAvailableBalance, "mAvailableBalance(...)");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("balance", A0.e(amountMAvailableBalance));
                    break;
                } catch (JSONException unused) {
                    yk.a.e();
                }
                String string = jSONObject.toString();
                kotlin.jvm.internal.j.f(string, "toString(...)");
                return string;
            case 1:
            case 4:
            case 5:
            default:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                return Ah.h.d(new MaintenanceDynamicConfig(false, null, 3, null));
            case 2:
                AccountLimits it2 = (AccountLimits) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("limits", A0.d(it2));
                    break;
                } catch (JSONException unused2) {
                    yk.a.e();
                }
                String string2 = jSONObject2.toString();
                kotlin.jvm.internal.j.f(string2, "toString(...)");
                return string2;
            case 3:
                CustomerAccessToken it3 = (CustomerAccessToken) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("customer_access_token", it3.getToken());
                    break;
                } catch (JSONException unused3) {
                    yk.a.e();
                }
                String string3 = jSONObject3.toString();
                kotlin.jvm.internal.j.f(string3, "toString(...)");
                return string3;
            case 6:
                String it4 = (String) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                MaintenanceDynamicConfig maintenanceDynamicConfig = (MaintenanceDynamicConfig) A.f10366a.e(it4, MaintenanceDynamicConfig.class);
                return maintenanceDynamicConfig == null ? new MaintenanceDynamicConfig(false, null, 3, null) : maintenanceDynamicConfig;
        }
    }
}
