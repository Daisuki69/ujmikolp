package com.paymaya.domain.store;

import android.util.Pair;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.FormSeries;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Collections;
import java.util.List;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f11399b;

    public /* synthetic */ V(W w6, int i) {
        this.f11398a = i;
        this.f11399b = w6;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f11398a) {
            case 0:
                W w6 = this.f11399b;
                w6.getClass();
                String str = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeD = AbstractC1234x.d(str);
                com.paymaya.data.preference.a aVar = w6.f11402d;
                String string = svM7M6.getString(aVar.f11330b, "key_form_series_head_date", null);
                LocalDateTime localDateTimeD2 = string != null ? AbstractC1234x.d(string) : null;
                if (localDateTimeD2 == null || localDateTimeD == null || localDateTimeD.isAfter(localDateTimeD2)) {
                    Ah.p<List<FormSeries>> formSeries = w6.f11401b.getFormSeries();
                    V v7 = new V(w6, 3);
                    Kh.I i = Eh.d.f1366d;
                    formSeries.getClass();
                    formSeries.f(new Gh.d(1, v7, i));
                }
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_form_series_head_date", str);
                break;
            case 1:
            default:
                com.paymaya.data.database.repository.r rVar = this.f11399b.c;
                rVar.f11319a.b("form_series_bir", "", null);
                rVar.a((List) obj);
                break;
            case 2:
                Pair pair = (Pair) obj;
                W w8 = this.f11399b;
                w8.getClass();
                if (!((List) pair.first).isEmpty() && !((String) pair.second).isEmpty()) {
                    com.paymaya.data.database.repository.r rVar2 = w8.c;
                    rVar2.f11319a.b("form_series_bir", "", null);
                    rVar2.a((List) pair.first);
                    androidx.media3.datasource.cache.c.u(w8.f11402d.f11330b, "key_form_series_head_date", (String) pair.second);
                    break;
                }
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        W w6 = this.f11399b;
        w6.getClass();
        String str = ((Response) obj).headers().get("Last-Modified");
        LocalDateTime localDateTimeD = AbstractC1234x.d(str);
        String string = svM7M6.getString(w6.f11402d.f11330b, "key_form_series_head_date", null);
        LocalDateTime localDateTimeD2 = string != null ? AbstractC1234x.d(string) : null;
        if (localDateTimeD2 != null && localDateTimeD != null && (localDateTimeD.isEqual(localDateTimeD2) || !localDateTimeD.isAfter(localDateTimeD2))) {
            return Ah.p.c(new Pair(Collections.EMPTY_LIST, ""));
        }
        Ah.p<List<FormSeries>> formSeries = w6.f11401b.getFormSeries();
        Z.m mVar = new Z.m(str, 9);
        formSeries.getClass();
        return new Lh.f(formSeries, mVar, 0);
    }
}
