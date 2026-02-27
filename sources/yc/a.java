package Yc;

import A7.j;
import Lh.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.paymaya.domain.store.C1261h;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f6783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.preference.a f6784b;
    public boolean c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null || this.c) {
            return;
        }
        j jVar = this.f6783a;
        String strD = this.f6784b.d();
        String strZ = this.f6784b.z();
        jVar.getClass();
        if (C2576A.H(((com.paymaya.data.preference.a) jVar.f).b())) {
            new h(((C1261h) jVar.e).a(strD, strZ), b.a(), 0).e();
        }
        this.c = true;
    }
}
