package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class zzmd {
    private static final zzme zza;

    static {
        zza = (zzma.zza() && zzma.zzb() && !zzhi.zza()) ? new zzmj() : new zzmh();
    }

    public static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(byte[] bArr, int i, int i4) {
        byte b8 = bArr[i - 1];
        int i6 = i4 - i;
        if (i6 == 0) {
            return zzb(b8);
        }
        if (i6 == 1) {
            return zzb(b8, bArr[i]);
        }
        if (i6 == 2) {
            return zzb(b8, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean zza(byte[] bArr, int i, int i4) {
        return zza.zza(bArr, i, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(int i, int i4) {
        if (i > -12 || i4 > -65) {
            return -1;
        }
        return i ^ (i4 << 8);
    }

    public static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i6 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i4++;
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char cCharAt2 = charSequence.charAt(i4);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i4) < 65536) {
                                throw new zzmg(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i6) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(int i, int i4, int i6) {
        if (i > -12 || i4 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i4 << 8)) ^ (i6 << 16);
    }

    public static String zzb(byte[] bArr, int i, int i4) throws zzjk {
        return zza.zzb(bArr, i, i4);
    }

    public static int zza(CharSequence charSequence, byte[] bArr, int i, int i4) {
        return zza.zza(charSequence, bArr, i, i4);
    }
}
