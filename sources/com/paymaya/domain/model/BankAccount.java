package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_BankAccount;
import com.paymaya.domain.model.C$AutoValue_BankAccount;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BankAccount implements Parcelable {

    public static abstract class Builder {
        public abstract BankAccount build();

        public abstract Builder mAccountName(String str);

        public abstract Builder mFirstName(String str);

        public abstract Builder mLastName(String str);

        public abstract Builder mMiddleName(String str);

        public abstract Builder mRecipientMobileNumber(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BankAccount.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BankAccount.GsonTypeAdapter(jVar);
    }

    public String getAccountFirstAndLastName() {
        if (mAccountName() != null) {
            return mAccountName();
        }
        return mFirstName() + Global.BLANK + mLastName();
    }

    public String getAccountName() {
        if (mAccountName() != null) {
            return mAccountName();
        }
        if (C.e(mMiddleName())) {
            return mFirstName() + Global.BLANK + mLastName();
        }
        return mFirstName() + Global.BLANK + mMiddleName() + Global.BLANK + mLastName();
    }

    @Nullable
    @InterfaceC1498b("account_name")
    public abstract String mAccountName();

    @Nullable
    @InterfaceC1498b("first_name")
    public abstract String mFirstName();

    @Nullable
    @InterfaceC1498b("last_name")
    public abstract String mLastName();

    @Nullable
    @InterfaceC1498b("middle_name")
    public abstract String mMiddleName();

    @Nullable
    @InterfaceC1498b("mobile_number")
    public abstract String mRecipientMobileNumber();

    public abstract Builder toBuilder();
}
