package A7;

import bf.InterfaceC0950c;
import cj.L;
import com.paymaya.domain.model.AccessToken;
import com.paymaya.domain.store.H;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements H, InterfaceC0950c, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg.t f211a;

    public /* synthetic */ g(pg.t tVar) {
        this.f211a = tVar;
    }

    @Override // bf.InterfaceC0950c
    public void a(Serializable serializable) {
        this.f211a.success(serializable);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        AccessToken it = (AccessToken) obj;
        kotlin.jvm.internal.j.g(it, "it");
        this.f211a.success(L.c(new Pair("refresh_access_token_response", "true")));
    }

    @Override // bf.InterfaceC0950c
    public void b(String str, HashMap map) {
        this.f211a.error("sqlite_error", str, map);
    }

    @Override // com.paymaya.domain.store.H, Ah.q, Ah.b
    public void onError(Throwable th2) {
        this.f211a.error("1001", th2.getMessage(), null);
    }

    @Override // com.paymaya.domain.store.H
    public void onSuccess() {
        this.f211a.success("1000");
    }
}
