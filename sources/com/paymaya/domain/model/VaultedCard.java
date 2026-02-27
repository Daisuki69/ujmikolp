package com.paymaya.domain.model;

import android.os.Parcelable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_VaultedCard;
import com.paymaya.domain.model.C$AutoValue_VaultedCard;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VaultedCard implements Parcelable {

    public static abstract class Builder {
        public abstract VaultedCard build();

        public abstract Builder mCardScheme(String str);

        public abstract Builder mCardTokenId(String str);

        public abstract Builder mLastFourDigits(String str);

        public abstract Builder mState(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_VaultedCard.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_VaultedCard.GsonTypeAdapter(jVar);
    }

    public String getCardName() {
        String upperCase = mCardScheme().toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "MASTERCARD":
                return "Mastercard-" + mLastFourDigits();
            case "JCB":
                return "JCB-" + mLastFourDigits();
            case "VISA":
                return "Visa-" + mLastFourDigits();
            default:
                return mCardScheme() + Global.HYPHEN + mLastFourDigits();
        }
    }

    public String getCardSchemeName() {
        String upperCase = mCardScheme().toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "MASTERCARD":
                return "Mastercard";
            case "JCB":
                return "JCB";
            case "VISA":
                return "Visa";
            default:
                return mCardScheme();
        }
    }

    @InterfaceC1498b("scheme")
    public abstract String mCardScheme();

    @InterfaceC1498b("card_token_id")
    public abstract String mCardTokenId();

    @InterfaceC1498b("last_four")
    public abstract String mLastFourDigits();

    @InterfaceC1498b("state")
    public abstract String mState();

    public String getCardName(String str) {
        return getCardSchemeName() + str + mLastFourDigits();
    }
}
