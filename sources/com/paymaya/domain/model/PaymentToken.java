package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentToken implements Parcelable {
    public static final Parcelable.Creator<PaymentToken> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<PaymentToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentToken createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PaymentToken(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentToken[] newArray(int i) {
            return new PaymentToken[i];
        }
    }

    public PaymentToken(String id) {
        j.g(id, "id");
        this.id = id;
    }

    public static /* synthetic */ PaymentToken copy$default(PaymentToken paymentToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentToken.id;
        }
        return paymentToken.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final PaymentToken copy(String id) {
        j.g(id, "id");
        return new PaymentToken(id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentToken) && j.b(this.id, ((PaymentToken) obj).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return s.j("PaymentToken(id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
    }
}
