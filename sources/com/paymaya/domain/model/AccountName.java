package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_AccountName;
import com.paymaya.domain.model.C$AutoValue_AccountName;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountName implements Parcelable {

    public static abstract class Builder {
        public abstract AccountName build();

        public abstract Builder mFirstName(String str);

        public abstract Builder mLastName(String str);

        public abstract Builder mMiddleName(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_AccountName.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_AccountName.GsonTypeAdapter(jVar);
    }

    public String getFullName() {
        if (C.e(mMiddleName())) {
            return mFirstName() + Global.BLANK + mLastName();
        }
        return mFirstName() + Global.BLANK + mMiddleName() + Global.BLANK + mLastName();
    }

    @InterfaceC1498b("firstName")
    public abstract String mFirstName();

    @InterfaceC1498b("last")
    public abstract String mLastName();

    @Nullable
    @InterfaceC1498b("middle")
    public abstract String mMiddleName();
}
