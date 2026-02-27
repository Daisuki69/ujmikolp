package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_BillerMetadata;
import com.paymaya.domain.model.C$AutoValue_BillerMetadata;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillerMetadata implements Parcelable {

    public static abstract class Builder {
        public abstract BillerMetadata build();

        public abstract Builder mAccountNumberPlaceHolder(String str);

        public abstract Builder mAmountPlaceHolder(String str);

        public abstract Builder mIsAccountNumberDisabled(Boolean bool);

        public abstract Builder mNotes(List<String> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillerMetadata.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillerMetadata.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("accountNumberPlaceholder")
    public abstract String mAccountNumberPlaceHolder();

    @InterfaceC1498b("amountPlaceholder")
    public abstract String mAmountPlaceHolder();

    @InterfaceC1498b("isAccountNumberDisabled")
    public abstract Boolean mIsAccountNumberDisabled();

    @InterfaceC1498b("notes")
    public abstract List<String> mNotes();

    public abstract Builder toBuilder();
}
