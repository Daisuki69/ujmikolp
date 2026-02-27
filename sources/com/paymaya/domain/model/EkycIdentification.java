package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_EkycIdentification;
import com.paymaya.domain.model.C$AutoValue_EkycIdentification;
import g3.InterfaceC1498b;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EkycIdentification implements Parcelable {

    public static abstract class Builder {
        public abstract EkycIdentification build();

        public abstract Builder mBackSideImageFile(File file);

        public abstract Builder mBackSideImageUrl(String str);

        public abstract Builder mExpirationDate(String str);

        public abstract Builder mIdName(String str);

        public abstract Builder mIdNumber(String str);

        public abstract Builder mIdType(String str);

        public abstract Builder mImageFile(File file);

        public abstract Builder mImageUrl(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_EkycIdentification.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_EkycIdentification.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract File mBackSideImageFile();

    @Nullable
    @InterfaceC1498b("backside_url")
    public abstract String mBackSideImageUrl();

    @Nullable
    @InterfaceC1498b("expiry")
    public abstract String mExpirationDate();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mIdName();

    @Nullable
    @InterfaceC1498b("number")
    public abstract String mIdNumber();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mIdType();

    @Nullable
    public abstract File mImageFile();

    @Nullable
    @InterfaceC1498b(ImagesContract.URL)
    public abstract String mImageUrl();

    public abstract Builder toBuilder();
}
