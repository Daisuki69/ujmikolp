package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_BillsPayRequestDetails;
import com.paymaya.domain.model.C$AutoValue_BillsPayRequestDetails;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillsPayRequestDetails implements Parcelable {

    public static abstract class Builder {
        public abstract BillsPayRequestDetails build();

        public abstract Builder mAccountNumber(String str);

        public abstract Builder mSlug(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillsPayRequestDetails.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillsPayRequestDetails.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("account_number")
    public abstract String mAccountNumber();

    @Nullable
    @InterfaceC1498b("slug")
    public abstract String mSlug();

    public abstract Builder toBuilder();
}
