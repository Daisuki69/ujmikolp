package k2;

import a.AbstractC0617a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.FragmentActivity;
import b5.AbstractC0911c;
import cj.C1110A;
import cj.C1132s;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateException;
import com.dynatrace.android.agent.Global;
import com.mastercard.mpqr.pushpayment.exception.DuplicateTagException;
import com.mastercard.mpqr.pushpayment.exception.FormatException;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.tencent.could.component.common.ai.net.TxNetWorkHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import n.C1880g;
import t.C2264a;
import t.C2265b;
import x5.C2467a;
import y.AbstractC2494a;
import y.C2495b;
import y4.AbstractC2505a;
import y4.C2506b;
import y4.C2507c;
import y4.C2508d;
import z.AbstractC2544f;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f18020a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f18021b = null;
    public static J5.a c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f18022d = 3;
    public static final byte[] e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static y4.f A(String str) throws FormatException {
        str.getClass();
        y4.f fVar = new y4.f();
        int iB = 0;
        while (iB < str.length()) {
            M5.e eVarC = C(iB, str);
            String str2 = eVarC.f3087b;
            int i = Integer.parseInt(str2);
            boolean zEquals = str2.equals("62");
            String str3 = eVarC.c;
            if (zEquals) {
                C2506b c2506b = new C2506b();
                v(str3, c2506b);
                G(fVar, str2, c2506b);
            } else if (str2.equals("05")) {
                y4.e eVar = new y4.e(x4.e.class, "", "05");
                v(str3, eVar);
                G(fVar, str2, eVar);
            } else if (str2.equals("64")) {
                C2507c c2507c = new C2507c(x4.d.class, "^(0[3-9]|[1-9][0-9])$", "64");
                c2507c.e = Arrays.asList(Locale.getISOLanguages());
                v(str3, c2507c);
                G(fVar, str2, c2507c);
            } else if (i > 25 && i < 52) {
                C2508d c2508d = new C2508d(str2);
                v(str3, c2508d);
                G(fVar, str2, c2508d);
            } else if (i <= 79 || i >= 100) {
                G(fVar, str2, str3);
            } else {
                y4.h hVar = new y4.h(str2);
                v(str3, hVar);
                G(fVar, str2, hVar);
            }
            iB = androidx.media3.datasource.cache.c.b(iB, 4, str3);
        }
        return fVar;
    }

    public static void B(AtomicLong atomicLong, long j) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return;
            }
            j7 = j6 - j;
            if (j7 < 0) {
                E1.c.k(new IllegalStateException(androidx.camera.core.impl.a.f(j7, "More produced than requested: ")));
                j7 = 0;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
    }

    public static M5.e C(int i, String str) throws FormatException {
        int i4 = i + 2;
        String strD = D(i, i4, null, str);
        M8.A0.t(strD);
        int i6 = i + 4;
        String strD2 = D(i4, i6, strD, str);
        if (strD2 != null && strD2.length() != 0) {
            int length = strD2.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (Character.isDigit(strD2.charAt(i10))) {
                }
            }
            String strD3 = D(i6, Integer.parseInt(strD2) + i6, strD, str);
            M5.e eVar = new M5.e(6);
            eVar.f3087b = strD;
            eVar.c = strD3;
            return eVar;
        }
        throw new FormatException(We.s.f(i4, "Length field is not numeric start index: "));
    }

    public static String D(int i, int i4, String str, String str2) throws FormatException {
        if (str2.length() >= i4) {
            return str2.substring(i, i4);
        }
        if (str != null) {
            throw new FormatException(String.format("Cannot read enough characters for tag '%1$s'", str));
        }
        throw new FormatException("Cannot read enough characters for next tag");
    }

    public static void E(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                E(file2);
            }
        }
        file.delete();
    }

    public static void F(F7.s sVar, String str, Map map, int i) {
        String str2 = (i & 2) != 0 ? "button" : "link";
        String str3 = (i & 4) != 0 ? "wallet_functions" : "footer";
        if ((i & 8) != 0) {
            map = cj.M.e();
        }
        boolean z4 = (i & 16) == 0;
        MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) sVar;
        mayaWalletFragment.getClass();
        C1219h c1219hD = C1219h.d(EnumC1215d.WALLET);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("button", str);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("button_type", str2);
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("category", str3);
        for (Map.Entry entry : map.entrySet()) {
            c1219hD.h((String) entry.getKey(), (String) entry.getValue());
        }
        if (z4) {
            S5.c cVarQ1 = mayaWalletFragment.q1();
            String strC = c1219hD.c();
            kotlin.jvm.internal.j.f(strC, "getResolvedEvent(...)");
            cVarQ1.g(strC, W5.e.c, c1219hD.j);
        }
        mayaWalletFragment.o1().b(c1219hD);
    }

    public static void G(AbstractC2505a abstractC2505a, String str, Serializable serializable) throws DuplicateTagException {
        M8.A0.t(str);
        str.getClass();
        if (!abstractC2505a.f21056d.containsKey(str)) {
            abstractC2505a.g(str, serializable);
            return;
        }
        String str2 = abstractC2505a.c;
        if (str2 == null) {
            throw new DuplicateTagException(String.format("This tag '%1$s' has a duplicate, with values of '%2$s' and '%3$s'", str, serializable, abstractC2505a.d(str)));
        }
        throw new DuplicateTagException(String.format("This sub-tag '%1$s' at root-tag '%2$s' has a duplicate, with values '%3$s' and '%4$s'", str, str2, serializable, abstractC2505a.d(str)));
    }

    public static String H(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String I(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final Gg.c J(xg.b bVar, io.ktor.utils.io.n content) {
        kotlin.jvm.internal.j.g(bVar, "<this>");
        kotlin.jvm.internal.j.g(content, "content");
        Ng.m responseHeaders = bVar.d().a();
        wg.c client = bVar.f20990a;
        kotlin.jvm.internal.j.g(client, "client");
        kotlin.jvm.internal.j.g(responseHeaders, "responseHeaders");
        return new Gg.c(client, new Ag.k(content, 20), bVar, responseHeaders);
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static long c(AtomicLong atomicLong, long j) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j7 = j6 + j;
        } while (!atomicLong.compareAndSet(j6, j7 >= 0 ? j7 : Long.MAX_VALUE));
        return j6;
    }

    public static Uri d(Uri uri, int i, Context context) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File fileCreateTempFile = File.createTempFile(We.s.j("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()), Global.UNDERSCORE), ".jpg", context.getCacheDir());
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriFromFile = Uri.fromFile(fileCreateTempFile);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                return uriFromFile;
            } catch (Throwable th2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException e7) {
            throw new RuntimeException(e7);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void e(String str, String str2, Object obj) {
        String strN = n(str);
        if (Log.isLoggable(strN, 3)) {
            Log.d(strN, String.format(str2, obj));
        }
    }

    public static void f(String str, TxNetWorkHelper.AnonymousClass1 anonymousClass1) {
        StringBuilder sbV = We.s.v("[ai-network-debug]", str);
        if (anonymousClass1 != null) {
            anonymousClass1.logger("AiOkHttpHelper", sbV.toString());
        } else {
            Log.d("AiOkHttpHelper", sbV.toString());
        }
    }

    public static void g(String str, String str2, Exception exc) {
        String strN = n(str);
        if (Log.isLoggable(strN, 6)) {
            Log.e(strN, str2, exc);
        }
    }

    public static final jj.b h(Enum[] entries) {
        kotlin.jvm.internal.j.g(entries, "entries");
        return new jj.b(entries);
    }

    public static boolean i(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i) || ((c10 = (char) ((r3 | ' ') - 97)) < 26 && c10 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final O.b j(Function1 function1) {
        O.a aVar = new O.a();
        function1.invoke(aVar);
        P.b bVar = aVar.h;
        if (bVar == null) {
            throw new CustomTemplateException("CustomTemplate must have a presenter");
        }
        String str = aVar.f4506d;
        if (str == null) {
            throw new CustomTemplateException("CustomTemplate must have a name");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (O.i iVar : aVar.f4507g) {
            String str2 = (String) C1110A.A(C2576A.T(iVar.f4517a, new String[]{"."}, 2));
            if (linkedHashMap.containsKey(str2)) {
                List list = (List) linkedHashMap.get(str2);
                if (list != null) {
                    list.add(iVar);
                }
            } else {
                linkedHashMap.put(str2, C1132s.h(iVar));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            cj.x.p(C1110A.Q(new B9.a(6), C1110A.V((Iterable) ((Map.Entry) it.next()).getValue())), arrayList);
        }
        return new O.b(str, bVar, aVar.f4505b, arrayList, aVar.f4504a, aVar.c);
    }

    public static String k(Class cls, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            return (String) cls.getMethod("getPath", null).invoke(obj, null);
        }
        File file = (File) cls.getMethod("getDirectory", null).invoke(obj, null);
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    public static String l(Context context, Uri uri) {
        Uri uri2;
        int iLastIndexOf;
        String path = null;
        try {
            if (uri.getScheme().equals("content")) {
                uri2 = uri;
                Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            path = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                        }
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                }
                cursorQuery.close();
            } else {
                uri2 = uri;
            }
            return (path != null || (iLastIndexOf = (path = uri2.getPath()).lastIndexOf(47)) == -1) ? path : path.substring(iLastIndexOf + 1);
        } catch (Exception e7) {
            Log.e("FilePickerUtils", "Failed to handle file name: " + e7.toString());
            return path;
        }
    }

    public static String[] m(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type " + ((String) arrayList.get(i)) + " is unsupported and will be ignored.");
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
        }
        Log.d("FilePickerUtils", "Allowed file extensions mimes: " + arrayList2);
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static String n(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final int o(int i) {
        return (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void p(Context context, AbstractC0911c adVariable) {
        kotlin.jvm.internal.j.g(adVariable, "adVariable");
        String url = adVariable.a();
        Log.d("MayaAdKit/UrlRedirectionUtility", "Redirecting to URL via " + adVariable.b() + ": " + url);
        if (adVariable.b() != s5.i.f20018d && adVariable.b() != s5.i.c) {
            C2467a c2467a = AbstractC0617a.f6973b;
            if (c2467a != null) {
                kotlin.jvm.internal.j.g(url, "url");
                c2467a.f20932b.k0((Activity) context, url);
                return;
            }
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Log.e("MayaAdKit/UrlRedirectionUtility", "No activity found to handle URL: " + url);
    }

    public static final boolean q(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "<this>");
        try {
            PackageManager packageManager = activity.getPackageManager();
            kotlin.jvm.internal.j.f(packageManager, "getPackageManager(...)");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.android.vending", 0);
            kotlin.jvm.internal.j.f(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.enabled;
        } catch (Exception unused) {
            yk.a.e();
            return false;
        }
    }

    public static boolean r(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must be non-null");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalStateException("Application context is null!");
        }
        if (f18020a != null && applicationContext.equals(f18021b)) {
            return f18020a.booleanValue();
        }
        Boolean bool = null;
        f18020a = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (c == null || !applicationContext.equals(f18021b)) {
                c = new J5.a(applicationContext.getPackageManager(), 12);
            }
            J5.a aVar = c;
            aVar.getClass();
            if (i >= 26) {
                if (J5.a.f2412d == null) {
                    try {
                        J5.a.f2412d = PackageManager.class.getDeclaredMethod("isInstantApp", null);
                        bool = (Boolean) J5.a.f2412d.invoke((PackageManager) aVar.f2414b, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                } else {
                    bool = (Boolean) J5.a.f2412d.invoke((PackageManager) aVar.f2414b, null);
                }
            }
        }
        f18021b = applicationContext;
        if (bool != null) {
            f18020a = bool;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f18020a = Boolean.TRUE;
            } catch (ClassNotFoundException unused2) {
                f18020a = Boolean.FALSE;
            }
        }
        return f18020a.booleanValue();
    }

    public static final boolean s(FragmentActivity fragmentActivity) {
        Object systemService = fragmentActivity.getSystemService("connectivity");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static V4.a t(android.content.Context r11, android.net.Uri r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.v0.t(android.content.Context, android.net.Uri, boolean):V4.a");
    }

    public static C2264a u(C2495b c2495b, C1880g c1880g) {
        return new C2264a(x.p.a(c2495b, c1880g, 1.0f, x.f.f20816b, false), 0);
    }

    public static AbstractC2505a v(String str, AbstractC2505a abstractC2505a) throws FormatException {
        int iB = 0;
        while (iB < str.length()) {
            M5.e eVarC = C(iB, str);
            String str2 = eVarC.f3087b;
            int i = Integer.parseInt(str2);
            boolean z4 = abstractC2505a instanceof C2506b;
            String str3 = eVarC.c;
            if (!z4 || i <= 49 || i >= 100) {
                G(abstractC2505a, str2, str3);
            } else {
                y4.h hVar = new y4.h(We.s.i(str2, " (in main TAG_62_ADDITIONAL_DATA)"));
                v(str3, hVar);
                G(abstractC2505a, str2, hVar);
            }
            iB = androidx.media3.datasource.cache.c.b(iB, 4, str3);
        }
        return abstractC2505a;
    }

    public static C2265b w(AbstractC2494a abstractC2494a, C1880g c1880g, boolean z4) {
        return new C2265b(x.p.a(abstractC2494a, c1880g, z4 ? AbstractC2544f.c() : 1.0f, x.f.c, false), 3);
    }

    public static C2264a x(C2495b c2495b, C1880g c1880g) {
        return new C2264a(x.p.a(c2495b, c1880g, 1.0f, x.f.f20817d, false), 2);
    }

    public static C2264a y(C2495b c2495b, C1880g c1880g) {
        return new C2264a(x.p.a(c2495b, c1880g, AbstractC2544f.c(), x.f.f, true), 3);
    }

    public static y4.f z(String str) throws InvalidTagValueException {
        str.getClass();
        if (E1.c.t(str)) {
            return A(str);
        }
        throw new InvalidTagValueException(x4.f.f20925r, str.length() > 4 ? str.substring(str.length() - 4) : null);
    }
}
