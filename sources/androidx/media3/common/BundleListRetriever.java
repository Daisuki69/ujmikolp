package androidx.media3.common;

import O1.O;
import O1.S;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE;
    private final S list;

    static {
        SUGGESTED_MAX_IPC_SIZE = Util.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BundleListRetriever(List<Bundle> list) {
        this.list = S.k(list);
    }

    public static S getList(IBinder iBinder) {
        return iBinder instanceof BundleListRetriever ? ((BundleListRetriever) iBinder).list : getListFromRemoteBinder(iBinder);
    }

    @VisibleForTesting
    public static S getListFromRemoteBinder(IBinder iBinder) {
        int i;
        O oJ = S.j();
        int i4 = 0;
        int i6 = 1;
        while (i6 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i4);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            oJ.a((Bundle) Assertions.checkNotNull(parcelObtain2.readBundle()));
                            i4++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i6 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return oJ.g();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i4) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i4);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i6 = parcel.readInt();
        while (i6 < size && parcel2.dataSize() < SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.list.get(i6));
            i6++;
        }
        parcel2.writeInt(i6 < size ? 2 : 0);
        return true;
    }
}
