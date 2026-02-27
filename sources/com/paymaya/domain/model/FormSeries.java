package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_FormSeries;
import com.paymaya.domain.model.C$AutoValue_FormSeries;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FormSeries implements Parcelable {

    public static abstract class Builder {
        public abstract FormSeries build();

        public abstract Builder mFormSeries(String str);

        public abstract Builder mFormType(String str);

        public abstract Builder mTaxTypeList(List<String> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_FormSeries.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_FormSeries.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("form_series")
    public abstract String mFormSeries();

    @InterfaceC1498b("form_type")
    public abstract String mFormType();

    @InterfaceC1498b("tax_type")
    public abstract List<String> mTaxTypeList();
}
