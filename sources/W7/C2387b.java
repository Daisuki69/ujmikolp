package w7;

import Ch.c;
import cj.L;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import pg.t;

/* JADX INFO: renamed from: w7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2387b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f20703b;

    public /* synthetic */ C2387b(t tVar, int i) {
        this.f20702a = i;
        this.f20703b = tVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20702a) {
            case 0:
                String balanceAndLimitsJSON = (String) obj;
                j.g(balanceAndLimitsJSON, "balanceAndLimitsJSON");
                ">>>> Flutter call: getBalanceAndLimits = ".concat(balanceAndLimitsJSON);
                yk.a.a();
                this.f20703b.success(balanceAndLimitsJSON);
                break;
            default:
                Throwable it = (Throwable) obj;
                j.g(it, "it");
                this.f20703b.success(L.c(new Pair("refresh_access_token_response", "false")));
                break;
        }
    }
}
