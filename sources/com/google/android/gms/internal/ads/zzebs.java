package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebs extends zzebt {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzcuw zzc;
    private final TelephonyManager zzd;
    private final zzebk zze;
    private zzbbn.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbn.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbn.zzaf.zzd zzdVar = zzbbn.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbn.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbn.zzaf.zzd zzdVar2 = zzbbn.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbn.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzebs(Context context, zzcuw zzcuwVar, zzebk zzebkVar, zzebg zzebgVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzebgVar, zzgVar);
        this.zzb = context;
        this.zzc = zzcuwVar;
        this.zze = zzebkVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    public static final /* synthetic */ zzbbn.zzaf.zzd zze(Bundle bundle) {
        return (zzbbn.zzaf.zzd) zzg.get(zzfdr.zza(zzfdr.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbn.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbbn.zzq zzg(boolean z4) {
        return z4 ? zzbbn.zzq.ENUM_TRUE : zzbbn.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z4) {
        zzgot.zzq(this.zzc.zza(new Bundle()), new zzebr(this, z4), zzbzh.zzg);
    }

    public final /* synthetic */ zzbbn.zzab zzb(Bundle bundle) {
        zzbbn.zzab.zzb zzbVar;
        zzbbn.zzab.zza zzaVarZzq = zzbbn.zzab.zzq();
        int i = bundle.getInt("cnt", -2);
        int i4 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = zzbbn.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbbn.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZzq.zzc(zzbbn.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZzq.zzc(zzbbn.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbbn.zzab.zzc.WIFI);
            }
            switch (i4) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbn.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbbn.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbn.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbn.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    public final /* synthetic */ byte[] zzc(boolean z4, ArrayList arrayList, zzbbn.zzab zzabVar, zzbbn.zzaf.zzd zzdVar) {
        zzbbn.zzaf.zza.C0028zza c0028zzaZzz = zzbbn.zzaf.zza.zzz();
        c0028zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c0028zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0028zzaZzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        zzebk zzebkVar = this.zze;
        c0028zzaZzz.zzk(zzebkVar.zzf());
        c0028zzaZzz.zzo(zzebkVar.zzj());
        c0028zzaZzz.zzR(zzebkVar.zzd());
        c0028zzaZzz.zzZ(zzdVar);
        c0028zzaZzz.zzz(zzabVar);
        c0028zzaZzz.zzV(this.zzf);
        c0028zzaZzz.zzg(zzg(z4));
        c0028zzaZzz.zzad(zzebkVar.zzb());
        c0028zzaZzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        c0028zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0028zzaZzz.zzbu().zzaN();
    }

    public final /* synthetic */ zzebk zzd() {
        return this.zze;
    }
}
