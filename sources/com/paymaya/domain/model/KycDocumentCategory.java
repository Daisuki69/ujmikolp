package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class KycDocumentCategory implements Parcelable {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ KycDocumentCategory[] $VALUES;
    public static final Parcelable.Creator<KycDocumentCategory> CREATOR;

    @InterfaceC1497a
    @InterfaceC1498b("category")
    private final String category;
    public static final KycDocumentCategory ID = new KycDocumentCategory("ID", 0, "ID");
    public static final KycDocumentCategory ADDITIONAL_DOCUMENT = new KycDocumentCategory("ADDITIONAL_DOCUMENT", 1, "ADDITIONAL_DOCUMENT");

    private static final /* synthetic */ KycDocumentCategory[] $values() {
        return new KycDocumentCategory[]{ID, ADDITIONAL_DOCUMENT};
    }

    static {
        KycDocumentCategory[] kycDocumentCategoryArr$values = $values();
        $VALUES = kycDocumentCategoryArr$values;
        $ENTRIES = v0.h(kycDocumentCategoryArr$values);
        CREATOR = new Parcelable.Creator<KycDocumentCategory>() { // from class: com.paymaya.domain.model.KycDocumentCategory.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KycDocumentCategory createFromParcel(Parcel parcel) {
                j.g(parcel, "parcel");
                return KycDocumentCategory.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KycDocumentCategory[] newArray(int i) {
                return new KycDocumentCategory[i];
            }
        };
    }

    private KycDocumentCategory(String str, int i, String str2) {
        this.category = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static KycDocumentCategory valueOf(String str) {
        return (KycDocumentCategory) Enum.valueOf(KycDocumentCategory.class, str);
    }

    public static KycDocumentCategory[] values() {
        return (KycDocumentCategory[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCategory() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(name());
    }
}
