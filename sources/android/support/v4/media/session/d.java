package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7303a;

    public d() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f7303a = new WeakReference(null);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                if (this.f7303a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 2:
                throw new AssertionError();
            case 3:
                if (this.f7303a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 4:
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                parcel.readInt();
                if (this.f7303a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.f7303a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.f7303a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 13:
                if (this.f7303a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i4);
        }
    }
}
