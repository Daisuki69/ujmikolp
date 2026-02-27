package Ci;

import B5.m;
import D.C0178k;
import D.C0190x;
import D.Q;
import D.S;
import D.Z;
import D.b0;
import D.d0;
import D8.C0193a;
import E1.c;
import Eh.d;
import G6.v;
import Gb.n;
import Gh.f;
import H.e;
import Kh.B;
import P5.C0533b;
import Q6.r;
import Rg.u;
import Ui.g;
import Ui.h;
import Ui.k;
import We.s;
import aj.InterfaceC0716a;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.webkit.ProxyConfig;
import androidx.webkit.internal.AssetHelper;
import bg.AbstractC0983W;
import bj.C1034e;
import bj.InterfaceC1033d;
import cg.InterfaceC1101b;
import ch.l;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.gson.JsonSyntaxException;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.U0;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import df.C1365g;
import df.i;
import df.x;
import e1.InterfaceC1418b;
import g4.C1499a;
import ha.C1555h;
import ha.D;
import i1.C1583c;
import io.split.android.client.dtos.BetweenMatcherData;
import io.split.android.client.dtos.BetweenStringMatcherData;
import io.split.android.client.dtos.Condition;
import io.split.android.client.dtos.ConditionType;
import io.split.android.client.dtos.DependencyMatcherData;
import io.split.android.client.dtos.KeySelector;
import io.split.android.client.dtos.Matcher;
import io.split.android.client.dtos.MatcherCombiner;
import io.split.android.client.dtos.MatcherGroup;
import io.split.android.client.dtos.MatcherType;
import io.split.android.client.dtos.Partition;
import io.split.android.client.dtos.UnaryNumericMatcherData;
import io.split.android.client.service.sseclient.notifications.ControlNotification;
import io.split.android.client.service.sseclient.notifications.IncomingNotification;
import io.split.android.client.service.sseclient.notifications.NotificationParser;
import io.split.android.client.service.sseclient.notifications.NotificationProcessor;
import io.split.android.client.service.sseclient.notifications.OccupancyNotification;
import io.split.android.client.service.sseclient.notifications.StreamingError;
import j1.InterfaceC1656d;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
import ki.C1781b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import n2.C1915b;
import o6.C1967a;
import of.p;
import oi.C1983a;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C2011b;
import pg.t;
import w.C2361c;
import z.AbstractC2540b;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC1101b, InterfaceC1418b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f783g;
    public static boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f785b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f786d;
    public Object e;
    public Object f;

    public /* synthetic */ b(int i) {
        this.f784a = i;
    }

    public static boolean E(String str) {
        Log.d("OpenCVManager/Helper", "Trying to load library " + str);
        try {
            System.load(str);
            Log.d("OpenCVManager/Helper", "OpenCV libs init was ok!");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d("OpenCVManager/Helper", "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }

    public static void a(FragmentActivity fragmentActivity, u uVar) {
        if (f783g) {
            Log.d("OpenCVManager/Helper", "Waiting current installation process");
            uVar.p(1, new kk.a(uVar, fragmentActivity, 1));
        } else {
            Log.d("OpenCVManager/Helper", "Request new service installation");
            uVar.p(0, new kk.a(uVar, fragmentActivity, 0));
        }
    }

    public static boolean b(FragmentActivity fragmentActivity) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=org.opencv.engine"));
            intent.addFlags(268435456);
            fragmentActivity.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(b bVar, String str, String str2) {
        Log.d("OpenCVManager/Helper", "Trying to init OpenCV libs");
        if (str.length() == 0) {
            Log.d("OpenCVManager/Helper", "Library path \"" + str + "\" is empty");
            return false;
        }
        if (str2 == null || str2.length() == 0) {
            StringBuilder sbW = androidx.camera.core.impl.a.w(str);
            sbW.append(File.separator);
            sbW.append("libopencv_java3.so");
            return E(sbW.toString());
        }
        Log.d("OpenCVManager/Helper", "Trying to load libs by dependency list");
        StringTokenizer stringTokenizer = new StringTokenizer(str2, Global.SEMICOLON);
        boolean zE = true;
        while (stringTokenizer.hasMoreTokens()) {
            StringBuilder sbW2 = androidx.camera.core.impl.a.w(str);
            sbW2.append(File.separator);
            sbW2.append(stringTokenizer.nextToken());
            zE &= E(sbW2.toString());
        }
        return zE;
    }

    public static f i(l lVar, Function1 function1) {
        B bE = c.r(lVar).e(zh.b.a());
        f fVar = new f(new C1258f0(function1, 11), d.f1366d);
        bE.g(fVar);
        return fVar;
    }

    public static void j(MayaInputLayout mayaInputLayout, UIComponent uIComponent, String str) {
        if (str != null) {
            mayaInputLayout.setHint(str);
            return;
        }
        String strPlaceholder = uIComponent.placeholder();
        int i = MayaInputLayout.f12049a0;
        mayaInputLayout.o(strPlaceholder, true);
    }

    public static b o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        b bVar = new b(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) bVar.e)) {
            try {
                ((ArrayDeque) bVar.e).clear();
                String string = svM7M6.getString((SharedPreferences) bVar.f785b, (String) bVar.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) bVar.f786d)) {
                    String[] strArrSplit = string.split((String) bVar.f786d, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) bVar.e).add(str);
                        }
                    }
                    return bVar;
                }
                return bVar;
            } finally {
            }
        }
    }

    public static HashMap r(JSONObject jSONObject) {
        if (jSONObject.has("evtName") && jSONObject.has("evtData")) {
            try {
                return x3.d.x(jSONObject.getJSONObject("evtData"));
            } catch (JSONException e) {
                S.l("Could not convert JSONObject to Map - " + e.getMessage());
            }
        }
        return new HashMap();
    }

    public static String t(String str) {
        if (str == null || !C2576A.z(str, "/", false, 2)) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        String strSubstring = str.substring(0, C2576A.F(str, "/", 0, false, 6));
        j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean A(HashMap map) {
        if (map.get("data") != null && map.get("data") == null && map.get("event") == null) {
            return true;
        }
        return (map.get("data") == null || ((NotificationParser) this.c).isError(map)) ? false : true;
    }

    public boolean B(HashMap map) {
        String str = (String) map.get("data");
        if (str == null) {
            return true;
        }
        try {
            return ((NotificationParser) this.c).parseError(str).isRetryable();
        } catch (JsonSyntaxException unused) {
            Ri.a.g("Could no parse ably error: ".concat(str));
            return true;
        }
    }

    public boolean C(boolean z4) {
        n nVar = new n(z4, this, 2);
        Activity activityF = D.B.f();
        if (activityF != null) {
            return ((Z) this.f786d).f(activityF, z4, new Lh.c(6, nVar, activityF, false));
        }
        ((S) this.f).getClass();
        S.f("CurrentActivity reference is null. SDK can't prompt the user with Notification Permission! Ensure the following things:\n1. Calling ActivityLifecycleCallback.register(this) in your custom application class before super.onCreate().\n   Alternatively, register CleverTap SDK's Application class in the manifest using com.clevertap.android.sdk.Application.\n2. Ensure that the promptPushPrimer() API is called from the onResume() lifecycle method, not onCreate().");
        return false;
    }

    public synchronized H.b D(Context context) {
        H.b bVar;
        j.g(context, "context");
        bVar = (H.b) this.f;
        if (bVar == null) {
            bVar = new H.b(context, (CleverTapInstanceConfig) this.f785b);
            this.f = bVar;
            bVar.d(e.f2065b);
            bVar.d(e.c);
            bVar.d(e.e);
            bVar.b();
            bVar.r().c();
        }
        return bVar;
    }

    public void F(String str, i iVar) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (iVar != null && !AbstractC0983W.b(str)) {
            throw new IllegalArgumentException(s.j("method ", str, " must not have a request body."));
        }
        if (iVar == null && (str.equals(ShareTarget.METHOD_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(s.j("method ", str, " must have a request body."));
        }
        this.c = str;
        this.e = iVar;
    }

    public boolean G(FragmentActivity fragmentActivity, String url) {
        Context context;
        j.g(url, "url");
        try {
            Uri uri = Uri.parse(z.t(z.t(url, Global.NEWLINE, ""), "\r", ""));
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Bundle bundle = new Bundle();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                for (String str : queryParameterNames) {
                    bundle.putString(str, uri.getQueryParameter(str));
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!bundle.isEmpty()) {
                intent.putExtras(bundle);
            }
            if (fragmentActivity != null) {
                context = fragmentActivity;
            } else {
                intent.setFlags(268435456);
                context = (Context) this.f785b;
            }
            d0.j(context, intent);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            if (z.w(url, 2, "wzrk://", false)) {
                return true;
            }
            String strConcat = "No activity found to open url: ".concat(url);
            ((S) this.f).getClass();
            S.f(strConcat);
            return false;
        }
    }

    public String H() {
        String str;
        synchronized (((ArrayDeque) this.e)) {
            str = (String) ((ArrayDeque) this.e).peek();
        }
        return str;
    }

    public void I(Context context, JSONObject jSONObject, e eVar) {
        synchronized (((C0178k) this.c).f925a) {
            try {
                if (D(context).m(jSONObject, eVar) > 0) {
                    S sC = ((CleverTapInstanceConfig) this.f785b).c();
                    sC.getClass();
                    S.g(((CleverTapInstanceConfig) this.f785b).f9439a, "Queued event: " + jSONObject);
                    S sC2 = ((CleverTapInstanceConfig) this.f785b).c();
                    sC2.getClass();
                    S.s(((CleverTapInstanceConfig) this.f785b).f9439a, "Queued event to DB table " + eVar + ": " + jSONObject);
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean J(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.e)) {
            zRemove = ((ArrayDeque) this.e).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f).execute(new androidx.window.layout.adapter.extensions.a(this, 6));
            }
        }
        return zRemove;
    }

    public void K(String str) {
        ((L) this.f786d).b(str);
    }

    public void L(String text, String str) {
        j.g(text, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", text);
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        Context context = (Context) this.f785b;
        Intent intentCreateChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((InterfaceC1033d) this.f).getValue()).intValue() | C.BUFFER_FLAG_FIRST_SAMPLE).getIntentSender());
        j.d(intentCreateChooser);
        N(intentCreateChooser);
    }

    public void M(List list, String str, List list2, String str2) throws IOException {
        String str3;
        boolean zW;
        File fileV = v();
        File[] fileArrListFiles = fileV.listFiles();
        if (fileV.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileV.delete();
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = (Context) this.f785b;
            if (!zHasNext) {
                Intent intent = new Intent();
                if (arrayList.isEmpty()) {
                    if (!(str == null || C2576A.H(str))) {
                        L(str, str2);
                        return;
                    }
                }
                str3 = "*/*";
                if (arrayList.size() == 1) {
                    List list3 = list2;
                    str3 = list3 == null || list3.isEmpty() ? "*/*" : (String) C1110A.A(list2);
                    intent.setAction("android.intent.action.SEND");
                    intent.setType(str3);
                    intent.putExtra("android.intent.extra.STREAM", (Parcelable) C1110A.A(arrayList));
                } else {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    if (list2 != null && !list2.isEmpty()) {
                        if (list2.size() == 1) {
                            str3 = (String) C1110A.A(list2);
                        } else {
                            String strConcat = (String) C1110A.A(list2);
                            int iF = C1132s.f(list2);
                            if (1 <= iF) {
                                int i = 1;
                                while (true) {
                                    if (!j.b(strConcat, list2.get(i))) {
                                        if (!t(strConcat).equals(t((String) list2.get(i)))) {
                                            break;
                                        } else {
                                            strConcat = t((String) list2.get(i)).concat("/*");
                                        }
                                    }
                                    if (i == iF) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                str3 = strConcat;
                            } else {
                                str3 = strConcat;
                            }
                        }
                    }
                    intent.setType(str3);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                }
                if (str != null) {
                    intent.putExtra("android.intent.extra.TEXT", str);
                }
                if (str2 != null) {
                    intent.putExtra("android.intent.extra.SUBJECT", str2);
                }
                intent.addFlags(1);
                Intent intentCreateChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((InterfaceC1033d) this.f).getValue()).intValue() | C.BUFFER_FLAG_FIRST_SAMPLE).getIntentSender());
                Context context2 = (Activity) this.c;
                if (context2 == null) {
                    context2 = context;
                }
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
                j.f(listQueryIntentActivities, "queryIntentActivities(...)");
                Iterator<T> it2 = listQueryIntentActivities.iterator();
                while (it2.hasNext()) {
                    String str4 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                    Iterator<? extends Parcelable> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Uri uri = (Uri) it3.next();
                        Context context3 = (Activity) this.c;
                        if (context3 == null) {
                            context3 = context;
                        }
                        context3.grantUriPermission(str4, uri, 3);
                    }
                }
                j.d(intentCreateChooser);
                N(intentCreateChooser);
                return;
            }
            File file2 = new File((String) it.next());
            try {
                String canonicalPath = file2.getCanonicalPath();
                j.d(canonicalPath);
                String canonicalPath2 = v().getCanonicalPath();
                j.f(canonicalPath2, "getCanonicalPath(...)");
                zW = z.w(canonicalPath, 2, canonicalPath2, false);
            } catch (IOException unused) {
                zW = false;
            }
            if (zW) {
                throw new IOException(s.j("Shared file can not be located in '", v().getCanonicalPath(), "'"));
            }
            File fileV2 = v();
            if (!fileV2.exists()) {
                fileV2.mkdirs();
            }
            File file3 = new File(fileV2, file2.getName());
            nj.l.e(file2, file3);
            Activity activity = (Activity) this.c;
            if (activity != null) {
                context = activity;
            }
            arrayList.add(FileProvider.getUriForFile(context, (String) ((InterfaceC1033d) this.e).getValue(), file3));
        }
    }

    public void N(Intent intent) {
        t tVar;
        Activity activity = (Activity) this.c;
        if (activity != null) {
            activity.startActivityForResult(intent, 22643);
            return;
        }
        intent.addFlags(268435456);
        hg.b bVar = (hg.b) this.f786d;
        if (bVar.f17043b.compareAndSet(false, true) && (tVar = bVar.f17042a) != null) {
            tVar.success("dev.fluttercommunity.plus/share/unavailable");
            bVar.f17042a = null;
        }
        ((Context) this.f785b).startActivity(intent);
    }

    public Ui.f O(MatcherGroup matcherGroup, String str) throws Ti.d {
        k dVar;
        String str2;
        List<Matcher> list = matcherGroup.matchers;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (Matcher matcher : list) {
            MatcherType matcherType = matcher.matcherType;
            if (matcherType == null) {
                throw new Ti.d("Unable to create matcher for matcher type");
            }
            int i = Ti.c.f5852a[matcherType.ordinal()];
            Li.c cVar = (Li.c) this.c;
            Li.c cVar2 = (Li.c) this.f785b;
            String str3 = null;
            switch (i) {
                case 1:
                    dVar = new Ui.a();
                    break;
                case 2:
                    Objects.requireNonNull(matcher.userDefinedSegmentMatcherData);
                    dVar = new Lh.c(22, str != null ? cVar2.d(str) : q(), matcher.userDefinedSegmentMatcherData.segmentName);
                    break;
                case 3:
                    Objects.requireNonNull(matcher.userDefinedLargeSegmentMatcherData);
                    dVar = new Lh.c(22, str != null ? cVar.d(str) : q(), matcher.userDefinedLargeSegmentMatcherData.largeSegmentName);
                    break;
                case 4:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Xi.e(matcher.whitelistMatcherData.whitelist);
                    break;
                case 5:
                    Objects.requireNonNull(matcher.unaryNumericMatcherData);
                    UnaryNumericMatcherData unaryNumericMatcherData = matcher.unaryNumericMatcherData;
                    dVar = new h(unaryNumericMatcherData.value, unaryNumericMatcherData.dataType);
                    break;
                case 6:
                    Objects.requireNonNull(matcher.unaryNumericMatcherData);
                    UnaryNumericMatcherData unaryNumericMatcherData2 = matcher.unaryNumericMatcherData;
                    dVar = new Ui.i(unaryNumericMatcherData2.value, unaryNumericMatcherData2.dataType);
                    break;
                case 7:
                    Objects.requireNonNull(matcher.unaryNumericMatcherData);
                    UnaryNumericMatcherData unaryNumericMatcherData3 = matcher.unaryNumericMatcherData;
                    dVar = new Ui.j(unaryNumericMatcherData3.value, unaryNumericMatcherData3.dataType);
                    break;
                case 8:
                    Objects.requireNonNull(matcher.betweenMatcherData);
                    BetweenMatcherData betweenMatcherData = matcher.betweenMatcherData;
                    dVar = new Ui.d(betweenMatcherData.start, betweenMatcherData.end, betweenMatcherData.dataType);
                    break;
                case 9:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Vi.c(matcher.whitelistMatcherData.whitelist);
                    break;
                case 10:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Vi.d(matcher.whitelistMatcherData.whitelist);
                    break;
                case 11:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Vi.a(matcher.whitelistMatcherData.whitelist);
                    break;
                case 12:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Vi.b(matcher.whitelistMatcherData.whitelist);
                    break;
                case 13:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Xi.d(matcher.whitelistMatcherData.whitelist);
                    break;
                case 14:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Xi.b(matcher.whitelistMatcherData.whitelist);
                    break;
                case 15:
                    Objects.requireNonNull(matcher.whitelistMatcherData);
                    dVar = new Xi.a(matcher.whitelistMatcherData.whitelist);
                    break;
                case 16:
                    Objects.requireNonNull(matcher.stringMatcherData);
                    String str4 = matcher.stringMatcherData;
                    Xi.c cVar3 = new Xi.c();
                    cVar3.f6678a = str4;
                    cVar3.f6679b = Pattern.compile(str4);
                    dVar = cVar3;
                    break;
                case 17:
                    DependencyMatcherData dependencyMatcherData = matcher.dependencyMatcherData;
                    String str5 = "MatcherType is " + matcher.matcherType + ". matcher.dependencyMatcherData() MUST NOT BE null";
                    if (dependencyMatcherData == null) {
                        throw new NullPointerException(String.valueOf(str5));
                    }
                    DependencyMatcherData dependencyMatcherData2 = matcher.dependencyMatcherData;
                    String str6 = dependencyMatcherData2.split;
                    List<String> list2 = dependencyMatcherData2.treatments;
                    g gVar = new g();
                    gVar.f5993a = str6;
                    gVar.f5994b = list2;
                    dVar = gVar;
                    break;
                    break;
                case 18:
                    Boolean bool = matcher.booleanMatcherData;
                    String str7 = "MatcherType is " + matcher.matcherType + ". matcher.booleanMatcherData() MUST NOT BE null";
                    if (bool == null) {
                        throw new NullPointerException(String.valueOf(str7));
                    }
                    boolean zBooleanValue = matcher.booleanMatcherData.booleanValue();
                    Ui.e eVar = new Ui.e();
                    eVar.f5990a = zBooleanValue;
                    dVar = eVar;
                    break;
                    break;
                case 19:
                    dVar = new r(matcher.stringMatcherData);
                    break;
                case 20:
                    dVar = new Qd.a(matcher.stringMatcherData);
                    break;
                case 21:
                    dVar = new Q6.n(matcher.stringMatcherData);
                    break;
                case 22:
                    BetweenStringMatcherData betweenStringMatcherData = matcher.betweenStringMatcherData;
                    dVar = new Lh.c(betweenStringMatcherData.start, betweenStringMatcherData.end);
                    break;
                case 23:
                    dVar = new Q6.s(matcher.whitelistMatcherData.whitelist);
                    break;
                case 24:
                    Mi.c cVar4 = (Mi.c) this.f786d;
                    if (cVar4 != null) {
                        dVar = new com.google.firebase.messaging.r(cVar4, str != null ? cVar2.d(str) : q(), str != null ? cVar.d(str) : q(), matcher.userDefinedSegmentMatcherData.segmentName);
                    } else {
                        Ri.a.q("RuleBasedSegmentStorage not set in ParserCommons");
                        dVar = null;
                    }
                    break;
                default:
                    throw new Ti.d("Unable to create matcher for matcher type: " + matcher.matcherType);
            }
            if (dVar == null) {
                throw new Ti.d("Unable to create matcher for matcher type: " + matcher.matcherType);
            }
            KeySelector keySelector = matcher.keySelector;
            if (keySelector != null && (str2 = keySelector.attribute) != null) {
                str3 = str2;
            }
            arrayList.add(new Ui.c(str3, dVar, matcher.negate));
        }
        return new Ui.f(matcherGroup.combiner, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(com.paymaya.mayaui.common.view.widget.MayaInputLayout r8, java.lang.String r9, java.util.List r10, boolean r11, kotlin.jvm.functions.Function0 r12) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "mayaInputLayout"
            kotlin.jvm.internal.j.g(r8, r2)
            java.lang.String r2 = "choices"
            kotlin.jvm.internal.j.g(r10, r2)
            androidx.appcompat.widget.AppCompatEditText r2 = r8.getInputEditText()
            java.lang.Object r3 = r7.e
            Dh.c r3 = (Dh.c) r3
            if (r3 == 0) goto Lb6
            java.lang.String r4 = "$this$focusChanges"
            kotlin.jvm.internal.j.h(r2, r4)
            j4.c r4 = new j4.c
            r4.<init>(r2, r1)
            ha.D r5 = new ha.D
            r5.<init>(r12, r8, r1)
            Gh.f r4 = i(r4, r5)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r8.getFormContainerLayout()
            g4.a r5 = jk.b.d(r5)
            ha.D r6 = new ha.D
            r6.<init>(r12, r8, r0)
            Gh.f r8 = i(r5, r6)
            r12 = 2
            io.reactivex.rxjava3.disposables.b[] r12 = new io.reactivex.rxjava3.disposables.b[r12]
            r12[r1] = r4
            r12[r0] = r8
            r3.c(r12)
            if (r9 == 0) goto Lae
            boolean r8 = zj.C2576A.H(r9)
            if (r8 == 0) goto L4d
            goto Lae
        L4d:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L54
            goto La2
        L54:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r8 = r10 instanceof java.util.Collection
            if (r8 == 0) goto L64
            r8 = r10
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L64
            goto L77
        L64:
            java.util.Iterator r8 = r10.iterator()
        L68:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L77
            java.lang.Object r11 = r8.next()
            boolean r11 = r11 instanceof com.paymaya.domain.model.UIValue
            if (r11 != 0) goto L68
            goto La2
        L77:
            java.util.Iterator r8 = r10.iterator()
        L7b:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto La6
            java.lang.Object r10 = r8.next()
            com.paymaya.domain.model.UIValue r10 = (com.paymaya.domain.model.UIValue) r10
            java.lang.String r11 = r10.value()
            boolean r11 = kotlin.jvm.internal.j.b(r11, r9)
            if (r11 != 0) goto L9b
            java.lang.String r11 = r10.display()
            boolean r11 = kotlin.jvm.internal.j.b(r11, r9)
            if (r11 == 0) goto L7b
        L9b:
            java.lang.String r9 = r10.display()
            kotlin.jvm.internal.j.d(r9)
        La2:
            r2.setText(r9)
            return
        La6:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "Collection contains no element matching the predicate."
            r8.<init>(r9)
            throw r8
        Lae:
            if (r11 == 0) goto Lb5
            java.lang.String r8 = ""
            r2.setText(r8)
        Lb5:
            return
        Lb6:
            java.lang.String r8 = "mInputFieldsDisposable"
            kotlin.jvm.internal.j.n(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.b.P(com.paymaya.mayaui.common.view.widget.MayaInputLayout, java.lang.String, java.util.List, boolean, kotlin.jvm.functions.Function0):void");
    }

    public void d(final UIComponent uIComponent, String str, String str2, final Function2 function2, final C1555h c1555h, final Function0 function0, final Function0 function02) {
        Context contextS = s();
        j.f(contextS, "<get-mContext>(...)");
        final MayaInputLayout mayaInputLayout = new MayaInputLayout(contextS);
        mayaInputLayout.setLabel(uIComponent.placeholder());
        j(mayaInputLayout, uIComponent, str2);
        Context contextS2 = s();
        j.f(contextS2, "<get-mContext>(...)");
        mayaInputLayout.t(contextS2, 2131231272);
        jk.b.b(mayaInputLayout.getPrimaryIconImageView(), R.attr.mayaColorIconTint);
        int i = 0;
        mayaInputLayout.getInputEditText().setInputType(0);
        final AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        final AppCompatEditText focusChanges = mayaInputLayout.getInputEditText();
        mayaInputLayout.setContentDescription(str);
        String strDefaultValue = uIComponent.defaultValue();
        String strDateFormat = uIComponent.dateFormat();
        if (strDefaultValue != null && !C2576A.H(strDefaultValue)) {
            String strA = AbstractC1234x.a(strDefaultValue, strDateFormat, "MMM d, yyyy");
            if (strA == null && (strA = AbstractC1234x.a(strDefaultValue, "yyyy-MM-dd", "MMM d, yyyy")) == null) {
                strA = "";
            }
            mayaInputLayout.getInputEditText().setText(strA);
            mayaInputLayout.d();
        }
        DateTime dateTimeNow = DateTime.now();
        DateTime dateTimeMinusDays = new DateTime(dateTimeNow.getYear() + 1, 1, 1, 1, 1).minusDays(1);
        final DatePickerDialog datePickerDialog = new DatePickerDialog(s(), 2132018264, new DatePickerDialog.OnDateSetListener() { // from class: ha.I
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i6, int i10) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(i4, i6, i10);
                String str3 = new SimpleDateFormat(numX49.tnTj78("bSHPO"), Locale.getDefault()).format(calendar.getTime());
                kotlin.jvm.internal.j.f(str3, numX49.tnTj78("bSHPQ"));
                focusChanges.setText(str3);
            }
        }, dateTimeNow.getYear(), dateTimeNow.getMonthOfYear() - 1, dateTimeNow.getDayOfMonth());
        datePickerDialog.getDatePicker().setMaxDate(dateTimeMinusDays.getMillis());
        Dh.c cVar = (Dh.c) this.e;
        if (cVar == null) {
            j.n("mInputFieldsDisposable");
            throw null;
        }
        j.h(focusChanges, "$this$focusChanges");
        final int i4 = 0;
        f fVarI = i(new C1499a(new j4.c(focusChanges, 0), i), new Function1() { // from class: ha.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            datePickerDialog.show();
                            C1555h c1555h2 = c1555h;
                            if (c1555h2 != null) {
                                c1555h2.invoke(String.valueOf(focusChanges.getText()));
                            }
                            mayaInputLayout.d();
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHr"));
                        datePickerDialog.show();
                        C1555h c1555h3 = c1555h;
                        if (c1555h3 != null) {
                            c1555h3.invoke(String.valueOf(focusChanges.getText()));
                        }
                        mayaInputLayout.d();
                        break;
                    default:
                        kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHL"));
                        datePickerDialog.show();
                        C1555h c1555h4 = c1555h;
                        if (c1555h4 != null) {
                            c1555h4.invoke(String.valueOf(focusChanges.getText()));
                        }
                        mayaInputLayout.d();
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i6 = 1;
        f fVarI2 = i(jk.b.d(focusChanges), new Function1() { // from class: ha.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            datePickerDialog.show();
                            C1555h c1555h2 = c1555h;
                            if (c1555h2 != null) {
                                c1555h2.invoke(String.valueOf(focusChanges.getText()));
                            }
                            mayaInputLayout.d();
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHr"));
                        datePickerDialog.show();
                        C1555h c1555h3 = c1555h;
                        if (c1555h3 != null) {
                            c1555h3.invoke(String.valueOf(focusChanges.getText()));
                        }
                        mayaInputLayout.d();
                        break;
                    default:
                        kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHL"));
                        datePickerDialog.show();
                        C1555h c1555h4 = c1555h;
                        if (c1555h4 != null) {
                            c1555h4.invoke(String.valueOf(focusChanges.getText()));
                        }
                        mayaInputLayout.d();
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i10 = 2;
        cVar.c(fVarI, fVarI2, i(jk.b.d(mayaInputLayout.getFormContainerLayout()), new Function1() { // from class: ha.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            datePickerDialog.show();
                            C1555h c1555h2 = c1555h;
                            if (c1555h2 != null) {
                                c1555h2.invoke(String.valueOf(focusChanges.getText()));
                            }
                            mayaInputLayout.d();
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHr"));
                        datePickerDialog.show();
                        C1555h c1555h3 = c1555h;
                        if (c1555h3 != null) {
                            c1555h3.invoke(String.valueOf(focusChanges.getText()));
                        }
                        mayaInputLayout.d();
                        break;
                    default:
                        kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHL"));
                        datePickerDialog.show();
                        C1555h c1555h4 = c1555h;
                        if (c1555h4 != null) {
                            c1555h4.invoke(String.valueOf(focusChanges.getText()));
                        }
                        mayaInputLayout.d();
                        break;
                }
                return Unit.f18162a;
            }
        }));
        ((HashMap) this.f).put(uIComponent.parameter() + str, mayaInputLayout);
        Dh.c cVar2 = (Dh.c) this.e;
        if (cVar2 == null) {
            j.n("mInputFieldsDisposable");
            throw null;
        }
        cVar2.a(i(new C1499a(p.E(inputEditText), i), new Function1() { // from class: ha.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AppCompatEditText appCompatEditText = inputEditText;
                UIComponent uIComponent2 = uIComponent;
                Function2 function22 = function2;
                CharSequence charSequence = (CharSequence) obj;
                String strTnTj78 = numX49.tnTj78("bSHZ");
                String strTnTj782 = numX49.tnTj78("bSHk");
                kotlin.jvm.internal.j.g(charSequence, numX49.tnTj78("bSHB"));
                try {
                    Editable text = appCompatEditText.getText();
                    String string = text != null ? text.toString() : null;
                    if (string == null || C2576A.H(string)) {
                        function02.invoke();
                    } else {
                        String string2 = charSequence.toString();
                        String strA2 = AbstractC1234x.a(string2, uIComponent2.dateFormat(), strTnTj78);
                        if (strA2 == null && (strA2 = AbstractC1234x.a(string2, "MMM d, yyyy", strTnTj78)) == null) {
                            strA2 = strTnTj782;
                        }
                        function22.invoke(strA2, charSequence.toString());
                    }
                } catch (Exception unused) {
                    appCompatEditText.setText(strTnTj782);
                    function22.invoke(strTnTj782, strTnTj782);
                    function0.invoke();
                    yk.a.b();
                }
                return Unit.f18162a;
            }
        }));
        h(mayaInputLayout);
        String strDefaultValue2 = uIComponent.defaultValue();
        if (strDefaultValue2 != null && !C2576A.H(strDefaultValue2)) {
            inputEditText.setText(AbstractC1234x.m.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(uIComponent.defaultValue())));
        }
        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ((HashMap) this.f).get(uIComponent.parameter());
        if (mayaInputLayout2 != null) {
            ((LinearLayout) this.f785b).removeView(mayaInputLayout2);
        }
        ((HashMap) this.f).put(uIComponent.parameter(), mayaInputLayout);
    }

    public void e(String str, String str2) {
        L l6 = (L) this.f786d;
        l6.getClass();
        x.c(str);
        x.d(str2, str);
        ArrayList arrayList = (ArrayList) l6.f11367b;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public void f(UIComponent uIComponent, String str, Function1 function1, Function0 function0, Function0 function02) {
        int i = 2;
        Context contextS = s();
        j.f(contextS, "<get-mContext>(...)");
        MayaInputLayout mayaInputLayout = new MayaInputLayout(contextS);
        mayaInputLayout.setLabel(uIComponent.placeholder());
        Context contextS2 = s();
        j.f(contextS2, "<get-mContext>(...)");
        mayaInputLayout.t(contextS2, R.drawable.maya_ic_chevron_down_primary);
        jk.b.b(mayaInputLayout.getPrimaryIconImageView(), R.attr.mayaColorIconTint);
        int i4 = 0;
        mayaInputLayout.getInputEditText().setInputType(0);
        j(mayaInputLayout, uIComponent, str);
        Dh.c cVar = (Dh.c) this.e;
        if (cVar == null) {
            j.n("mInputFieldsDisposable");
            throw null;
        }
        AppCompatEditText afterTextChangeEvents = mayaInputLayout.getInputEditText();
        j.h(afterTextChangeEvents, "$this$afterTextChangeEvents");
        cVar.a(i(new C1499a(new j4.c(afterTextChangeEvents, 1), i4), new C7.f(21, function1, function02)));
        String strDefaultValue = uIComponent.defaultValue();
        AppCompatEditText focusChanges = mayaInputLayout.getInputEditText();
        Dh.c cVar2 = (Dh.c) this.e;
        if (cVar2 == null) {
            j.n("mInputFieldsDisposable");
            throw null;
        }
        j.h(focusChanges, "$this$focusChanges");
        cVar2.c(i(new j4.c(focusChanges, 0), new D(function0, mayaInputLayout, i)), i(jk.b.d(mayaInputLayout.getFormContainerLayout()), new D(function0, mayaInputLayout, 3)));
        if (strDefaultValue != null && !C2576A.H(strDefaultValue)) {
            focusChanges.setText(strDefaultValue);
        }
        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ((HashMap) this.f).get(uIComponent.parameter());
        if (mayaInputLayout2 != null) {
            ((LinearLayout) this.f785b).removeView(mayaInputLayout2);
        }
        ((HashMap) this.f).remove(uIComponent.parameter());
        h(mayaInputLayout);
        ((HashMap) this.f).put(uIComponent.parameter(), mayaInputLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.paymaya.domain.model.UIComponent r8, java.lang.String r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.b.g(com.paymaya.domain.model.UIComponent, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f784a) {
            case 4:
                return new m((B5.l) ((InterfaceC1101b) this.f785b).get(), (OkHttpClient) ((InterfaceC1101b) this.c).get(), (S0) ((C1915b) this.f786d).get(), (U0) ((C0533b) this.e).get(), (S5.c) ((InterfaceC1101b) this.f).get());
            default:
                return new h1.a((Executor) ((InterfaceC0716a) this.f785b).get(), (d1.e) ((InterfaceC0716a) this.c).get(), (C1583c) ((U8.c) this.f786d).get(), (InterfaceC1656d) ((InterfaceC0716a) this.e).get(), (k1.b) ((InterfaceC0716a) this.f).get());
        }
    }

    public void h(MayaInputLayout mayaInputLayout) {
        ((LinearLayout) this.f785b).addView(mayaInputLayout, new ViewGroup.LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = mayaInputLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((Number) ((InterfaceC1033d) this.f786d).getValue()).floatValue();
        }
    }

    public C1365g k() {
        if (((df.z) this.f785b) != null) {
            return new C1365g(this);
        }
        throw new IllegalStateException("url == null");
    }

    public boolean l(Context context, ArrayList ids) {
        j.g(context, "context");
        j.g(ids, "ids");
        synchronized (((C0178k) this.c).f925a) {
            if (ids.isEmpty()) {
                return true;
            }
            try {
                H.b bVarD = D(context);
                if (!ids.isEmpty()) {
                    bVarD.c((String) ids.get(ids.size() - 1), e.e);
                    S sC = ((CleverTapInstanceConfig) this.f785b).c();
                    String str = ((CleverTapInstanceConfig) this.f785b).f9439a;
                    String str2 = "Cleaned " + ids.size() + " events from Push impressions table";
                    sC.getClass();
                    S.s(str, str2);
                }
                return true;
            } catch (Exception e) {
                S sC2 = ((CleverTapInstanceConfig) this.f785b).c();
                String str3 = ((CleverTapInstanceConfig) this.f785b).f9439a;
                sC2.getClass();
                S.t(str3, "Error during cleanup of notification sent events", e);
                return false;
            }
        }
    }

    public boolean m(Context context, ArrayList eventIds, ArrayList profileEventIds) {
        j.g(context, "context");
        j.g(eventIds, "eventIds");
        j.g(profileEventIds, "profileEventIds");
        synchronized (((C0178k) this.c).f925a) {
            if (eventIds.isEmpty() && profileEventIds.isEmpty()) {
                return true;
            }
            try {
                H.b bVarD = D(context);
                if (!eventIds.isEmpty()) {
                    bVarD.c((String) eventIds.get(eventIds.size() - 1), e.f2065b);
                    S sC = ((CleverTapInstanceConfig) this.f785b).c();
                    String str = ((CleverTapInstanceConfig) this.f785b).f9439a;
                    String str2 = "Cleaned " + eventIds.size() + " events from events table";
                    sC.getClass();
                    S.s(str, str2);
                }
                if (!profileEventIds.isEmpty()) {
                    bVarD.c((String) profileEventIds.get(profileEventIds.size() - 1), e.c);
                    S sC2 = ((CleverTapInstanceConfig) this.f785b).c();
                    String str3 = ((CleverTapInstanceConfig) this.f785b).f9439a;
                    String str4 = "Cleaned " + profileEventIds.size() + " events from profileEvents table";
                    sC2.getClass();
                    S.s(str3, str4);
                }
                return true;
            } catch (Exception e) {
                S sC3 = ((CleverTapInstanceConfig) this.f785b).c();
                String str5 = ((CleverTapInstanceConfig) this.f785b).f9439a;
                sC3.getClass();
                S.t(str5, "Error during cleanup of sent events", e);
                return false;
            }
        }
    }

    public void n(Context context) {
        j.g(context, "context");
        synchronized (((C0178k) this.c).f925a) {
            H.b bVarD = D(context);
            bVarD.l(e.f2065b);
            bVarD.l(e.c);
            SharedPreferences.Editor editorEdit = b0.f(context, "IJ").edit();
            editorEdit.clear();
            b0.i(editorEdit);
            ((C0190x) this.f786d).invoke();
            ((C0190x) this.e).invoke();
            Unit unit = Unit.f18162a;
        }
    }

    public B1.a p(Context context) {
        B1.a aVarF;
        j.g(context, "context");
        synchronized (((C0178k) this.c).f925a) {
            aVarF = D(context).f();
        }
        return aVarF;
    }

    public Li.a q() {
        if (((Li.a) this.f) == null) {
            this.f = new Li.a();
        }
        return (Li.a) this.f;
    }

    public Context s() {
        return (Context) ((InterfaceC1033d) this.c).getValue();
    }

    public List u(String str, String str2, List list) {
        if (list.size() > 50) {
            Ri.a.q(str2);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Condition condition = (Condition) it.next();
                List<Partition> list2 = condition.partitions;
                arrayList.add(new Ti.a(condition.conditionType, O(condition.matcherGroup, str), list2, condition.label));
            }
            return arrayList;
        } catch (Ti.d e) {
            Ri.a.q(e.getMessage());
            ((C2011b) this.e).getClass();
            Partition partition = new Partition();
            partition.size = 100;
            partition.treatment = SessionDescription.ATTR_CONTROL;
            return Collections.singletonList(new Ti.a(ConditionType.WHITELIST, new Ui.f(MatcherCombiner.AND, Collections.singletonList(new Ui.c(null, new Ui.a(), false))), Collections.singletonList(partition), "targeting rule type unsupported by sdk"));
        }
    }

    public File v() {
        Context context = (Activity) this.c;
        if (context == null) {
            context = (Context) this.f785b;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    public a w() {
        return new a((U8.c) this.c, (Qi.b) this.e, (Qi.c) this.f);
    }

    public void x(boolean z4) {
        ((C1967a) this.f785b).b(new S(z4 ? 3 : 4));
        ((Qi.c) this.f).t(new Pi.a(Oi.b.SSE_CONNECTION_ERROR, Long.valueOf((z4 ? Pi.b.REQUESTED : Pi.b.NON_REQUESTED).f5182a), System.currentTimeMillis()));
    }

    public void y(HashMap map) {
        StringBuilder sb2;
        String str = (String) map.get("data");
        if (str != null) {
            NotificationParser notificationParser = (NotificationParser) this.c;
            if (notificationParser.isError(map)) {
                try {
                    StreamingError error = notificationParser.parseError(str);
                    Ri.a.q("Streaming error notification received: " + error.getMessage());
                    if (error.shouldBeIgnored()) {
                        Ri.a.q("Error ignored");
                        return;
                    }
                    ((Qi.c) this.f).t(new Pi.a(Oi.b.ABLY_ERROR, Long.valueOf(error.getCode()), System.currentTimeMillis()));
                    ((C1967a) this.f785b).b(new S(error.isRetryable() ? 3 : 4));
                    return;
                } catch (JsonSyntaxException e) {
                    StringBuilder sbW = s.w("Could not parse occupancy notification: ", str, " -> ");
                    sbW.append(e.getLocalizedMessage());
                    Ri.a.g(sbW.toString());
                    return;
                } catch (Exception e7) {
                    e = e7;
                    sb2 = new StringBuilder("Unexpected error while processing occupancy notification: ");
                }
            } else {
                IncomingNotification incoming = notificationParser.parseIncoming(str);
                if (incoming == null) {
                    return;
                }
                int i = yi.i.f21306a[incoming.getType().ordinal()];
                yi.d dVar = (yi.d) this.e;
                switch (i) {
                    case 1:
                        try {
                            ControlNotification control = notificationParser.parseControl(incoming.getJsonData());
                            control.setTimestamp(incoming.getTimestamp());
                            dVar.a(control);
                            return;
                        } catch (JsonSyntaxException e10) {
                            Ri.a.g("Could not parse control notification: " + incoming.getJsonData() + " -> " + e10.getLocalizedMessage());
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            sb2 = new StringBuilder("Unexpected error while processing control notification: ");
                        }
                        break;
                    case 2:
                        try {
                            OccupancyNotification occupancy = notificationParser.parseOccupancy(incoming.getJsonData());
                            occupancy.setChannel(incoming.getChannel());
                            occupancy.setTimestamp(incoming.getTimestamp());
                            dVar.b(occupancy);
                            return;
                        } catch (JsonSyntaxException e12) {
                            Ri.a.g("Could not parse occupancy notification: " + incoming.getJsonData() + " -> " + e12.getLocalizedMessage());
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            sb2 = new StringBuilder("Unexpected error while processing occupancy notification: ");
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        if (dVar.f21290d.get()) {
                            ((NotificationProcessor) this.f786d).process(incoming);
                            return;
                        }
                        return;
                    default:
                        Ri.a.q("SSE Handler: Unknown notification: " + incoming.getType());
                        return;
                }
            }
            AbstractC1414e.o(e, sb2);
        }
    }

    public void z(String str, String str2) {
        L l6 = (L) this.f786d;
        l6.getClass();
        x.c(str);
        x.d(str2, str);
        l6.b(str);
        ArrayList arrayList = (ArrayList) l6.f11367b;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f784a = i;
        this.f785b = obj;
        this.c = obj2;
        this.f786d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ b(boolean z4) {
        this.f784a = 9;
    }

    public b() {
        this.f784a = 9;
        this.f = Collections.EMPTY_MAP;
        this.c = ShareTarget.METHOD_GET;
        this.f786d = new L(6);
    }

    public b(CleverTapInstanceConfig cleverTapInstanceConfig, C0178k c0178k, Qd.a aVar, C0190x c0190x, C0190x c0190x2) {
        this.f784a = 1;
        this.f785b = cleverTapInstanceConfig;
        this.c = c0178k;
        this.f786d = c0190x;
        this.e = c0190x2;
    }

    public b(Context context, hg.b manager) {
        this.f784a = 12;
        j.g(manager, "manager");
        this.f785b = context;
        this.c = null;
        this.f786d = manager;
        this.e = C1034e.b(new W4.b(this, 20));
        this.f = C1034e.b(new A5.j(28));
    }

    public b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Z z4) {
        this.f784a = 3;
        A0 a02 = new A0(25);
        j.g(context, "context");
        this.f785b = context;
        this.c = cleverTapInstanceConfig;
        this.f786d = z4;
        this.e = a02;
        this.f = cleverTapInstanceConfig.c();
    }

    public b(C1781b c1781b) {
        this.f784a = 14;
        mg.c cVar = new mg.c(18);
        this.f786d = new C0193a(new C1983a(this, 0));
        this.e = new C0193a(new C1983a(this, 0));
        this.f = new C0193a(new C1983a(this, 0));
        this.f785b = cVar;
        this.c = c1781b;
    }

    public b(Drawable.Callback callback) {
        this.f784a = 15;
        this.f785b = new s.j();
        this.c = new HashMap();
        this.f786d = new HashMap();
        this.f = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC2540b.b("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
        } else {
            this.e = ((View) callback).getContext().getAssets();
        }
    }

    public b(U8.c cVar, U8.c cVar2, Qi.c cVar3, Xh.d dVar, io.split.android.client.storage.splits.c cVar4, Li.c cVar5, Li.c cVar6, int i, int i4) {
        this.f784a = 0;
        this.f785b = cVar;
        this.f786d = new Q3.b(cVar3, dVar, i, i4);
        this.c = cVar2;
        this.e = new Qi.b(cVar3, cVar4, cVar5, cVar6);
        this.f = cVar3;
    }

    public b(LinearLayout mContainer) {
        this.f784a = 11;
        j.g(mContainer, "mContainer");
        this.f785b = mContainer;
        final int i = 0;
        this.c = C1034e.b(new Function0(this) { // from class: ha.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ci.b f16975b;

            {
                this.f16975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((LinearLayout) this.f16975b.f785b).getContext();
                    case 1:
                        return Float.valueOf(this.f16975b.s().getResources().getDimension(R.dimen.maya_margin_large));
                    default:
                        return Float.valueOf(this.f16975b.s().getResources().getDimension(R.dimen.maya_margin_small));
                }
            }
        });
        final int i4 = 1;
        this.f786d = C1034e.b(new Function0(this) { // from class: ha.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ci.b f16975b;

            {
                this.f16975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ((LinearLayout) this.f16975b.f785b).getContext();
                    case 1:
                        return Float.valueOf(this.f16975b.s().getResources().getDimension(R.dimen.maya_margin_large));
                    default:
                        return Float.valueOf(this.f16975b.s().getResources().getDimension(R.dimen.maya_margin_small));
                }
            }
        });
        final int i6 = 2;
        C1034e.b(new Function0(this) { // from class: ha.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ci.b f16975b;

            {
                this.f16975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return ((LinearLayout) this.f16975b.f785b).getContext();
                    case 1:
                        return Float.valueOf(this.f16975b.s().getResources().getDimension(R.dimen.maya_margin_large));
                    default:
                        return Float.valueOf(this.f16975b.s().getResources().getDimension(R.dimen.maya_margin_small));
                }
            }
        });
        this.f = new HashMap();
    }

    public b(NotificationParser notificationParser, NotificationProcessor notificationProcessor, Qi.c cVar, C1967a c1967a) {
        this.f784a = 17;
        yi.d dVar = new yi.d(c1967a, cVar);
        this.c = notificationParser;
        this.f786d = notificationProcessor;
        this.f785b = c1967a;
        this.e = dVar;
        Objects.requireNonNull(cVar);
        this.f = cVar;
    }

    public b(CleverTapInstanceConfig cleverTapInstanceConfig, D.B b8, Q q9, C2361c c2361c, c0.k kVar) {
        this.f784a = 2;
        this.c = cleverTapInstanceConfig;
        this.f786d = q9;
        this.e = kVar;
        this.f = c2361c;
        this.f785b = b8;
    }

    public b(v vVar, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, C1915b c1915b, C0533b c0533b, InterfaceC1101b interfaceC1101b3) {
        this.f784a = 4;
        this.f785b = interfaceC1101b;
        this.c = interfaceC1101b2;
        this.f786d = c1915b;
        this.e = c0533b;
        this.f = interfaceC1101b3;
    }

    public b(Li.c cVar, Li.c cVar2) {
        this.f784a = 7;
        C2011b c2011b = new C2011b(15);
        Objects.requireNonNull(cVar);
        this.f785b = cVar;
        Objects.requireNonNull(cVar2);
        this.c = cVar2;
        this.e = c2011b;
    }

    public b(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f784a = 8;
        this.e = new ArrayDeque();
        this.f785b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.f786d = ",";
        this.f = scheduledThreadPoolExecutor;
    }

    public b(String serialName) {
        this.f784a = 6;
        j.g(serialName, "serialName");
        this.f785b = C1112C.f9377a;
        this.c = new ArrayList();
        new HashSet();
        this.f786d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
}
