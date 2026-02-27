package com.google.android.gms.internal.mlkit_vision_barcode;

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
public final class zzwx implements zzwf {

    @Nullable
    private b zza;
    private final b zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        C0620a c0620a = C0620a.e;
        s.b(context);
        final q qVarC = s.a().c(c0620a);
        if (C0620a.f6974d.contains(new c("json"))) {
            this.zza = new j(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // B2.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // Z0.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new j(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // B2.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // Z0.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    public static d zzb(zzwh zzwhVar, zzwe zzweVar) {
        int iZza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? d.a(zzweVar.zze(iZza, false)) : d.b(zzweVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((r) this.zzb.get()).b(zzb(this.zzc, zzweVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((r) bVar.get()).b(zzb(this.zzc, zzweVar));
        }
    }
}
