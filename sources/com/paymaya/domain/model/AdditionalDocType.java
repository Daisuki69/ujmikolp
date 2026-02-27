package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AdditionalDocType implements Parcelable {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ AdditionalDocType[] $VALUES;
    public static final Parcelable.Creator<AdditionalDocType> CREATOR;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;
    public static final AdditionalDocType BIRTH_CERTIFICATE = new AdditionalDocType("BIRTH_CERTIFICATE", 0, "BIRTH_CERTIFICATE");
    public static final AdditionalDocType PARENT_GUARDIAN_ID = new AdditionalDocType("PARENT_GUARDIAN_ID", 1, "PARENT_GUARDIAN_ID");
    public static final AdditionalDocType PARENTAL_CONSENT = new AdditionalDocType("PARENTAL_CONSENT", 2, "PARENTAL_CONSENT");
    public static final AdditionalDocType AMLC_COR = new AdditionalDocType("AMLC_COR", 3, "AMLC_COR");
    public static final AdditionalDocType AMLC_PCOR = new AdditionalDocType("AMLC_PCOR", 4, "AMLC_PCOR");
    public static final AdditionalDocType SSNE = new AdditionalDocType("SSNE", 5, "SSNE");

    private static final /* synthetic */ AdditionalDocType[] $values() {
        return new AdditionalDocType[]{BIRTH_CERTIFICATE, PARENT_GUARDIAN_ID, PARENTAL_CONSENT, AMLC_COR, AMLC_PCOR, SSNE};
    }

    static {
        AdditionalDocType[] additionalDocTypeArr$values = $values();
        $VALUES = additionalDocTypeArr$values;
        $ENTRIES = v0.h(additionalDocTypeArr$values);
        CREATOR = new Parcelable.Creator<AdditionalDocType>() { // from class: com.paymaya.domain.model.AdditionalDocType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalDocType createFromParcel(Parcel parcel) {
                j.g(parcel, "parcel");
                return AdditionalDocType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalDocType[] newArray(int i) {
                return new AdditionalDocType[i];
            }
        };
    }

    private AdditionalDocType(String str, int i, String str2) {
        this.type = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static AdditionalDocType valueOf(String str) {
        return (AdditionalDocType) Enum.valueOf(AdditionalDocType.class, str);
    }

    public static AdditionalDocType[] values() {
        return (AdditionalDocType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(name());
    }
}
