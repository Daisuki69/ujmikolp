package b4;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import d4.AbstractC1331a;
import java.lang.reflect.Array;
import java.util.Arrays;
import qk.i;
import v.AbstractC2329d;

/* JADX INFO: renamed from: b4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0906a implements vk.b {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8506a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8507b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8508d;
    public final Object e;

    public C0906a(int i, int i4) {
        this.e = new O3.a[i];
        for (int i6 = 0; i6 < i; i6++) {
            ((O3.a[]) this.e)[i6] = new O3.a(AbstractC1331a.k(i4, 4, 17, 1));
        }
        this.f8508d = i4 * 17;
        this.c = i;
        this.f8507b = -1;
    }

    public O3.a a() {
        return ((O3.a[]) this.e)[this.f8507b];
    }

    @Override // vk.b
    public xk.a b(int i) {
        xk.a aVar = (xk.a) this.e;
        return aVar.h() == i ? aVar : xk.a.g(aVar, i);
    }

    public byte[][] c(int i, int i4) {
        int i6 = this.c;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i6 * i4, this.f8508d * i);
        int i10 = i6 * i4;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (i10 - i11) - 1;
            byte[] bArr2 = ((O3.a[]) this.e)[i11 / i4].f4630a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                bArr3[i13] = bArr2[i13 / i];
            }
            bArr[i12] = bArr3;
        }
        return bArr;
    }

    public Object clone() {
        switch (this.f8506a) {
            case 1:
                xk.a aVar = (xk.a) this.e;
                xk.a aVarG = xk.a.g(aVar, aVar.h());
                aVar.b();
                int i = aVar.c;
                int i4 = this.f8507b;
                int i6 = this.c;
                int i10 = this.f8508d;
                AbstractC2329d.c(i4, i, i6, i10);
                aVar.b();
                AbstractC2329d.c(i4, aVar.c, i6, i10);
                return new C0906a(aVarG, i4, i6, i10);
            default:
                return super.clone();
        }
    }

    @Override // vk.b
    public Bitmap d() {
        xk.a aVarG = (xk.a) this.e;
        if (aVarG.h() != 3) {
            Log.w(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<Warning> TensorBufferContainer is holding a non-uint8 image. The conversion to Bitmap will cause numeric casting and clamping on the data value.");
        }
        int i = this.f8507b;
        if (i != 1) {
            if (i != 2) {
                throw new UnsupportedOperationException("convertTensorBufferToBitmap() is unsupported for the color space type ".concat(AbstractC2329d.j(i)));
            }
            if (aVarG.h() != 3) {
                aVarG = xk.a.g(aVarG, 3);
            }
            aVarG.b();
            int[] iArr = aVarG.f21026b;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            AbstractC2329d.e(2, iArrCopyOf);
            AbstractC2329d.d(2, "getWidth()");
            AbstractC2329d.e(2, iArrCopyOf);
            int i4 = AbstractC2329d.f(2, iArrCopyOf)[2];
            AbstractC2329d.d(2, "getHeight()");
            AbstractC2329d.e(2, iArrCopyOf);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, AbstractC2329d.f(2, iArrCopyOf)[1], Bitmap.Config.ALPHA_8);
            aVarG.f21025a.rewind();
            bitmapCreateBitmap.copyPixelsFromBuffer(aVarG.f21025a);
            return bitmapCreateBitmap;
        }
        aVarG.b();
        int[] iArr2 = aVarG.f21026b;
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        AbstractC2329d.e(1, iArrCopyOf2);
        AbstractC2329d.e(1, iArrCopyOf2);
        int i6 = AbstractC2329d.f(1, iArrCopyOf2)[1];
        AbstractC2329d.e(1, iArrCopyOf2);
        int i10 = AbstractC2329d.f(1, iArrCopyOf2)[2];
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i6, Bitmap.Config.ARGB_8888);
        int i11 = i10 * i6;
        int[] iArr3 = new int[i11];
        int[] iArrJ = aVarG.j();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArrJ[i12];
            int i15 = i12 + 2;
            int i16 = iArrJ[i12 + 1];
            i12 += 3;
            iArr3[i13] = Color.rgb(i14, i16, iArrJ[i15]);
        }
        bitmapCreateBitmap2.setPixels(iArr3, 0, i10, 0, 0, i10, i6);
        return bitmapCreateBitmap2;
    }

    @Override // vk.b
    public int f() {
        return this.f8507b;
    }

    public C0906a(xk.a aVar, int i, int i4, int i6) {
        i.j("The actual encoding format of YUV420 is required. Choose a ColorSpaceType from: NV12, NV21, YV12, YV21. Use YUV_420_888 only when loading an android.media.Image.", i != 7);
        aVar.b();
        AbstractC2329d.c(i, aVar.c, i4, i6);
        this.e = aVar;
        this.f8507b = i;
        this.c = i4;
        this.f8508d = i6;
    }
}
