package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPart implements Parcelable {
    public static final Parcelable.Creator<KycPart> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(Constants.FILE)
    private final KycFileContent file;

    @InterfaceC1497a
    @InterfaceC1498b("part")
    private final String part;

    public static final class Creator implements Parcelable.Creator<KycPart> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPart createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycPart(parcel.readString(), parcel.readInt() == 0 ? null : KycFileContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPart[] newArray(int i) {
            return new KycPart[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycPart() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycPart copy$default(KycPart kycPart, String str, KycFileContent kycFileContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycPart.part;
        }
        if ((i & 2) != 0) {
            kycFileContent = kycPart.file;
        }
        return kycPart.copy(str, kycFileContent);
    }

    public final String component1() {
        return this.part;
    }

    public final KycFileContent component2() {
        return this.file;
    }

    public final KycPart copy(String str, KycFileContent kycFileContent) {
        return new KycPart(str, kycFileContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycPart)) {
            return false;
        }
        KycPart kycPart = (KycPart) obj;
        return j.b(this.part, kycPart.part) && j.b(this.file, kycPart.file);
    }

    public final KycFileContent getFile() {
        return this.file;
    }

    public final String getPart() {
        return this.part;
    }

    public int hashCode() {
        String str = this.part;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        KycFileContent kycFileContent = this.file;
        return iHashCode + (kycFileContent != null ? kycFileContent.hashCode() : 0);
    }

    public String toString() {
        return "KycPart(part=" + this.part + ", file=" + this.file + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.part);
        KycFileContent kycFileContent = this.file;
        if (kycFileContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycFileContent.writeToParcel(dest, i);
        }
    }

    public KycPart(String str, KycFileContent kycFileContent) {
        this.part = str;
        this.file = kycFileContent;
    }

    public /* synthetic */ KycPart(String str, KycFileContent kycFileContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : kycFileContent);
    }
}
