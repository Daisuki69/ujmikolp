package com.google.android.gms.internal.mlkit_vision_face_bundled;

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
public final class zzsm implements zzrx {

    @Nullable
    private b zza;
    private final b zzb;
    private final zzrz zzc;

    public zzsm(Context context, zzrz zzrzVar) {
        this.zzc = zzrzVar;
        C0620a c0620a = C0620a.e;
        s.b(context);
        final q qVarC = s.a().c(c0620a);
        if (C0620a.f6974d.contains(new c("json"))) {
            this.zza = new j(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsj
                @Override // B2.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsl
                        @Override // Z0.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new j(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsk
            @Override // B2.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsi
                    @Override // Z0.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    public static d zzb(zzrz zzrzVar, zzrw zzrwVar) {
        int iZza = zzrzVar.zza();
        return zzrwVar.zza() != 0 ? d.a(zzrwVar.zze(iZza, false)) : d.b(zzrwVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrx
    public final void zza(zzrw zzrwVar) {
        if (this.zzc.zza() != 0) {
            ((r) this.zzb.get()).b(zzb(this.zzc, zzrwVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((r) bVar.get()).b(zzb(this.zzc, zzrwVar));
        }
    }
}
