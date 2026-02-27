package com.paymaya.domain.model;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_FileUploadResponse;
import com.paymaya.domain.model.C$AutoValue_FileUploadResponse;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FileUploadResponse {

    public static abstract class Builder {
        public abstract FileUploadResponse build();

        public abstract Builder mContentType(String str);

        public abstract Builder mUploadUrl(String str);

        public abstract Builder mUrl(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_FileUploadResponse.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_FileUploadResponse.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("contentType")
    public abstract String mContentType();

    @InterfaceC1498b("uploadUrl")
    public abstract String mUploadUrl();

    @InterfaceC1498b(ImagesContract.URL)
    public abstract String mUrl();

    public abstract Builder toBuilder();
}
