package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.AutoValue_Contact;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Contact {

    public static abstract class Builder {
        public abstract Contact build();

        public abstract Builder mContactId(@Nullable String str);

        public abstract Builder mName(String str);

        public abstract Builder mNumber(String str);

        public abstract Builder mPhotoUri(String str);
    }

    public static Builder sBuilder() {
        return new AutoValue_Contact.Builder();
    }

    @Nullable
    public abstract String mContactId();

    public abstract String mName();

    public abstract String mNumber();

    @Nullable
    public abstract String mPhotoUri();
}
