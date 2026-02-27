package bg;

import G5.ViewOnFocusChangeListenerC0257g;
import G7.C0258a;
import a.AbstractC0617a;
import ad.InterfaceC0684a;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import b3.C0888i;
import b3.InterfaceC0897r;
import cj.C1128n;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import fh.InterfaceC1486b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kh.InterfaceC1778e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import xh.C2479c;
import yc.C2525f;
import yj.C2536a;
import zj.C2576A;

/* JADX INFO: renamed from: bg.W, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0983W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b3.e0 f8874a;

    public static /* synthetic */ void A(MayaInputLayout mayaInputLayout, C7.f fVar, Function1 function1, int i) {
        if ((i & 1) != 0) {
            fVar = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        z(mayaInputLayout, fVar, function1);
    }

    public static final void B(TextView textView, Context context, int i) {
        kotlin.jvm.internal.j.g(textView, "<this>");
        textView.setTextAppearance(i);
    }

    public static void C(F7.a aVar, int i, String str, String str2, int i4) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        C0258a c0258a = ((MayaDashboardFragment) aVar).f12165e0;
        if (c0258a == null) {
            kotlin.jvm.internal.j.n("cardsFlutterScreen");
            throw null;
        }
        c0258a.c().a("requestFullscreen", cj.M.h(new Pair("route", "cardDashboard"), new Pair("productOffering", "MAYA_BLACK_CREDIT_CARD_CONSUMER_LOAN"), new Pair("initialIndex", Integer.valueOf(i)), new Pair("voucherRedemptionId", str), new Pair("sourcePage", "wallet_dashboard"), new Pair("rewardsCatalogProductId", str2)), null);
        c0258a.n();
        c0258a.f1838x.invoke(c0258a.d());
    }

    public static final void D(MayaErrorDialogFragment mayaErrorDialogFragment, FragmentManager fragmentManager, String str) {
        try {
            mayaErrorDialogFragment.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
            fragmentTransactionBeginTransaction.add(mayaErrorDialogFragment, str);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public static final void E(MayaInputLayout mayaInputLayout) {
        kotlin.jvm.internal.j.g(mayaInputLayout, "<this>");
        mayaInputLayout.getInputEditText().setText(AbstractC1213b.M("\\s+", C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString(), Global.BLANK));
    }

    public static final void F(Ng.A a8, Ng.A url) {
        kotlin.jvm.internal.j.g(a8, "<this>");
        kotlin.jvm.internal.j.g(url, "url");
        a8.f4405d = url.f4405d;
        String str = url.f4403a;
        kotlin.jvm.internal.j.g(str, "<set-?>");
        a8.f4403a = str;
        a8.e(url.c);
        a8.d(url.h);
        a8.e = url.e;
        a8.f = url.f;
        Ng.y yVar = new Ng.y(0);
        AbstractC0617a.m(yVar, url.i);
        a8.i = yVar;
        a8.j = new G6.w(yVar);
        String str2 = url.f4406g;
        kotlin.jvm.internal.j.g(str2, "<set-?>");
        a8.f4406g = str2;
        a8.f4404b = url.f4404b;
    }

    public static void G(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static final Ng.E a(Ng.A builder) {
        kotlin.jvm.internal.j.g(builder, "builder");
        Ng.A a8 = new Ng.A();
        F(a8, builder);
        return a8.b();
    }

    public static boolean b(String str) {
        return (str.equals(ShareTarget.METHOD_GET) || str.equals("HEAD")) ? false : true;
    }

    public static final void c(AppCompatEditText appCompatEditText, MayaInputLayout mayaInputLayout, Function0 function0, Function0 function02, Function0 function03) {
        kotlin.jvm.internal.j.g(appCompatEditText, "<this>");
        kotlin.jvm.internal.j.g(mayaInputLayout, "mayaInputLayout");
        G5.m mVar = new G5.m();
        mVar.f1755d = mayaInputLayout;
        mVar.e = function0;
        mVar.f1754b = function02;
        mVar.f = function03;
        appCompatEditText.addTextChangedListener(mVar);
    }

    public static final void d(TextInputEditText textInputEditText, TextInputLayout textInputLayout, Function0 function0, C2525f c2525f) {
        G5.m mVar = new G5.m();
        mVar.c = textInputLayout;
        mVar.e = function0;
        mVar.f = c2525f;
        textInputEditText.addTextChangedListener(mVar);
    }

    public static final void e(EditText editText, MayaInputLayout mayaInputLayout, String str, Function0 function0, Function0 function02, Function0 function03) {
        kotlin.jvm.internal.j.g(editText, "<this>");
        kotlin.jvm.internal.j.g(mayaInputLayout, "mayaInputLayout");
        G5.A a8 = new G5.A(mayaInputLayout, str, function0, function02, function03);
        a8.k(String.valueOf(mayaInputLayout.getInputEditText().getText()));
        editText.addTextChangedListener(a8);
    }

    public static final Rg.i f(String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        return new Rg.i(str);
    }

    public static boolean g(boolean z4, boolean z5, C2479c c2479c, InterfaceC1778e interfaceC1778e, InterfaceC1486b interfaceC1486b, lh.l lVar) {
        if (lVar.f) {
            interfaceC1778e.clear();
            interfaceC1486b.dispose();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th2 = lVar.h;
        if (th2 != null) {
            interfaceC1778e.clear();
            if (interfaceC1486b != null) {
                interfaceC1486b.dispose();
            }
            c2479c.onError(th2);
            return true;
        }
        if (!z5) {
            return false;
        }
        if (interfaceC1486b != null) {
            interfaceC1486b.dispose();
        }
        c2479c.onComplete();
        return true;
    }

    public static CTInAppNotificationMedia h(JSONObject jSONObject, int i) {
        String strOptString = jSONObject.optString("content_type");
        kotlin.jvm.internal.j.d(strOptString);
        String str = null;
        if (C2576A.H(strOptString)) {
            return null;
        }
        String strOptString2 = jSONObject.optString(ImagesContract.URL);
        kotlin.jvm.internal.j.d(strOptString2);
        if (!C2576A.H(strOptString2) && zj.z.w(strOptString, 2, "image", false)) {
            str = UUID.randomUUID() + jSONObject.optString("key");
        }
        String strOptString3 = jSONObject.optString("alt_text");
        kotlin.jvm.internal.j.d(strOptString3);
        return new CTInAppNotificationMedia(i, strOptString2, strOptString, strOptString3, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r7.c.addAndGet(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(pg.C2038a r8, xh.C2479c r9, fh.InterfaceC1486b r10, lh.l r11) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r11.f18321g
            boolean r3 = r8.isEmpty()
            r5 = r8
            r4 = r9
            r6 = r10
            r7 = r11
            boolean r8 = g(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L13
            goto L32
        L13:
            boolean r2 = r7.f18321g
            java.lang.Object r8 = r5.poll()
            if (r8 != 0) goto L1d
            r3 = r0
            goto L1f
        L1d:
            r9 = 0
            r3 = r9
        L1f:
            boolean r9 = g(r2, r3, r4, r5, r6, r7)
            r10 = r3
            if (r9 == 0) goto L27
            goto L32
        L27:
            if (r10 == 0) goto L38
            int r8 = -r1
            java.util.concurrent.atomic.AtomicInteger r9 = r7.c
            int r1 = r9.addAndGet(r8)
            if (r1 != 0) goto L33
        L32:
            return
        L33:
            r9 = r4
            r8 = r5
            r10 = r6
            r11 = r7
            goto L2
        L38:
            r7.A(r4, r8)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.AbstractC0983W.i(pg.a, xh.c, fh.b, lh.l):void");
    }

    public static int j(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < 6; i4++) {
            int iCeil = (int) Math.ceil(fArr[i4]);
            iArr[i4] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i4] = (byte) (bArr[i4] + 1);
            }
        }
        return i;
    }

    public static int k(float f) {
        return ((int) (((double) f) + 16384.0d)) - 16384;
    }

    public static final Object l(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT > 33) {
            return intent.getParcelableExtra(str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (parcelableExtra == null) {
            return null;
        }
        return parcelableExtra;
    }

    public static void m(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean n(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean o(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean p(char c) {
        if (c == '\r' || c == '*' || c == '>' || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean q(String str) {
        return str == null || str.isEmpty();
    }

    public static final boolean r(Context context) {
        Object systemService = context.getSystemService("alarm");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        return Build.VERSION.SDK_INT >= 31 && !((AlarmManager) systemService).canScheduleExactAlarms();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01aa, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01af, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b4, code lost:
    
        return 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int s(java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.AbstractC0983W.s(java.lang.CharSequence, int, int):int");
    }

    public static final void t() {
        try {
            if (f8874a == null) {
                b3.e0 e0Var = (b3.e0) ((C0888i) ((InterfaceC0897r) U1.g.e().c(InterfaceC0897r.class))).f8474o.get();
                kotlin.jvm.internal.j.g(e0Var, "<set-?>");
                f8874a = e0Var;
            }
            b3.e0 e0Var2 = f8874a;
            if (e0Var2 == null) {
                kotlin.jvm.internal.j.n("sharedSessionRepository");
                throw null;
            }
            if (e0Var2.i) {
                if (e0Var2 != null) {
                    e0Var2.b();
                } else {
                    kotlin.jvm.internal.j.n("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void u(InterfaceC0684a interfaceC0684a, HashMap map) {
        Integer numF;
        String str = (String) map.get("action");
        String str2 = (String) map.get("unitId");
        String str3 = (String) map.get("position");
        interfaceC0684a.c((str3 == null || (numF = zj.y.f(str3)) == null) ? 0 : numF.intValue(), str, str2);
    }

    public static List v(int i, ArrayList arrayList) {
        if (i <= 0) {
            return Collections.singletonList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int i6 = i4 + i;
            arrayList2.add(new ArrayList(arrayList.subList(i4, Math.min(i6, arrayList.size()))));
            i4 = i6;
        }
        return arrayList2;
    }

    public static final ArrayList w(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        try {
            for (String it : new C2536a(new C1128n(bufferedReader, 2))) {
                kotlin.jvm.internal.j.g(it, "it");
                arrayList.add(it);
                Unit unit = Unit.f18162a;
            }
            Unit unit2 = Unit.f18162a;
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static final String x(Reader reader) throws IOException {
        kotlin.jvm.internal.j.g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public static final void y(MayaInputLayout mayaInputLayout, boolean z4) {
        kotlin.jvm.internal.j.g(mayaInputLayout, "<this>");
        mayaInputLayout.getInputEditText().setCustomSelectionActionModeCallback(new G5.D(z4, 0));
        mayaInputLayout.getInputEditText().setCustomInsertionActionModeCallback(new G5.D(z4, 1));
    }

    public static final void z(MayaInputLayout mayaInputLayout, Function1 function1, Function1 function12) {
        kotlin.jvm.internal.j.g(mayaInputLayout, "<this>");
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0257g(function1, function12, 1));
    }
}
