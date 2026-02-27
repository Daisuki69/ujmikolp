package E1;

import Kh.C0301f;
import M8.A0;
import N1.o;
import N1.p;
import N1.r;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDirections;
import androidx.window.layout.WindowMetrics;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.ktor.utils.io.C;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import okio.Utf8;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static J5.c f1224a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1225b = 1;
    public static volatile C2.f c;

    public static C a(byte[] content) {
        int length = content.length;
        kotlin.jvm.internal.j.g(content, "content");
        Mj.a aVar = new Mj.a();
        aVar.k(content, 0, length);
        return new C(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(zg.InterfaceC2568c r8, Jg.d r9, ij.AbstractC1609c r10) throws java.lang.Throwable {
        /*
            r0 = 2
            boolean r1 = r10 instanceof zg.C2566a
            if (r1 == 0) goto L14
            r1 = r10
            zg.a r1 = (zg.C2566a) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.e = r2
            goto L19
        L14:
            zg.a r1 = new zg.a
            r1.<init>(r10)
        L19:
            java.lang.Object r10 = r1.c
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r1.e
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 == r4) goto L32
            if (r3 != r0) goto L2a
            bj.AbstractC1039j.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            Jg.d r9 = r1.f21425b
            zg.c r8 = r1.f21424a
            bj.AbstractC1039j.b(r10)
            goto L7e
        L3a:
            bj.AbstractC1039j.b(r10)
            Bj.D0 r10 = r9.e
            r1.f21424a = r8
            r1.f21425b = r9
            r1.e = r4
            Bj.D r3 = zg.AbstractC2574i.f21434a
            Bj.o0 r3 = new Bj.o0
            r3.<init>(r10)
            kotlin.coroutines.CoroutineContext r10 = r8.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r10 = r10.plus(r3)
            Bj.D r5 = zg.AbstractC2574i.f21434a
            kotlin.coroutines.CoroutineContext r10 = r10.plus(r5)
            kotlin.coroutines.CoroutineContext r5 = r1.getContext()
            Bj.m0 r6 = Bj.C0154m0.f630a
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)
            Bj.n0 r5 = (Bj.InterfaceC0156n0) r5
            if (r5 != 0) goto L69
            goto L7b
        L69:
            Ag.q r6 = new Ag.q
            r7 = 3
            r6.<init>(r3, r7)
            Bj.W r4 = r5.f(r4, r4, r6)
            Ag.q r5 = new Ag.q
            r5.<init>(r4, r0)
            r3.i(r5)
        L7b:
            if (r10 != r2) goto L7e
            goto L9f
        L7e:
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            zg.j r3 = new zg.j
            r3.<init>(r10)
            kotlin.coroutines.CoroutineContext r10 = r10.plus(r3)
            zg.b r3 = new zg.b
            r4 = 0
            r3.<init>(r8, r9, r4)
            Bj.L r8 = Bj.H.g(r8, r10, r3, r0)
            r1.f21424a = r4
            r1.f21425b = r4
            r1.e = r0
            java.lang.Object r8 = r8.A(r1)
            if (r8 != r2) goto La0
        L9f:
            return r2
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.c.b(zg.c, Jg.d, ij.c):java.lang.Object");
    }

    public static void c(Context context, ug.b bVar) {
        Activity activityH = h(context);
        if (activityH != null) {
            WindowMetrics windowMetricsComputeMaximumWindowMetrics = androidx.window.layout.c.c().computeMaximumWindowMetrics(activityH);
            bVar.updateDisplayMetrics(windowMetricsComputeMaximumWindowMetrics.getBounds().width(), windowMetricsComputeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final String e(byte[] bArr, int i, int i4) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i;
        int i18 = 2;
        if (i17 < 0 || i4 > bArr.length || i17 > i4) {
            throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i17 + " endIndex=" + i4);
        }
        char[] cArr = new char[i4 - i17];
        int i19 = 0;
        while (i17 < i4) {
            byte b8 = bArr[i17];
            if (b8 >= 0) {
                i15 = i19 + 1;
                cArr[i19] = (char) b8;
                i17++;
                while (i17 < i4) {
                    byte b10 = bArr[i17];
                    if (b10 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i15] = (char) b10;
                    i15++;
                }
                Unit unit = Unit.f18162a;
            } else if ((b8 >> 5) == -2) {
                int i20 = i17 + 1;
                if (i4 <= i20) {
                    i15 = i19 + 1;
                    cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b11 = bArr[i20];
                    if ((b11 & 192) == 128) {
                        int i21 = (b8 << 6) ^ (b11 ^ 3968);
                        if (i21 < 128) {
                            i15 = i19 + 1;
                            cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i15 = i19 + 1;
                            cArr[i19] = (char) i21;
                        }
                        Unit unit2 = Unit.f18162a;
                        i16 = i18;
                        i17 += i16;
                    } else {
                        i15 = i19 + 1;
                        cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                Unit unit3 = Unit.f18162a;
                i16 = 1;
                i17 += i16;
            } else {
                if ((b8 >> 4) == -2) {
                    int i22 = i17 + 2;
                    if (i4 <= i22) {
                        i12 = i19 + 1;
                        cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit4 = Unit.f18162a;
                        int i23 = i17 + 1;
                        i13 = (i4 <= i23 || (bArr[i23] & 192) != 128) ? 1 : i18;
                    } else {
                        byte b12 = bArr[i17 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i22];
                            if ((b13 & 192) == 128) {
                                int i24 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b8 << 12);
                                if (i24 < 2048) {
                                    i14 = i19 + 1;
                                    cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i24 || i24 >= 57344) {
                                    char c10 = (char) i24;
                                    i14 = i19 + 1;
                                    cArr[i19] = c10;
                                } else {
                                    i14 = i19 + 1;
                                    cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                Unit unit5 = Unit.f18162a;
                                i12 = i14;
                                i13 = 3;
                            } else {
                                i12 = i19 + 1;
                                cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                Unit unit6 = Unit.f18162a;
                                i13 = i18;
                            }
                        } else {
                            i12 = i19 + 1;
                            cArr[i19] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit7 = Unit.f18162a;
                            i13 = 1;
                        }
                    }
                    i17 += i13;
                    i6 = i18;
                    i19 = i12;
                } else {
                    if ((b8 >> 3) == -2) {
                        int i25 = i17 + 3;
                        if (i4 <= i25) {
                            i10 = i19 + 1;
                            cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit8 = Unit.f18162a;
                            int i26 = i17 + 1;
                            if (i4 <= i26 || (bArr[i26] & 192) != 128) {
                                i6 = i18;
                                i18 = 1;
                                i17 += i18;
                            } else {
                                int i27 = i17 + 2;
                                if (i4 <= i27 || (bArr[i27] & 192) != 128) {
                                    i6 = i18;
                                    i17 += i18;
                                } else {
                                    i6 = i18;
                                    i18 = 3;
                                    i17 += i18;
                                }
                            }
                        } else {
                            byte b14 = bArr[i17 + 1];
                            if ((b14 & 192) == 128) {
                                byte b15 = bArr[i17 + 2];
                                i6 = i18;
                                if ((b15 & 192) == 128) {
                                    byte b16 = bArr[i25];
                                    if ((b16 & 192) == 128) {
                                        int i28 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b8 << 18);
                                        if (i28 > 1114111) {
                                            i10 = i19 + 1;
                                            cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i28 || i28 >= 57344) && i28 >= 65536) {
                                            if (i28 != 65533) {
                                                cArr[i19] = (char) ((i28 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i11 = i19 + 2;
                                                cArr[i19 + 1] = (char) ((i28 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                                                i11 = i19 + 1;
                                            }
                                            Unit unit9 = Unit.f18162a;
                                            i10 = i11;
                                            i18 = 4;
                                        } else {
                                            i10 = i19 + 1;
                                            cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        Unit unit10 = Unit.f18162a;
                                        i18 = 4;
                                    } else {
                                        i10 = i19 + 1;
                                        cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                                        Unit unit11 = Unit.f18162a;
                                        i18 = 3;
                                    }
                                } else {
                                    i10 = i19 + 1;
                                    cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit12 = Unit.f18162a;
                                    i18 = i6;
                                }
                                i17 += i18;
                            } else {
                                i6 = i18;
                                i10 = i19 + 1;
                                cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit13 = Unit.f18162a;
                                i18 = 1;
                                i17 += i18;
                            }
                        }
                    } else {
                        i6 = i18;
                        i10 = i19 + 1;
                        cArr[i19] = Utf8.REPLACEMENT_CHARACTER;
                        i17++;
                    }
                    i19 = i10;
                }
                i18 = i6;
            }
            i6 = i18;
            i19 = i15;
            i18 = i6;
        }
        return z.i(cArr, 0, i19);
    }

    public static String f(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA256").digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            for (byte b8 : bArrDigest) {
                sb2.append(Integer.toHexString((b8 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g(String str) {
        str.getClass();
        try {
            int i = 65535;
            for (byte b8 : str.getBytes("UTF-8")) {
                for (int i4 = 0; i4 < 8; i4++) {
                    boolean z4 = ((b8 >> (7 - i4)) & 1) == 1;
                    boolean z5 = ((i >> 15) & 1) == 1;
                    i <<= 1;
                    if (z4 ^ z5) {
                        i ^= 4129;
                    }
                }
            }
            return String.format("%04X", Integer.valueOf(i & 65535));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static Activity h(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return h(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void i(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (A0.r(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z4 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (!PlatformVersion.isAtLeastQ()) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new androidx.work.impl.a(context, z4, taskCompletionSource).run();
        taskCompletionSource.getTask();
    }

    public static o j(o oVar) {
        if ((oVar instanceof r) || (oVar instanceof p)) {
            return oVar;
        }
        if (oVar instanceof Serializable) {
            return new p(oVar);
        }
        r rVar = new r();
        rVar.f3508a = oVar;
        return rVar;
    }

    public static void k(Throwable th2) {
        C2.f fVar = c;
        if (th2 == null) {
            th2 = Qh.e.b("onError called with a null Throwable.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th2, th2);
        }
        if (fVar != null) {
            try {
                fVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final void l(NavController navController, int i, int i4, Bundle bundle) {
        kotlin.jvm.internal.j.g(navController, "<this>");
        NavDestination currentDestination = navController.getCurrentDestination();
        if (currentDestination == null || i != currentDestination.getId()) {
            return;
        }
        navController.navigate(i4, bundle);
    }

    public static final void m(NavController navController, NavDirections navDirections) {
        kotlin.jvm.internal.j.g(navController, "<this>");
        NavDestination currentDestination = navController.getCurrentDestination();
        if (currentDestination == null || currentDestination.getAction(navDirections.getActionId()) == null) {
            return;
        }
        navController.navigate(navDirections);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        r6 = r1 - 2;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r6 < 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r10 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r10 = (int) r5[r6];
        r11 = r6 + 1;
        r15 = (int) r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r10 < (-1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (r10 > r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if (r15 < (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (r15 > r14) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (r10 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        r5[r6] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r10 != r8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        r5[r6] = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        if (r15 != (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r5[r11] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        if (r15 != r14) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        r5[r11] = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        r6 = r6 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        throw com.google.zxing.NotFoundException.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
    
        if (r6 >= r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        if (r16.b((int) r5[r6], (int) r5[r6 + 1]) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        r4.f(r6 / 2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ec, code lost:
    
        r6 = r6 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
    
        throw com.google.zxing.NotFoundException.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K3.b n(K3.b r16, int r17, int r18, K3.f r19) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.c.n(K3.b, int, int, K3.f):K3.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(xg.b r4, ij.AbstractC1609c r5) {
        /*
            boolean r0 = r5 instanceof xg.c
            if (r0 == 0) goto L13
            r0 = r5
            xg.c r0 = (xg.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xg.c r0 = new xg.c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f20993b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xg.b r4 = r0.f20992a
            bj.AbstractC1039j.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            bj.AbstractC1039j.b(r5)
            Kg.c r5 = r4.d()
            io.ktor.utils.io.n r5 = r5.c()
            r0.f20992a = r4
            r0.c = r3
            java.lang.Object r5 = M8.T2.D(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            Mj.i r5 = (Mj.i) r5
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.j.g(r5, r0)
            r0 = -1
            byte[] r5 = Mj.j.d(r5, r0)
            xg.d r0 = new xg.d
            wg.c r1 = r4.f20990a
            Jg.b r2 = r4.c()
            Kg.c r4 = r4.d()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.c.o(xg.b, ij.c):java.lang.Object");
    }

    public static void p(Pair urlMeta, Pair pair) {
        kotlin.jvm.internal.j.g(urlMeta, "urlMeta");
        String url = (String) urlMeta.f18160a;
        long jCurrentTimeMillis = System.currentTimeMillis() + X.d.f;
        Y.a aVar = (Y.a) pair.f18160a;
        Y.c cVar = (Y.c) pair.f18161b;
        int iOrdinal = ((Q.a) urlMeta.f18161b).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            cVar.getClass();
            kotlin.jvm.internal.j.g(url, "url");
            cVar.f6703a.e(jCurrentTimeMillis, url);
            aVar.getClass();
            aVar.f6701a.e(jCurrentTimeMillis, url);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.getClass();
        kotlin.jvm.internal.j.g(url, "url");
        aVar.f6701a.e(jCurrentTimeMillis, url);
    }

    public static final String q(Long l6) {
        if (l6 == null) {
            return null;
        }
        long jLongValue = l6.longValue();
        if (jLongValue <= 0) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.getDefault()).format(new Date(jLongValue));
    }

    public static C0301f r(ch.l lVar) {
        Objects.requireNonNull(lVar, "source is null");
        return new C0301f(lVar, 2);
    }

    public static boolean s(View view, ug.c cVar) {
        if (view != null) {
            if (cVar.a(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (s(viewGroup.getChildAt(i), cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean t(String str) {
        str.getClass();
        if (str.length() <= 4) {
            return false;
        }
        return str.substring(str.length() - 4).toUpperCase().equals(g(str.substring(0, str.length() - 4)));
    }
}
