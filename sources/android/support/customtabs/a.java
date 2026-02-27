package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import k2.v0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f7251a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7251a;
    }

    @Override // android.support.customtabs.c
    public final void extraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeString(str);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeString(str);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) v0.a(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onActivityLayout(int i, int i4, int i6, int i10, int i11, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i4);
            parcelObtain.writeInt(i6);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onActivityResized(int i, int i4, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i4);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onMessageChannelReady(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onMinimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeInt(i);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onPostMessage(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeString(str);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z4, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            parcelObtain.writeInt(i);
            v0.b(parcelObtain, uri, 0);
            parcelObtain.writeInt(z4 ? 1 : 0);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onUnminimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.c
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f7252C);
            v0.b(parcelObtain, bundle, 0);
            this.f7251a.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
