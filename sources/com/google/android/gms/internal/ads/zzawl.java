package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawl extends zzaxl {
    private static final zzaxm zzh = new zzaxm();
    private final zzarp zzi;
    private final Context zzj;
    private final zzatr zzk;

    public zzawl(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4, Context context, zzari zzariVar, zzarp zzarpVar, zzatr zzatrVar) {
        super(zzavxVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", zzarwVar, i, 27);
        this.zzj = context;
        this.zzi = zzarpVar;
        this.zzk = zzatrVar;
    }

    private final zzato zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        int iIntValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcY)).booleanValue() ? ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzde)).intValue() : this.zzi.zzb();
        zzato zzatoVar = new zzato((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatr zzatrVar = this.zzk;
        if (zzatrVar == null || zzatrVar.zza() == null) {
            str = ExifInterface.LONGITUDE_EAST;
        } else {
            try {
                str = (String) zzatrVar.zza().get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = ExifInterface.LONGITUDE_EAST;
            }
        }
        zzatoVar.zza = str;
        return zzatoVar;
    }

    private final String zzd() {
        try {
            zzavx zzavxVar = this.zza;
            if (zzavxVar.zzm() != null) {
                zzavxVar.zzm().get();
            }
            zzast zzastVarZzl = zzavxVar.zzl();
            if (zzastVarZzl == null || !zzastVarZzl.zza()) {
                return null;
            }
            return zzastVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzato zzatoVarZzc;
        zzato zzatoVar;
        zzaxm zzaxmVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzaxmVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzato zzatoVar2 = (zzato) atomicReferenceZza.get();
                if (zzatoVar2 == null || zzawa.zzc(zzatoVar2.zza) || zzatoVar2.zza.equals(ExifInterface.LONGITUDE_EAST) || zzatoVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzawa.zzc(null)) {
                        zzawa.zzc(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    if (this.zzk != null) {
                        zzatoVarZzc = zzc();
                    } else {
                        Boolean boolValueOf = Boolean.valueOf(i == 3 && !this.zzi.zza());
                        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcM);
                        String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcL)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzawa.zzc(strZzb)) {
                            strZzb = zzd();
                        }
                        zzato zzatoVar3 = new zzato((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        if (zzawa.zzc(zzatoVar3.zza) || zzatoVar3.zza.equals(ExifInterface.LONGITUDE_EAST)) {
                            int i4 = i - 1;
                            if (i4 == 3) {
                                String strZzd = zzd();
                                if (!zzawa.zzc(strZzd)) {
                                    zzatoVar3.zza = strZzd;
                                }
                            } else if (i4 == 4) {
                                throw null;
                            }
                        }
                        zzatoVarZzc = zzatoVar3;
                    }
                    atomicReferenceZza.set(zzatoVarZzc);
                }
                zzatoVar = (zzato) atomicReferenceZza.get();
            } finally {
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            if (zzatoVar != null) {
                try {
                    zzarwVar.zzo(zzatoVar.zza);
                    zzarwVar.zzu(zzatoVar.zzb);
                    zzarwVar.zzt(zzatoVar.zzc);
                    zzarwVar.zzD(zzatoVar.zzd);
                    zzarwVar.zzE(zzatoVar.zze);
                } finally {
                }
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzb = zzawa.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcN));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawa.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcO)))));
            }
            Context context = this.zzj;
            return zzaxo.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
