package com.google.android.gms.phenotype;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Deprecated
public abstract class PhenotypeFlag<T> {
    private static final Object zzak = new Object();

    @SuppressLint({"StaticFieldLeak"})
    private static Context zzal;
    private static boolean zzam;
    private static Boolean zzan;
    private final Factory zzao;
    final String zzap;
    private final String zzaq;
    private final T zzar;
    private T zzas;

    @KeepForSdk
    public static class Factory {
        private final String zzax;
        private final Uri zzay;
        private final String zzaz;
        private final String zzba;
        private final boolean zzbb;
        private final boolean zzbc;

        @KeepForSdk
        public Factory(Uri uri) {
            this(null, uri, "", "", false, false);
        }

        @KeepForSdk
        public PhenotypeFlag<String> createFlag(String str, String str2) {
            return PhenotypeFlag.zza(this, str, str2);
        }

        @KeepForSdk
        public Factory withGservicePrefix(String str) {
            boolean z4 = this.zzbb;
            if (z4) {
                throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
            }
            return new Factory(this.zzax, this.zzay, str, this.zzba, z4, this.zzbc);
        }

        @KeepForSdk
        public Factory withPhenotypePrefix(String str) {
            return new Factory(this.zzax, this.zzay, this.zzaz, str, this.zzbb, this.zzbc);
        }

        private Factory(String str, Uri uri, String str2, String str3, boolean z4, boolean z5) {
            this.zzax = str;
            this.zzay = uri;
            this.zzaz = str2;
            this.zzba = str3;
            this.zzbb = z4;
            this.zzbc = z5;
        }
    }

    public interface zza<V> {
        V zzh();
    }

    private PhenotypeFlag(Factory factory, String str, T t5) {
        this.zzas = null;
        if (factory.zzax == null && factory.zzay == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (factory.zzax != null && factory.zzay != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzao = factory;
        String strValueOf = String.valueOf(factory.zzaz);
        String strValueOf2 = String.valueOf(str);
        this.zzaq = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        String strValueOf3 = String.valueOf(factory.zzba);
        String strValueOf4 = String.valueOf(str);
        this.zzap = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        this.zzar = t5;
    }

    @KeepForSdk
    public static void maybeInit(Context context) {
        Context applicationContext;
        com.google.android.gms.internal.phenotype.zzh.maybeInit(context);
        if (zzal == null) {
            com.google.android.gms.internal.phenotype.zzh.init(context);
            synchronized (zzak) {
                try {
                    if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                        context = applicationContext;
                    }
                    if (zzal != context) {
                        zzan = null;
                    }
                    zzal = context;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzam = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PhenotypeFlag<String> zza(Factory factory, String str, String str2) {
        return new zzs(factory, str, str2);
    }

    @TargetApi(24)
    private final T zzd() {
        if (zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String strValueOf = String.valueOf(this.zzap);
            Log.w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
            return null;
        }
        if (this.zzao.zzay != null) {
            final com.google.android.gms.phenotype.zza zzaVarZza = com.google.android.gms.phenotype.zza.zza(zzal.getContentResolver(), this.zzao.zzay);
            String str = (String) zza(new zza(this, zzaVarZza) { // from class: com.google.android.gms.phenotype.zzo
                private final PhenotypeFlag zzat;
                private final zza zzau;

                {
                    this.zzat = this;
                    this.zzau = zzaVarZza;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
                public final Object zzh() {
                    return this.zzau.zza().get(this.zzat.zzap);
                }
            });
            if (str != null) {
                return zza(str);
            }
        } else if (this.zzao.zzax != null && (Build.VERSION.SDK_INT < 24 || zzal.isDeviceProtectedStorage() || ((UserManager) zzal.getSystemService(UserManager.class)).isUserUnlocked())) {
            SharedPreferences sharedPreferences = zzal.getSharedPreferences(this.zzao.zzax, 0);
            if (sharedPreferences.contains(this.zzap)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    private final T zze() {
        String str;
        if (this.zzao.zzbb || !zzf() || (str = (String) zza(new zza(this) { // from class: com.google.android.gms.phenotype.zzp
            private final PhenotypeFlag zzat;

            {
                this.zzat = this;
            }

            @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
            public final Object zzh() {
                return this.zzat.zzg();
            }
        })) == null) {
            return null;
        }
        return zza(str);
    }

    private static boolean zzf() {
        if (zzan == null) {
            Context context = zzal;
            if (context == null) {
                return false;
            }
            zzan = Boolean.valueOf(PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzan.booleanValue();
    }

    @KeepForSdk
    public T get() {
        if (zzal == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.zzao.zzbc) {
            T tZze = zze();
            if (tZze != null) {
                return tZze;
            }
            T tZzd = zzd();
            if (tZzd != null) {
                return tZzd;
            }
        } else {
            T tZzd2 = zzd();
            if (tZzd2 != null) {
                return tZzd2;
            }
            T tZze2 = zze();
            if (tZze2 != null) {
                return tZze2;
            }
        }
        return this.zzar;
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(String str);

    public final /* synthetic */ String zzg() {
        return com.google.android.gms.internal.phenotype.zzf.zza(zzal.getContentResolver(), this.zzaq, (String) null);
    }

    public /* synthetic */ PhenotypeFlag(Factory factory, String str, Object obj, zzr zzrVar) {
        this(factory, str, obj);
    }

    private static <V> V zza(zza<V> zzaVar) {
        try {
            return zzaVar.zzh();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzaVar.zzh();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static boolean zza(final String str, boolean z4) {
        final boolean z5 = false;
        if (zzf()) {
            return ((Boolean) zza(new zza(str, z5) { // from class: com.google.android.gms.phenotype.zzq
                private final String zzav;
                private final boolean zzaw = false;

                {
                    this.zzav = str;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
                public final Object zzh() {
                    return Boolean.valueOf(com.google.android.gms.internal.phenotype.zzf.zza(PhenotypeFlag.zzal.getContentResolver(), this.zzav, this.zzaw));
                }
            })).booleanValue();
        }
        return false;
    }
}
