package F1;

import We.s;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1520a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f1520a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f1520a) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i4)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                E1.g gVar = (E1.g) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i6 = e.f1521a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(s.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    gVar.e(bundle);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i10 = e.f1521a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(s.f(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    gVar.zzb(bundle2);
                }
                return true;
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i4)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                com.google.android.play.core.review.c cVar = (com.google.android.play.core.review.c) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i11 = J1.a.f2377a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(s.f(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                cVar.zzb(bundle3);
                return true;
        }
    }
}
