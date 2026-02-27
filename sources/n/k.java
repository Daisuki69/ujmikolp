package N;

import D.A;
import D.AbstractC0184q;
import D.B;
import D.C0176i;
import D.CallableC0168a;
import D.CallableC0170c;
import D.H;
import D.J;
import D.K;
import D.O;
import D.S;
import D.T;
import D.Z;
import D.d0;
import D.r;
import M8.C0332a;
import We.s;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import bj.InterfaceC1033d;
import cj.C1110A;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.paymaya.domain.store.A0;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import n2.C1915b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final List f3472r = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile CTInAppNotification f3473s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f3475b;
    public final l0.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f3476d;
    public final r e;
    public final C0176i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H f3477g;
    public final Lh.c h;
    public final R.c i;
    public final O.k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Ci.b f3478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f3479l;
    public final C0332a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S f3480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f3481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f3482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f3483q;

    public k(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, l0.c cVar, A a8, r rVar, C0176i c0176i, B b8, T t5, H h, Lh.c cVar2, R.c cVar3, O.k kVar, Ci.b bVar, m mVar) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("PJG"));
        this.f3474a = context;
        this.f3475b = cleverTapInstanceConfig;
        this.c = cVar;
        this.f3476d = a8;
        this.e = rVar;
        this.f = c0176i;
        this.f3477g = h;
        this.h = cVar2;
        this.i = cVar3;
        this.j = kVar;
        this.f3478k = bVar;
        this.f3479l = mVar;
        this.m = new C0332a(this, 16);
        this.f3480n = cleverTapInstanceConfig.c();
        this.f3481o = cleverTapInstanceConfig.f9439a;
        this.f3482p = h.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = t5.f875d;
        if (str != null) {
            Iterator it = C2576A.T(str, new String[]{numX49.tnTj78("PJ3")}, 6).iterator();
            while (it.hasNext()) {
                String string = C2576A.b0((String) it.next()).toString();
                if (!C2576A.H(string)) {
                    linkedHashSet.add(string);
                }
            }
        }
        String str2 = numX49.tnTj78("PJy") + C1110A.F(linkedHashSet, null, null, null, null, 63);
        S s9 = this.f3480n;
        String str3 = this.f3481o;
        s9.getClass();
        S.g(str3, str2);
        this.f3483q = linkedHashSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // N.l
    public final Bundle A(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String str, Bundle bundle, FragmentActivity fragmentActivity) throws JSONException {
        kotlin.jvm.internal.j.g(cTInAppNotification, numX49.tnTj78("PJv"));
        kotlin.jvm.internal.j.g(cTInAppAction, numX49.tnTj78("PJ7"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PJA"));
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("wzrk_id", cTInAppNotification.f9489b);
        bundle2.putString("wzrk_c2a", str);
        if (!cTInAppNotification.f9500q) {
            this.f.r(true, cTInAppNotification, bundle2);
        }
        f fVar = cTInAppAction.f9471a;
        if (fVar == null) {
            S s9 = this.f3480n;
            String strTnTj78 = numX49.tnTj78("PJY");
            s9.getClass();
            S.f(strTnTj78);
            return bundle2;
        }
        int iOrdinal = fVar.ordinal();
        CTInAppNotification cTInAppNotification2 = null;
        o = null;
        O o8 = null;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                String str2 = cTInAppAction.f9472b;
                if (str2 != null) {
                    this.f3478k.G(fragmentActivity, str2);
                    return bundle2;
                }
                S s10 = this.f3480n;
                String strTnTj782 = numX49.tnTj78("PJ0");
                s10.getClass();
                S.f(strTnTj782);
                return bundle2;
            }
            if (iOrdinal == 2) {
                HashMap map = cTInAppAction.c;
                if (map != null && (!map.isEmpty())) {
                    r rVar = this.e;
                    WeakReference weakReference = rVar.f936d;
                    if (((weakReference == null || weakReference.get() == null) ? null : (O) rVar.f936d.get()) != null) {
                        r rVar2 = this.e;
                        WeakReference weakReference2 = rVar2.f936d;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            o8 = (O) rVar2.f936d.get();
                        }
                        o8.A0(map);
                        return bundle2;
                    }
                }
            } else if (iOrdinal == 3) {
                CustomTemplateInAppData customTemplateInAppData = cTInAppAction.f9473d;
                String str3 = customTemplateInAppData != null ? customTemplateInAppData.f9515a : null;
                if (str3 == null) {
                    S s11 = this.f3480n;
                    String strTnTj783 = numX49.tnTj78("PJp");
                    s11.getClass();
                    S.f(strTnTj783);
                    return bundle2;
                }
                O.b bVar = (O.b) this.j.f4524b.get(str3);
                if (bVar == null) {
                    S s12 = this.f3480n;
                    String strConcat = numX49.tnTj78("PJR").concat(str3);
                    s12.getClass();
                    S.f(strConcat);
                    return bundle2;
                }
                customTemplateInAppData.getClass();
                CustomTemplateInAppData customTemplateInAppData2 = new CustomTemplateInAppData(null);
                customTemplateInAppData2.f9515a = customTemplateInAppData.f9515a;
                customTemplateInAppData2.f9516b = customTemplateInAppData.f9516b;
                customTemplateInAppData2.c = customTemplateInAppData.c;
                customTemplateInAppData2.f9517d = customTemplateInAppData.f9517d;
                JSONObject jSONObject = customTemplateInAppData.e;
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    AbstractC0184q.c(jSONObject2, jSONObject);
                    customTemplateInAppData2.e = jSONObject2;
                }
                customTemplateInAppData2.f9516b = true;
                JSONObject jSONObject3 = cTInAppNotification.f;
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("ti", cTInAppNotification.f9487a);
                    jSONObject4.put("wzrk_id", cTInAppNotification.f9489b);
                    M2.b bVar2 = f.f3462b;
                    jSONObject4.put(SessionDescription.ATTR_TYPE, "custom-code");
                    jSONObject4.put("efc", 1);
                    jSONObject4.put("excludeGlobalFCaps", 1);
                    jSONObject4.put("wzrk_ttl", cTInAppNotification.f9497n);
                    if (jSONObject3.has("wzrk_pivot")) {
                        jSONObject4.put("wzrk_pivot", jSONObject3.optString("wzrk_pivot"));
                    }
                    if (jSONObject3.has("wzrk_cgId")) {
                        jSONObject4.put("wzrk_cgId", jSONObject3.optString("wzrk_cgId"));
                    }
                    CTInAppNotification cTInAppNotification3 = new CTInAppNotification(jSONObject4, cTInAppNotification.f9490b0);
                    cTInAppNotification3.e(customTemplateInAppData2);
                    cTInAppNotification2 = cTInAppNotification3;
                } catch (JSONException unused) {
                }
                if (cTInAppNotification2 == null) {
                    S s13 = this.f3480n;
                    String strConcat2 = numX49.tnTj78("PJT").concat(str3);
                    s13.getClass();
                    S.f(strConcat2);
                } else if (bVar.c) {
                    JSONObject jSONObjectB = AbstractC0184q.b(cTInAppNotification2.f);
                    if (!f(jSONObjectB)) {
                        Lh.c cVar = this.h;
                        synchronized (cVar) {
                            JSONArray jSONArrayI = cVar.i();
                            int i = 0;
                            Object obj = jSONObjectB;
                            while (i < jSONArrayI.length()) {
                                Object obj2 = jSONArrayI.get(i);
                                jSONArrayI.put(i, obj);
                                i++;
                                obj = obj2;
                            }
                            jSONArrayI.put(obj);
                            Y.d dVar = ((Y.f) cVar.f2990b).f6709a;
                            if (dVar != null) {
                                dVar.b(jSONArrayI);
                                Unit unit = Unit.f18162a;
                            }
                        }
                        k();
                    }
                } else {
                    i(AbstractC0184q.b(cTInAppNotification2.f));
                }
            }
        } else if (c.f3451r == cTInAppNotification.c) {
            O.k kVar = this.j;
            CustomTemplateInAppData customTemplateInAppData3 = cTInAppNotification.f9503t;
            String str4 = customTemplateInAppData3 != null ? customTemplateInAppData3.f9515a : null;
            String strTnTj784 = numX49.tnTj78("PJg");
            S s14 = kVar.f4523a;
            if (str4 == null) {
                S.g(strTnTj784, numX49.tnTj78("PJf"));
                return bundle2;
            }
            if (((O.f) kVar.c.get(str4)) == null) {
                S.g(strTnTj784, numX49.tnTj78("PJ1"));
                return bundle2;
            }
            if (((O.b) kVar.f4524b.get(str4)) == null) {
                s14.k(strTnTj784, numX49.tnTj78("PJn").concat(str4));
            }
        }
        return bundle2;
    }

    @Override // N.l
    public final void K(CTInAppNotification cTInAppNotification) {
        String strB;
        kotlin.jvm.internal.j.g(cTInAppNotification, numX49.tnTj78("PJx"));
        K k8 = (K) this.f3476d.f791a;
        if (k8 != null && (strB = K.b(cTInAppNotification)) != null) {
            k8.f853g.a().k(numX49.tnTj78("PJs"), new J(0, k8, strB, this.f3474a));
        }
        this.f.r(false, cTInAppNotification, null);
    }

    @Override // N.l
    public final void K0(CTInAppNotification cTInAppNotification, Bundle bundle) {
        String strTnTj78;
        kotlin.jvm.internal.j.g(cTInAppNotification, numX49.tnTj78("PJ5"));
        K k8 = (K) this.f3476d.f791a;
        String str = this.f3481o;
        S s9 = this.f3480n;
        if (k8 != null) {
            CustomTemplateInAppData customTemplateInAppData = cTInAppNotification.f9503t;
            if (customTemplateInAppData == null || (strTnTj78 = customTemplateInAppData.f9515a) == null) {
                strTnTj78 = numX49.tnTj78("PJJ");
            }
            String str2 = numX49.tnTj78("PJI") + cTInAppNotification.f9489b + ' ' + strTnTj78;
            s9.getClass();
            S.s(str, str2);
        } else {
            String str3 = numX49.tnTj78("PJq") + cTInAppNotification.f9489b + numX49.tnTj78("PJz");
            s9.getClass();
            S.s(str, str3);
        }
        this.c.c(numX49.tnTj78("PJl")).k(numX49.tnTj78("PJW"), new g(this, cTInAppNotification, 0));
    }

    public final void a() {
        JSONObject jSONObject;
        try {
            if (!c(B.f())) {
                S.l("Not showing notification on blacklisted activity");
                return;
            }
            if (this.f3482p == h.f3468b) {
                S s9 = this.f3480n;
                String str = this.f3481o;
                s9.getClass();
                S.g(str, "InApp Notifications are set to be suspended, not showing the InApp Notification");
                return;
            }
            if (d()) {
                return;
            }
            Lh.c cVar = this.h;
            synchronized (cVar) {
                JSONArray jSONArrayI = cVar.i();
                if (jSONArrayI.length() != 0) {
                    Object objRemove = jSONArrayI.remove(0);
                    Y.d dVar = ((Y.f) cVar.f2990b).f6709a;
                    if (dVar != null) {
                        dVar.b(jSONArrayI);
                        Unit unit = Unit.f18162a;
                    }
                    jSONObject = objRemove instanceof JSONObject ? (JSONObject) objRemove : null;
                }
            }
            if (jSONObject == null) {
                return;
            }
            if (this.f3482p != h.f3467a) {
                i(jSONObject);
                return;
            }
            S s10 = this.f3480n;
            String str2 = this.f3481o;
            s10.getClass();
            S.g(str2, "InApp Notifications are set to be discarded, dropping the InApp Notification");
        } catch (Throwable th2) {
            S s11 = this.f3480n;
            String str3 = this.f3481o;
            String strTnTj78 = numX49.tnTj78("PJP9");
            s11.getClass();
            S.t(str3, strTnTj78, th2);
        }
    }

    public final void b(JSONArray jSONArray) {
        kotlin.jvm.internal.j.g(jSONArray, numX49.tnTj78("PJPP"));
        try {
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && !f(jSONObjectOptJSONObject)) {
                    jSONArray2.put(jSONObjectOptJSONObject);
                }
            }
            this.h.f(jSONArray2);
            k();
        } catch (Exception e) {
            this.f3480n.getClass();
            S.h(this.f3481o, numX49.tnTj78("PJPb"), e);
        }
    }

    public final boolean c(Activity activity) {
        if (activity == null) {
            return true;
        }
        String localClassName = activity.getLocalClassName();
        kotlin.jvm.internal.j.f(localClassName, numX49.tnTj78("PJP2"));
        Iterator it = this.f3483q.iterator();
        while (it.hasNext()) {
            if (C2576A.z(localClassName, (String) it.next(), false, 2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        S.m(this.f3481o, numX49.tnTj78("PJPL"));
        List list = f3472r;
        kotlin.jvm.internal.j.f(list, numX49.tnTj78("PJPr"));
        synchronized (list) {
            if (list.isEmpty()) {
                return false;
            }
            CTInAppNotification cTInAppNotification = (CTInAppNotification) list.remove(0);
            kotlin.jvm.internal.j.d(cTInAppNotification);
            C1915b c1915bA = this.c.a();
            c1915bA.e(new A7.r(16, this, cTInAppNotification));
            c1915bA.k("checkLimitsBeforeShowing", new g(this, cTInAppNotification, 1));
            return true;
        }
    }

    public final void e(CTInAppNotification cTInAppNotification) {
        boolean zB = kotlin.jvm.internal.j.b(Looper.myLooper(), Looper.getMainLooper());
        l0.c cVar = this.c;
        if (!zB) {
            cVar.d(cVar.f18219b, cVar.c, numX49.tnTj78("PJPZ")).k(numX49.tnTj78("PJPk"), new g(this, cTInAppNotification, 2));
            return;
        }
        if (cTInAppNotification.f9502s) {
            Ci.b bVar = this.f3478k;
            Z z4 = (Z) bVar.f786d;
            Context context = (Context) bVar.f785b;
            if (z4.c(context)) {
                this.f3480n.getClass();
                S.s(this.f3481o, numX49.tnTj78("PJPB"));
                z4.getClass();
                kotlin.jvm.internal.j.g(context, numX49.tnTj78("PJPu"));
                z4.c(context);
                z4.d();
                k();
                return;
            }
        }
        C1915b c1915bA = cVar.a();
        c1915bA.e(new A7.r(16, this, cTInAppNotification));
        c1915bA.k(numX49.tnTj78("PJPV"), new g(this, cTInAppNotification, 1));
        if (cTInAppNotification.f9500q) {
            this.f3477g.e().f836p++;
            cVar.a().k(numX49.tnTj78("PJPS"), new CallableC0170c(7, this.f3474a, this));
        }
    }

    @Override // N.l
    public final Bundle e0(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, InAppNotificationActivity inAppNotificationActivity) {
        kotlin.jvm.internal.j.g(cTInAppNotification, numX49.tnTj78("PJPj"));
        CTInAppAction cTInAppAction = cTInAppNotificationButton.f;
        if (cTInAppAction == null) {
            return null;
        }
        return A(cTInAppNotification, cTInAppAction, cTInAppNotificationButton.f9509a, null, inAppNotificationActivity);
    }

    public final boolean f(JSONObject jSONObject) {
        CustomTemplateInAppData.CREATOR.getClass();
        CustomTemplateInAppData customTemplateInAppDataA = O.g.a(jSONObject);
        String str = customTemplateInAppDataA != null ? customTemplateInAppDataA.f9515a : null;
        boolean z4 = (str == null || this.j.f4524b.containsKey(str)) ? false : true;
        if (z4) {
            this.f3480n.k(numX49.tnTj78("PJPE"), s.j(numX49.tnTj78("PJPd"), str, numX49.tnTj78("PJPi")));
        }
        return z4;
    }

    public final void g(JSONArray jSONArray) {
        JSONArray jSONArray2;
        kotlin.jvm.internal.j.g(jSONArray, numX49.tnTj78("PJPF"));
        HashMap mapX = x3.d.x(this.f3477g.d());
        Pattern pattern = d0.f906a;
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i));
        }
        kotlin.jvm.internal.j.d(mapX);
        R.c cVar = this.i;
        Iterator it = R.c.h(R.c.a(cVar, new R.d(numX49.tnTj78("PJPH"), mapX, null, null, 20), arrayList)).iterator();
        while (true) {
            if (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                if (jSONObject.optBoolean("suppressed")) {
                    cVar.i(jSONObject);
                    z4 = true;
                } else {
                    if (z4) {
                        cVar.g();
                    }
                    jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                }
            } else {
                if (z4) {
                    cVar.g();
                }
                jSONArray2 = new JSONArray();
            }
        }
        if (jSONArray2.length() > 0) {
            b(jSONArray2);
        }
    }

    public final void h(String str, HashMap map) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PJPO"));
        kotlin.jvm.internal.j.g(map, numX49.tnTj78("PJPQ"));
        HashMap mapX = x3.d.x(this.f3477g.d());
        mapX.putAll(map);
        R.c cVar = this.i;
        List listC = cj.r.c(new R.d(str, mapX, null, null, 20));
        cVar.c(listC);
        JSONArray jSONArrayB = cVar.b(listC);
        if (jSONArrayB.length() > 0) {
            b(jSONArrayB);
        }
    }

    public final void i(JSONObject jSONObject) {
        String str = numX49.tnTj78("PJPt") + jSONObject;
        this.f3480n.getClass();
        S.g(this.f3481o, str);
        j jVar = new j(this);
        m mVar = this.f3479l;
        ((l0.c) mVar.f3486d).c(numX49.tnTj78("PJPU")).k(numX49.tnTj78("PJPe"), new J(2, jSONObject, mVar, new WeakReference(jVar)));
    }

    public final void j(CTInAppNotification cTInAppNotification) {
        O.f eVar;
        T.b.f.h(this.f3474a, this.f3480n);
        O.k kVar = this.j;
        CustomTemplateInAppData customTemplateInAppData = cTInAppNotification.f9503t;
        O.f fVar = null;
        String str = customTemplateInAppData != null ? customTemplateInAppData.f9515a : null;
        LinkedHashMap linkedHashMap = kVar.f4524b;
        S s9 = kVar.f4523a;
        String strTnTj78 = numX49.tnTj78("PJP8");
        if (str == null) {
            S.g(strTnTj78, numX49.tnTj78("PJPC"));
        } else {
            O.b bVar = (O.b) linkedHashMap.get(str);
            if (bVar == null) {
                S.g(strTnTj78, numX49.tnTj78("PJP4").concat(str));
            } else {
                int iOrdinal = bVar.e.ordinal();
                if (iOrdinal == 0) {
                    eVar = new O.e(bVar, cTInAppNotification, this, kVar, s9);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = new O.d(bVar, cTInAppNotification, this, kVar, s9);
                }
                fVar = eVar;
            }
        }
        if (fVar == null) {
            return;
        }
        String str2 = fVar.c;
        O.b bVar2 = (O.b) linkedHashMap.get(str2);
        if (bVar2 == null) {
            s9.k(strTnTj78, numX49.tnTj78("PJPo") + str2);
            return;
        }
        P.b bVar3 = bVar2.f4509b;
        if (AbstractC1414e.u(bVar3) && (fVar instanceof O.d)) {
            kVar.c.put(bVar2.f4508a, fVar);
            O.d dVar = (O.d) fVar;
            switch (bVar3.f4899a) {
                case 0:
                    Ci.b bVar4 = bVar3.f4900b;
                    Object obj = dVar.f4513d.get(numX49.tnTj78("PJPM"));
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str3 = (String) obj;
                    if (AbstractC0184q.e(str3) && bVar4.G(null, str3)) {
                        dVar.b();
                    }
                    dVar.a();
                    return;
                case 1:
                    Ci.b bVar5 = bVar3.f4900b;
                    C0332a c0332a = new C0332a(dVar, 21);
                    N9.f fVar2 = new N9.f(dVar, 6);
                    String strTnTj782 = numX49.tnTj78("PJPw");
                    S s10 = (S) bVar5.f;
                    kotlin.jvm.internal.j.f(s10, strTnTj782);
                    A0 a02 = (A0) bVar5.e;
                    a02.getClass();
                    String strTnTj783 = numX49.tnTj78("PJPc");
                    Context context = (Context) bVar5.f785b;
                    kotlin.jvm.internal.j.g(context, strTnTj783);
                    if (((Class) ((InterfaceC1033d) a02.f11334b).getValue()) == null) {
                        S.f(numX49.tnTj78("PJPh"));
                        fVar2.invoke(null);
                        return;
                    }
                    I1.a aVarCreate = ReviewManagerFactory.create(context);
                    kotlin.jvm.internal.j.f(aVarCreate, numX49.tnTj78("PJPm"));
                    Task taskB = ((com.google.android.play.core.review.b) aVarCreate).b();
                    kotlin.jvm.internal.j.f(taskB, numX49.tnTj78("PJPD"));
                    taskB.addOnCompleteListener(new Le.l(aVarCreate, s10, fVar2, c0332a));
                    return;
                default:
                    Ci.b bVar6 = bVar3.f4900b;
                    Object obj2 = dVar.f4513d.get(numX49.tnTj78("PJPK"));
                    if (!(obj2 instanceof Boolean)) {
                        obj2 = null;
                    }
                    if (bVar6.C(kotlin.jvm.internal.j.b((Boolean) obj2, Boolean.TRUE))) {
                        dVar.b();
                    }
                    dVar.a();
                    return;
            }
        }
    }

    public final void k() {
        if (this.f3475b.h) {
            return;
        }
        this.c.c(numX49.tnTj78("PJPN")).k(numX49.tnTj78("PJP6"), new CallableC0168a(this, 6));
    }
}
