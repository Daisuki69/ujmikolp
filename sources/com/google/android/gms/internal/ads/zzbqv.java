package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbqv extends zzaya implements zzbqw {
    public zzbqv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbqw ? (zzbqw) iInterfaceQueryLocalInterface : new zzbqu(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.zzbqv, com.google.android.gms.internal.ads.zzbqw] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzbqt] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbqq] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.google.android.gms.internal.ads.zzbqt] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.google.android.gms.internal.ads.zzbqk] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzbqq] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.gms.internal.ads.zzbqh] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbqk] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.zzbqn] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.zzbqz] */
    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        IInterface zzbqfVar = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzayb.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzayb.zzb(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqfVar = iInterfaceQueryLocalInterface instanceof zzbqz ? (zzbqz) iInterfaceQueryLocalInterface : new zzbqx(strongBinder);
            }
            zzayb.zzh(parcel);
            zze(iObjectWrapperAsInterface, string, bundle, bundle2, zzrVar, zzbqfVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbrl zzbrlVarZzf = zzf();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, zzbrlVarZzf);
        } else if (i == 3) {
            zzbrl zzbrlVarZzg = zzg();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, zzbrlVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzed zzedVarZzh = zzh();
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzedVarZzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface2 instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface2 : new zzbqi(strongBinder2);
                    }
                    ?? r52 = zzbqfVar;
                    zzbpd zzbpdVarZzb = zzbpc.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzayb.zzh(parcel);
                    zzi(string2, string3, zzmVar, iObjectWrapperAsInterface2, r52, zzbpdVarZzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface3 instanceof zzbqn ? (zzbqn) iInterfaceQueryLocalInterface3 : new zzbql(strongBinder3);
                    }
                    zzbpd zzbpdVarZzb2 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzj(string4, string5, zzmVar2, iObjectWrapperAsInterface3, zzbqfVar, zzbpdVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zZzk = zzk(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzk ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface4 instanceof zzbqt ? (zzbqt) iInterfaceQueryLocalInterface4 : new zzbqr(strongBinder4);
                    }
                    zzbpd zzbpdVarZzb3 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzl(string6, string7, zzmVar3, iObjectWrapperAsInterface5, zzbqfVar, zzbpdVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zZzm = zzm(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzm ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface5 instanceof zzbqq ? (zzbqq) iInterfaceQueryLocalInterface5 : new zzbqo(strongBinder5);
                    }
                    zzbpd zzbpdVarZzb4 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzn(string8, string9, zzmVar4, iObjectWrapperAsInterface7, zzbqfVar, zzbpdVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzayb.zzh(parcel);
                    zzo(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface6 instanceof zzbqt ? (zzbqt) iInterfaceQueryLocalInterface6 : new zzbqr(strongBinder6);
                    }
                    zzbpd zzbpdVarZzb5 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzp(string11, string12, zzmVar5, iObjectWrapperAsInterface8, zzbqfVar, zzbpdVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface7 instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface7 : new zzbqi(strongBinder7);
                    }
                    ?? r53 = zzbqfVar;
                    zzbpd zzbpdVarZzb6 = zzbpc.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzayb.zzh(parcel);
                    zzq(string13, string14, zzmVar6, iObjectWrapperAsInterface9, r53, zzbpdVarZzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface8 instanceof zzbqq ? (zzbqq) iInterfaceQueryLocalInterface8 : new zzbqo(strongBinder8);
                    }
                    zzbpd zzbpdVarZzb7 = zzbpc.zzb(parcel.readStrongBinder());
                    zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                    zzayb.zzh(parcel);
                    zzr(string15, string16, zzmVar7, iObjectWrapperAsInterface10, zzbqfVar, zzbpdVarZzb7, zzbflVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqfVar = iInterfaceQueryLocalInterface9 instanceof zzbqh ? (zzbqh) iInterfaceQueryLocalInterface9 : new zzbqf(strongBinder9);
                    }
                    zzbpd zzbpdVarZzb8 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzs(string17, string18, zzmVar8, iObjectWrapperAsInterface11, zzbqfVar, zzbpdVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzayb.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
