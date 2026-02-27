package com.paymaya.domain.store;

import android.content.ContentValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.IncomeSource;
import dOYHB6.yFtIp6.svM7M6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: renamed from: com.paymaya.domain.store.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1252c0 implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1254d0 f11430b;

    public /* synthetic */ C1252c0(C1254d0 c1254d0, int i) {
        this.f11429a = i;
        this.f11430b = c1254d0;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f11429a) {
            case 0:
                C1254d0 c1254d0 = this.f11430b;
                c1254d0.getClass();
                String str = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str);
                com.paymaya.data.preference.a aVar = c1254d0.f11434d;
                String string = svM7M6.getString(aVar.f11330b, "key_income_source_head_date_v2", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 == null || localDateTimeC == null || localDateTimeC.isAfter(localDateTimeC2)) {
                    Ah.p<List<IncomeSource>> incomeSourcesV2 = c1254d0.c.getIncomeSourcesV2();
                    C1252c0 c1252c0 = new C1252c0(c1254d0, 1);
                    Kh.I i = Eh.d.f1366d;
                    incomeSourcesV2.getClass();
                    incomeSourcesV2.f(new Gh.d(1, c1252c0, i));
                }
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_income_source_head_date_v2", str);
                break;
            default:
                List<IncomeSource> list = (List) obj;
                com.paymaya.data.database.repository.u uVar = this.f11430b.f11433b;
                uVar.f11323a.f2812a.b("income_source_v2", "", null);
                ArrayList arrayList = new ArrayList(list.size());
                for (IncomeSource incomeSource : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, incomeSource.mName());
                    arrayList.add(contentValues);
                }
                uVar.f11323a.a("income_source_v2", Collections.unmodifiableList(arrayList));
                break;
        }
    }
}
