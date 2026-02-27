package Ej;

import android.os.Handler;
import android.os.HandlerThread;
import com.dynatrace.android.agent.Global;
import com.paymaya.domain.store.H0;
import defpackage.AbstractC1414e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import oi.C1990h;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements m4.j {
    public static Z f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1430b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1431d;
    public Object e;

    public /* synthetic */ Z(int i, boolean z4) {
        this.f1429a = i;
    }

    public File a(String key, byte[] value) throws IOException {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        int iT = S1.r.t(value);
        int i = this.f1430b;
        if (iT > i) {
            m(key);
            throw new IllegalArgumentException(We.s.f(i, "File size exceeds the maximum limit of "));
        }
        File fileF = f(key);
        if (fileF.exists()) {
            fileF.delete();
        }
        File fileF2 = f(key);
        if (((D.S) this.f1431d) != null) {
            D.S.s("FileDownload", "mapped file path - " + fileF2.getAbsoluteFile() + " to key - " + key);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileF2);
        fileOutputStream.write(value);
        fileOutputStream.close();
        return fileF2;
    }

    public void b(Y.e eVar) {
        if (eVar != null) {
            Y3.e eVar2 = (Y3.e) eVar;
            Y3.a[] aVarArr = (Y3.a[]) eVar2.c;
            for (Y3.a aVar : aVarArr) {
                if (aVar != null) {
                    aVar.b();
                }
            }
            Y3.a aVar2 = (Y3.a) this.c;
            eVar2.B(aVarArr, aVar2);
            Y3.c cVar = (Y3.c) eVar2.f6708b;
            boolean z4 = eVar2.f6746d;
            C3.l lVar = z4 ? cVar.f6741b : cVar.f6742d;
            C3.l lVar2 = z4 ? cVar.c : cVar.e;
            int iO = eVar2.o((int) lVar.f728b);
            int iO2 = eVar2.o((int) lVar2.f728b);
            int i = -1;
            int i4 = 0;
            int iMax = 1;
            while (iO < iO2) {
                Y3.a aVar3 = aVarArr[iO];
                if (aVar3 != null) {
                    int i6 = aVar3.f;
                    int i10 = i6 - i;
                    if (i10 == 0) {
                        i4++;
                    } else {
                        if (i10 == 1) {
                            iMax = Math.max(iMax, i4);
                            i = aVar3.f;
                        } else if (i10 < 0 || i6 >= aVar2.f || i10 > iO) {
                            aVarArr[iO] = null;
                        } else {
                            if (iMax > 2) {
                                i10 *= iMax - 2;
                            }
                            boolean z5 = i10 >= iO;
                            for (int i11 = 1; i11 <= i10 && !z5; i11++) {
                                z5 = aVarArr[iO - i11] != null;
                            }
                            if (z5) {
                                aVarArr[iO] = null;
                            } else {
                                i = aVar3.f;
                            }
                        }
                        i4 = 1;
                    }
                }
                iO++;
            }
        }
    }

    public void c() {
        synchronized (this.e) {
            try {
                if (((Handler) this.c) == null) {
                    if (this.f1430b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f1431d = handlerThread;
                    handlerThread.start();
                    this.c = new Handler(((HandlerThread) this.f1431d).getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(Runnable runnable) {
        synchronized (this.e) {
            c();
            ((Handler) this.c).post(runnable);
        }
    }

    public boolean e() {
        return ((M.c) this.f1431d).f3041k != 0;
    }

    public File f(String str) {
        return new File(((File) this.c) + "/CT_FILE_" + ((String) ((Function1) this.e).invoke(str)));
    }

    public int g() {
        int i;
        synchronized (this.e) {
            i = this.f1430b;
        }
        return i;
    }

    public M.c h() {
        byte[] bArr;
        if (((ByteBuffer) this.e) == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (e()) {
            return (M.c) this.f1431d;
        }
        String string = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder sbW = androidx.camera.core.impl.a.w(string);
            sbW.append((char) j());
            string = sbW.toString();
        }
        if (string.startsWith("GIF")) {
            ((M.c) this.f1431d).f3042l = ((ByteBuffer) this.e).getShort();
            ((M.c) this.f1431d).i = ((ByteBuffer) this.e).getShort();
            int iJ = j();
            M.c cVar = (M.c) this.f1431d;
            cVar.f3040g = (iJ & 128) != 0;
            cVar.h = 2 << (iJ & 7);
            cVar.f3038b = j();
            M.c cVar2 = (M.c) this.f1431d;
            j();
            cVar2.getClass();
            if (((M.c) this.f1431d).f3040g && !e()) {
                M.c cVar3 = (M.c) this.f1431d;
                cVar3.f = l(cVar3.h);
                M.c cVar4 = (M.c) this.f1431d;
                cVar4.f3037a = cVar4.f[cVar4.f3038b];
            }
        } else {
            ((M.c) this.f1431d).f3041k = 1;
        }
        if (!e()) {
            boolean z4 = false;
            while (!z4 && !e() && ((M.c) this.f1431d).f3039d <= Integer.MAX_VALUE) {
                int iJ2 = j();
                if (iJ2 == 33) {
                    int iJ3 = j();
                    if (iJ3 == 1) {
                        o();
                    } else if (iJ3 == 249) {
                        ((M.c) this.f1431d).c = new M.b();
                        j();
                        int iJ4 = j();
                        M.b bVar = ((M.c) this.f1431d).c;
                        int i4 = (iJ4 & 28) >> 2;
                        bVar.c = i4;
                        if (i4 == 0) {
                            bVar.c = 1;
                        }
                        bVar.f3036k = (iJ4 & 1) != 0;
                        short s9 = ((ByteBuffer) this.e).getShort();
                        if (s9 < 2) {
                            s9 = 10;
                        }
                        M.b bVar2 = ((M.c) this.f1431d).c;
                        bVar2.f3033b = s9 * 10;
                        bVar2.j = j();
                        j();
                    } else if (iJ3 == 254) {
                        o();
                    } else if (iJ3 != 255) {
                        o();
                    } else {
                        k();
                        int i6 = 0;
                        String string2 = "";
                        while (true) {
                            bArr = (byte[]) this.c;
                            if (i6 >= 11) {
                                break;
                            }
                            StringBuilder sbW2 = androidx.camera.core.impl.a.w(string2);
                            sbW2.append((char) bArr[i6]);
                            string2 = sbW2.toString();
                            i6++;
                        }
                        if (string2.equals("NETSCAPE2.0")) {
                            do {
                                k();
                                if (bArr[0] == 1) {
                                    int i10 = bArr[1] & 255;
                                    int i11 = bArr[2] & 255;
                                    M.c cVar5 = (M.c) this.f1431d;
                                    int i12 = i10 | (i11 << 8);
                                    cVar5.j = i12;
                                    if (i12 == 0) {
                                        cVar5.j = -1;
                                    }
                                }
                                if (this.f1430b > 0) {
                                }
                            } while (!e());
                        } else {
                            o();
                        }
                    }
                } else if (iJ2 == 44) {
                    M.c cVar6 = (M.c) this.f1431d;
                    if (cVar6.c == null) {
                        cVar6.c = new M.b();
                    }
                    cVar6.c.e = ((ByteBuffer) this.e).getShort();
                    ((M.c) this.f1431d).c.f = ((ByteBuffer) this.e).getShort();
                    ((M.c) this.f1431d).c.f3035g = ((ByteBuffer) this.e).getShort();
                    ((M.c) this.f1431d).c.h = ((ByteBuffer) this.e).getShort();
                    int iJ5 = j();
                    boolean z5 = (iJ5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iJ5 & 7) + 1);
                    M.b bVar3 = ((M.c) this.f1431d).c;
                    bVar3.f3034d = (iJ5 & 64) != 0;
                    if (z5) {
                        bVar3.i = l(iPow);
                    } else {
                        bVar3.i = null;
                    }
                    ((M.c) this.f1431d).c.f3032a = ((ByteBuffer) this.e).position();
                    j();
                    o();
                    if (!e()) {
                        M.c cVar7 = (M.c) this.f1431d;
                        cVar7.f3039d++;
                        cVar7.e.add(cVar7.c);
                    }
                } else if (iJ2 != 59) {
                    ((M.c) this.f1431d).f3041k = 1;
                } else {
                    z4 = true;
                }
            }
            M.c cVar8 = (M.c) this.f1431d;
            if (cVar8.f3039d < 0) {
                cVar8.f3041k = 1;
            }
        }
        return (M.c) this.f1431d;
    }

    public void i() {
        synchronized (this.e) {
            ((HandlerThread) this.f1431d).quit();
            this.f1431d = null;
            this.c = null;
        }
    }

    public int j() {
        try {
            return ((ByteBuffer) this.e).get() & 255;
        } catch (Exception unused) {
            ((M.c) this.f1431d).f3041k = 1;
            return 0;
        }
    }

    public void k() {
        int iJ = j();
        this.f1430b = iJ;
        if (iJ <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i4 = this.f1430b;
                if (i >= i4) {
                    return;
                }
                int i6 = i4 - i;
                ((ByteBuffer) this.e).get((byte[]) this.c, i, i6);
                i += i6;
            } catch (Exception unused) {
                ((M.c) this.f1431d).f3041k = 1;
                return;
            }
        }
    }

    public int[] l(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            ((ByteBuffer) this.e).get(bArr);
            iArr = new int[256];
            int i4 = 0;
            int i6 = 0;
            while (i4 < i) {
                int i10 = bArr[i6] & 255;
                int i11 = i6 + 2;
                int i12 = bArr[i6 + 1] & 255;
                i6 += 3;
                int i13 = i4 + 1;
                iArr[i4] = (i12 << 8) | (i10 << 16) | (-16777216) | (bArr[i11] & 255);
                i4 = i13;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            D.S.e("GifHeaderParser", "Format Error Reading Color Table", e);
            ((M.c) this.f1431d).f3041k = 1;
            return iArr;
        }
    }

    public boolean m(String key) {
        kotlin.jvm.internal.j.g(key, "key");
        File fileF = f(key);
        if (!fileF.exists()) {
            return false;
        }
        fileF.delete();
        return true;
    }

    public void n(byte[] bArr) {
        if (bArr == null) {
            this.e = null;
            ((M.c) this.f1431d).f3041k = 2;
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.e = null;
        Arrays.fill((byte[]) this.c, (byte) 0);
        this.f1431d = new M.c();
        this.f1430b = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferWrap.asReadOnlyBuffer();
        this.e = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        ((ByteBuffer) this.e).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void o() {
        int iJ;
        do {
            try {
                iJ = j();
                ByteBuffer byteBuffer = (ByteBuffer) this.e;
                byteBuffer.position(byteBuffer.position() + iJ);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (iJ > 0);
    }

    public String toString() {
        switch (this.f1429a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC1414e.w(this.f1430b));
                sb2.append(Global.BLANK);
                sb2.append(((URL) this.c).toString());
                sb2.append(Global.NEWLINE);
                HashMap map = (HashMap) this.f1431d;
                for (String str : map.keySet()) {
                    sb2.append(str);
                    sb2.append(Global.BLANK);
                    sb2.append((String) map.get(str));
                    sb2.append(Global.NEWLINE);
                }
                sb2.append(new String((byte[]) this.e));
                return sb2.toString();
            case 3:
            default:
                return super.toString();
            case 4:
                Y.e[] eVarArr = (Y.e[]) this.f1431d;
                Y.e eVar = eVarArr[0];
                int i = this.f1430b;
                if (eVar == null) {
                    eVar = eVarArr[i + 1];
                }
                Formatter formatter = new Formatter();
                for (int i4 = 0; i4 < ((Y3.a[]) eVar.c).length; i4++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i4));
                        for (int i6 = 0; i6 < i + 2; i6++) {
                            Y.e eVar2 = eVarArr[i6];
                            if (eVar2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                Y3.a aVar = ((Y3.a[]) eVar2.c)[i4];
                                if (aVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(aVar.f), Integer.valueOf(aVar.e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } finally {
                        try {
                        } catch (Throwable th2) {
                            try {
                                break;
                            } catch (Throwable th3) {
                            }
                        }
                    }
                }
                String string = formatter.toString();
                formatter.close();
                return string;
        }
    }

    public Z(File file, int i, D.S s9) {
        this.f1429a = 7;
        H0 h02 = new H0(9);
        this.c = file;
        this.f1430b = i;
        this.f1431d = s9;
        this.e = h02;
    }

    public Z(int i) {
        this.f1429a = i;
        switch (i) {
            case 2:
                this.f1431d = new HashMap();
                this.c = new URL("https://glimpse.voyagerapis.com/v1/collect");
                break;
            case 8:
                this.f1430b = 0;
                this.e = new Object();
                break;
            default:
                this.c = new byte[256];
                this.f1430b = 0;
                break;
        }
    }

    public Z(Xh.d dVar, Ki.a aVar, Ii.a aVar2, zi.c cVar, Xh.m mVar, C1990h c1990h, C1781b c1781b) {
        this.f1429a = 3;
        Object obj = new Object();
        this.e = obj;
        Objects.requireNonNull(dVar);
        Objects.requireNonNull(aVar);
        this.c = aVar;
        Objects.requireNonNull(aVar2);
        this.f1431d = aVar2;
        Objects.requireNonNull(cVar);
        Objects.requireNonNull(mVar);
        Objects.requireNonNull(c1990h);
        synchronized (obj) {
            try {
                if (this.f1430b == 1) {
                    return;
                }
                ((AtomicBoolean) mVar.a().f).set(true);
                c1990h.f18902a.set(true);
                Ri.a.d("Tracking has been set to true");
                c1781b.l(new Xh.r(this, true), null);
                Ri.a.d("Persistence has been set to true");
                zi.d dVar2 = cVar.f21452b;
                Ri.a.p("User consent status is granted now. Starting recorders");
                dVar2.g();
                this.f1430b = 1;
                Ri.a.d("User consent set to GRANTED");
            } finally {
            }
        }
    }

    public Z(Y3.a aVar, Y3.c cVar) {
        this.f1429a = 4;
        this.c = aVar;
        int i = aVar.f6737b;
        this.f1430b = i;
        this.e = cVar;
        this.f1431d = new Y.e[i + 2];
    }

    public Z(int i, Dj.a aVar, InterfaceC0230h interfaceC0230h, CoroutineContext coroutineContext) {
        this.f1429a = 0;
        this.c = interfaceC0230h;
        this.f1430b = i;
        this.f1431d = aVar;
        this.e = coroutineContext;
    }
}
