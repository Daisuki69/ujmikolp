package xk;

import androidx.camera.video.AudioStats;
import d4.AbstractC1331a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import qk.i;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f21025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21026b;
    public int c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21027d = true;
    public final /* synthetic */ int e;

    public a(int[] iArr, int i) {
        this.e = i;
        a(iArr);
    }

    public static int c(int[] iArr) {
        i.m(iArr, "Shape cannot be null.");
        int i = 1;
        for (int i4 : iArr) {
            i *= i4;
        }
        return i;
    }

    public static a e(int i) {
        int iC = AbstractC2217b.c(i);
        if (iC == 0) {
            return new a(0);
        }
        if (iC == 2) {
            return new a(1);
        }
        throw new AssertionError("TensorBuffer does not support data type: ".concat(AbstractC1331a.A(i)));
    }

    public static a f(int i, int[] iArr) {
        int iC = AbstractC2217b.c(i);
        if (iC == 0) {
            return new a(iArr, 0);
        }
        if (iC == 2) {
            return new a(iArr, 1);
        }
        throw new AssertionError("TensorBuffer does not support data type: ".concat(AbstractC1331a.A(i)));
    }

    public static a g(a aVar, int i) {
        i.m(aVar, "Cannot create a buffer from null");
        a aVarE = aVar.f21027d ? e(i) : f(i, aVar.f21026b);
        if (aVar.h() == 1 && i == 1) {
            aVarE.l(aVar.i(), aVar.f21026b);
            return aVarE;
        }
        int[] iArrJ = aVar.j();
        int[] iArr = aVar.f21026b;
        switch (aVarE.e) {
            case 0:
                i.m(iArrJ, "The array to be loaded cannot be null.");
                int i4 = 0;
                i.j("The size of the array to be loaded does not match the specified shape.", iArrJ.length == c(iArr));
                aVarE.d();
                aVarE.m(iArr);
                aVarE.f21025a.rewind();
                float[] fArr = new float[iArrJ.length];
                int length = iArrJ.length;
                int i6 = 0;
                while (i4 < length) {
                    fArr[i6] = iArrJ[i4];
                    i4++;
                    i6++;
                }
                aVarE.f21025a.asFloatBuffer().put(fArr);
                return aVarE;
            default:
                i.m(iArrJ, "The array to be loaded cannot be null.");
                int i10 = 0;
                i.j("The size of the array to be loaded does not match the specified shape.", iArrJ.length == c(iArr));
                aVarE.d();
                aVarE.m(iArr);
                aVarE.f21025a.rewind();
                byte[] bArr = new byte[iArrJ.length];
                int length2 = iArrJ.length;
                int i11 = 0;
                while (i10 < length2) {
                    bArr[i11] = (byte) Math.max(Math.min(iArrJ[i10], 255.0f), 0.0f);
                    i10++;
                    i11++;
                }
                aVarE.f21025a.put(bArr);
                return aVarE;
        }
    }

    public final void a(int[] iArr) {
        i.m(iArr, "TensorBuffer shape cannot be null.");
        boolean z4 = true;
        if (iArr.length != 0) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] < 0) {
                    z4 = false;
                    break;
                }
                i++;
            }
        }
        i.j("Values in TensorBuffer shape should be non-negative.", z4);
        int iC = c(iArr);
        this.f21026b = (int[]) iArr.clone();
        if (this.c == iC) {
            return;
        }
        this.c = iC;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(k() * iC);
        this.f21025a = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
    }

    public final void b() {
        boolean z4 = this.f21025a.limit() == k() * c(this.f21026b);
        String str = String.format("The size of underlying ByteBuffer (%d) and the shape (%s) do not match. The ByteBuffer may have been changed.", Integer.valueOf(this.f21025a.limit()), Arrays.toString(this.f21026b));
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }

    public final synchronized void d() {
        if (this.f21025a.isReadOnly()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f21025a.capacity());
            byteBufferAllocateDirect.order(this.f21025a.order());
            byteBufferAllocateDirect.put(this.f21025a);
            byteBufferAllocateDirect.rewind();
            this.f21025a = byteBufferAllocateDirect;
        }
    }

    public final int h() {
        switch (this.e) {
            case 0:
                return 1;
            default:
                return 3;
        }
    }

    public final float[] i() {
        switch (this.e) {
            case 0:
                this.f21025a.rewind();
                float[] fArr = new float[this.c];
                this.f21025a.asFloatBuffer().get(fArr);
                return fArr;
            default:
                this.f21025a.rewind();
                this.f21025a.get(new byte[this.c]);
                float[] fArr2 = new float[this.c];
                for (int i = 0; i < this.c; i++) {
                    fArr2[i] = r0[i] & 255;
                }
                return fArr2;
        }
    }

    public final int[] j() {
        switch (this.e) {
            case 0:
                this.f21025a.rewind();
                float[] fArr = new float[this.c];
                this.f21025a.asFloatBuffer().get(fArr);
                int[] iArr = new int[this.c];
                for (int i = 0; i < this.c; i++) {
                    iArr[i] = (int) fArr[i];
                }
                return iArr;
            default:
                this.f21025a.rewind();
                byte[] bArr = new byte[this.c];
                this.f21025a.get(bArr);
                int[] iArr2 = new int[this.c];
                for (int i4 = 0; i4 < this.c; i4++) {
                    iArr2[i4] = bArr[i4] & 255;
                }
                return iArr2;
        }
    }

    public final int k() {
        switch (this.e) {
            case 0:
                return AbstractC1331a.c(1);
            default:
                return AbstractC1331a.c(3);
        }
    }

    public final void l(float[] fArr, int[] iArr) {
        switch (this.e) {
            case 0:
                i.m(fArr, "The array to be loaded cannot be null.");
                i.j("The size of the array to be loaded does not match the specified shape.", fArr.length == c(iArr));
                d();
                m(iArr);
                this.f21025a.rewind();
                this.f21025a.asFloatBuffer().put(fArr);
                break;
            default:
                i.m(fArr, "The array to be loaded cannot be null.");
                int i = 0;
                i.j("The size of the array to be loaded does not match the specified shape.", fArr.length == c(iArr));
                d();
                m(iArr);
                this.f21025a.rewind();
                byte[] bArr = new byte[fArr.length];
                int length = fArr.length;
                int i4 = 0;
                while (i < length) {
                    bArr[i4] = (byte) Math.max(Math.min(fArr[i], 255.0d), AudioStats.AUDIO_AMPLITUDE_NONE);
                    i++;
                    i4++;
                }
                this.f21025a.put(bArr);
                break;
        }
    }

    public final void m(int[] iArr) {
        if (this.f21027d) {
            a(iArr);
        } else {
            if (!Arrays.equals(iArr, this.f21026b)) {
                throw new IllegalArgumentException();
            }
            this.f21026b = (int[]) iArr.clone();
        }
    }

    public a(int i) {
        this.e = i;
        a(new int[]{0});
    }
}
