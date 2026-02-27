package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_UIValue;
import com.paymaya.domain.model.C$AutoValue_UIValue;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UIValue implements Parcelable {

    public static abstract class Builder {
        public abstract UIValue build();

        public abstract Builder display(String str);

        public abstract Builder value(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_UIValue.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_UIValue.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("display")
    public abstract String display();

    @InterfaceC1498b("value")
    public abstract String value();
}
