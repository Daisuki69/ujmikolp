package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i4 = 0;
        boolean z4 = false;
        int i6 = 0;
        int i10 = 0;
        boolean z5 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        String strCreateString = null;
        zzr[] zzrVarArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    zzrVarArr = (zzr[]) SafeParcelReader.createTypedArray(parcel, header, zzr.CREATOR);
                    break;
                case 9:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzr(strCreateString, i, i4, z4, i6, i10, zzrVarArr, z5, z8, z9, z10, z11, z12, z13, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
