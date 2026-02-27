package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.AutoValue_SecondaryFeature;
import com.paymaya.domain.model.C$AutoValue_SecondaryFeature;
import com.paymaya.domain.store.AbstractC1259g;
import com.paymaya.domain.store.C1263i;
import g3.InterfaceC1498b;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SecondaryFeature {

    public static abstract class Builder {
        public abstract SecondaryFeature build();

        public abstract Builder mAgeRestricted(@Nullable AbstractC1259g abstractC1259g);

        public abstract Builder mEventName(@Nullable String str);

        public abstract Builder mFeatureDynamicStatus(@Nullable FeatureDynamicStatus featureDynamicStatus);

        public abstract Builder mId(@Nullable String str);

        public abstract Builder mImageResource(int i);

        public abstract Builder mIsKycRequired(@Nullable Boolean bool);

        public abstract Builder mLabel(String str);

        public abstract Builder mUri(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_SecondaryFeature.Builder().mImageResource(0);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_SecondaryFeature.GsonTypeAdapter(jVar);
    }

    public String getAgeRestrictedMessage() {
        if (mAgeRestricted() == null) {
            return null;
        }
        return ((C1263i) mAgeRestricted()).c;
    }

    public String getAgeRestrictedTitle() {
        if (mAgeRestricted() == null) {
            return null;
        }
        return ((C1263i) mAgeRestricted()).f11448b;
    }

    public String getEventNameForModule() {
        return mEventName() == null ? getLabelAsEventName() : mEventName();
    }

    public String getEventNameForTileAttribute() {
        return getIdAsEventName() == null ? getEventNameLowerCase() == null ? getLabelAsEventNameLowerCase() : getEventNameLowerCase() : getIdAsEventName();
    }

    public String getEventNameLowerCase() {
        if (C.e(mEventName())) {
            return null;
        }
        return mEventName().toLowerCase(Locale.getDefault());
    }

    public String getIdAsEventName() {
        if (C.e(mId())) {
            return null;
        }
        return mId().toLowerCase(Locale.getDefault());
    }

    public String getLabelAsEventName() {
        return mLabel().toUpperCase(Locale.getDefault()).replace(Global.BLANK, Global.UNDERSCORE);
    }

    public String getLabelAsEventNameLowerCase() {
        return mLabel().toLowerCase(Locale.getDefault()).replace(Global.BLANK, Global.UNDERSCORE);
    }

    public boolean isKycRequired() {
        return mIsKycRequired() != null && mIsKycRequired().booleanValue();
    }

    @Nullable
    @InterfaceC1498b("age_restricted")
    public abstract AbstractC1259g mAgeRestricted();

    @Nullable
    @InterfaceC1498b("event_name")
    public abstract String mEventName();

    @Nullable
    @InterfaceC1498b("dynamic_status")
    public abstract FeatureDynamicStatus mFeatureDynamicStatus();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    public abstract int mImageResource();

    @Nullable
    @InterfaceC1498b("is_kyc_required")
    public abstract Boolean mIsKycRequired();

    @InterfaceC1498b("label")
    public abstract String mLabel();

    @Nullable
    @InterfaceC1498b("uri")
    public abstract String mUri();
}
