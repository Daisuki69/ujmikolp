package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Contact;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Contact extends Contact {
    private final String mContactId;
    private final String mName;
    private final String mNumber;
    private final String mPhotoUri;

    public static final class Builder extends Contact.Builder {
        private String mContactId;
        private String mName;
        private String mNumber;
        private String mPhotoUri;

        @Override // com.paymaya.domain.model.Contact.Builder
        public Contact build() {
            String strConcat = this.mName == null ? " mName" : "";
            if (this.mNumber == null) {
                strConcat = strConcat.concat(" mNumber");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_Contact(0, this.mContactId, this.mName, this.mNumber, this.mPhotoUri);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.paymaya.domain.model.Contact.Builder
        public Contact.Builder mContactId(@Nullable String str) {
            this.mContactId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Contact.Builder
        public Contact.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Contact.Builder
        public Contact.Builder mNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mNumber");
            }
            this.mNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Contact.Builder
        public Contact.Builder mPhotoUri(String str) {
            this.mPhotoUri = str;
            return this;
        }
    }

    public /* synthetic */ AutoValue_Contact(int i, String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            String str2 = this.mContactId;
            if (str2 != null ? str2.equals(contact.mContactId()) : contact.mContactId() == null) {
                if (this.mName.equals(contact.mName()) && this.mNumber.equals(contact.mNumber()) && ((str = this.mPhotoUri) != null ? str.equals(contact.mPhotoUri()) : contact.mPhotoUri() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mContactId;
        int iHashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mNumber.hashCode()) * 1000003;
        String str2 = this.mPhotoUri;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Contact
    @Nullable
    public String mContactId() {
        return this.mContactId;
    }

    @Override // com.paymaya.domain.model.Contact
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Contact
    public String mNumber() {
        return this.mNumber;
    }

    @Override // com.paymaya.domain.model.Contact
    @Nullable
    public String mPhotoUri() {
        return this.mPhotoUri;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Contact{mContactId=");
        sb2.append(this.mContactId);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mNumber=");
        sb2.append(this.mNumber);
        sb2.append(", mPhotoUri=");
        return s.p(sb2, this.mPhotoUri, "}");
    }

    private AutoValue_Contact(@Nullable String str, String str2, String str3, @Nullable String str4) {
        this.mContactId = str;
        this.mName = str2;
        this.mNumber = str3;
        this.mPhotoUri = str4;
    }
}
