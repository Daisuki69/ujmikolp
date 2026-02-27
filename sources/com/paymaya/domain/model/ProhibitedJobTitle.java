package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProhibitedJobTitle implements Parcelable {
    public static final Parcelable.Creator<ProhibitedJobTitle> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    public static final class Creator implements Parcelable.Creator<ProhibitedJobTitle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProhibitedJobTitle createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProhibitedJobTitle(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProhibitedJobTitle[] newArray(int i) {
            return new ProhibitedJobTitle[i];
        }
    }

    public ProhibitedJobTitle(String code) {
        j.g(code, "code");
        this.code = code;
    }

    public static /* synthetic */ ProhibitedJobTitle copy$default(ProhibitedJobTitle prohibitedJobTitle, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prohibitedJobTitle.code;
        }
        return prohibitedJobTitle.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final ProhibitedJobTitle copy(String code) {
        j.g(code, "code");
        return new ProhibitedJobTitle(code);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProhibitedJobTitle) && j.b(this.code, ((ProhibitedJobTitle) obj).code);
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return s.j("ProhibitedJobTitle(code=", this.code, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
    }
}
