package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TencentCompleteRequest implements Parcelable {
    public static final Parcelable.Creator<TencentCompleteRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("sdkToken")
    private final String sdkToken;

    public static final class Creator implements Parcelable.Creator<TencentCompleteRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TencentCompleteRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new TencentCompleteRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TencentCompleteRequest[] newArray(int i) {
            return new TencentCompleteRequest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TencentCompleteRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TencentCompleteRequest copy$default(TencentCompleteRequest tencentCompleteRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tencentCompleteRequest.sdkToken;
        }
        return tencentCompleteRequest.copy(str);
    }

    public final String component1() {
        return this.sdkToken;
    }

    public final TencentCompleteRequest copy(String str) {
        return new TencentCompleteRequest(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TencentCompleteRequest) && j.b(this.sdkToken, ((TencentCompleteRequest) obj).sdkToken);
    }

    public final String getSdkToken() {
        return this.sdkToken;
    }

    public int hashCode() {
        String str = this.sdkToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("TencentCompleteRequest(sdkToken=", this.sdkToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.sdkToken);
    }

    public TencentCompleteRequest(String str) {
        this.sdkToken = str;
    }

    public /* synthetic */ TencentCompleteRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
