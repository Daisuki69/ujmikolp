package com.paymaya.domain.store;

import android.util.Pair;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.LoadUpPartner;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Collections;
import java.util.List;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: renamed from: com.paymaya.domain.store.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1260g0 implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1262h0 f11443b;

    public /* synthetic */ C1260g0(C1262h0 c1262h0, int i) {
        this.f11442a = i;
        this.f11443b = c1262h0;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f11442a) {
            case 1:
                Pair pair = (Pair) obj;
                C1262h0 c1262h0 = this.f11443b;
                c1262h0.getClass();
                if (!((List) pair.first).isEmpty() && !((String) pair.second).isEmpty()) {
                    com.paymaya.data.database.repository.v vVar = c1262h0.f11446d;
                    vVar.f11324a.b("load_up_partner", "", null);
                    vVar.b((List) pair.first);
                    androidx.media3.datasource.cache.c.u(c1262h0.e.f11330b, "key_top_up_partners_date", (String) pair.second);
                    break;
                }
                break;
            default:
                com.paymaya.data.database.repository.v vVar2 = this.f11443b.f11446d;
                vVar2.f11324a.b("load_up_partner", "", null);
                vVar2.b((List) obj);
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        C1262h0 c1262h0 = this.f11443b;
        c1262h0.getClass();
        String str = ((Response) obj).headers().get("Last-Modified");
        LocalDateTime localDateTimeC = AbstractC1234x.c(str);
        String string = svM7M6.getString(c1262h0.e.f11330b, "key_top_up_partners_date", null);
        LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
        if (localDateTimeC2 != null && localDateTimeC != null && (localDateTimeC.isEqual(localDateTimeC2) || !localDateTimeC.isAfter(localDateTimeC2))) {
            return Ah.p.c(new Pair(Collections.EMPTY_LIST, ""));
        }
        Ah.p<List<LoadUpPartner>> loadUpPartners = c1262h0.c.getLoadUpPartners();
        Z.m mVar = new Z.m(str, 10);
        loadUpPartners.getClass();
        return new Lh.f(loadUpPartners, mVar, 0);
    }
}
