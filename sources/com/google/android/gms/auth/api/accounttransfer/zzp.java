package com.google.android.gms.auth.api.accounttransfer;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i4 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                int i6 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(1);
                i4 = i6;
            } else if (fieldId == 2) {
                ArrayList arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzu.CREATOR);
                hashSet.add(2);
                arrayList = arrayListCreateTypedList;
            } else if (fieldId == 3) {
                int i10 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(3);
                i = i10;
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzs zzsVar2 = (zzs) SafeParcelReader.createParcelable(parcel, header, zzs.CREATOR);
                hashSet.add(4);
                zzsVar = zzsVar2;
            }
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzo(hashSet, i4, arrayList, i, zzsVar);
        }
        throw new SafeParcelReader.ParseException(s.f(iValidateObjectHeader, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
