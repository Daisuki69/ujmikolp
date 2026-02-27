package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MissionValidity;
import com.paymaya.domain.model.C$AutoValue_MissionValidity;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionValidity implements Parcelable {

    public static abstract class Builder {
        public abstract MissionValidity build();

        public abstract Builder mUnit(String str);

        public abstract Builder mValue(int i);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MissionValidity.Builder().mValue(0);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MissionValidity.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("unit")
    public abstract String mUnit();

    @InterfaceC1498b("value")
    public abstract int mValue();
}
