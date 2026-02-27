package M2;

import Ch.g;
import Ej.Z;
import F.i;
import Gi.d;
import Kh.I;
import M5.f;
import Oi.e;
import Oi.j;
import Oi.k;
import Oi.l;
import Oi.m;
import Oi.r;
import P5.S;
import Qi.c;
import We.s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import cg.InterfaceC1101b;
import ch.q;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.paymaya.R;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.voyager.glimpse.network.http.HttpException;
import com.voyager.glimpse.network.http.UnknownException;
import defpackage.AbstractC1414e;
import hh.n;
import hh.o;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import l1.InterfaceC1797a;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import n1.AbstractC1894G;
import n4.RunnableC1918b;
import p3.C2010a;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements g, d, f, InterfaceC1101b, c, q, o, n, InterfaceC1797a, b2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f3047b;
    public static b c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3048a;

    public /* synthetic */ b(int i) {
        this.f3048a = i;
    }

    public static final void Q(MayaInputLayout mayaInputLayout, String str) {
        mayaInputLayout.setHelperErrorText(str);
        mayaInputLayout.getHelperErrorIconImageView().setImageResource(R.drawable.maya_ic_information_error_small);
        mayaInputLayout.p();
        mayaInputLayout.f12051K = true;
        mayaInputLayout.l();
    }

    public static i R(Z z4) throws UnknownException, IOException {
        int iC = AbstractC2217b.c(z4.f1430b);
        if (iC == 0) {
            return X(b0(z4));
        }
        if (iC != 1) {
            throw new UnknownException("Not a valid request method!", null);
        }
        HttpURLConnection httpURLConnectionB0 = b0(z4);
        httpURLConnectionB0.setDoOutput(true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Callback.getOutputStream(httpURLConnectionB0));
        byte[] bArr = (byte[]) z4.e;
        DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        return X(httpURLConnectionB0);
    }

    public static void S(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] T(String str, byte[] bArr) {
        str.getClass();
        if (str.equals("sha256")) {
            MessageDigest messageDigestW = W("SHA-256");
            return messageDigestW != null ? messageDigestW.digest(bArr) : new byte[0];
        }
        if (!str.equals("sha1")) {
            return new byte[0];
        }
        MessageDigest messageDigestW2 = W("SHA-1");
        return messageDigestW2 != null ? messageDigestW2.digest(bArr) : new byte[0];
    }

    public static Lh.c U(Context context, String[] strArr, String str, Cg.c cVar) {
        String[] strArrC0 = c0(context);
        int length = strArrC0.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrC0[i];
            int i4 = 0;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i6;
                }
            }
            if (zipFile != null) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder("lib");
                            char c10 = File.separatorChar;
                            sb2.append(c10);
                            sb2.append(str3);
                            sb2.append(c10);
                            sb2.append(str);
                            String string = sb2.toString();
                            cVar.getClass();
                            Cg.c.n("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                Lh.c cVar2 = new Lh.c(10);
                                cVar2.f2990b = zipFile;
                                cVar2.c = entry;
                                return cVar2;
                            }
                        }
                        i10 = i11;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static N.f V(String str) {
        for (N.f fVar : N.f.values()) {
            if (fVar.f3464a.equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public static MessageDigest W(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            StringBuilder sbW = s.w("Error getting ", str, " MessageDigest: ");
            sbW.append(e.getMessage());
            Ri.a.g(sbW.toString());
            return null;
        }
    }

    public static i X(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = Callback.getResponseCode(httpURLConnection);
        BufferedReader bufferedReader = (responseCode < 200 || responseCode > 299) ? new BufferedReader(new InputStreamReader(Callback.getErrorStream(httpURLConnection))) : new BufferedReader(new InputStreamReader(Callback.getInputStream(httpURLConnection)));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
        }
        String string = sb2.toString();
        if (responseCode < 200 || responseCode > 299) {
            HttpException httpException = new HttpException();
            httpException.f16231a = responseCode;
            httpException.f16232b = string;
            throw httpException;
        }
        i iVar = new i(2, (byte) 0);
        iVar.f1503b = new HashMap();
        iVar.c = responseCode;
        iVar.f1504d = string;
        for (Map.Entry<String, List<String>> entry : Callback.getHeaderFields(httpURLConnection).entrySet()) {
            List<String> value = entry.getValue();
            StringBuilder sb3 = new StringBuilder();
            for (int i = 0; i < value.size(); i++) {
                sb3.append(value.get(i));
                if (i < value.size() - 1) {
                    sb3.append(",");
                }
            }
            String string2 = sb3.toString();
            String key = entry.getKey();
            HashMap map = (HashMap) iVar.f1503b;
            if (map != null) {
                map.put(key, string2);
            }
        }
        return iVar;
    }

    public static String[] Y(Context context, String str) {
        StringBuilder sb2 = new StringBuilder("lib");
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append("([^\\");
        sb2.append(c10);
        sb2.append("]*)");
        sb2.append(c10);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : c0(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static MayaErrorDialogFragment Z(int i, String str, String str2, String str3, String str4, boolean z4, PayMayaError payMayaError, View.OnClickListener onClickListener, boolean z5, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        if ((i4 & 8) != 0) {
            str3 = null;
        }
        if ((i4 & 16) != 0) {
            str4 = null;
        }
        if ((i4 & 32) != 0) {
            z4 = true;
        }
        if ((i4 & 64) != 0) {
            payMayaError = null;
        }
        if ((i4 & 128) != 0) {
            onClickListener = null;
        }
        if ((i4 & 256) != 0) {
            z5 = true;
        }
        MayaErrorDialogFragment mayaErrorDialogFragment = new MayaErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("drawable", i);
        bundle.putString("title", str);
        bundle.putString("action", str3);
        bundle.putString("cancel", str4);
        bundle.putBoolean("imply_cancel", z4);
        bundle.putString("message", str2);
        bundle.putParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaError);
        bundle.putBoolean("action_dismiss", z5);
        mayaErrorDialogFragment.setArguments(bundle);
        mayaErrorDialogFragment.f11852e0 = onClickListener;
        return mayaErrorDialogFragment;
    }

    public static MayaMaintenanceFragment a0(CharSequence charSequence, int i) {
        if ((i & 4) != 0) {
            charSequence = null;
        }
        MayaMaintenanceFragment mayaMaintenanceFragment = new MayaMaintenanceFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("image_res_id", 0);
        bundle.putCharSequence("title", null);
        bundle.putCharSequence("description", charSequence);
        mayaMaintenanceFragment.setArguments(bundle);
        return mayaMaintenanceFragment;
    }

    public static HttpURLConnection b0(Z z4) throws ProtocolException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) z4.c).openConnection());
        Callback.openConnection(uRLConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestMethod(AbstractC1414e.w(z4.f1430b));
        HashMap map = (HashMap) z4.f1431d;
        for (String str : map.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) map.get(str));
        }
        httpURLConnection.setConnectTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        httpURLConnection.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        return httpURLConnection;
    }

    public static String[] c0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // Qi.c
    public void A(long j) {
    }

    @Override // Qi.c
    public j B() {
        return null;
    }

    @Override // Qi.c
    public List C() {
        return null;
    }

    @Override // Qi.c
    public r D() {
        return null;
    }

    @Override // Qi.c
    public void E(String str) {
    }

    @Override // Qi.c
    public List F() {
        return null;
    }

    @Override // Qi.c
    public long G() {
        return 0L;
    }

    @Override // Qi.c
    public void H(int i) {
    }

    @Override // Qi.c
    public l I() {
        return null;
    }

    @Override // Qi.c
    public void J(long j) {
    }

    @Override // Qi.c
    public m K() {
        return null;
    }

    @Override // Qi.c
    public void L(k kVar) {
    }

    @Override // Qi.c
    public long M() {
        return 0L;
    }

    @Override // Qi.c
    public Oi.f N() {
        return null;
    }

    @Override // ch.q
    public ch.l O(ch.l lVar) {
        return lVar;
    }

    @Override // Qi.c
    public long P() {
        return 0L;
    }

    @Override // Gi.d
    public String a(String str) {
        return str;
    }

    @Override // hh.n
    public Object apply(Object obj) {
        return obj;
    }

    @Override // Qi.c
    public void b() {
    }

    @Override // Qi.c
    public void c(Oi.n nVar, long j) {
    }

    @Override // M5.f
    public String d() {
        switch (this.f3048a) {
            case 7:
                return String.format("SELECT * FROM %s", Arrays.copyOf(new Object[]{"kyc_settings"}, 1));
            case 8:
                return String.format("SELECT * FROM %1$s", "address");
            default:
                return String.format("SELECT * FROM %1$s ORDER BY %2$s IS NULL, %2$s ASC, %3$s COLLATE NOCASE ASC LIMIT %4$s", Arrays.copyOf(new Object[]{"shop_provider", "priority", "display_name", 10}, 4));
        }
    }

    @Override // Qi.c
    public void e(long j) {
    }

    @Override // l1.InterfaceC1797a
    public long f() {
        return SystemClock.elapsedRealtime();
    }

    @Override // Qi.c
    public void g() {
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new Xe.f(new I(12));
    }

    @Override // Qi.c
    public long h() {
        return 0L;
    }

    @Override // Qi.c
    public long i(Oi.g gVar) {
        return 0L;
    }

    @Override // Qi.c
    public void j(k kVar, long j) {
    }

    @Override // Qi.c
    public void k(int i) {
    }

    @Override // Qi.c
    public void l() {
    }

    @Override // Qi.c
    public long m() {
        return 0L;
    }

    @Override // Qi.c
    public void n(Oi.g gVar) {
    }

    @Override // Qi.c
    public void o() {
    }

    @Override // Qi.c
    public void p(Oi.n nVar, long j) {
    }

    @Override // Qi.c
    public long q() {
        return 0L;
    }

    @Override // Gi.d
    public String r(String str) {
        return str;
    }

    @Override // Qi.c
    public long s() {
        return 0L;
    }

    @Override // Qi.c
    public void t(Pi.c cVar) {
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        switch (this.f3048a) {
            case 3:
                return true;
            default:
                return ((Ze.a) obj).c;
        }
    }

    public String toString() {
        switch (this.f3048a) {
            case 26:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    @Override // Qi.c
    public void u(Oi.n nVar, Integer num) {
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        C2010a c2010a = new C2010a();
        Eh.b bVar2 = new Eh.b(4);
        ReferenceQueue referenceQueue = c2010a.f19020a;
        Set set = c2010a.f19021b;
        set.add(new p3.l(c2010a, referenceQueue, set, bVar2));
        Thread thread = new Thread(new RunnableC1918b(1, referenceQueue, set, false), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c2010a;
    }

    @Override // Qi.c
    public e w() {
        return null;
    }

    @Override // Qi.c
    public long x(Oi.c cVar) {
        return 0L;
    }

    @Override // Qi.c
    public long y() {
        return 0L;
    }

    @Override // Qi.c
    public void z(Pi.f fVar) {
    }

    public b(S s9) {
        this.f3048a = 12;
    }

    public b(AbstractC1894G abstractC1894G, int i, long j) {
        this.f3048a = 29;
    }
}
