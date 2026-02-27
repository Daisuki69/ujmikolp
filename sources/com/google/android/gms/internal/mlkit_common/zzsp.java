package com.google.android.gms.internal.mlkit_common;

import B2.b;
import Z0.c;
import Z0.d;
import Z0.f;
import a1.C0620a;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b2.j;
import c1.q;
import c1.r;
import c1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsp implements zzrz {

    @Nullable
    private b zza;
    private final b zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        C0620a c0620a = C0620a.e;
        s.b(context);
        final q qVarC = s.a().c(c0620a);
        if (C0620a.f6974d.contains(new c("json"))) {
            this.zza = new j(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // B2.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // Z0.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new j(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // B2.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // Z0.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    public static d zzb(zzsb zzsbVar, zzry zzryVar) {
        return d.b(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((r) this.zzb.get()).b(zzb(this.zzc, zzryVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((r) bVar.get()).b(zzb(this.zzc, zzryVar));
        }
    }
}
