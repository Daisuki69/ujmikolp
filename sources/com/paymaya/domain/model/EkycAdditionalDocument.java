package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_EkycAdditionalDocument;
import com.paymaya.domain.model.C$AutoValue_EkycAdditionalDocument;
import g3.InterfaceC1498b;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EkycAdditionalDocument implements Parcelable {

    public static abstract class Builder {
        public abstract EkycAdditionalDocument build();

        public abstract Builder mFile(File file);

        public abstract Builder mImageUrl(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_EkycAdditionalDocument.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_EkycAdditionalDocument.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract File mFile();

    @Nullable
    @InterfaceC1498b(ImagesContract.URL)
    public abstract String mImageUrl();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public abstract Builder toBuilder();
}
