package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class Restriction implements Parcelable {
    public static final Parcelable.Creator<Restriction> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(Constants.REASON)
    private String reason;

    public static final class Creator implements Parcelable.Creator<Restriction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Restriction createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new Restriction(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Restriction[] newArray(int i) {
            return new Restriction[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Restriction() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Restriction copy$default(Restriction restriction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = restriction.reason;
        }
        return restriction.copy(str);
    }

    public final String component1() {
        return this.reason;
    }

    public final Restriction copy(String reason) {
        j.g(reason, "reason");
        return new Restriction(reason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Restriction) && j.b(this.reason, ((Restriction) obj).reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public final void setReason(String str) {
        j.g(str, "<set-?>");
        this.reason = str;
    }

    public String toString() {
        return s.j("Restriction(reason=", this.reason, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.reason);
    }

    public Restriction(String reason) {
        j.g(reason, "reason");
        this.reason = reason;
    }

    public /* synthetic */ Restriction(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
