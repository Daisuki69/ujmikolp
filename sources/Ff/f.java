package Ff;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Fg.g, io.split.android.client.service.sseclient.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1581b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1582d;

    public f(ArrayList arrayList, int i, int i4) {
        this.f1580a = 3;
        this.f1582d = arrayList;
        this.f1581b = i;
        this.c = i4;
    }

    public static f d(int i) {
        return new f(i, 2, new HashMap());
    }

    public static f k(int i) {
        return new f(i, 1, new HashMap());
    }

    @Override // io.split.android.client.service.sseclient.a
    public long a() {
        return Math.min((long) Math.pow(this.f1581b * 2, ((AtomicLong) this.f1582d).getAndAdd(1L)), this.c);
    }

    @Override // io.split.android.client.service.sseclient.a
    public void b() {
        ((AtomicLong) this.f1582d).set(0L);
    }

    public int c() {
        return ((((byte[]) this.f1582d).length - this.f1581b) * 8) - this.c;
    }

    public byte e(int i, int i4) {
        return ((byte[][]) this.f1582d)[i4][i];
    }

    public Boolean f() {
        Object obj = ((Map) this.f1582d).get("DO_NOT_RETRY");
        if (obj != null) {
            return Boolean.valueOf(Boolean.parseBoolean(obj.toString()));
        }
        return null;
    }

    public int g(int i) {
        if (i <= 0 || i > 32 || i > c()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i4 = this.c;
        int i6 = 0;
        byte[] bArr = (byte[]) this.f1582d;
        if (i4 > 0) {
            int i10 = 8 - i4;
            int i11 = i < i10 ? i : i10;
            int i12 = i10 - i11;
            int i13 = this.f1581b;
            int i14 = (((255 >> (8 - i11)) << i12) & bArr[i13]) >> i12;
            i -= i11;
            int i15 = i4 + i11;
            this.c = i15;
            if (i15 == 8) {
                this.c = 0;
                this.f1581b = i13 + 1;
            }
            i6 = i14;
        }
        if (i > 0) {
            while (i >= 8) {
                int i16 = i6 << 8;
                int i17 = this.f1581b;
                int i18 = i16 | (bArr[i17] & 255);
                this.f1581b = i17 + 1;
                i -= 8;
                i6 = i18;
            }
            if (i > 0) {
                int i19 = 8 - i;
                int i20 = ((bArr[this.f1581b] & ((255 >> i19) << i19)) >> i19) | (i6 << i);
                this.c += i;
                return i20;
            }
        }
        return i6;
    }

    public void h(int i, int i4, int i6) {
        ((byte[][]) this.f1582d)[i4][i] = (byte) i6;
    }

    public void i(int i, int i4, boolean z4) {
        ((byte[][]) this.f1582d)[i4][i] = z4 ? (byte) 1 : (byte) 0;
    }

    public void j(byte[] bArr) {
        int[] iArr;
        this.f1581b = 0;
        this.c = 0;
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("number of bytes must be between 1 and 32");
        }
        int i = 0;
        while (true) {
            iArr = (int[]) this.f1582d;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = i;
            i++;
        }
        int length = 0;
        int i4 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i10 = bArr[length];
            if (i10 < 0) {
                i10 += 256;
            }
            int i11 = iArr[i6];
            i4 = ((i10 + i11) + i4) % 256;
            iArr[i6] = iArr[i4];
            iArr[i4] = i11;
            length = (length + 1) % bArr.length;
        }
    }

    public void l(byte b8, OutputStream outputStream) throws IOException {
        int i = (this.f1581b + 1) % 256;
        this.f1581b = i;
        int[] iArr = (int[]) this.f1582d;
        int i4 = iArr[i];
        int i6 = (this.c + i4) % 256;
        this.c = i6;
        iArr[i] = iArr[i6];
        iArr[i6] = i4;
        outputStream.write(b8 ^ ((byte) iArr[(iArr[i] + i4) % 256]));
    }

    @Override // Fg.g
    public void log(String message) {
        kotlin.jvm.internal.j.g(message, "message");
        while (true) {
            int length = message.length();
            Fg.g gVar = (Fg.g) this.f1582d;
            int i = this.f1581b;
            if (length <= i) {
                gVar.log(message);
                return;
            }
            String strSubstring = message.substring(0, i);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            int I4 = C2576A.I(strSubstring, '\n', 0, 6);
            if (I4 >= this.c) {
                strSubstring = strSubstring.substring(0, I4);
                kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                i = I4 + 1;
            }
            gVar.log(strSubstring);
            message = message.substring(i);
            kotlin.jvm.internal.j.f(message, "substring(...)");
        }
    }

    public String toString() {
        switch (this.f1580a) {
            case 4:
                int i = this.f1581b;
                int i4 = this.c;
                StringBuilder sb2 = new StringBuilder((i * 2 * i4) + 2);
                for (int i6 = 0; i6 < i4; i6++) {
                    byte[] bArr = ((byte[][]) this.f1582d)[i6];
                    for (int i10 = 0; i10 < i; i10++) {
                        byte b8 = bArr[i10];
                        if (b8 == 0) {
                            sb2.append(" 0");
                        } else if (b8 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f(int i) {
        this.f1580a = 5;
        this.f1581b = 1;
        this.f1582d = new AtomicLong(0L);
        this.c = i;
    }

    public f(int i, int i4, int i6) {
        this.f1580a = i6;
        switch (i6) {
            case 6:
                this.f1582d = null;
                this.f1581b = i;
                int i10 = i4 & 7;
                this.c = i10 == 0 ? 8 : i10;
                break;
            default:
                this.f1582d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i4, i);
                this.f1581b = i;
                this.c = i4;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(int i, byte b8) {
        this(1800);
        this.f1580a = i;
        switch (i) {
            case 5:
                break;
            case 6:
                this.f1582d = new f[256];
                this.f1581b = 0;
                this.c = 0;
                break;
            default:
                this.f1582d = new int[256];
                break;
        }
    }

    public f(byte[] bArr) {
        this.f1580a = 2;
        this.f1582d = bArr;
    }

    public f(int i, int i4, Map map) {
        this.f1580a = 7;
        if (i != 0) {
            this.f1581b = i;
            if (i4 != 0) {
                this.c = i4;
                Objects.requireNonNull(map);
                this.f1582d = map;
                return;
            }
            throw null;
        }
        throw null;
    }

    public f(Fg.g gVar) {
        this.f1580a = 1;
        this.f1581b = 4000;
        this.c = 3000;
        this.f1582d = gVar;
    }
}
