package com.shield.android.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import com.google.android.gms.common.GoogleApiAvailability;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.h.b;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15427d = {1176739732, 256178089, 777388342, -603021391, 1430494465, 994926726, 1356687970, 1047017056, 286211519, 1015584065, 1804717824, -1759211055, 908400341, 206764689, 1774513834, 1593245294, 1331361337, 2110192162, 488323097, 349591669, 481512207, 2046047141, 456200483, 2009672590, 733592023, 2096484553, 1912025110, 688875583, 329314048, 1456764074, 1595013348, 1390619171, 935068086, 455991044, 1108667790, 40452617, 856668487, 568590813, 615671660, 604685255, -2078063473, -2076826841, -2029458987, -512001954, 1682308119, 910697211, 104496023, 952511550, 499905859, 1606235553, 546285392, 1349827246, 1915046043, 1990442481, 61737219, 116736843};
    private static final int[] gv;
    private static final String[] gw;
    private static final Map<String, List<ExecutorService>> gx;
    private static final Map<String, List<ExecutorService>> gy;

    public static class a extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15428d = {562694552, 1636217669, 1443433914, 55586192, 175839309, 1214599315};

        public /* synthetic */ a(int i, String str, byte b8) {
            this(i, str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private a(int i, String str) {
            long[] jArr = f15428d;
            long j = jArr[0];
            super(i < (((int) j) ^ 562694554) ? ((int) jArr[1]) ^ 1636217668 : ((int) j) ^ 562694554, i, j ^ 562694554, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str));
        }
    }

    public static class b extends Thread {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15429d = {195852383, 1135955974, 1911327879, 1469779318, 1933452215};

        public b(Runnable runnable, String str) {
            super(runnable, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(((int) f15429d[0]) ^ 195852373);
            super.run();
        }
    }

    public static class c implements ThreadFactory {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15430d = {2495051, 1583642618, 1130321728, 21252899, 1423067853, 1768070336};
        private final AtomicInteger gA = new AtomicInteger(((int) f15430d[0]) ^ 2495050);
        private String gz;

        public c(String str) {
            this.gz = d("ђ艨䅩⃥ာࡄ葓䉧ꅪ탶栤둘\uda64");
            this.gz = str;
        }

        public static String d(String str) {
            int i = ((int) f15430d[1]) ^ 1583644664;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15430d[2]) ^ 1130321728;
            while (i4 < str.length()) {
                long[] jArr = f15430d;
                int i6 = (((i >> (((int) jArr[2]) ^ 1130321728)) ^ (i >> (((int) jArr[3]) ^ 21252897))) ^ (i >> (((int) jArr[4]) ^ 1423067854))) ^ (i >> 5);
                long j = jArr[0];
                i = (char) ((i >> (((int) j) ^ 2495050)) | (((char) (i6 & (((int) j) ^ 2495050))) << (((int) jArr[5]) ^ 1768070351)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15430d[0];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 2495050, i11, i10, (((int) j6) ^ 2495050) + i10 + i11));
                long j7 = f15430d[0];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 2495050) + (((int) j7) ^ 2495050) + ((~(((int) j7) ^ 2495050)) | i12) + (((((int) j7) ^ 2495050) + i4) - ((((((int) j7) ^ 2495050) + i4) + (((int) j7) ^ 2495050)) + ((~(((int) j7) ^ 2495050)) | i12)));
            }
            return sb2.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new b(runnable, this.gz + this.gA.getAndIncrement());
        }
    }

    static {
        int[] iArr = new int[((int) 908400341) ^ 908400339];
        iArr[((int) 256178089) ^ 256178089] = -256;
        iArr[((int) 1176739732) ^ 1176739733] = ((int) (-2078063473)) ^ 2078033039;
        iArr[((int) 488323097) ^ 488323099] = ((int) (-2076826841)) ^ 2067193048;
        iArr[((int) 349591669) ^ 349591670] = ((int) (-2029458987)) ^ 2013849898;
        iArr[4] = ((int) (-512001954)) ^ 511412062;
        iArr[5] = ((int) (-1759211055)) ^ 1747227089;
        gv = iArr;
        String[] strArr = new String[((int) 1682308119) ^ 1682308107];
        strArr[((int) 256178089) ^ 256178089] = f("럙럺럪럫럱럶럯럚럽럧럸럸럵럄럗랸럘럮럯럼럢럮럾랣럶럷럦");
        strArr[((int) f15427d[0]) ^ 1176739733] = f("럙럴럵런런럸럏럲럽럽랾럥럢럱");
        strArr[((int) f15427d[18]) ^ 488323099] = f("럙럮러런럨럺럑럲럼럼랾럥럢럱");
        strArr[((int) f15427d[19]) ^ 349591670] = f("럞럺럶럺럷럱럻럎럱럡럹럡럢랺럖럺럦럯랦럽럺럩");
        strArr[4] = f("럞럺럶럺럷럱럻럎럱럡럹럡럢랺럆런럭럾럤럨럼랡럸럹럤");
        strArr[5] = f("럞럩럷런럺럌럽럳럡랾럒럾럺럳랺럡럾럭");
        strArr[((int) f15427d[12]) ^ 908400339] = f("럞럩럷런럺럌럽럳럡랽럤럥런");
        strArr[((int) f15427d[24]) ^ 733592016] = f("럞럩럷런럺럌럽럳럡럞럿럿럹랹럠럡러");
        strArr[((int) f15427d[6]) ^ 1356687978] = f("럔럴러럶럍럾럲럮럕럶럿럣럱럾럵럻랧량럧럥럪랡럣럹럤");
        strArr[((int) f15427d[27]) ^ 688875574] = f("럔럴러럶럍럾럲럮럕럶럿럣럱럾럵럻랧럆럭럭럧럺럡랣럭럷럦");
        strArr[((int) f15427d[10]) ^ 1804717834] = f("럔럴러럶럍럾럲럮럕럶럿럣럱럾럵럻랧럙럭럮럻럣럭럿랬러럴럧");
        strArr[((int) f15427d[30]) ^ 1595013359] = f("럈럴럺럶럪런랱럟럾럲럳럺랸럣럠럳");
        strArr[((int) f15427d[32]) ^ 935068090] = f("럈럴럺럶럪런랱럟럾럲럳럺럟럣럵럹럣럨랦럽럺럩");
        strArr[((int) f15427d[34]) ^ 1108667779] = f("럈럴럺럶럪런랱럟럽럿럴랿럢럣럲");
        strArr[((int) f15427d[36]) ^ 856668489] = f("럈럴럺럶럪런랱럟럽럿럴럘럢럶럸럼럩랥럼럽럨");
        strArr[((int) f15427d[38]) ^ 615671651] = f("럈럴럺럶럪런랱럔럦럲럼럸럵랹럠럡러");
        strArr[((int) f15427d[15]) ^ 1593245310] = f("럈럴럺럶럪런랱럐럷럷럹럤럻랹럠럡러");
        strArr[((int) f15427d[45]) ^ 910697194] = f("럈럴럺럶럪런랱럐럷럷럹럤럻럞럠럴럦럢럫랧럺럻럪");
        strArr[((int) f15427d[46]) ^ 104496005] = f("럈럴럺럶럪런랱럏럷럴럥럽럷럥랺럡럾럭");
        strArr[((int) f15427d[14]) ^ 1774513849] = f("럈럴럺럶럪런럟럲럼럷럵럿럥럲런랸럇럮러럠럻럢랢럹럶럥");
        strArr[((int) f15427d[47]) ^ 952511530] = f("럈럴럺럶럪런럟럲럼럷럵럿럥럲런랸럇럮러럠럻럢럅럹럣럯럩럢램럳런럣");
        strArr[((int) f15427d[48]) ^ 499905878] = f("럈럴럺럶럪런럟럲럼럷럵럿럥럲런랸럘럮럯럼럢럮럾랣럶럷럦");
        strArr[((int) f15427d[49]) ^ 1606235575] = f("량럴럭럫럽럺럏럼럼럠럀럣럹랺럖럺럦럯랦럽럺럩");
        strArr[((int) f15427d[50]) ^ 546285383] = f("량럴럭럫럽럺럏럼럼럠럀럣럹랺럖럺럦럯럁럽럯럣럥럮랬럷럴럧");
        strArr[((int) f15427d[7]) ^ 1047017080] = f("량럴럭럫럽럺럏럼럼럠럀럣럹랺럝럡럫럧럡럪랠럻럸럫");
        strArr[((int) f15427d[51]) ^ 1349827255] = f("량럴럭럫럽럺럏럼럼럠럀럣럹랺럆런럭럾럤럨럼랡럸럹럤");
        strArr[((int) f15427d[52]) ^ 1915046017] = f("량럴럭럫럽럺럏럼럼럠럀럣럹랺럇런럧럢럊럦럢럫랢럹럶럥");
        strArr[((int) f15427d[53]) ^ 1990442474] = f("량럴럭럫럽럺럏럼럼럠럀럣럹랺럇런럧럢럊럦럢럫럅럹럣럯럩럢램럳런럣");
        gw = strArr;
        gx = new ConcurrentHashMap();
        gy = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean L(Context context) {
        try {
            return LocationManagerCompat.isLocationEnabled((LocationManager) context.getSystemService(f("럶럴럻럸럪럶럳럳")));
        } catch (Exception unused) {
            return ((int) f15427d[1]) ^ 256178089;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [long[]] */
    public static boolean M(Context context) {
        int i;
        int i4 = 256178089;
        ?? r1 = 1;
        r1 = 1;
        try {
            Class.forName(f("럹럴럵랷럹런럳럺럾럶랾런럸럳럦럺럣럯랦럮럣럼랢럮럭럮럭럮럨랩럃럪럕럜럔럜럿럏럕럼럄럒럙럝럗럕럝럙럃럟럑"));
            Class.forName(f("럹럴럵랷럹런럳럺럾럶랾런럸럳럦럺럣럯랦럮럣럼랢럡럭럠럡럵럯럨럪랫럼럎럋럜럚럳럓럞럓럇럙럞럘럧럆럚럜럂럌럌럜러럀럄럇럍럔"));
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                i = (int) f15427d[0];
                i4 = 1176739733;
            } else {
                r1 = f15427d[1];
                i = (int) r1;
            }
        } catch (Exception unused) {
            r1 = f15427d[r1];
            i = (int) r1;
        }
        return i ^ i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [long[]] */
    public static boolean N(Context context) {
        int i;
        int i4 = 256178089;
        ?? r1 = 1;
        r1 = 1;
        try {
            Class.forName(f("럹럴럵랷럹런럳럺럾럶랾런럸럳럦럺럣럯랦럮럣럼랢러럦런랮럨럢럢럪럱럓럝럑럜럌랑럽럙럄럖럂럅럟럄럝럛럍럢럌럪럂럆량럃럖"));
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                i = (int) f15427d[0];
                i4 = 1176739733;
            } else {
                r1 = f15427d[1];
                i = (int) r1;
            }
        } catch (Exception unused) {
            r1 = f15427d[r1];
            i = (int) r1;
        }
        return i ^ i4;
    }

    public static int O(Context context) {
        int i = ((int) f15427d[1]) ^ 256178089;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(f("럻럮럼런럱"));
            if (audioManager != null) {
                return audioManager.getMode();
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(CharSequence charSequence) {
        int i;
        int i4;
        if (TextUtils.isEmpty(charSequence) || TextUtils.getTrimmedLength(charSequence) == 0) {
            i = (int) f15427d[0];
            i4 = 1176739733;
        } else {
            i = (int) f15427d[1];
            i4 = 256178089;
        }
        return i ^ i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Context context, String str) {
        int i;
        int i4;
        if (context.checkCallingOrSelfPermission(str) == 0) {
            i = (int) f15427d[0];
            i4 = 1176739733;
        } else {
            i = (int) f15427d[1];
            i4 = 256178089;
        }
        return i ^ i4;
    }

    private static Bitmap bR() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(200, ((int) f15427d[2]) ^ 777388366, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(((int) f15427d[3]) ^ 595990329);
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        int[] iArr = new int[width * height];
        long j = f15427d[1];
        bitmapCreateBitmap.getPixels(iArr, ((int) j) ^ 256178089, width, ((int) j) ^ 256178089, ((int) j) ^ 256178089, width, height);
        Random random = new Random();
        int i = ((int) f15427d[1]) ^ 256178089;
        while (i < height) {
            int i4 = ((int) f15427d[1]) ^ 256178089;
            while (i4 < width) {
                if (random.nextInt(((int) f15427d[4]) ^ 1430494564) >= (((int) f15427d[5]) ^ 994926778)) {
                    int i6 = (i * width) + i4;
                    int iNextInt = random.nextInt(255);
                    iArr[i6] = Color.rgb(iNextInt, iNextInt, iNextInt) | iArr[i6];
                }
                long j6 = f15427d[0];
                int i10 = ~i4;
                i4 = i4 + (((int) j6) ^ 1176739733) + (((int) j6) ^ 1176739733) + ((~(1176739733 ^ ((int) j6))) | i10) + (((((int) j6) ^ 1176739733) + i4) - ((((((int) j6) ^ 1176739733) + i4) + (((int) j6) ^ 1176739733)) + ((~(((int) j6) ^ 1176739733)) | i10)));
            }
            long j7 = f15427d[0];
            int i11 = ~i;
            i = i + (((int) j7) ^ 1176739733) + (((int) j7) ^ 1176739733) + ((~(((int) j7) ^ 1176739733)) | i11) + (((((int) j7) ^ 1176739733) + i) - ((((((int) j7) ^ 1176739733) + i) + (((int) j7) ^ 1176739733)) + ((~(((int) j7) ^ 1176739733)) | i11)));
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, bitmapCreateBitmap.getConfig());
        long j9 = f15427d[1];
        bitmapCreateBitmap2.setPixels(iArr, ((int) j9) ^ 256178089, width, ((int) j9) ^ 256178089, ((int) j9) ^ 256178089, width, height);
        new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap2;
    }

    public static String bS() {
        StringBuilder sb2 = new StringBuilder(((int) f15427d[12]) ^ 908400339);
        int i = ((int) f15427d[1]) ^ 256178089;
        while (i < (((int) f15427d[12]) ^ 908400339)) {
            sb2.append(f("랪랪랪랪랪랪랪랪랪랪럑럓럕럓럑럓럍럃럁럃럅럃럁럃럍럓럑럓럕럓럑럓럭럣럡럣").charAt(new Random().nextInt(((int) f15427d[13]) ^ 206764725)));
            long j = f15427d[0];
            int i4 = ~i;
            i = i + (((int) j) ^ 1176739733) + (((int) j) ^ 1176739733) + ((~(((int) j) ^ 1176739733)) | i4) + (((((int) j) ^ 1176739733) + i) - ((((((int) j) ^ 1176739733) + i) + (((int) j) ^ 1176739733)) + ((~(((int) j) ^ 1176739733)) | i4)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean bT() {
        int i;
        int i4;
        try {
            Class.forName(f("럻럵럼럫럱럶럸럥랼럲럴럢랸럾런런럤럿럡럯럧럪럾랣럃럧럶럤럴럳럭럶럓럕럟런럚럼럐럔럗럝럄"));
            i = (int) f15427d[0];
            i4 = 1176739733;
        } catch (Exception unused) {
            i = (int) f15427d[1];
            i4 = 256178089;
        }
        return i ^ i4;
    }

    public static <T> T c(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static int d(Context context, String str) {
        try {
            return Settings.System.getInt(context.getContentResolver(), str);
        } catch (Settings.SettingNotFoundException unused) {
            return ((int) f15427d[1]) ^ 256178089;
        }
    }

    public static String e(Context context, String str) {
        try {
            return Settings.System.getString(context.getContentResolver(), str);
        } catch (Exception unused) {
            return f("");
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15427d[1]) ^ 256178089;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15427d;
            long j = jArr[54];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 61783705) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 61783705)) + (((int) j6) ^ 1176739733), (~(((int) j) ^ 61783705)) | i4, i6, (((((int) j) ^ 61783705) + cCharAt) + (((int) j6) ^ 1176739733)) + ((~(((int) j) ^ 61783705)) | i4)) ^ (i % (((int) jArr[55]) ^ 116767924))));
            long j7 = f15427d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1176739733) + (((int) j7) ^ 1176739733) + ((~(((int) j7) ^ 1176739733)) | i10) + (((((int) j7) ^ 1176739733) + i) - ((((((int) j7) ^ 1176739733) + i) + (((int) j7) ^ 1176739733)) + ((~(((int) j7) ^ 1176739733)) | i10)));
        }
        return sb2.toString();
    }

    public static int g(Context context, String str) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), str);
        } catch (Settings.SettingNotFoundException unused) {
            return ((int) f15427d[1]) ^ 256178089;
        }
    }

    @RequiresApi(api = 17)
    public static int h(Context context, String str) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), str);
        } catch (Settings.SettingNotFoundException unused) {
            return ((int) f15427d[1]) ^ 256178089;
        }
    }

    @RequiresApi(api = 17)
    public static String i(Context context, String str) {
        try {
            return Settings.Global.getString(context.getContentResolver(), str);
        } catch (Exception unused) {
            return f("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(Context context, String str) {
        int i;
        int i4;
        if (ContextCompat.checkSelfPermission(context, str) == 0) {
            i = (int) f15427d[0];
            i4 = 1176739733;
        } else {
            i = (int) f15427d[1];
            i4 = 256178089;
        }
        return i ^ i4;
    }

    public static SharedPreferences k(@NonNull Context context, @NonNull String str) {
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append(f("럅럫럪럼럸럺럮럸럼런럵럢"));
        return context.getSharedPreferences(sbW.toString(), ((int) f15427d[1]) ^ 256178089);
    }

    public static Bitmap m(String str) {
        Bitmap bitmapBR = bR();
        Canvas canvas = new Canvas(bitmapBR);
        canvas.drawBitmap(bitmapBR, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        int i = ((int) f15427d[1]) ^ 256178089;
        while (i < str.toCharArray().length) {
            char c10 = str.toCharArray()[i];
            int[] iArr = gv;
            paint.setColor(iArr[new Random().nextInt(iArr.length)]);
            try {
                StringBuilder sb2 = new StringBuilder(f("략럨럡럪럪럺럱랲럴럼럾럥럥랸"));
                String[] strArr = gw;
                sb2.append(strArr[new Random().nextInt(strArr.length)]);
                paint.setTypeface(Typeface.createFromFile(sb2.toString()));
            } catch (Exception unused) {
            }
            paint.setTextSize(new Random().nextInt(((int) f15427d[6]) ^ 1356687978) + (((int) f15427d[7]) ^ 1047017080));
            String strValueOf = String.valueOf(c10);
            long[] jArr = f15427d;
            canvas.drawText(strValueOf, ((((int) jArr[7]) ^ 1047017080) * i) + (((int) jArr[8]) ^ 286211489), (new Random().nextInt(((int) f15427d[10]) ^ 1804717834) + (((int) jArr[9]) ^ 1015584115)) - 5, paint);
            long j = f15427d[0];
            int i4 = ~i;
            i = i + (((int) j) ^ 1176739733) + (((int) j) ^ 1176739733) + ((~(((int) j) ^ 1176739733)) | i4) + (((((int) j) ^ 1176739733) + i) - ((((((int) j) ^ 1176739733) + i) + (((int) j) ^ 1176739733)) + ((~(((int) j) ^ 1176739733)) | i4)));
        }
        return bitmapBR;
    }

    public static String n(String str) {
        String str2 = null;
        if (str != null && !str.isEmpty()) {
            int i = ((int) f15427d[1]) ^ 256178089;
            String[] strArrSplit = str.split(f("략"));
            int length = strArrSplit.length;
            int i4 = ((int) f15427d[1]) ^ 256178089;
            while (i4 < length) {
                String str3 = strArrSplit[i4];
                if (str3.matches(f("럄랳럃럘랳럅럽랰럨럎럫랠럫럌럕랸럐럪랥럳럒럫럓럐램럟랮램랭럜럅램럠럚랕럃럣럤럽랐럨럒랝럋럪럓럫럨란랏"))) {
                    long j = f15427d[0];
                    int i6 = ~i;
                    i = i + (((int) j) ^ 1176739733) + (((int) j) ^ 1176739733) + ((~(((int) j) ^ 1176739733)) | i6) + (((((int) j) ^ 1176739733) + i) - ((((((int) j) ^ 1176739733) + i) + (((int) j) ^ 1176739733)) + ((~(((int) j) ^ 1176739733)) | i6)));
                    if (i == (((int) j) ^ 1176739733)) {
                        str2 = str3;
                    }
                }
                long j6 = f15427d[0];
                int i10 = ~i4;
                i4 = i4 + (((int) j6) ^ 1176739733) + (((int) j6) ^ 1176739733) + ((~(((int) j6) ^ 1176739733)) | i10) + (((((int) j6) ^ 1176739733) + i4) - ((((((int) j6) ^ 1176739733) + i4) + (((int) j6) ^ 1176739733)) + ((~(((int) j6) ^ 1176739733)) | i10)));
            }
        }
        return str2;
    }

    public static String o(String str) {
        return a(f("럻럵럼럫럱럶럸랳럽럠랾럂럯럤럠런럧럛럺럦럾럪럾럹럫럦럳"), str);
    }

    @SuppressLint({"PrivateApi"})
    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(str);
            String strF = f("럽럾러");
            long[] jArr = f15427d;
            Class<?>[] clsArr = new Class[((int) jArr[0]) ^ 1176739733];
            clsArr[((int) jArr[1]) ^ 256178089] = String.class;
            Method declaredMethod = cls.getDeclaredMethod(strF, clsArr);
            long[] jArr2 = f15427d;
            Object[] objArr = new Object[((int) jArr2[0]) ^ 1176739733];
            objArr[((int) jArr2[1]) ^ 256178089] = str2;
            return (String) declaredMethod.invoke(null, objArr);
        } catch (Exception unused) {
            return f("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(ShieldException shieldException) {
        long j;
        int i;
        int i4 = 256178089;
        if (shieldException == null) {
            j = f15427d[1];
        } else {
            if (shieldException.code == 0) {
                i = (int) f15427d[0];
                i4 = 1176739733;
                return i ^ i4;
            }
            j = f15427d[1];
        }
        i = (int) j;
        return i ^ i4;
    }

    public static String f(Context context, String str) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), str);
        } catch (Exception unused) {
            return f("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(int i) {
        int i4;
        int i6;
        if (Build.VERSION.SDK_INT >= i) {
            i4 = (int) f15427d[0];
            i6 = 1176739733;
        } else {
            i4 = (int) f15427d[1];
            i6 = 256178089;
        }
        return i4 ^ i6;
    }

    public static Bitmap a(int i, int i4) {
        Bitmap bitmapBR = bR();
        Canvas canvas = new Canvas(bitmapBR);
        canvas.drawBitmap(bitmapBR, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(((int) f15427d[11]) ^ 1747227089);
        paint.setTextSize(24.0f);
        canvas.drawText(i + f("랺랰랸") + i4 + f("랺랦랸"), 30.0f, 50.0f, paint);
        return bitmapBR;
    }

    public static String b(byte[] bArr) {
        long[] jArr = f15427d;
        char[] cArr = new char[((int) jArr[15]) ^ 1593245310];
        long j = jArr[1];
        cArr[((int) j) ^ 256178089] = ((int) jArr[16]) ^ 62985;
        char c10 = 0;
        long j6 = jArr[0];
        cArr[((int) j6) ^ 1176739733] = ((int) jArr[17]) ^ 64019;
        cArr[((int) jArr[18]) ^ 488323099] = ((int) jArr[9]) ^ 38259;
        cArr[((int) jArr[19]) ^ 349591670] = ((int) jArr[20]) ^ 19260;
        cArr[4] = ((int) jArr[21]) ^ 13201;
        cArr[5] = ((int) jArr[22]) ^ 4374;
        cArr[((int) jArr[12]) ^ 908400339] = ((int) jArr[23]) ^ 11192;
        cArr[((int) jArr[24]) ^ 733592016] = ((int) jArr[25]) ^ 53502;
        cArr[((int) jArr[6]) ^ 1356687978] = ((int) jArr[26]) ^ 12334;
        cArr[((int) jArr[27]) ^ 688875574] = ((int) jArr[28]) ^ 61241;
        cArr[((int) jArr[10]) ^ 1804717834] = ((int) jArr[29]) ^ 29931;
        cArr[((int) jArr[30]) ^ 1595013359] = ((int) jArr[31]) ^ 10849;
        cArr[((int) jArr[32]) ^ 935068090] = ((int) jArr[33]) ^ 57159;
        cArr[((int) jArr[34]) ^ 1108667779] = ((int) jArr[35]) ^ 16973;
        cArr[((int) jArr[36]) ^ 856668489] = ((int) jArr[37]) ^ 408;
        cArr[((int) jArr[38]) ^ 615671651] = ((int) jArr[39]) ^ 50049;
        char[] cArr2 = new char[bArr.length << (((int) j6) ^ 1176739733)];
        int i = ((int) j) ^ 256178089;
        while (i < bArr.length) {
            int i4 = bArr[i] & 255;
            long[] jArr2 = f15427d;
            long j7 = jArr2[c10];
            cArr2[i << (((int) j7) ^ 1176739733)] = cArr[i4 >>> 4];
            long j9 = jArr2[38];
            cArr2[(i << (((int) j7) ^ 1176739733)) + (((int) j7) ^ 1176739733)] = cArr[((((int) j9) ^ 615671651) + i4) - ((((((int) j9) ^ 615671651) + i4) + (((int) j7) ^ 1176739733)) + ((~i4) | (~(((int) j9) ^ 615671651))))];
            int i6 = ~i;
            i = i + (((int) j7) ^ 1176739733) + (((int) j7) ^ 1176739733) + ((~(((int) j7) ^ 1176739733)) | i6) + (((((int) j7) ^ 1176739733) + i) - ((((((int) j7) ^ 1176739733) + i) + (((int) j7) ^ 1176739733)) + ((~(((int) j7) ^ 1176739733)) | i6)));
            c10 = 0;
        }
        return new String(cArr2);
    }

    public static String n(boolean z4) {
        long j;
        int iNextInt = new Random().nextInt(513) - 256;
        if (z4) {
            long[] jArr = f15427d;
            if (iNextInt % (488323099 ^ ((int) jArr[18])) != 0) {
                j = jArr[0];
                int i = ~iNextInt;
                iNextInt = iNextInt + (((int) j) ^ 1176739733) + (((int) j) ^ 1176739733) + ((~(((int) j) ^ 1176739733)) | i) + (((((int) j) ^ 1176739733) + iNextInt) - ((((((int) j) ^ 1176739733) + iNextInt) + (((int) j) ^ 1176739733)) + ((~(((int) j) ^ 1176739733)) | i)));
            }
        } else {
            long[] jArr2 = f15427d;
            if (iNextInt % (488323099 ^ ((int) jArr2[18])) == 0) {
                j = jArr2[0];
                int i4 = ~iNextInt;
                iNextInt = iNextInt + (((int) j) ^ 1176739733) + (((int) j) ^ 1176739733) + ((~(((int) j) ^ 1176739733)) | i4) + (((((int) j) ^ 1176739733) + iNextInt) - ((((((int) j) ^ 1176739733) + iNextInt) + (((int) j) ^ 1176739733)) + ((~(((int) j) ^ 1176739733)) | i4)));
            }
        }
        return String.valueOf(iNextInt);
    }

    public static a b(String str, int i, String str2) {
        long[] jArr = f15427d;
        a aVar = new a(((int) jArr[0]) ^ 1176739733, str2, (((int) jArr[1]) ^ 256178089) == true ? (byte) 1 : (byte) 0);
        Map<String, List<ExecutorService>> map = gy;
        List<ExecutorService> list = map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            map.put(str, arrayList);
            return aVar;
        }
        list.add(aVar);
        return aVar;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    public static String a(String str, com.shield.android.h.a aVar) {
        X509Certificate x509CertificateCX;
        Certificate[] certificateArrA;
        try {
            if (Build.VERSION.SDK_INT >= (((int) f15427d[7]) ^ 1047017080)) {
                try {
                    b.e eVarCD = new b.C0066b(new File(str)).cE().cD();
                    if (eVarCD.cG()) {
                        x509CertificateCX = eVarCD.cK().get(((int) f15427d[1]) ^ 256178089).cR();
                    } else if (eVarCD.cH()) {
                        x509CertificateCX = eVarCD.cL().get(((int) f15427d[1]) ^ 256178089).cU();
                    } else if (eVarCD.cI()) {
                        x509CertificateCX = eVarCD.cM().get(((int) f15427d[1]) ^ 256178089).cU();
                    } else {
                        x509CertificateCX = eVarCD.cJ() ? eVarCD.cN().get(((int) f15427d[1]) ^ 256178089).cX() : null;
                    }
                    if (x509CertificateCX != null) {
                        return aVar.d(b(MessageDigest.getInstance(f("량럓럙랴랯")).digest(x509CertificateCX.getEncoded())).getBytes(StandardCharsets.UTF_8));
                    }
                } catch (Throwable unused) {
                }
            }
            JarFile jarFile = new JarFile(str);
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String name = jarEntryNextElement.getName();
                if (!jarEntryNextElement.isDirectory() && name.contains(f("랴량럋럘")) && name.contains(f("랴럟럋럘")) && name.contains(f("랴럞럛")) && (certificateArrA = a(jarFile, jarEntryNextElement, new byte[8192])) != null) {
                    String strB = b(MessageDigest.getInstance(f("량럓럙랴랯")).digest(certificateArrA[((int) f15427d[1]) ^ 256178089].getEncoded()));
                    if (Build.VERSION.SDK_INT >= (((int) f15427d[14]) ^ 1774513849)) {
                        return aVar.d(strB.getBytes(StandardCharsets.UTF_8));
                    }
                    return aVar.d(strB.getBytes(Charset.forName(f("럏럏럞랴랦"))));
                }
            }
        } catch (Throwable unused2) {
        }
        return f("");
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            while (inputStream.read(bArr, ((int) f15427d[1]) ^ 256178089, 8192) != -1) {
            }
            inputStream.close();
            if (jarEntry != null) {
                return jarEntry.getCertificates();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static a a(String str, int i, String str2) {
        long[] jArr = f15427d;
        a aVar = new a(((int) jArr[0]) ^ 1176739733, str2, (((int) jArr[1]) ^ 256178089) == true ? (byte) 1 : (byte) 0);
        Map<String, List<ExecutorService>> map = gx;
        List<ExecutorService> list = map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            map.put(str, arrayList);
            return aVar;
        }
        list.add(aVar);
        return aVar;
    }

    public static String a(String[] strArr) {
        try {
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[1024];
            InputStream inputStream = new ProcessBuilder(strArr).start().getInputStream();
            while (inputStream.read(bArr) != -1) {
                sb2.append(new String(bArr));
            }
            inputStream.close();
            return sb2.toString();
        } catch (Throwable unused) {
            return f("");
        }
    }
}
