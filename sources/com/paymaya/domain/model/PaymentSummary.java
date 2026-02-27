package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.C$AutoValue_PaymentSummary;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PaymentSummary implements Parcelable {

    public static abstract class Builder {
        public abstract PaymentSummary build();

        public abstract Builder mFundSourceId(String str);

        public abstract Builder mIsGifted(boolean z4);

        public abstract Builder mIsIncludeSignatureEnabled(boolean z4);

        public abstract Builder mMessage(String str);

        public abstract Builder mOtherFields(Map<String, String> map);

        public abstract Builder mProductId(String str);

        public abstract Builder mRecipient(String str);

        public abstract Builder mTargetNumber(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_PaymentSummary.Builder().mIsIncludeSignatureEnabled(false).mIsGifted(false);
    }

    @Nullable
    public abstract String mFundSourceId();

    public abstract boolean mIsGifted();

    public abstract boolean mIsIncludeSignatureEnabled();

    @Nullable
    public abstract String mMessage();

    @Nullable
    public abstract Map<String, String> mOtherFields();

    public abstract String mProductId();

    @Nullable
    public abstract String mRecipient();

    @Nullable
    public abstract String mTargetNumber();

    public abstract Builder toBuilder();
}
