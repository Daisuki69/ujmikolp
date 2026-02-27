package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.zzbbn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbh {
    private final zzbbm zza;
    private final zzbbn.zzt.zza zzb;
    private final boolean zzc;

    private zzbbh() {
        this.zzb = zzbbn.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbbm();
    }

    public static zzbbh zza() {
        return new zzbbh();
    }

    private final synchronized void zzd(int i) {
        zzbbn.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzk());
        zzbbl zzbblVar = new zzbbl(this.zza, zzaVar.zzbu().zzaN(), null);
        int i4 = i - 1;
        zzbblVar.zzb(i4);
        zzbblVar.zza();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i4, 10))));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqm.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i) {
        StringBuilder sb2;
        zzbbn.zzt.zza zzaVar = this.zzb;
        String strZzf = zzaVar.zzf();
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(zzaVar.zzbu().zzaN(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strZzf);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append(Global.NEWLINE);
        return sb2.toString();
    }

    public final synchronized void zzb(zzbbg zzbbgVar) {
        if (this.zzc) {
            try {
                zzbbgVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfE)).booleanValue()) {
                zze(i);
            } else {
                zzd(i);
            }
        }
    }

    public zzbbh(zzbbm zzbbmVar) {
        this.zzb = zzbbn.zzt.zzx();
        this.zza = zzbbmVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfD)).booleanValue();
    }
}
