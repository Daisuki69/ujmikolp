package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecb {
    private final zzbbh zza;
    private final Context zzb;
    private final zzebg zzc;
    private final VersionInfoParcel zzd;

    public zzecb(Context context, VersionInfoParcel versionInfoParcel, zzbbh zzbbhVar, zzebg zzebgVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbbhVar;
        this.zzc = zzebgVar;
    }

    public final void zza(final boolean z4) {
        try {
            this.zzc.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // com.google.android.gms.internal.ads.zzfgm
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z4, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    public final /* synthetic */ Void zzb(boolean z4, SQLiteDatabase sQLiteDatabase) {
        if (z4) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbbn.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhiw e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbbn.zzaf.zzc zzcVarZzB = zzbbn.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzebv.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzebv.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzebv.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzcVarZzB.zzM(zzebv.zzd(sQLiteDatabase, 2));
            final zzbbn.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i4 = 0; i4 < size; i4++) {
                zzbbn.zzaf.zza zzaVar = (zzbbn.zzaf.zza) arrayList.get(i4);
                if (zzaVar.zzf() == zzbbn.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbbh zzbbhVar = this.zza;
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzeby
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbn.zzar.zza zzaVarZzs = zzbbn.zzar.zzs();
            zzaVarZzs.zzc(versionInfoParcel.buddyApkVersion);
            zzaVarZzs.zzg(versionInfoParcel.clientJarVersion);
            zzaVarZzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbbn.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzebz
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar2) {
                    zzbbn.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbbhVar.zzc(10004);
            zzebv.zzb(sQLiteDatabase);
        }
        return null;
    }
}
