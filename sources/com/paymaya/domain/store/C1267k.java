package com.paymaya.domain.store;

import Kh.C0312q;
import android.util.Pair;
import bg.AbstractC0983W;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.data.database.repository.C1242f;
import com.paymaya.domain.model.Bank;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Collections;
import java.util.List;
import n3.C1916a;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: renamed from: com.paymaya.domain.store.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1267k implements Ch.f, Ch.c, Ah.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1269l f11454b;

    public /* synthetic */ C1267k(C1269l c1269l, int i) {
        this.f11453a = i;
        this.f11454b = c1269l;
    }

    @Override // Ah.r
    public void a(Lh.a aVar) {
        C1916a c1916a = new C1916a(6);
        C1242f c1242f = this.f11454b.f11457b;
        try {
            c1242f.f11308a.d("bank", c1916a).g(new C0312q(new Gh.f(new androidx.work.impl.e(aVar, 21), Eh.d.f1366d), new com.paymaya.data.database.repository.x(c1242f, 2), 1));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Pair pair = (Pair) obj;
        C1269l c1269l = this.f11454b;
        c1269l.getClass();
        if (((List) pair.first).isEmpty() || ((String) pair.second).isEmpty()) {
            return;
        }
        C1242f c1242f = c1269l.f11457b;
        c1242f.f11308a.b("bank", "", null);
        c1242f.b((List) pair.first);
        androidx.media3.datasource.cache.c.u(c1269l.f11458d.f11330b, "key_bank_head_date", (String) pair.second);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f11453a) {
            case 0:
                C1269l c1269l = this.f11454b;
                c1269l.getClass();
                String str = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str);
                String string = svM7M6.getString(c1269l.f11458d.f11330b, "key_bank_head_date", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 != null && localDateTimeC != null && (localDateTimeC.isEqual(localDateTimeC2) || !localDateTimeC.isAfter(localDateTimeC2))) {
                    return Ah.p.c(Boolean.FALSE);
                }
                Ah.p<List<Bank>> banks = c1269l.c.getBanks();
                androidx.camera.lifecycle.a aVar = new androidx.camera.lifecycle.a(23, c1269l, str);
                banks.getClass();
                return new Lh.f(banks, aVar, 0);
            case 1:
                C1269l c1269l2 = this.f11454b;
                c1269l2.getClass();
                return new Kh.J(new C1267k(c1269l2, 4), 1);
            default:
                C1269l c1269l3 = this.f11454b;
                c1269l3.getClass();
                String str2 = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeC3 = AbstractC1234x.c(str2);
                String string2 = svM7M6.getString(c1269l3.f11458d.f11330b, "key_bank_head_date", null);
                LocalDateTime localDateTimeC4 = string2 != null ? AbstractC1234x.c(string2) : null;
                if (localDateTimeC4 != null && localDateTimeC3 != null && (localDateTimeC3.isEqual(localDateTimeC4) || !localDateTimeC3.isAfter(localDateTimeC4))) {
                    return Ah.p.c(new Pair(Collections.EMPTY_LIST, ""));
                }
                Ah.p<List<Bank>> banks2 = c1269l3.c.getBanks();
                Z.m mVar = new Z.m(str2, 6);
                banks2.getClass();
                return new Lh.f(banks2, mVar, 0);
        }
    }
}
