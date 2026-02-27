package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Order;
import com.paymaya.domain.model.C$AutoValue_Order;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Order implements Parcelable {

    public static abstract class Builder {
        public abstract Order build();

        public abstract Builder mAvailableBalance(Amount amount);

        public abstract Builder mCode(String str);

        public abstract Builder mCurrentBalance(Amount amount);

        public abstract Builder mId(String str);

        public abstract Builder mOtherFields(List<OrderProviderField> list);

        public abstract Builder mPaymentId(String str);

        public abstract Builder mStatus(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Order.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Order.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract Amount mAvailableBalance();

    @Nullable
    @InterfaceC1498b("code")
    public abstract String mCode();

    @Nullable
    public abstract Amount mCurrentBalance();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("other_fields")
    public abstract List<OrderProviderField> mOtherFields();

    @Nullable
    @InterfaceC1498b("payment_id")
    public abstract String mPaymentId();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    public abstract Builder toBuilder();
}
