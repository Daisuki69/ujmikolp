package com.paymaya.mayaui.kyczoloz.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        j.g(parcel, "parcel");
        parcel.readInt();
        return KycMinorDocument.ParentIdKycDocument.f12434b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new KycMinorDocument.ParentIdKycDocument[i];
    }
}
