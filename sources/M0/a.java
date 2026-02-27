package M0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.heifwriter.HeifWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.UUID;
import jk.b;
import kotlin.jvm.internal.j;
import x3.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements K0.a {
    public static void c(Bitmap bitmap, int i, int i4, int i6, String str, int i10) throws Exception {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        b.s("src width = " + width);
        b.s("src height = " + height);
        float fG = d.g(bitmap, i, i4);
        b.s("scale = " + fG);
        float f = width / fG;
        float f3 = height / fG;
        b.s("dst width = " + f);
        b.s("dst height = " + f3);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f3, true);
        j.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapZ = d.z(bitmapCreateScaledBitmap, i6);
        HeifWriter heifWriterBuild = new HeifWriter.Builder(str, bitmapZ.getWidth(), bitmapZ.getHeight(), 2).setQuality(i10).setMaxImages(1).build();
        heifWriterBuild.start();
        heifWriterBuild.addBitmap(bitmapZ);
        heifWriterBuild.stop(5000L);
        heifWriterBuild.close();
    }

    @Override // K0.a
    public final void a(Context context, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, int i, int i4, int i6, int i10, boolean z4, int i11) throws Exception {
        j.g(context, "context");
        String string = UUID.randomUUID().toString();
        j.f(string, "toString(...)");
        File file = new File(context.getCacheDir(), string);
        String absolutePath = file.getAbsolutePath();
        j.f(absolutePath, "getAbsolutePath(...)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i11;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        j.d(bitmapDecodeByteArray);
        c(bitmapDecodeByteArray, i, i4, i10, absolutePath, i6);
        byteArrayOutputStream.write(nj.j.a(file));
    }

    @Override // K0.a
    public final void b(Context context, String str, OutputStream outputStream, int i, int i4, int i6, int i10, boolean z4, int i11, int i12) throws Exception {
        j.g(context, "context");
        String string = UUID.randomUUID().toString();
        j.f(string, "toString(...)");
        File file = new File(context.getCacheDir(), string);
        String absolutePath = file.getAbsolutePath();
        j.f(absolutePath, "getAbsolutePath(...)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i11;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        j.d(bitmapDecodeFile);
        c(bitmapDecodeFile, i, i4, i10, absolutePath, i6);
        outputStream.write(nj.j.a(file));
    }
}
