package R1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5432a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i4 = 0; i4 < 26; i4++) {
            byte b8 = (byte) (i4 + 10);
            bArr[i4 + 65] = b8;
            bArr[i4 + 97] = b8;
        }
        f5432a = bArr;
    }
}
