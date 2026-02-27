package com.paymaya.domain.model;

import android.os.Parcelable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Term;
import com.paymaya.domain.model.C$AutoValue_Term;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Term implements Parcelable {

    public static abstract class Builder {
        public abstract Term build();

        public abstract Builder mUnit(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Term.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Term.GsonTypeAdapter(jVar);
    }

    public String getFormattedTerm() {
        return mValue() + Global.BLANK + mUnit().substring(0, 1).toUpperCase() + mUnit().substring(1).toLowerCase();
    }

    @InterfaceC1498b("unit")
    public abstract String mUnit();

    @InterfaceC1498b("value")
    public abstract String mValue();

    public String getFormattedTerm(boolean z4) {
        if (z4) {
            return getFormattedTerm().toLowerCase();
        }
        return getFormattedTerm().toUpperCase();
    }
}
