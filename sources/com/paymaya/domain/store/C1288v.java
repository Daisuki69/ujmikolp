package com.paymaya.domain.store;

import android.content.ContentValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.Country;
import dOYHB6.yFtIp6.svM7M6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: renamed from: com.paymaya.domain.store.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1288v implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1290w f11487b;

    public /* synthetic */ C1288v(C1290w c1290w, int i) {
        this.f11486a = i;
        this.f11487b = c1290w;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f11486a) {
            case 0:
                C1290w c1290w = this.f11487b;
                c1290w.getClass();
                String str = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str);
                com.paymaya.data.preference.a aVar = c1290w.f11492d;
                String string = svM7M6.getString(aVar.f11330b, "key_country_head_date", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 == null || localDateTimeC == null || localDateTimeC.isAfter(localDateTimeC2)) {
                    Ah.p<List<Country>> countries = c1290w.c.getCountries();
                    C1288v c1288v = new C1288v(c1290w, 1);
                    Kh.I i = Eh.d.f1366d;
                    countries.getClass();
                    countries.f(new Gh.d(1, c1288v, i));
                }
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_country_head_date", str);
                break;
            default:
                List<Country> list = (List) obj;
                com.paymaya.data.database.repository.l lVar = this.f11487b.f11491b;
                lVar.f11314a.f2812a.b("country", "", null);
                ArrayList arrayList = new ArrayList(list.size());
                for (Country country : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, country.mName());
                    contentValues.put("code", country.mCode());
                    arrayList.add(contentValues);
                }
                lVar.f11314a.a("country", Collections.unmodifiableList(arrayList));
                break;
        }
    }
}
