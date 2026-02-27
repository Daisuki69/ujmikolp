package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzenh implements zzeup {
    private final zzgpd zza;
    private final zzdqc zzb;
    private final zzdux zzc;
    private final zzenj zzd;

    public zzenh(zzgpd zzgpdVar, zzdqc zzdqcVar, zzdux zzduxVar, zzenj zzenjVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdqcVar;
        this.zzc = zzduxVar;
        this.zzd = zzenjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        zzbbz zzbbzVar = zzbci.zzmu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            zzenj zzenjVar = this.zzd;
            if (zzenjVar.zzd() != null) {
                zzeni zzeniVarZzd = zzenjVar.zzd();
                zzeniVarZzd.getClass();
                return zzgot.zza(zzeniVarZzd);
            }
        }
        if (zzghs.zzc((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbE)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgot.zza(new zzeni(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 1;
    }

    public final /* synthetic */ zzeni zzc() {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbE)).split(Global.SEMICOLON));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfea zzfeaVarZza = this.zzb.zza(str, new JSONObject());
                zzfeaVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmu)).booleanValue() || zZze) {
                    try {
                        zzbrl zzbrlVarZzC = zzfeaVarZza.zzC();
                        if (zzbrlVarZzC != null) {
                            bundle2.putString("sdk_version", zzbrlVarZzC.toString());
                        }
                    } catch (zzfdj unused) {
                    }
                }
                try {
                    zzbrl zzbrlVarZzB = zzfeaVarZza.zzB();
                    if (zzbrlVarZzB != null) {
                        bundle2.putString("adapter_version", zzbrlVarZzB.toString());
                    }
                } catch (zzfdj unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfdj unused3) {
            }
        }
        zzeni zzeniVar = new zzeni(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmu)).booleanValue()) {
            this.zzd.zzc(zzeniVar);
        }
        return zzeniVar;
    }
}
