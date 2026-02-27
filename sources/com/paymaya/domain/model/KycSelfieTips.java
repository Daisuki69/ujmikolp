package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycSelfieTips implements Parcelable {
    public static final Parcelable.Creator<KycSelfieTips> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b("iconUrl")
    private final String iconUrl;

    public static final class Creator implements Parcelable.Creator<KycSelfieTips> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSelfieTips createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycSelfieTips(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSelfieTips[] newArray(int i) {
            return new KycSelfieTips[i];
        }
    }

    public KycSelfieTips() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycSelfieTips copy$default(KycSelfieTips kycSelfieTips, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycSelfieTips.description;
        }
        if ((i & 2) != 0) {
            str2 = kycSelfieTips.header;
        }
        if ((i & 4) != 0) {
            str3 = kycSelfieTips.iconUrl;
        }
        return kycSelfieTips.copy(str, str2, str3);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final KycSelfieTips copy(String description, String header, String iconUrl) {
        j.g(description, "description");
        j.g(header, "header");
        j.g(iconUrl, "iconUrl");
        return new KycSelfieTips(description, header, iconUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSelfieTips)) {
            return false;
        }
        KycSelfieTips kycSelfieTips = (KycSelfieTips) obj;
        return j.b(this.description, kycSelfieTips.description) && j.b(this.header, kycSelfieTips.header) && j.b(this.iconUrl, kycSelfieTips.iconUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        return this.iconUrl.hashCode() + AbstractC1414e.c(this.description.hashCode() * 31, 31, this.header);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.header;
        return s.p(s.x("KycSelfieTips(description=", str, ", header=", str2, ", iconUrl="), this.iconUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.description);
        dest.writeString(this.header);
        dest.writeString(this.iconUrl);
    }

    public KycSelfieTips(String description, String header, String iconUrl) {
        j.g(description, "description");
        j.g(header, "header");
        j.g(iconUrl, "iconUrl");
        this.description = description;
        this.header = header;
        this.iconUrl = iconUrl;
    }

    public /* synthetic */ KycSelfieTips(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
