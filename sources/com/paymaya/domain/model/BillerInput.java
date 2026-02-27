package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_BillerInput;
import com.paymaya.domain.model.C$AutoValue_BillerInput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillerInput implements Parcelable {
    public static Builder sBuilder() {
        return new C$$AutoValue_BillerInput.Builder().mSlug("").mAccountNumber("").mAmount(null).mBillerFields(new LinkedHashMap());
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillerInput.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract String mAccountNumber();

    @Nullable
    public abstract Amount mAmount();

    public abstract Map<String, BillerField> mBillerFields();

    @Nullable
    public abstract String mSlug();

    public BillsPayRequest toBillsPayRequest() {
        HashMap map = new HashMap();
        for (Map.Entry<String, BillerField> entry : mBillerFields().entrySet()) {
            if (!C.e(entry.getValue().mValue())) {
                map.put(entry.getValue().mParameter(), entry.getValue().mValue());
            }
        }
        return BillsPayRequest.sBuilder().mAmount(mAmount()).mBiller(BillsPayRequestDetails.sBuilder().mAccountNumber(mAccountNumber()).mSlug(mSlug()).build()).mOtherFields(map).build();
    }

    public abstract Builder toBuilder();

    public static abstract class Builder {
        private Map<String, BillerField> billerFields = new LinkedHashMap();

        public void addBillerField(BillerField billerField) {
            this.billerFields.put(billerField.mParameter(), billerField);
            mBillerFields(this.billerFields);
        }

        public abstract BillerInput build();

        public BillerField getBillerField(UIComponent uIComponent) {
            BillerField billerField = this.billerFields.get(uIComponent.parameter());
            if (C.e(billerField)) {
                return null;
            }
            return billerField;
        }

        public abstract Builder mAccountNumber(@Nullable String str);

        public abstract Builder mAmount(@Nullable Amount amount);

        public abstract Builder mBillerFields(Map<String, BillerField> map);

        public abstract Builder mSlug(@Nullable String str);

        public void setBillerFieldInput(UIComponent uIComponent, String str) {
            BillerField billerFieldGenerateBillerField = this.billerFields.get(uIComponent.parameter());
            if (billerFieldGenerateBillerField == null) {
                billerFieldGenerateBillerField = BillerField.generateBillerField(uIComponent);
            }
            addBillerField(billerFieldGenerateBillerField.toBuilder().mValue(str).build());
        }

        public void setBillerFieldInput(UIComponent uIComponent, String str, String str2) {
            BillerField billerFieldGenerateBillerField = this.billerFields.get(uIComponent.parameter());
            if (billerFieldGenerateBillerField == null) {
                billerFieldGenerateBillerField = BillerField.generateBillerField(uIComponent);
            }
            addBillerField(billerFieldGenerateBillerField.toBuilder().mValue(str).mDisplayValue(str2).build());
        }

        public void setBillerFieldInput(UIComponent uIComponent, String str, boolean z4) {
            BillerField billerFieldGenerateBillerField = this.billerFields.get(uIComponent.parameter());
            if (billerFieldGenerateBillerField == null) {
                billerFieldGenerateBillerField = BillerField.generateBillerField(uIComponent);
            }
            addBillerField(billerFieldGenerateBillerField.toBuilder().mValue(str).mIsHidden(z4).build());
        }
    }
}
