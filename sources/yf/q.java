package yf;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f21278b = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21279a;

    public q(String str) {
        for (char c : str.toCharArray()) {
            if (!r.f21281b.containsKey(Character.valueOf(c))) {
                byte[] bytes = str.getBytes(Nf.a.f4396a);
                byte[] bArr = new byte[bytes.length + 2];
                this.f21279a = bArr;
                bArr[0] = -2;
                bArr[1] = -1;
                System.arraycopy(bytes, 0, bArr, 2, bytes.length);
                return;
            }
        }
        int[] iArr = r.f21280a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c10 : str.toCharArray()) {
            Integer num = (Integer) r.f21281b.get(Character.valueOf(c10));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        this.f21279a = byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && f().equals(((q) obj).f());
    }

    public final String f() {
        byte[] bArr = this.f21279a;
        if (bArr.length >= 2) {
            byte b8 = bArr[0];
            if ((b8 & 255) == 254 && (bArr[1] & 255) == 255) {
                return new String(bArr, 2, bArr.length - 2, Nf.a.f4396a);
            }
            if ((b8 & 255) == 255 && (bArr[1] & 255) == 254) {
                return new String(bArr, 2, bArr.length - 2, Nf.a.f4397b);
            }
        }
        int[] iArr = r.f21280a;
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            int i = b10 & 255;
            if (i >= 256) {
                sb2.append('?');
            } else {
                sb2.append((char) r.f21280a[i]);
            }
        }
        return sb2.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21279a);
    }

    public final String toString() {
        return "COSString{" + f() + "}";
    }

    public q(byte[] bArr) {
        this.f21279a = (byte[]) bArr.clone();
    }
}
