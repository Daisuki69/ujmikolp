package E8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Base64;
import android.widget.LinearLayout;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f1285a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1286b;

    public static byte[] a(int i, byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        if (bArr == null || bArr.length == 0 || (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        if (i != 0) {
            matrix.postRotate(90.0f);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), true);
        kotlin.jvm.internal.j.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
        byte[] byteArray = new byte[0];
        Iterator it = C1110A.V(kotlin.ranges.d.e(kotlin.ranges.d.d(100, 10), 10)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, iIntValue, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
            String strEncodeToString = Base64.encodeToString(byteArray, 0);
            kotlin.jvm.internal.j.f(strEncodeToString, "encodeToString(...)");
            if (zj.z.l(strEncodeToString).length < 1048576) {
                break;
            }
        }
        return byteArray;
    }

    public static byte[] b(byte[] bArr, int i, boolean z4) {
        Bitmap bitmapDecodeByteArray;
        if (bArr == null || bArr.length == 0 || (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        if (z4) {
            matrix.postRotate(90.0f);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), true);
        kotlin.jvm.internal.j.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
        byte[] byteArray = new byte[0];
        Iterator it = C1110A.V(kotlin.ranges.d.e(kotlin.ranges.d.d(100, 10), 10)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, iIntValue, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
            String strEncodeToString = Base64.encodeToString(byteArray, 0);
            kotlin.jvm.internal.j.f(strEncodeToString, "encodeToString(...)");
            if (zj.z.l(strEncodeToString).length < i) {
                break;
            }
        }
        return byteArray;
    }

    public static void c(LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (linearLayout2.getHeight() <= 0 && linearLayout2.getVisibility() != 0) {
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(linearLayout2.getHeight() > 0 ? linearLayout2.getHeight() : linearLayout2.getMeasuredHeight(), 0);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new n(linearLayout2, 0));
        valueAnimatorOfInt.start();
        linearLayout.postDelayed(new l(linearLayout, 0), 50L);
    }

    public static void d(File file, MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        if (mayaEKYCSelectedDocument == null) {
            return;
        }
        File file2 = new File(file, "kycpictures");
        if (!file2.exists()) {
            yk.a.a();
            return;
        }
        File file3 = new File(file2, We.s.i(mayaEKYCSelectedDocument.getKey(), "_FRONT.jpg"));
        File file4 = new File(file2, We.s.i(mayaEKYCSelectedDocument.getKey(), "_BACK.jpg"));
        if (file3.exists()) {
            file3.delete();
        }
        if (file4.exists()) {
            file4.delete();
        }
    }

    public static void e(File file, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, byte[] bArr) {
        File fileI = i(file, mayaEKYCSelectedDocument, "kycpictures");
        if (fileI == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileI);
            try {
                fileOutputStream.write(bArr);
                Unit unit = Unit.f18162a;
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception unused) {
            yk.a.b();
        }
    }

    public static String g(Context context, Uri uri) {
        Bitmap bitmapDecodeStream;
        InputStream inputStreamOpenInputStream;
        kotlin.jvm.internal.j.g(uri, "uri");
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (inputStreamOpenInputStream != null) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    inputStreamOpenInputStream.close();
                } finally {
                }
            } else {
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
            return Base64.encodeToString(byteArray, 0);
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static byte[] h(Context context, Uri uri, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, int i) throws IOException {
        kotlin.jvm.internal.j.g(uri, "uri");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        byte[] bArrZ = Xh.i.z(inputStreamOpenInputStream);
        byte[] bArrB = b(bArrZ, i, false);
        File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
        if (bArrB != null) {
            bArrZ = bArrB;
        }
        File fileI = i(cacheDir, mayaEKYCSelectedDocument, "kycpictures");
        if (fileI == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileI);
            try {
                fileOutputStream.write(bArrZ);
                Unit unit = Unit.f18162a;
                fileOutputStream.close();
                yk.a.a();
                return bArrZ;
            } finally {
            }
        } catch (Exception unused) {
            yk.a.b();
            return null;
        }
    }

    public static File i(File file, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String str) {
        File file2 = new File(file, str);
        if ((!file2.exists() || mayaEKYCSelectedDocument == null) && (!file2.mkdirs() || mayaEKYCSelectedDocument == null)) {
            yk.a.a();
            return null;
        }
        File file3 = new File(androidx.media3.datasource.cache.c.l(file2.getPath(), File.separator, mayaEKYCSelectedDocument.getKey(), ".jpg"));
        if (!file3.exists() || file3.delete()) {
            return file3;
        }
        return null;
    }

    public static Bitmap j(k kVar, Bitmap bitmap) {
        kVar.getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 720, sj.b.b((bitmap.getHeight() / bitmap.getWidth()) * 720), true);
        kotlin.jvm.internal.j.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static Pair k(String str) {
        int i;
        int iMax;
        String string = C2576A.b0(str).toString();
        if (string.length() <= 40) {
            if (C2576A.H(string)) {
                string = null;
            }
            return new Pair(string, null);
        }
        List<String> listI = new zj.o("\\s+").i(0, string);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StringBuilder());
        for (String str2 : listI) {
            StringBuilder sb2 = (StringBuilder) C1110A.G(arrayList);
            int i4 = (sb2.length() == 0 ? 1 : 0) ^ 1;
            if (androidx.media3.datasource.cache.c.b(sb2.length(), i4, str2) > 40) {
                if (arrayList.size() >= 2) {
                    break;
                }
                arrayList.add(new StringBuilder(str2));
            } else {
                if (i4 > 0) {
                    sb2.append(Global.BLANK);
                }
                sb2.append(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((StringBuilder) it.next()).toString());
        }
        if (AbstractC1213b.M("\\s+", C1110A.F(arrayList2, Global.BLANK, null, null, null, 62), Global.BLANK).equals(new zj.o("\\s+").f(Global.BLANK, string))) {
            String str3 = (String) C1110A.C(0, arrayList2);
            if (str3 == null || C2576A.H(str3)) {
                str3 = null;
            }
            String str4 = (String) C1110A.C(1, arrayList2);
            if (str4 != null && !C2576A.H(str4)) {
                str = str4;
            }
            return new Pair(str3, str);
        }
        if (string.length() <= 40) {
            if (C2576A.H(string)) {
                string = null;
            }
            return new Pair(string, null);
        }
        int iMax2 = Math.max(0, 30);
        int i6 = 39;
        if (iMax2 <= 39) {
            i = 39;
            while (true) {
                if (string.charAt(i) == ' ') {
                    String strSubstring = string.substring(i);
                    kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                    if (C2576A.b0(strSubstring).toString().length() <= 40) {
                        break;
                    }
                }
                if (i == iMax2) {
                    break;
                }
                i--;
            }
            i = 40;
        } else {
            i = 40;
        }
        if (i == 40 && string.charAt(40) != ' ' && (iMax = Math.max(0, 35)) <= 39) {
            while (true) {
                if (string.charAt(i6) == ' ') {
                    i = i6;
                    break;
                }
                if (i6 == iMax) {
                    break;
                }
                i6--;
            }
        }
        String strSubstring2 = string.substring(0, i);
        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
        String string2 = C2576A.b0(strSubstring2).toString();
        String strSubstring3 = string.substring(i);
        kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
        String string3 = C2576A.b0(strSubstring3).toString();
        if (C2576A.H(string2)) {
            string2 = null;
        }
        return new Pair(string2, C2576A.H(string3) ? null : string3);
    }

    public byte[] f(byte[] bArr, int i, int i4, int i6, int i10) {
        Bitmap bitmapDecodeByteArray;
        if (bArr == null || bArr.length == 0 || (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        if (i != 0) {
            matrix.postRotate(90.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
        kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
        if (!f1286b) {
            bitmapCreateBitmap = j(this, bitmapCreateBitmap);
        }
        int height = (bitmapCreateBitmap.getHeight() * i6) / i4;
        int height2 = (bitmapCreateBitmap.getHeight() * i10) / i4;
        Rect rect = new Rect(0, height2 - 40, bitmapCreateBitmap.getWidth(), height + height2 + 40);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, rect.left, rect.top, rect.width(), rect.height());
        kotlin.jvm.internal.j.f(bitmapCreateBitmap2, "createBitmap(...)");
        bitmapCreateBitmap.recycle();
        byte[] byteArray = new byte[0];
        Iterator it = C1110A.V(kotlin.ranges.d.e(kotlin.ranges.d.d(100, 10), 10)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, iIntValue, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
            String strEncodeToString = Base64.encodeToString(byteArray, 0);
            kotlin.jvm.internal.j.f(strEncodeToString, "encodeToString(...)");
            if (zj.z.l(strEncodeToString).length < 1048576) {
                break;
            }
        }
        return byteArray;
    }
}
