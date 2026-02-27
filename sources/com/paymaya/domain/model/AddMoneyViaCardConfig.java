package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AddMoneyViaCardConfig;
import com.paymaya.domain.model.C$AutoValue_AddMoneyViaCardConfig;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AddMoneyViaCardConfig {

    public static abstract class Builder {
        public abstract AddMoneyViaCardConfig build();

        public abstract Builder mBiggerPredefinedAmount(int i);

        public abstract Builder mCurrency(String str);

        public abstract Builder mDynamicButtonAmounts(List<Integer> list);

        public abstract Builder mEnabled(boolean z4);

        public abstract Builder mForceVaultingEnabled(boolean z4);

        public abstract Builder mMaxAmount(int i);

        public abstract Builder mMinAmount(int i);

        public abstract Builder mNote(@Nullable String str);

        public abstract Builder mSmallerPredefinedAmount(int i);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AddMoneyViaCardConfig.Builder().mEnabled(false).mNote("").mForceVaultingEnabled(false).mCurrency("PHP").mMinAmount(500).mSmallerPredefinedAmount(1000).mBiggerPredefinedAmount(2000).mMaxAmount(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS).mDynamicButtonAmounts(Arrays.asList(500, 1000, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), 2000, 3000, Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS), 7000, 10000));
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AddMoneyViaCardConfig.GsonTypeAdapter(jVar);
    }

    public String getFormattedBiggerPredefinedAmount() {
        return mCurrency() + Global.BLANK + mBiggerPredefinedAmount();
    }

    public String getFormattedSmallerPredefinedAmount() {
        return mCurrency() + Global.BLANK + mSmallerPredefinedAmount();
    }

    @InterfaceC1498b("button3")
    public abstract int mBiggerPredefinedAmount();

    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @InterfaceC1498b("dynamic_button")
    public abstract List<Integer> mDynamicButtonAmounts();

    @InterfaceC1498b(Constants.ENABLED)
    public abstract boolean mEnabled();

    @InterfaceC1498b("force_vaulting_enabled")
    public abstract boolean mForceVaultingEnabled();

    @InterfaceC1498b("button4")
    public abstract int mMaxAmount();

    @InterfaceC1498b("button1")
    public abstract int mMinAmount();

    @Nullable
    @InterfaceC1498b("note")
    public abstract String mNote();

    @InterfaceC1498b("button2")
    public abstract int mSmallerPredefinedAmount();

    public abstract Builder toBuilder();
}
