package M;

import D.S;
import Ej.Z;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import dOYHB6.tiZVw8.numX49;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f3015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M2.b f3016b;
    public byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3017d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f3018g;
    public boolean h;
    public int i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f3019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Z f3020l;
    public final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f3021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short[] f3022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f3023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f3024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f3028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f3029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3031x;

    public a() {
        M2.b bVar = new M2.b(6);
        this.m = new int[256];
        this.f3030w = 0;
        this.f3031x = 0;
        this.f3016b = bVar;
        this.f3018g = new c();
    }

    public final void a(int[] iArr, b bVar, int i) {
        int i4 = bVar.h;
        int i6 = this.f3025r;
        int i10 = i4 / i6;
        int i11 = bVar.f / i6;
        int i12 = bVar.f3035g / i6;
        int i13 = bVar.e / i6;
        int i14 = this.e;
        int i15 = (i11 * i14) + i13;
        int i16 = (i10 * i14) + i15;
        while (i15 < i16) {
            int i17 = i15 + i12;
            for (int i18 = i15; i18 < i17; i18++) {
                iArr[i18] = i;
            }
            i15 += this.e;
        }
    }

    public final synchronized Bitmap b() {
        String strTnTj78 = numX49.tnTj78("PnP");
        String strTnTj782 = numX49.tnTj78("Pnb");
        synchronized (this) {
            try {
                if (this.f3018g.f3039d <= 0 || this.f < 0) {
                    S.c(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "unable to decode frame, frameCount=" + this.f3018g.f3039d + " framePointer=" + this.f);
                    this.f3027t = 1;
                }
                int i = this.f3027t;
                if (i != 1 && i != 2) {
                    this.f3027t = 0;
                    b bVar = (b) this.f3018g.e.get(this.f);
                    int i4 = this.f - 1;
                    b bVar2 = i4 >= 0 ? (b) this.f3018g.e.get(i4) : null;
                    int[] iArr = bVar.i;
                    if (iArr == null) {
                        iArr = this.f3018g.f;
                    }
                    this.f3015a = iArr;
                    if (iArr == null) {
                        S.c(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, strTnTj782 + this.f);
                        this.f3027t = 1;
                        return null;
                    }
                    if (bVar.f3036k) {
                        System.arraycopy(iArr, 0, this.m, 0, iArr.length);
                        int[] iArr2 = this.m;
                        this.f3015a = iArr2;
                        iArr2[bVar.j] = 0;
                    }
                    return h(bVar, bVar2);
                }
                S.c(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, strTnTj78 + this.f3027t);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int c() {
        try {
            d();
            byte[] bArr = this.f3029v;
            int i = this.f3030w;
            this.f3030w = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f3027t = 1;
            return 0;
        }
    }

    public final void d() {
        if (this.f3031x > this.f3030w) {
            return;
        }
        if (this.f3029v == null) {
            this.f3016b.getClass();
            this.f3029v = new byte[16384];
        }
        this.f3030w = 0;
        int iMin = Math.min(this.f3024q.remaining(), 16384);
        this.f3031x = iMin;
        this.f3024q.get(this.f3029v, 0, iMin);
    }

    public final synchronized void e(c cVar, ByteBuffer byteBuffer) {
        g(cVar, byteBuffer);
    }

    public final synchronized void f(c cVar, byte[] bArr) {
        e(cVar, ByteBuffer.wrap(bArr));
    }

    public final synchronized void g(c cVar, ByteBuffer byteBuffer) {
        try {
            int iHighestOneBit = Integer.highestOneBit(1);
            this.f3027t = 0;
            this.f3018g = cVar;
            this.h = false;
            this.f = -1;
            this.i = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f3024q = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f3024q.order(ByteOrder.LITTLE_ENDIAN);
            this.f3026s = false;
            Iterator it = cVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).c == 3) {
                    this.f3026s = true;
                    break;
                }
            }
            this.f3025r = iHighestOneBit;
            int i = cVar.f3042l;
            int i4 = i / iHighestOneBit;
            this.e = i4;
            int i6 = cVar.i;
            int i10 = i6 / iHighestOneBit;
            this.f3017d = i10;
            this.j = new byte[i * i6];
            this.f3019k = new int[i4 * i10];
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v62, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10, types: [int] */
    /* JADX WARN: Type inference failed for: r20v11, types: [int] */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12, types: [int] */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14, types: [int] */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16, types: [int] */
    /* JADX WARN: Type inference failed for: r22v17, types: [int] */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v9, types: [int] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v53, types: [short] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap h(M.b r33, M.b r34) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.a.h(M.b, M.b):android.graphics.Bitmap");
    }
}
