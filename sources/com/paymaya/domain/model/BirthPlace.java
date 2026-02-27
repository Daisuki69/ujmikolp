package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_BirthPlace;
import com.paymaya.domain.model.C$AutoValue_BirthPlace;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BirthPlace implements Parcelable {

    public static abstract class Builder {
        public abstract BirthPlace build();

        public abstract Builder mCity(String str);

        public abstract Builder mCountryCode(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BirthPlace.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BirthPlace.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("city")
    public abstract String mCity();

    @InterfaceC1498b("country")
    public abstract String mCountryCode();
}
