package L0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import jk.b;
import kotlin.jvm.internal.j;
import x3.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements K0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.CompressFormat f2797b;

    public a(int i) {
        this.f2796a = i;
        this.f2797b = i != 1 ? i != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    @Override // K0.a
    public final void a(Context context, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, int i, int i4, int i6, int i10, boolean z4, int i11) throws IOException {
        j.g(context, "context");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i11;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        float width = bitmapDecodeByteArray.getWidth();
        float height = bitmapDecodeByteArray.getHeight();
        b.s("src width = " + width);
        b.s("src height = " + height);
        float fG = d.g(bitmapDecodeByteArray, i, i4);
        b.s("scale = " + fG);
        float f = width / fG;
        float f3 = height / fG;
        b.s("dst width = " + f);
        b.s("dst height = " + f3);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, (int) f, (int) f3, true);
        j.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapZ = d.z(bitmapCreateScaledBitmap, i10);
        Bitmap.CompressFormat compressFormat = this.f2797b;
        bitmapZ.compress(compressFormat, i6, byteArrayOutputStream2);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        j.f(byteArray, "toByteArray(...)");
        if (!z4 || compressFormat != Bitmap.CompressFormat.JPEG) {
            byteArrayOutputStream.write(byteArray);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        byteArrayOutputStream3.write(byteArray);
        byteArrayOutputStream.write(new H0.a(bArr).a(context, byteArrayOutputStream3).toByteArray());
    }

    @Override // K0.a
    public final void b(Context context, String str, OutputStream outputStream, int i, int i4, int i6, int i10, boolean z4, int i11, int i12) throws IOException {
        j.g(context, "context");
        if (i12 <= 0) {
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = i11;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            j.d(bitmapDecodeFile);
            byte[] bArrI = d.i(bitmapDecodeFile, i, i4, i6, i10, this.f2796a);
            if (!z4 || this.f2797b != Bitmap.CompressFormat.JPEG) {
                outputStream.write(bArrI);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArrI);
            outputStream.write(new H0.a(str).a(context, byteArrayOutputStream).toByteArray());
        } catch (OutOfMemoryError unused) {
            System.gc();
            b(context, str, outputStream, i, i4, i6, i10, z4, i11 * 2, i12 - 1);
        }
    }

    public final int c() {
        return this.f2796a;
    }
}
