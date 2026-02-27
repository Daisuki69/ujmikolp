package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.C$$AutoValue_BillsPayRequest;
import com.paymaya.domain.model.C$AutoValue_BillsPayRequest;
import g3.InterfaceC1498b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillsPayRequest implements Parcelable {

    public static abstract class Builder {
        public abstract BillsPayRequest build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mBiller(BillsPayRequestDetails billsPayRequestDetails);

        public abstract Builder mImageUrl(ImageUrlUnfiltered imageUrlUnfiltered);

        public abstract Builder mOtherFields(Map<String, String> map);
    }

    public static BillsPayRequest fromJson(String str) {
        return (BillsPayRequest) A.f10366a.e(str, BillsPayRequest.class);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillsPayRequest.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillsPayRequest.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("biller")
    public abstract BillsPayRequestDetails mBiller();

    @Nullable
    @InterfaceC1498b("icon_url")
    public abstract ImageUrlUnfiltered mImageUrl();

    @Nullable
    @InterfaceC1498b("other_fields")
    public abstract Map<String, String> mOtherFields();

    public abstract Builder toBuilder();

    public String toJson() {
        return A.f10366a.k(this);
    }
}
