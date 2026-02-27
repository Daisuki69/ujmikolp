package com.android.installreferrer.api;

import C1.c;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f9420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9421b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f9421b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f9420a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = C1.b.f667a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new C1.a(iBinder);
        }
        b bVar = this.f9421b;
        bVar.c = aVar;
        bVar.f9422a = 2;
        this.f9420a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f9421b;
        bVar.c = null;
        bVar.f9422a = 0;
        this.f9420a.onInstallReferrerServiceDisconnected();
    }
}
