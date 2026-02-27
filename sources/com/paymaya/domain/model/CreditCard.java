package com.paymaya.domain.model;

import We.s;
import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_CreditCard;
import com.paymaya.domain.model.C$AutoValue_CreditCard;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CreditCard {

    public static abstract class Builder {
        public abstract CreditCard build();

        public abstract Builder mCardNumber(String str);

        public abstract Builder mCsc(String str);

        public abstract Builder mExpiryMonth(String str);

        public abstract Builder mExpiryYear(String str);
    }

    private String getFormattedYear() {
        return mExpiryYear().isEmpty() ? "" : mExpiryYear().substring(Math.max(mExpiryYear().length() - 2, 0));
    }

    public static Builder sBuilder() {
        return new C$AutoValue_CreditCard.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_CreditCard.GsonTypeAdapter(jVar);
    }

    public String getFormattedCardNumber() {
        if (mCardNumber().length() != 16) {
            return mCardNumber();
        }
        StringBuilder sbV = s.v("" + mCardNumber().substring(0, 4), Global.BLANK);
        sbV.append(mCardNumber().substring(4, 8));
        StringBuilder sbV2 = s.v(sbV.toString(), Global.BLANK);
        sbV2.append(mCardNumber().substring(8, 12));
        StringBuilder sbV3 = s.v(sbV2.toString(), Global.BLANK);
        sbV3.append(mCardNumber().substring(12, 16));
        return sbV3.toString();
    }

    public String getFormattedDate() {
        return a.j(mExpiryMonth(), "/", getFormattedYear());
    }

    @InterfaceC1498b("number")
    public abstract String mCardNumber();

    @InterfaceC1498b("csc")
    public abstract String mCsc();

    @InterfaceC1498b("month_expiry")
    public abstract String mExpiryMonth();

    @InterfaceC1498b("year_expiry")
    public abstract String mExpiryYear();
}
