package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import of.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Binder implements f {
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;

    public static f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f.f7262H);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof f)) {
            return (f) iInterfaceQueryLocalInterface;
        }
        d dVar = new d();
        dVar.f7261a = iBinder;
        return dVar;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        String str = f.f7262H;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) p.d(parcel));
                parcel2.writeNoException();
                p.e(parcel2, bundleNotifyNotificationWithChannel, 1);
                return true;
            case 3:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                cancelNotification((Bundle) p.d(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                int smallIconId = getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(smallIconId);
                return true;
            case 5:
                Bundle activeNotifications = getActiveNotifications();
                parcel2.writeNoException();
                p.e(parcel2, activeNotifications, 1);
                return true;
            case 6:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) p.d(parcel));
                parcel2.writeNoException();
                p.e(parcel2, bundleAreNotificationsEnabled, 1);
                return true;
            case 7:
                Bundle smallIconBitmap = getSmallIconBitmap();
                parcel2.writeNoException();
                p.e(parcel2, smallIconBitmap, 1);
                return true;
            case 8:
            default:
                return super.onTransact(i, parcel, parcel2, i4);
            case 9:
                String string = parcel.readString();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundleExtraCommand = extraCommand(string, (Bundle) p.d(parcel), parcel.readStrongBinder());
                parcel2.writeNoException();
                p.e(parcel2, bundleExtraCommand, 1);
                return true;
        }
    }
}
