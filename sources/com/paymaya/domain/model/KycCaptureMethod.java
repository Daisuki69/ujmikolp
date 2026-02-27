package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCaptureMethod implements Parcelable {
    public static final Parcelable.Creator<KycCaptureMethod> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    public static final class Creator implements Parcelable.Creator<KycCaptureMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCaptureMethod createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycCaptureMethod(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCaptureMethod[] newArray(int i) {
            return new KycCaptureMethod[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycCaptureMethod() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycCaptureMethod copy$default(KycCaptureMethod kycCaptureMethod, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycCaptureMethod.id;
        }
        if ((i4 & 2) != 0) {
            str = kycCaptureMethod.method;
        }
        return kycCaptureMethod.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.method;
    }

    public final KycCaptureMethod copy(int i, String method) {
        j.g(method, "method");
        return new KycCaptureMethod(i, method);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCaptureMethod)) {
            return false;
        }
        KycCaptureMethod kycCaptureMethod = (KycCaptureMethod) obj;
        return this.id == kycCaptureMethod.id && j.b(this.method, kycCaptureMethod.method);
    }

    public final int getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "KycCaptureMethod(id=" + this.id + ", method=" + this.method + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.method);
    }

    public KycCaptureMethod(int i, String method) {
        j.g(method, "method");
        this.id = i;
        this.method = method;
    }

    public /* synthetic */ KycCaptureMethod(int i, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str);
    }
}
