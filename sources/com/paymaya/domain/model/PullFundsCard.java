package com.paymaya.domain.model;

import android.os.Parcelable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_PullFundsCard;
import com.paymaya.domain.model.C$AutoValue_PullFundsCard;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PullFundsCard implements Parcelable {

    public static abstract class Builder {
        public abstract PullFundsCard build();

        public abstract Builder mLastFour(String str);

        public abstract Builder mScheme(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PullFundsCard.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PullFundsCard.GsonTypeAdapter(jVar);
    }

    public String getCardName() {
        return mScheme() + Global.HYPHEN + mLastFour();
    }

    public String getCardSchemeName() {
        String upperCase = mScheme().toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "MASTERCARD":
                return "Mastercard";
            case "JCB":
                return "JCB";
            case "VISA":
                return "Visa";
            default:
                return mScheme();
        }
    }

    @InterfaceC1498b("last_four")
    public abstract String mLastFour();

    @InterfaceC1498b("scheme")
    public abstract String mScheme();

    public abstract Builder toBuilder();
}
