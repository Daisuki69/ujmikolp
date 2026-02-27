package S1;

import Bj.C0151l;
import Bj.D0;
import Bj.InterfaceC0156n0;
import K8.InterfaceC0279d;
import M8.A0;
import Ng.C0496d;
import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import b3.C0902w;
import cj.C1110A;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import d4.AbstractC1331a;
import hj.EnumC1578a;
import ih.EnumC1605c;
import ij.AbstractC1609c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ph.RunnableC2103n2;
import vh.AbstractC2353d;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s implements Qf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f5625a;

    public static final CoroutineContext b(InterfaceC0156n0 interfaceC0156n0) {
        return kotlin.coroutines.e.d(new D0(interfaceC0156n0), new Rg.k(Bj.B.f582a));
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C2581c.f21468b);
            kotlin.jvm.internal.j.f(bytes, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            kotlin.jvm.internal.j.c(bArrDigest, "digest.digest()");
            StringBuilder sb2 = new StringBuilder();
            for (byte b8 : bArrDigest) {
                String hexString = Integer.toHexString(b8 & 255);
                while (hexString.length() < 2) {
                    hexString = "0".concat(hexString);
                }
                sb2.append(hexString);
            }
            String string = sb2.toString();
            kotlin.jvm.internal.j.c(string, "hexString.toString()");
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object d(Task task, C0902w c0902w) throws Exception {
        if (!task.isComplete()) {
            C0151l c0151l = new C0151l(1, hj.h.b(c0902w));
            c0151l.r();
            task.addOnCompleteListener(Lj.a.f3014a, new G6.w(c0151l, 17));
            Object objQ = c0151l.q();
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            return objQ;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static FlutterEngine e(Context context) {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
        FlutterEngine flutterEngine = flutterEngineCache.get("cardPull");
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put("cardPull", flutterEngine2);
        return flutterEngine2;
    }

    public static ch.v f(Callable callable) {
        try {
            Object objCall = callable.call();
            jh.e.b(objCall, "Scheduler Callable result can't be null");
            return (ch.v) objCall;
        } catch (Throwable th2) {
            throw AbstractC2353d.d(th2);
        }
    }

    public static final C0496d g(Ng.r rVar) {
        kotlin.jvm.internal.j.g(rVar, "<this>");
        Ng.m mVarA = rVar.a();
        List list = Ng.q.f4436a;
        String str = mVarA.get(RtspHeaders.CONTENT_TYPE);
        if (str == null) {
            return null;
        }
        C0496d c0496d = C0496d.f;
        return A0.x(str);
    }

    public static final C0496d h(Ng.s sVar) {
        kotlin.jvm.internal.j.g(sVar, "<this>");
        Ng.n nVarA = sVar.a();
        List list = Ng.q.f4436a;
        String strN = nVarA.n(RtspHeaders.CONTENT_TYPE);
        if (strN == null) {
            return null;
        }
        C0496d c0496d = C0496d.f;
        return A0.x(strN);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.util.ArrayList r5, io.ktor.utils.io.n r6, Wg.a r7, java.nio.charset.Charset r8, ij.AbstractC1609c r9) throws io.ktor.serialization.ContentConvertException {
        /*
            boolean r0 = r9 instanceof Pg.c
            if (r0 == 0) goto L13
            r0 = r9
            Pg.c r0 = (Pg.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Pg.c r0 = new Pg.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            Wg.a r7 = r0.f5171b
            io.ktor.utils.io.n r6 = r0.f5170a
            bj.AbstractC1039j.b(r9)
            goto L53
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            bj.AbstractC1039j.b(r9)
            Ej.k r9 = new Ej.k
            r9.<init>(r5)
            Pg.b r5 = new Pg.b
            r5.<init>(r9, r8, r7, r6)
            Pg.d r8 = new Pg.d
            r8.<init>(r6, r3)
            r0.f5170a = r6
            r0.f5171b = r7
            r0.e = r4
            java.lang.Object r9 = Ej.W.m(r5, r8, r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            if (r9 != 0) goto L81
            boolean r5 = r6.i()
            if (r5 != 0) goto L5c
            return r6
        L5c:
            kotlin.jvm.internal.F r5 = r7.f6434b
            if (r5 == 0) goto L68
            int r5 = r5.c
            r5 = r5 & r4
            if (r5 == 0) goto L68
            Og.c r5 = Og.c.f4794a
            return r5
        L68:
            io.ktor.serialization.ContentConvertException r5 = new io.ktor.serialization.ContentConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "No suitable converter found for "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "message"
            kotlin.jvm.internal.j.g(r6, r7)
            r5.<init>(r6, r3)
            throw r5
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.s.i(java.util.ArrayList, io.ktor.utils.io.n, Wg.a, java.nio.charset.Charset, ij.c):java.lang.Object");
    }

    public static int j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getWidth() == defaultDisplay.getHeight()) {
            return 3;
        }
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }

    public static final String k(JSONObject jSONObject, String str) {
        kotlin.jvm.internal.j.g(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static yj.f l(LinearLayout linearLayout) {
        return yj.q.h(yj.n.d(yj.q.o(ViewGroupKt.getChildren(linearLayout), new Ag.a(14)), new yc.m(16)), new Ag.a(15));
    }

    public static void m(InterfaceC0279d interfaceC0279d, String actionValue, String str, String str2, String str3, String str4, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) interfaceC0279d;
        mayaKycAmlcCertificateFragment.getClass();
        kotlin.jvm.internal.j.g(actionValue, "actionValue");
        C1219h c1219hD = C1219h.d(mayaKycAmlcCertificateFragment.u1());
        c1219hD.r(EnumC1216e.AMLC_UPLOAD);
        c1219hD.n(18);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = mayaKycAmlcCertificateFragment.getString(R.string.maya_kyc_amlc_certificate_screen_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put("button", actionValue);
        map.put("path", "TOFU 1.0");
        map.put("kyc_status", mayaKycAmlcCertificateFragment.t1().l());
        c1219hD.i();
        MayaKycAmlcCertificateFragment.P1(c1219hD, EnumC1212a.DESTINATION_PAGE, str);
        MayaKycAmlcCertificateFragment.P1(c1219hD, EnumC1212a.ACTION_FUNCTION, str2);
        MayaKycAmlcCertificateFragment.P1(c1219hD, EnumC1212a.CERTIFICATE_TYPE, str3);
        MayaKycAmlcCertificateFragment.P1(c1219hD, EnumC1212a.CERTIFICATE_EXPIRY_DATE, str4);
        mayaKycAmlcCertificateFragment.o1().c(mayaKycAmlcCertificateFragment.getActivity(), c1219hD);
    }

    public static final void n(StringBuilder sb2, String key, String value) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        Appendable appendableAppend = sb2.append((CharSequence) ("-> " + key + ": " + value));
        kotlin.jvm.internal.j.f(appendableAppend, "append(...)");
        kotlin.jvm.internal.j.f(appendableAppend.append('\n'), "append(...)");
    }

    public static final void o(StringBuilder sb2, Set headers, ArrayList sanitizedHeaders) {
        kotlin.jvm.internal.j.g(headers, "headers");
        kotlin.jvm.internal.j.g(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : C1110A.Q(new Fg.o(), C1110A.V(headers))) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = sanitizedHeaders.iterator();
            if (it.hasNext()) {
                throw AbstractC1331a.n(it);
            }
            n(sb2, str, C1110A.F(list, "; ", null, null, null, 62));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(java.lang.StringBuilder r5, Ng.C0496d r6, io.ktor.utils.io.n r7, ij.AbstractC1609c r8) {
        /*
            boolean r0 = r8 instanceof Fg.p
            if (r0 == 0) goto L13
            r0 = r8
            Fg.p r0 = (Fg.p) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Fg.p r0 = new Fg.p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.nio.charset.Charset r5 = r0.f1625b
            java.lang.StringBuilder r6 = r0.f1624a
            bj.AbstractC1039j.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L70
        L2b:
            r5 = r6
            goto L78
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            bj.AbstractC1039j.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "BODY Content-Type: "
            r8.<init>(r2)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            r8 = 10
            r5.append(r8)
            java.lang.String r2 = "BODY START"
            r5.append(r2)
            r5.append(r8)
            if (r6 == 0) goto L5e
            java.nio.charset.Charset r6 = M8.T2.b(r6)
            if (r6 != 0) goto L60
        L5e:
            java.nio.charset.Charset r6 = zj.C2581c.f21468b
        L60:
            r0.f1624a = r5     // Catch: java.lang.Throwable -> L78
            r0.f1625b = r6     // Catch: java.lang.Throwable -> L78
            r0.e = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = M8.T2.D(r7, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r4 = r6
            r6 = r5
            r5 = r4
        L70:
            Mj.i r8 = (Mj.i) r8     // Catch: java.lang.Throwable -> L2b
            r7 = 2
            java.lang.String r5 = Yg.a.c(r8, r5, r7)     // Catch: java.lang.Throwable -> L2b
            goto L7c
        L78:
            r6 = 0
            r4 = r6
            r6 = r5
            r5 = r4
        L7c:
            if (r5 != 0) goto L80
            java.lang.String r5 = "[response body omitted]"
        L80:
            r6.append(r5)
            java.lang.String r5 = "\nBODY END"
            r6.append(r5)
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.s.p(java.lang.StringBuilder, Ng.d, io.ktor.utils.io.n, ij.c):java.lang.Object");
    }

    public static final void q(StringBuilder sb2, Kg.c cVar, Fg.e level, ArrayList sanitizedHeaders) {
        kotlin.jvm.internal.j.g(level, "level");
        kotlin.jvm.internal.j.g(sanitizedHeaders, "sanitizedHeaders");
        if (level.f1604a) {
            sb2.append("RESPONSE: " + cVar.f());
            sb2.append('\n');
            sb2.append("METHOD: " + cVar.b().c().r());
            sb2.append('\n');
            sb2.append("FROM: " + cVar.b().c().getUrl());
            sb2.append('\n');
        }
        if (level.f1605b) {
            sb2.append("COMMON HEADERS");
            sb2.append('\n');
            o(sb2, cVar.a().a(), sanitizedHeaders);
        }
    }

    public static void r(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th2, th2);
        }
        th2.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    public static boolean t(ch.p pVar, ch.r rVar, hh.n nVar) {
        if (!(pVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) pVar).call();
            if (objCall == null) {
                EnumC1605c.a(rVar);
                return true;
            }
            try {
                Object objApply = nVar.apply(objCall);
                jh.e.b(objApply, "The mapper returned a null ObservableSource");
                ch.p pVar2 = (ch.p) objApply;
                if (!(pVar2 instanceof Callable)) {
                    pVar2.subscribe(rVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) pVar2).call();
                    if (objCall2 == null) {
                        EnumC1605c.a(rVar);
                        return true;
                    }
                    RunnableC2103n2 runnableC2103n2 = new RunnableC2103n2(rVar, objCall2);
                    rVar.onSubscribe(runnableC2103n2);
                    runnableC2103n2.run();
                    return true;
                } catch (Throwable th2) {
                    of.p.F(th2);
                    EnumC1605c.c(th2, rVar);
                    return true;
                }
            } catch (Throwable th3) {
                of.p.F(th3);
                EnumC1605c.c(th3, rVar);
                return true;
            }
        } catch (Throwable th4) {
            of.p.F(th4);
            EnumC1605c.c(th4, rVar);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cj.C1128n u(java.util.Map r19, android.widget.LinearLayout r20, com.paymaya.domain.model.DosriValidationResult r21) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.s.u(java.util.Map, android.widget.LinearLayout, com.paymaya.domain.model.DosriValidationResult):cj.n");
    }

    public static Object v(io.ktor.utils.io.w wVar, Function1 function1, AbstractC1609c abstractC1609c) {
        Mj.a aVarE = wVar.e();
        aVarE.getClass();
        Mj.g gVarG = aVarE.g(1);
        int i = gVarG.c;
        byte[] bArr = gVarG.f3432a;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
        kotlin.jvm.internal.j.d(byteBufferWrap);
        function1.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition == 1) {
            gVarG.c += iPosition;
            aVarE.c += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > gVarG.a()) {
                StringBuilder sbT = We.s.t(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                sbT.append(gVarG.a());
                throw new IllegalStateException(sbT.toString().toString());
            }
            if (iPosition != 0) {
                gVarG.c += iPosition;
                aVarE.c += (long) iPosition;
            } else if (Mj.j.b(gVarG)) {
                aVarE.c();
            }
        }
        Object objC = wVar.c(abstractC1609c);
        return objC == EnumC1578a.f17050a ? objC : Unit.f18162a;
    }

    public static int w(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }
}
