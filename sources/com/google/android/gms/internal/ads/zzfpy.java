package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.Hex;
import dOYHB6.yFtIp6.svM7M6;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpy {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfpf zzd;
    private boolean zze;

    public zzfpy(@NonNull Context context, @NonNull zzaxq zzaxqVar, @NonNull zzfpf zzfpfVar, boolean z4) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzaxqVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfpfVar;
        this.zze = z4;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private static String zzh(@NonNull zzaxs zzaxsVar) {
        zzaxv zzaxvVarZzi = zzaxw.zzi();
        zzaxvVarZzi.zza(zzaxsVar.zza().zza());
        zzaxvVarZzi.zzb(zzaxsVar.zza().zzb());
        zzaxvVarZzi.zzd(zzaxsVar.zza().zzd());
        zzaxvVarZzi.zze(zzaxsVar.zza().zze());
        zzaxvVarZzi.zzc(zzaxsVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzaxw) zzaxvVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zzd.zzb(i, j, str);
    }

    @Nullable
    private final zzaxw zzk(int i) {
        String string = i == 1 ? svM7M6.getString(this.zzb, zzg(), null) : svM7M6.getString(this.zzb, zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzhhb zzhhbVar = zzhhb.zzb;
            return zzaxw.zzh(zzhhb.zzr(bArrStringToBytes, 0, bArrStringToBytes.length), this.zze ? zzhhr.zza() : zzhhr.zzb());
        } catch (zzhiw unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzaxs zzaxsVar, @Nullable zzfpx zzfpxVar) {
        boolean z4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzaxw zzaxwVarZzk = zzk(1);
                String strZza = zzaxsVar.zza().zza();
                if (zzaxwVarZzk != null && zzaxwVarZzk.zza().equals(strZza)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZza);
                if (fileZze.exists()) {
                    boolean zIsDirectory = fileZze.isDirectory();
                    String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != zIsDirectory) {
                        str = "0";
                    }
                    boolean zIsFile = fileZze.isFile();
                    String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != zIsFile) {
                        str2 = "0";
                    }
                    z4 = false;
                    StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length());
                    sb2.append("d:");
                    sb2.append(str);
                    sb2.append(",f:");
                    sb2.append(str2);
                    zzj(4023, jCurrentTimeMillis2, sb2.toString());
                    zzi(4015, jCurrentTimeMillis2);
                } else {
                    z4 = false;
                    if (!fileZze.mkdirs()) {
                        boolean zCanWrite = fileZze.canWrite();
                        String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                        if (true != zCanWrite) {
                            str3 = "0";
                        }
                        zzj(4024, jCurrentTimeMillis2, "cw:".concat(str3));
                        zzi(4015, jCurrentTimeMillis2);
                        return false;
                    }
                }
                File fileZze2 = zze(strZza);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfps.zzb(file, zzaxsVar.zzb().zzv())) {
                    zzi(4016, jCurrentTimeMillis);
                    return z4;
                }
                if (!zzfps.zzb(file2, zzaxsVar.zzc().zzv())) {
                    zzi(4017, jCurrentTimeMillis);
                    return z4;
                }
                if (zzfpxVar != null && !zzfpxVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfps.zze(fileZze2);
                    return z4;
                }
                String strZzh = zzh(zzaxsVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = svM7M6.getString(sharedPreferences, zzg(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzg(), strZzh);
                if (string != null) {
                    editorEdit.putString(zzf(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return z4;
                }
                HashSet hashSet = new HashSet();
                zzaxw zzaxwVarZzk2 = zzk(1);
                if (zzaxwVarZzk2 != null) {
                    hashSet.add(zzaxwVarZzk2.zza());
                }
                zzaxw zzaxwVarZzk3 = zzk(2);
                if (zzaxwVarZzk3 != null) {
                    hashSet.add(zzaxwVarZzk3.zza());
                }
                boolean z5 = z4;
                File[] fileArrListFiles = new File(this.zza.getDir("pccache", z5 ? 1 : 0), this.zzc).listFiles();
                int length = fileArrListFiles.length;
                for (int i = z5 ? 1 : 0; i < length; i++) {
                    File file3 = fileArrListFiles[i];
                    if (!hashSet.contains(file3.getName())) {
                        zzfps.zze(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb(@NonNull zzaxs zzaxsVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfps.zzb(new File(zze(zzaxsVar.zza().zza()), "pcbc"), zzaxsVar.zzc().zzv())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzh = zzh(zzaxsVar);
                SharedPreferences.Editor editorEdit = this.zzb.edit();
                editorEdit.putString(zzg(), strZzh);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final zzfpq zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzaxw zzaxwVarZzk = zzk(1);
                if (zzaxwVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzaxwVarZzk.zza());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfpq(zzaxwVarZzk, file, file2, file3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzaxw zzaxwVarZzk = zzk(1);
                if (zzaxwVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzaxwVarZzk.zza());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
