package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import cj.M;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCmsContent implements Parcelable {
    public static final Parcelable.Creator<KycCmsContent> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final KycCmsContentData data;

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final Map<String, String> meta;

    public static final class Creator implements Parcelable.Creator<KycCmsContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsContent createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            KycCmsContentData kycCmsContentDataCreateFromParcel = KycCmsContentData.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i4 = 0; i4 != i; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new KycCmsContent(kycCmsContentDataCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsContent[] newArray(int i) {
            return new KycCmsContent[i];
        }
    }

    public KycCmsContent(KycCmsContentData data, Map<String, String> meta) {
        j.g(data, "data");
        j.g(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycCmsContent copy$default(KycCmsContent kycCmsContent, KycCmsContentData kycCmsContentData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            kycCmsContentData = kycCmsContent.data;
        }
        if ((i & 2) != 0) {
            map = kycCmsContent.meta;
        }
        return kycCmsContent.copy(kycCmsContentData, map);
    }

    public final KycCmsContentData component1() {
        return this.data;
    }

    public final Map<String, String> component2() {
        return this.meta;
    }

    public final KycCmsContent copy(KycCmsContentData data, Map<String, String> meta) {
        j.g(data, "data");
        j.g(meta, "meta");
        return new KycCmsContent(data, meta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCmsContent)) {
            return false;
        }
        KycCmsContent kycCmsContent = (KycCmsContent) obj;
        return j.b(this.data, kycCmsContent.data) && j.b(this.meta, kycCmsContent.meta);
    }

    public final KycCmsContentData getData() {
        return this.data;
    }

    public final Map<String, String> getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return this.meta.hashCode() + (this.data.hashCode() * 31);
    }

    public String toString() {
        return "KycCmsContent(data=" + this.data + ", meta=" + this.meta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.data.writeToParcel(dest, i);
        Map<String, String> map = this.meta;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public /* synthetic */ KycCmsContent(KycCmsContentData kycCmsContentData, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kycCmsContentData, (i & 2) != 0 ? M.e() : map);
    }
}
