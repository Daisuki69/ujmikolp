package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_CardProfile;
import com.paymaya.domain.model.C$AutoValue_CardProfile;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CardProfile implements Parcelable {

    public static abstract class Builder {
        public abstract CardProfile build();

        public abstract Builder mBrand(String str);

        public abstract Builder mScheme(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_CardProfile.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_CardProfile.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("brand")
    public abstract String mBrand();

    @InterfaceC1498b("scheme")
    public abstract String mScheme();
}
