package com.paymaya.ui.ekyc.view.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.ui.ekyc.view.widget.EDDInput;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        j.g(parcel, "parcel");
        return new EDDInput.MyState(parcel.readParcelable(EDDInput.MyState.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new EDDInput.MyState[i];
    }
}
