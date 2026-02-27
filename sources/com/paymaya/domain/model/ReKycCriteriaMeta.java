package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycCriteriaMeta implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaMeta> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final String meta;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaMeta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaMeta createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReKycCriteriaMeta(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaMeta[] newArray(int i) {
            return new ReKycCriteriaMeta[i];
        }
    }

    public ReKycCriteriaMeta(String str) {
        this.meta = str;
    }

    public static /* synthetic */ ReKycCriteriaMeta copy$default(ReKycCriteriaMeta reKycCriteriaMeta, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reKycCriteriaMeta.meta;
        }
        return reKycCriteriaMeta.copy(str);
    }

    public final String component1() {
        return this.meta;
    }

    public final ReKycCriteriaMeta copy(String str) {
        return new ReKycCriteriaMeta(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReKycCriteriaMeta) && j.b(this.meta, ((ReKycCriteriaMeta) obj).meta);
    }

    public final String getMeta() {
        return this.meta;
    }

    public int hashCode() {
        String str = this.meta;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("ReKycCriteriaMeta(meta=", this.meta, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.meta);
    }
}
