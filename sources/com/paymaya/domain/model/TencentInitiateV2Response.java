package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TencentInitiateV2Response implements Parcelable {
    public static final Parcelable.Creator<TencentInitiateV2Response> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("sdkToken")
    private final String sdkToken;

    public static final class Creator implements Parcelable.Creator<TencentInitiateV2Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TencentInitiateV2Response createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new TencentInitiateV2Response(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TencentInitiateV2Response[] newArray(int i) {
            return new TencentInitiateV2Response[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TencentInitiateV2Response() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TencentInitiateV2Response copy$default(TencentInitiateV2Response tencentInitiateV2Response, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tencentInitiateV2Response.sdkToken;
        }
        return tencentInitiateV2Response.copy(str);
    }

    public final String component1() {
        return this.sdkToken;
    }

    public final TencentInitiateV2Response copy(String str) {
        return new TencentInitiateV2Response(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TencentInitiateV2Response) && j.b(this.sdkToken, ((TencentInitiateV2Response) obj).sdkToken);
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
        return s.j("TencentInitiateV2Response(sdkToken=", this.sdkToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.sdkToken);
    }

    public TencentInitiateV2Response(String str) {
        this.sdkToken = str;
    }

    public /* synthetic */ TencentInitiateV2Response(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
