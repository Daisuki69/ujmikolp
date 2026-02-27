package android.support.v4.os;

import A1.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import b.b;
import b.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7308a;

    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        b bVar = this.f7308a;
        if (bVar != null) {
            try {
                bVar.d(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f7308a == null) {
                    this.f7308a = new c(this);
                }
                parcel.writeStrongBinder(this.f7308a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
