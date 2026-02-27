package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class HexDumpUtils {
    @Nullable
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i, int i4, boolean z4) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i4 <= 0 || i + i4 > length) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((i4 + 15) / 16) * (z4 ? 75 : 57));
        int i6 = i4;
        int i10 = 0;
        int i11 = 0;
        while (i6 > 0) {
            if (i10 == 0) {
                if (i4 < 65536) {
                    sb2.append(String.format("%04X:", Integer.valueOf(i)));
                } else {
                    sb2.append(String.format("%08X:", Integer.valueOf(i)));
                }
                i11 = i;
            } else if (i10 == 8) {
                sb2.append(" -");
            }
            sb2.append(String.format(" %02X", Integer.valueOf(bArr[i] & 255)));
            i6--;
            i10++;
            if (z4 && (i10 == 16 || i6 == 0)) {
                int i12 = 16 - i10;
                if (i12 > 0) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        sb2.append("   ");
                    }
                }
                if (i12 >= 8) {
                    sb2.append("  ");
                }
                sb2.append("  ");
                for (int i14 = 0; i14 < i10; i14++) {
                    char c = (char) bArr[i11 + i14];
                    if (c < ' ' || c > '~') {
                        c = '.';
                    }
                    sb2.append(c);
                }
            }
            if (i10 == 16 || i6 == 0) {
                sb2.append('\n');
                i10 = 0;
            }
            i++;
        }
        return sb2.toString();
    }
}
