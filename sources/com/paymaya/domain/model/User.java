package com.paymaya.domain.model;

import We.s;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_User;
import com.paymaya.domain.model.C$AutoValue_User;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class User implements Parcelable {

    public static abstract class Builder {
        public abstract User build();

        public abstract Builder mAddress(@Nullable Address address);

        public abstract Builder mBirthDate(@Nullable String str);

        public abstract Builder mFirstName(String str);

        public abstract Builder mHasNoMiddleName(@Nullable Boolean bool);

        public abstract Builder mLastName(String str);

        public abstract Builder mMiddleName(@Nullable String str);

        public abstract Builder mPassword(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_User.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_User.GsonTypeAdapter(jVar);
    }

    public String getCardDisplayName() {
        if (mLastName().length() >= 25) {
            String strMLastName = mLastName();
            return C.e(strMLastName) ? "" : strMLastName.length() <= 26 ? strMLastName : strMLastName.substring(0, 26);
        }
        StringBuilder sb2 = new StringBuilder();
        String strMFirstName = mFirstName();
        int length = 25 - mLastName().length();
        sb2.append(C.e(strMFirstName) ? "" : strMFirstName.length() <= length ? strMFirstName : strMFirstName.substring(0, length));
        sb2.append(Global.BLANK);
        sb2.append(mLastName());
        return sb2.toString();
    }

    public String getFullName() {
        return mFirstName() + Global.BLANK + mLastName();
    }

    public String getFullNameWithMiddleName() {
        String strMFirstName = mFirstName();
        if (mHasNoMiddleName() != null && !mHasNoMiddleName().booleanValue() && mMiddleName() != null) {
            String strMMiddleName = mMiddleName();
            int length = strMMiddleName.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    break;
                }
                int iCodePointAt = strMMiddleName.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    StringBuilder sbV = s.v(strMFirstName, Global.BLANK);
                    sbV.append(mMiddleName());
                    strMFirstName = sbV.toString();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        StringBuilder sbV2 = s.v(strMFirstName, Global.BLANK);
        sbV2.append(mLastName());
        return sbV2.toString();
    }

    @Nullable
    @InterfaceC1498b("present_address")
    public abstract Address mAddress();

    @Nullable
    @InterfaceC1498b("birth_date")
    public abstract String mBirthDate();

    @InterfaceC1498b("first_name")
    public abstract String mFirstName();

    @Nullable
    @InterfaceC1498b("no_middle_name_flag")
    public abstract Boolean mHasNoMiddleName();

    @InterfaceC1498b("last_name")
    public abstract String mLastName();

    @Nullable
    @InterfaceC1498b("middle_name")
    public abstract String mMiddleName();

    @Nullable
    @InterfaceC1498b("password")
    public abstract String mPassword();

    public abstract Builder toBuilder();
}
