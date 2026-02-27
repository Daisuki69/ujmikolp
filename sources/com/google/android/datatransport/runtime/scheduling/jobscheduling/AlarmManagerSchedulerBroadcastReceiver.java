package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import K.c;
import Z0.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c1.i;
import c1.s;
import i1.f;
import m1.AbstractC1844a;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9609a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        e eVarB = AbstractC1844a.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        f fVar = s.a().f9250d;
        i iVar = new i(queryParameter, bArrDecode, eVarB);
        I8.f fVar2 = new I8.f(4);
        fVar.getClass();
        fVar.e.execute(new c(fVar, iVar, i, fVar2));
    }
}
