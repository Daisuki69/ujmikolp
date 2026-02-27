package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.C$$AutoValue_PayMayaError;
import com.paymaya.domain.model.C$AutoValue_PayMayaError;
import g3.InterfaceC1498b;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PayMayaError implements Parcelable {
    private static final int ERROR_PAYMAYA_EXPIRED_ACCESS_TOKEN = -4;
    private static final int ERROR_PAYMAYA_MALFORMED_ACCESS_TOKEN = -3;
    public static final int ERROR_PAYMAYA_SHOP_PROCESSING = -226;
    private static final int ERROR_PAYMAYA_UNAUTHORIZED = -5;

    public static abstract class Builder {
        public abstract PayMayaError build();

        public abstract Builder isDefault(boolean z4);

        public abstract Builder isNetworkError(boolean z4);

        public abstract Builder mAction(PayMayaErrorAction payMayaErrorAction);

        public abstract Builder mDetails(String str);

        public abstract Builder mErrorCode(int i);

        public abstract Builder mJsonObject(String str);

        public abstract Builder mMessage(String str);

        public abstract Builder mMeta(String str);

        public abstract Builder mSpiel(String str);

        public abstract Builder mStatusCode(int i);

        public abstract Builder mThrowableMessage(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PayMayaError.Builder().mStatusCode(Integer.MIN_VALUE).mErrorCode(Integer.MIN_VALUE).mMessage("").mSpiel("").mJsonObject("").isNetworkError(false).isDefault(false).mDetails("").mMeta(null).mAction(null);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PayMayaError.GsonTypeAdapter(jVar);
    }

    public MfaMeta getMetaAsMfaMeta() {
        if (mMeta() != null) {
            try {
                return (MfaMeta) A.f10366a.e(mMeta(), MfaMeta.class);
            } catch (JsonParseException unused) {
                a.e();
            }
        }
        return null;
    }

    public abstract boolean isDefault();

    public abstract boolean isNetworkError();

    public boolean isSessionTimeout() {
        int iMErrorCode = mErrorCode();
        return iMErrorCode == -5 || iMErrorCode == -4 || iMErrorCode == -3;
    }

    @Nullable
    @InterfaceC1498b("action")
    public abstract PayMayaErrorAction mAction();

    @Nullable
    @InterfaceC1498b("details")
    public abstract String mDetails();

    @InterfaceC1498b("code")
    public abstract int mErrorCode();

    @Nullable
    public abstract String mJsonObject();

    @InterfaceC1498b("msg")
    public abstract String mMessage();

    @Nullable
    public abstract String mMeta();

    @InterfaceC1498b("spiel")
    public abstract String mSpiel();

    public abstract int mStatusCode();

    @Nullable
    public abstract String mThrowableMessage();

    public abstract Builder toBuilder();
}
