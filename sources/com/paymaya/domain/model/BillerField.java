package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_BillerField;
import com.paymaya.domain.model.C$AutoValue_BillerField;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillerField implements Parcelable {

    public static abstract class Builder {
        public abstract BillerField build();

        public abstract Builder mDisplayValue(@Nullable String str);

        public abstract Builder mIsHidden(boolean z4);

        public abstract Builder mIsRequired(boolean z4);

        public abstract Builder mParameter(@Nullable String str);

        public abstract Builder mPlaceholder(@Nullable String str);

        public abstract Builder mRegex(@Nullable String str);

        public abstract Builder mType(@Nullable String str);

        public abstract Builder mValue(@Nullable String str);
    }

    public static BillerField generateBillerField(UIComponent uIComponent) {
        return sBuilder().mIsRequired(uIComponent.required()).mType(uIComponent.type()).mRegex(uIComponent.regex()).mPlaceholder(uIComponent.placeholder()).mParameter(uIComponent.parameter()).build();
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillerField.Builder().mValue("").mType("").mDisplayValue("").mParameter("").mPlaceholder("").mIsRequired(false).mIsHidden(false).mRegex("");
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillerField.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract String mDisplayValue();

    public abstract boolean mIsHidden();

    public abstract boolean mIsRequired();

    @Nullable
    public abstract String mParameter();

    @Nullable
    public abstract String mPlaceholder();

    @Nullable
    public abstract String mRegex();

    @Nullable
    public abstract String mType();

    @Nullable
    public abstract String mValue();

    public abstract Builder toBuilder();
}
