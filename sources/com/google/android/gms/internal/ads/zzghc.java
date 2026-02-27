package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghc {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z4, String str, char c) {
        if (!z4) {
            throw new IllegalArgumentException(zzghs.zzd(str, Character.valueOf(c)));
        }
    }

    public static void zzd(boolean z4, String str, int i) {
        if (!z4) {
            throw new IllegalArgumentException(zzghs.zzd(str, Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z4, String str, long j) {
        if (!z4) {
            throw new IllegalArgumentException(zzghs.zzd(str, Long.valueOf(j)));
        }
    }

    public static void zzf(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(zzghs.zzd(str, obj));
        }
    }

    public static void zzg(boolean z4, String str, int i, int i4) {
        if (!z4) {
            throw new IllegalArgumentException(zzghs.zzd(str, Integer.valueOf(i), Integer.valueOf(i4)));
        }
    }

    public static void zzh(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void zzj(boolean z4, String str, Object obj, Object obj2) {
        if (!z4) {
            throw new IllegalStateException(zzghs.zzd(str, obj, obj2));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzghs.zzd(str, obj2));
    }

    public static int zzm(int i, int i4, String str) {
        String strZzd;
        if (i >= 0 && i < i4) {
            return i;
        }
        if (i < 0) {
            strZzd = zzghs.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i4 < 0) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i4).length() + 15), "negative size: ", i4));
            }
            strZzd = zzghs.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i, int i4, String str) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(zzp(i, i4, "index"));
        }
        return i;
    }

    public static void zzo(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zzp(i, i6, "start index") : (i4 < 0 || i4 > i6) ? zzp(i4, i6, "end index") : zzghs.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    private static String zzp(int i, int i4, String str) {
        if (i < 0) {
            return zzghs.zzd("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return zzghs.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i4).length() + 15), "negative size: ", i4));
    }
}
