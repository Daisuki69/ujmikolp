package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i4 = 0;
        float f = 0.0f;
        float f3 = 0.0f;
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MAX_VALUE;
        LandmarkParcel[] landmarkParcelArr = null;
        zza[] zzaVarArr = null;
        float f17 = -1.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f7 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) SafeParcelReader.createTypedArray(parcel, header, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    zzaVarArr = (zza[]) SafeParcelReader.createTypedArray(parcel, header, zza.CREATOR);
                    break;
                case 14:
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f17 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new FaceParcel(i, i4, f, f3, f7, f10, f14, f15, f16, landmarkParcelArr, f11, f12, f13, zzaVarArr, f17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel[] newArray(int i) {
        return new FaceParcel[i];
    }
}
