package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_Address;
import com.paymaya.domain.model.C$AutoValue_Address;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Address implements Parcelable {

    public static abstract class Builder {
        public abstract Address build();

        public abstract Builder mCity(@Nullable String str);

        public abstract Builder mCountryCode(@Nullable String str);

        public abstract Builder mLine1(@Nullable String str);

        public abstract Builder mLine2(@Nullable String str);

        public abstract Builder mLocality(@Nullable String str);

        public abstract Builder mState(@Nullable String str);

        public abstract Builder mZipCode(@Nullable String str);
    }

    private String getAddressLine1Line2Locality() {
        return mLine1() + ", " + mLine2() + ", " + mLocality();
    }

    private String getAddressLine1Locality() {
        return a.j(mLine1(), ", ", mLocality());
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Address.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Address.GsonTypeAdapter(jVar);
    }

    public String getAddressCity() {
        return mCity() + ", " + mState() + ", " + mZipCode();
    }

    public String getAddressStreet() {
        return C.e(mLine2()) ? getAddressLine1Locality() : getAddressLine1Line2Locality();
    }

    public String getCompleteAddress() {
        return a.j(getAddressStreet(), ", ", getAddressCity());
    }

    @Nullable
    @InterfaceC1498b("city")
    public abstract String mCity();

    @Nullable
    @InterfaceC1498b("country")
    public abstract String mCountryCode();

    @Nullable
    @InterfaceC1498b("line1")
    public abstract String mLine1();

    @Nullable
    @InterfaceC1498b("line2")
    public abstract String mLine2();

    @Nullable
    @InterfaceC1498b("locality")
    public abstract String mLocality();

    @Nullable
    @InterfaceC1498b("state")
    public abstract String mState();

    @Nullable
    @InterfaceC1498b("zip_code")
    public abstract String mZipCode();

    public abstract Builder toBuilder();
}
