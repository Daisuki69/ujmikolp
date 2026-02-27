package com.paymaya.domain.store;

import android.content.ContentValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.data.database.repository.C1243g;
import com.paymaya.data.database.repository.C1246j;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerV3Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.store.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1271m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1273n f11461b;

    public /* synthetic */ C1271m(C1273n c1273n, int i) {
        this.f11460a = i;
        this.f11461b = c1273n;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        C1273n c1273n = this.f11461b;
        switch (this.f11460a) {
            case 0:
                C1246j c1246j = c1273n.e;
                Biller billerConvertToBiller = ((BillerV3Response) obj).convertToBiller();
                c1246j.getClass();
                c1246j.f11312a.c("biller_v2", C1246j.b(Collections.singletonList(billerConvertToBiller)));
                break;
            case 1:
                c1273n.c.a(((BillerDetails) obj).toBiller());
                break;
            case 2:
                List<BillerCategory> list = (List) obj;
                C1243g c1243g = c1273n.f11464d;
                c1243g.f11309a.b("biller_category", null, null);
                ArrayList arrayList = new ArrayList(list.size());
                com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
                for (BillerCategory billerCategory : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, billerCategory.mName());
                    contentValues.put("slug", billerCategory.mSlug());
                    contentValues.put("listUrl", billerCategory.mListUrl());
                    arrayList.add(contentValues);
                }
                c1243g.f11309a.c("biller_category", Collections.unmodifiableList(arrayList));
                break;
            default:
                C1246j c1246j2 = c1273n.e;
                Biller billerConvertToBiller2 = ((BillerV3Response) obj).convertToBiller();
                c1246j2.getClass();
                c1246j2.f11312a.c("biller_v2", C1246j.b(Collections.singletonList(billerConvertToBiller2)));
                break;
        }
    }
}
