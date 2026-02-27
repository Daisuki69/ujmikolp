package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAllowedId implements Parcelable {
    public static final String ACTION_ALLOW = "ALLOW";
    public static final String ACTION_REQUIRE_SECONDARY_ID = "UI_REQUIRE_SECONDARY";

    @InterfaceC1497a
    @InterfaceC1498b("action")
    private final String action;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KycAllowedId> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<KycAllowedId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAllowedId createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycAllowedId(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAllowedId[] newArray(int i) {
            return new KycAllowedId[i];
        }
    }

    public KycAllowedId(int i, String key, String action) {
        j.g(key, "key");
        j.g(action, "action");
        this.id = i;
        this.key = key;
        this.action = action;
    }

    public static /* synthetic */ KycAllowedId copy$default(KycAllowedId kycAllowedId, int i, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycAllowedId.id;
        }
        if ((i4 & 2) != 0) {
            str = kycAllowedId.key;
        }
        if ((i4 & 4) != 0) {
            str2 = kycAllowedId.action;
        }
        return kycAllowedId.copy(i, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.action;
    }

    public final KycAllowedId copy(int i, String key, String action) {
        j.g(key, "key");
        j.g(action, "action");
        return new KycAllowedId(i, key, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAllowedId)) {
            return false;
        }
        KycAllowedId kycAllowedId = (KycAllowedId) obj;
        return this.id == kycAllowedId.id && j.b(this.key, kycAllowedId.key) && j.b(this.action, kycAllowedId.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final int getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.action.hashCode() + AbstractC1414e.c(this.id * 31, 31, this.key);
    }

    public String toString() {
        int i = this.id;
        String str = this.key;
        String str2 = this.action;
        StringBuilder sb2 = new StringBuilder("KycAllowedId(id=");
        sb2.append(i);
        sb2.append(", key=");
        sb2.append(str);
        sb2.append(", action=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.key);
        dest.writeString(this.action);
    }
}
