package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final android.support.customtabs.trusted.c mCallbackBinder;

    private TrustedWebActivityCallbackRemote(@NonNull android.support.customtabs.trusted.c cVar) {
        this.mCallbackBinder = cVar;
    }

    @Nullable
    public static TrustedWebActivityCallbackRemote fromBinder(@Nullable IBinder iBinder) {
        android.support.customtabs.trusted.c cVarAsInterface = iBinder == null ? null : android.support.customtabs.trusted.b.asInterface(iBinder);
        if (cVarAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(cVarAsInterface);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
