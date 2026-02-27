package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.User;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_User, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_User extends User {
    private final Address mAddress;
    private final String mBirthDate;
    private final String mFirstName;
    private final Boolean mHasNoMiddleName;
    private final String mLastName;
    private final String mMiddleName;
    private final String mPassword;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_User$Builder */
    public static class Builder extends User.Builder {
        private Address mAddress;
        private String mBirthDate;
        private String mFirstName;
        private Boolean mHasNoMiddleName;
        private String mLastName;
        private String mMiddleName;
        private String mPassword;

        public /* synthetic */ Builder(User user, int i) {
            this(user);
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User build() {
            String strI = this.mFirstName == null ? " mFirstName" : "";
            if (this.mLastName == null) {
                strI = s.i(strI, " mLastName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_User(this.mFirstName, this.mMiddleName, this.mLastName, this.mBirthDate, this.mPassword, this.mAddress, this.mHasNoMiddleName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mAddress(@Nullable Address address) {
            this.mAddress = address;
            return this;
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mBirthDate(@Nullable String str) {
            this.mBirthDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mFirstName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFirstName");
            }
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mHasNoMiddleName(@Nullable Boolean bool) {
            this.mHasNoMiddleName = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mLastName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastName");
            }
            this.mLastName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mMiddleName(@Nullable String str) {
            this.mMiddleName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.User.Builder
        public User.Builder mPassword(@Nullable String str) {
            this.mPassword = str;
            return this;
        }

        public Builder() {
        }

        private Builder(User user) {
            this.mFirstName = user.mFirstName();
            this.mMiddleName = user.mMiddleName();
            this.mLastName = user.mLastName();
            this.mBirthDate = user.mBirthDate();
            this.mPassword = user.mPassword();
            this.mAddress = user.mAddress();
            this.mHasNoMiddleName = user.mHasNoMiddleName();
        }
    }

    public C$$AutoValue_User(String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable Address address, @Nullable Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null mFirstName");
        }
        this.mFirstName = str;
        this.mMiddleName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mLastName");
        }
        this.mLastName = str3;
        this.mBirthDate = str4;
        this.mPassword = str5;
        this.mAddress = address;
        this.mHasNoMiddleName = bool;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        Address address;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            if (this.mFirstName.equals(user.mFirstName()) && ((str = this.mMiddleName) != null ? str.equals(user.mMiddleName()) : user.mMiddleName() == null) && this.mLastName.equals(user.mLastName()) && ((str2 = this.mBirthDate) != null ? str2.equals(user.mBirthDate()) : user.mBirthDate() == null) && ((str3 = this.mPassword) != null ? str3.equals(user.mPassword()) : user.mPassword() == null) && ((address = this.mAddress) != null ? address.equals(user.mAddress()) : user.mAddress() == null) && ((bool = this.mHasNoMiddleName) != null ? bool.equals(user.mHasNoMiddleName()) : user.mHasNoMiddleName() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mFirstName.hashCode() ^ 1000003) * 1000003;
        String str = this.mMiddleName;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mLastName.hashCode()) * 1000003;
        String str2 = this.mBirthDate;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mPassword;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Address address = this.mAddress;
        int iHashCode5 = (iHashCode4 ^ (address == null ? 0 : address.hashCode())) * 1000003;
        Boolean bool = this.mHasNoMiddleName;
        return iHashCode5 ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.User
    @Nullable
    @InterfaceC1498b("present_address")
    public Address mAddress() {
        return this.mAddress;
    }

    @Override // com.paymaya.domain.model.User
    @Nullable
    @InterfaceC1498b("birth_date")
    public String mBirthDate() {
        return this.mBirthDate;
    }

    @Override // com.paymaya.domain.model.User
    @InterfaceC1498b("first_name")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.User
    @Nullable
    @InterfaceC1498b("no_middle_name_flag")
    public Boolean mHasNoMiddleName() {
        return this.mHasNoMiddleName;
    }

    @Override // com.paymaya.domain.model.User
    @InterfaceC1498b("last_name")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.User
    @Nullable
    @InterfaceC1498b("middle_name")
    public String mMiddleName() {
        return this.mMiddleName;
    }

    @Override // com.paymaya.domain.model.User
    @Nullable
    @InterfaceC1498b("password")
    public String mPassword() {
        return this.mPassword;
    }

    @Override // com.paymaya.domain.model.User
    public User.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("User{mFirstName=");
        sb2.append(this.mFirstName);
        sb2.append(", mMiddleName=");
        sb2.append(this.mMiddleName);
        sb2.append(", mLastName=");
        sb2.append(this.mLastName);
        sb2.append(", mBirthDate=");
        sb2.append(this.mBirthDate);
        sb2.append(", mPassword=");
        sb2.append(this.mPassword);
        sb2.append(", mAddress=");
        sb2.append(this.mAddress);
        sb2.append(", mHasNoMiddleName=");
        return AbstractC1213b.N(sb2, this.mHasNoMiddleName, "}");
    }
}
