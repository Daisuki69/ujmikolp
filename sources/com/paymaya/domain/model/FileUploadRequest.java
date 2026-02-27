package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_FileUploadRequest;
import com.paymaya.domain.model.C$AutoValue_FileUploadRequest;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FileUploadRequest {

    public static abstract class Builder {
        public abstract FileUploadRequest build();

        public abstract Builder mFilename(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_FileUploadRequest.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_FileUploadRequest.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("fileName")
    public abstract String mFilename();

    public abstract Builder toBuilder();
}
