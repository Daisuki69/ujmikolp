package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycUploadGuideError implements Parcelable {
    public static final Parcelable.Creator<KycUploadGuideError> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String message;

    public static final class Creator implements Parcelable.Creator<KycUploadGuideError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUploadGuideError createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycUploadGuideError(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUploadGuideError[] newArray(int i) {
            return new KycUploadGuideError[i];
        }
    }

    public KycUploadGuideError() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycUploadGuideError copy$default(KycUploadGuideError kycUploadGuideError, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycUploadGuideError.id;
        }
        if ((i & 2) != 0) {
            str = kycUploadGuideError.code;
        }
        if ((i & 4) != 0) {
            str2 = kycUploadGuideError.message;
        }
        return kycUploadGuideError.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.message;
    }

    public final KycUploadGuideError copy(Integer num, String str, String str2) {
        return new KycUploadGuideError(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUploadGuideError)) {
            return false;
        }
        KycUploadGuideError kycUploadGuideError = (KycUploadGuideError) obj;
        return j.b(this.id, kycUploadGuideError.id) && j.b(this.code, kycUploadGuideError.code) && j.b(this.message, kycUploadGuideError.message);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.code;
        return s.p(AbstractC1213b.O(num, "KycUploadGuideError(id=", ", code=", str, ", message="), this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.code);
        dest.writeString(this.message);
    }

    public KycUploadGuideError(Integer num, String str, String str2) {
        this.id = num;
        this.code = str;
        this.message = str2;
    }

    public /* synthetic */ KycUploadGuideError(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
