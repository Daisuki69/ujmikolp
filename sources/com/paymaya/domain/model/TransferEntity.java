package com.paymaya.domain.model;

import android.os.Parcelable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_TransferEntity;
import com.paymaya.domain.model.C$AutoValue_TransferEntity;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransferEntity implements Parcelable {

    public static abstract class Builder {
        public abstract TransferEntity build();

        public abstract Builder mFirstName(String str);

        public abstract Builder mLastName(String str);

        public abstract Builder mMobileNumber(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TransferEntity.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TransferEntity.GsonTypeAdapter(jVar);
    }

    public String getFullName() {
        return mFirstName() + Global.BLANK + mLastName();
    }

    @InterfaceC1498b("first_name")
    public abstract String mFirstName();

    @InterfaceC1498b("last_name")
    public abstract String mLastName();

    @InterfaceC1498b("msisdn")
    public abstract String mMobileNumber();

    public abstract Builder toBuilder();
}
