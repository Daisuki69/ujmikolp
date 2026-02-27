package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AFa1fSDK {
    public final String[] values;

    public static final class AFa1wSDK implements IInterface {
        private final IBinder AFKeystoreWrapper;

        public AFa1wSDK(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final String AFKeystoreWrapper() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final boolean values() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static final class AFa1xSDK {
        final String AFInAppEventType;
        private final boolean valueOf;

        public AFa1xSDK(String str, boolean z4) {
            this.AFInAppEventType = str;
            this.valueOf = z4;
        }

        public final boolean values() {
            return this.valueOf;
        }
    }

    public AFa1fSDK() {
    }

    public static AFa1xSDK AFInAppEventParameterName(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1vSDK aFa1vSDK = new AFa1vSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1vSDK, 1)) {
                context.unbindService(aFa1vSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1vSDK.values) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1vSDK.values = true;
            IBinder iBinderPoll = aFa1vSDK.AFKeystoreWrapper.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1wSDK aFa1wSDK = new AFa1wSDK(iBinderPoll);
            return new AFa1xSDK(aFa1wSDK.AFKeystoreWrapper(), aFa1wSDK.values());
        } finally {
            context.unbindService(aFa1vSDK);
        }
    }

    public AFa1fSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.values = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains(TtmlNode.COMBINE_ALL)) {
            this.values = new String[]{TtmlNode.COMBINE_ALL};
        } else if (arrayList.isEmpty()) {
            this.values = null;
        } else {
            this.values = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public static final class AFa1vSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFKeystoreWrapper;
        boolean values;

        private AFa1vSDK() {
            this.AFKeystoreWrapper = new LinkedBlockingQueue<>(1);
            this.values = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFKeystoreWrapper.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ AFa1vSDK(byte b8) {
            this();
        }
    }
}
