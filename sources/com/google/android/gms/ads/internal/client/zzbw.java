package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzbvn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbw extends zzaya implements zzbx {
    public zzbw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbx zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        zzbk zzbiVar = null;
        zzcv zzctVar = null;
        zzbn zzblVar = null;
        zzdt zzdrVar = null;
        zzcb zzbzVar = null;
        zzcs zzcsVar = null;
        zzbh zzbfVar = null;
        zzco zzcmVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzayb.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzd = zzd();
                parcel2.writeNoException();
                int i6 = zzayb.zza;
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzayb.zzb(parcel, zzm.CREATOR);
                zzayb.zzh(parcel);
                boolean zZze = zze(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
                }
                zzayb.zzh(parcel);
                zzdW(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcmVar = iInterfaceQueryLocalInterface2 instanceof zzco ? (zzco) iInterfaceQueryLocalInterface2 : new zzcm(strongBinder2);
                }
                zzayb.zzh(parcel);
                zzi(zzcmVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarZzn = zzn();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzrVarZzn);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                zzayb.zzh(parcel);
                zzo(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtf zzbtfVarZzb = zzbte.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzp(zzbtfVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbti zzbtiVarZzb = zzbth.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzayb.zzh(parcel);
                zzq(zzbtiVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                zzbdd zzbddVarZzb = zzbdc.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzx(zzbddVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbfVar = iInterfaceQueryLocalInterface3 instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface3 : new zzbf(strongBinder3);
                }
                zzayb.zzh(parcel);
                zzy(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = iInterfaceQueryLocalInterface4 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface4 : new zzcs(strongBinder4);
                }
                zzayb.zzh(parcel);
                zzY(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzz(zZza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i10 = zzayb.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 24:
                zzbvn zzbvnVarZzb = zzbvm.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzC(zzbvnVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzD(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzed zzedVarZzF = zzF();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzedVarZzF);
                return true;
            case 29:
                zzga zzgaVar = (zzga) zzayb.zzb(parcel, zzga.CREATOR);
                zzayb.zzh(parcel);
                zzG(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzeh zzehVar = (zzeh) zzayb.zzb(parcel, zzeh.CREATOR);
                zzayb.zzh(parcel);
                zzH(zzehVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                zzco zzcoVarZzv = zzv();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzcoVarZzv);
                return true;
            case 33:
                zzbk zzbkVarZzw = zzw();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbkVarZzw);
                return true;
            case 34:
                boolean zZza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzK(zZza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbzVar = iInterfaceQueryLocalInterface5 instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface5 : new zzbz(strongBinder5);
                }
                zzayb.zzh(parcel);
                zzj(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzk);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzayb.zzh(parcel);
                zzE(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzayb.zzb(parcel, zzx.CREATOR);
                zzayb.zzh(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbae zzbaeVarZze = zzbad.zze(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzJ(zzbaeVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzea zzeaVarZzt = zzt();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzeaVarZzt);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdrVar = iInterfaceQueryLocalInterface6 instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface6 : new zzdr(strongBinder6);
                }
                zzayb.zzh(parcel);
                zzP(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzayb.zzb(parcel, zzm.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzblVar = iInterfaceQueryLocalInterface7 instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface7 : new zzbl(strongBinder7);
                }
                zzayb.zzh(parcel);
                zzQ(zzmVar2, zzblVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzR(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzctVar = iInterfaceQueryLocalInterface8 instanceof zzcv ? (zzcv) iInterfaceQueryLocalInterface8 : new zzct(strongBinder8);
                }
                zzayb.zzh(parcel);
                zzS(zzctVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i11 = zzayb.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 47:
                long jZzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(jZzU);
                return true;
            case 48:
                long j = parcel.readLong();
                zzayb.zzh(parcel);
                zzT(j);
                parcel2.writeNoException();
                return true;
        }
    }
}
