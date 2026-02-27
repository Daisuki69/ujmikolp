package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.AddMoneyViaCardConfig;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_AddMoneyViaCardConfig<T extends AddMoneyViaCardConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_AddMoneyViaCardConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mBiggerPredefinedAmount() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "button3");
    }

    public String mCurrency() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "currency");
    }

    public String mDynamicButtonAmounts() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "dynamic_button");
    }

    public String mEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, Constants.ENABLED);
    }

    public String mForceVaultingEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "force_vaulting_enabled");
    }

    public String mMaxAmount() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "button4");
    }

    public String mMinAmount() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "button1");
    }

    public String mNote() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "note");
    }

    public String mSmallerPredefinedAmount() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "button2");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, Constants.ENABLED), Boolean.valueOf(this.mTarget.mEnabled()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "note"), this.mTarget.mNote());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "force_vaulting_enabled"), Boolean.valueOf(this.mTarget.mForceVaultingEnabled()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "currency"), this.mTarget.mCurrency());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "button1"), Integer.valueOf(this.mTarget.mMinAmount()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "button2"), Integer.valueOf(this.mTarget.mSmallerPredefinedAmount()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "button3"), Integer.valueOf(this.mTarget.mBiggerPredefinedAmount()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "button4"), Integer.valueOf(this.mTarget.mMaxAmount()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "dynamic_button"), this.mTarget.mDynamicButtonAmounts().toString());
    }

    public void updateConfig() {
        AddMoneyViaCardConfig.Builder builder = this.mTarget.toBuilder();
        builder.mEnabled(this.mRemoteConfig.c(mEnabled()));
        builder.mNote(this.mRemoteConfig.g(mNote()));
        builder.mForceVaultingEnabled(this.mRemoteConfig.c(mForceVaultingEnabled()));
        builder.mCurrency(this.mRemoteConfig.g(mCurrency()));
        builder.mMinAmount((int) this.mRemoteConfig.d(mMinAmount()));
        builder.mSmallerPredefinedAmount((int) this.mRemoteConfig.d(mSmallerPredefinedAmount()));
        builder.mBiggerPredefinedAmount((int) this.mRemoteConfig.d(mBiggerPredefinedAmount()));
        builder.mMaxAmount((int) this.mRemoteConfig.d(mMaxAmount()));
        String[] strArrSplit = this.mRemoteConfig.g(mDynamicButtonAmounts()).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        ArrayList arrayList = new ArrayList();
        for (String str : strArrSplit) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException e) {
                arrayList.add(0);
                e.printStackTrace();
            }
        }
        builder.mDynamicButtonAmounts(arrayList);
        this.mTarget = (T) builder.build();
    }
}
