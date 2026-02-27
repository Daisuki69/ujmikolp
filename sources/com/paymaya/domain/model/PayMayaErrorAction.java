package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$AutoValue_PayMayaErrorAction;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PayMayaErrorAction implements Parcelable {

    public static abstract class Builder {
        public abstract PayMayaErrorAction build();

        public abstract Builder isExternal(Boolean bool);

        public abstract Builder mTitle(String str);

        public abstract Builder mUrl(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_PayMayaErrorAction.Builder().mUrl("").mTitle("").isExternal(Boolean.FALSE);
    }

    @InterfaceC1498b("is_external")
    public abstract Boolean isExternal();

    @InterfaceC1498b("title")
    public abstract String mTitle();

    @InterfaceC1498b(ImagesContract.URL)
    public abstract String mUrl();

    public String normalizeUrl() {
        return C.m0(mUrl());
    }

    public abstract Builder toBuilder();
}
