package com.google.firebase.analytics.connector.internal;

import U1.g;
import Y1.b;
import Y1.c;
import Y1.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.h;
import b2.i;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import y2.d;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static b lambda$getComponents$0(InterfaceC0860b interfaceC0860b) {
        g gVar = (g) interfaceC0860b.get(g.class);
        Context context = (Context) interfaceC0860b.get(Context.class);
        d dVar = (d) interfaceC0860b.get(d.class);
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (c.c == null) {
            synchronized (c.class) {
                try {
                    if (c.c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f5905b)) {
                            ((i) dVar).c(e.f6733a, Y1.d.f6732a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.k());
                        }
                        c.c = new c(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return c.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<C0859a> getComponents() {
        K3.d dVarB = C0859a.b(b.class);
        dVarB.c(h.c(g.class));
        dVarB.c(h.c(Context.class));
        dVarB.c(h.c(d.class));
        dVarB.f = mg.c.f18414b;
        dVarB.f(2);
        return Arrays.asList(dVarB.d(), jk.b.e("fire-analytics", "23.0.0"));
    }
}
