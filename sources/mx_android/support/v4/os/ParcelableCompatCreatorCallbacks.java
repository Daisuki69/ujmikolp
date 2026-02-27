package mx_android.support.v4.os;

import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
