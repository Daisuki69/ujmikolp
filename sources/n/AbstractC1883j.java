package n;

import D.CallableC0192z;
import We.C0600d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import s.C2223h;
import y.AbstractC2494a;
import y.C2495b;
import z.AbstractC2540b;
import z.AbstractC2544f;

/* JADX INFO: renamed from: n.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1883j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f18472a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18473b = {80, 75, 3, 4};

    public static y a(String str, Callable callable) {
        C1880g c1880g = str == null ? null : (C1880g) C2223h.f19977b.f19978a.get(str);
        if (c1880g != null) {
            return new y(new CallableC0192z(c1880g, 7), false);
        }
        HashMap map = f18472a;
        if (str != null && map.containsKey(str)) {
            return (y) map.get(str);
        }
        y yVar = new y(callable, false);
        if (str != null) {
            yVar.c(new C1881h(str, 0));
            yVar.b(new C1881h(str, 1));
            map.put(str, yVar);
        }
        return yVar;
    }

    public static w b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new w((Throwable) e);
        }
    }

    public static w c(InputStream inputStream, String str) {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(inputStream));
            String[] strArr = AbstractC2494a.e;
            return d(new C2495b(bufferedSourceBuffer), str, true);
        } finally {
            AbstractC2544f.b(inputStream);
        }
    }

    public static w d(C2495b c2495b, String str, boolean z4) {
        try {
            try {
                C1880g c1880gA = x.r.a(c2495b);
                if (str != null) {
                    C2223h.f19977b.f19978a.put(str, c1880gA);
                }
                w wVar = new w(c1880gA);
                if (z4) {
                    AbstractC2544f.b(c2495b);
                }
                return wVar;
            } catch (Exception e) {
                w wVar2 = new w((Throwable) e);
                if (z4) {
                    AbstractC2544f.b(c2495b);
                }
                return wVar2;
            }
        } catch (Throwable th2) {
            if (z4) {
                AbstractC2544f.b(c2495b);
            }
            throw th2;
        }
    }

    public static w e(Context context, int i, String str) {
        Boolean bool;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i)));
            try {
                BufferedSource bufferedSourcePeek = bufferedSourceBuffer.peek();
                byte[] bArr = f18473b;
                int length = bArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        bufferedSourcePeek.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (bufferedSourcePeek.readByte() != bArr[i4]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i4++;
                }
            } catch (Exception unused) {
                AbstractC2540b.f21333a.getClass();
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? f(new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : c(bufferedSourceBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new w((Throwable) e);
        }
    }

    public static w f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            AbstractC2544f.b(zipInputStream);
        }
    }

    public static w g(ZipInputStream zipInputStream, String str) {
        t tVar;
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1880g c1880g = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(zipInputStream));
                    String[] strArr = AbstractC2494a.e;
                    c1880g = (C1880g) d(new C2495b(bufferedSourceBuffer), null, false).f18531a;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c1880g == null) {
                return new w((Throwable) new IllegalArgumentException(numX49.tnTj78("b24j")));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator it = c1880g.f18461d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        tVar = null;
                        break;
                    }
                    tVar = (t) it.next();
                    if (tVar.c.equals(str2)) {
                        break;
                    }
                }
                if (tVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    C0600d c0600d = AbstractC2544f.f21341a;
                    int width = bitmap.getWidth();
                    int i = tVar.f18500a;
                    int i4 = tVar.f18501b;
                    if (width != i || bitmap.getHeight() != i4) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i4, true);
                        bitmap.recycle();
                        bitmap = bitmapCreateScaledBitmap;
                    }
                    tVar.f18502d = bitmap;
                }
            }
            for (Map.Entry entry2 : c1880g.f18461d.entrySet()) {
                if (((t) entry2.getValue()).f18502d == null) {
                    return new w((Throwable) new IllegalStateException(numX49.tnTj78("b24d").concat(((t) entry2.getValue()).c)));
                }
            }
            if (str != null) {
                C2223h.f19977b.f19978a.put(str, c1880g);
            }
            return new w(c1880g);
        } catch (IOException e) {
            return new w((Throwable) e);
        }
    }

    public static String h(Context context, int i) {
        return androidx.camera.core.impl.a.o(new StringBuilder(numX49.tnTj78("b24i")), (context.getResources().getConfiguration().uiMode & 48) == 32 ? numX49.tnTj78("b24E") : numX49.tnTj78("b24F"), i);
    }
}
