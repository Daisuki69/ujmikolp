package Lh;

import Ah.q;
import C3.l;
import D.S;
import D.X;
import D8.C0196d;
import D8.C0197e;
import E8.y;
import Gb.n;
import P5.V;
import P5.Y;
import S1.r;
import Xh.o;
import Xh.p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import bg.AbstractC0983W;
import cg.InterfaceC1101b;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionTemplate;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import w3.C2376a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class c implements q, X, Ch.c, InterfaceC1101b, Ui.k, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2990b;
    public Object c;

    public /* synthetic */ c(int i) {
        this.f2989a = i;
    }

    public static int d(l lVar, l lVar2) {
        return x3.d.A(l.a(lVar, lVar2));
    }

    public static void m(HashMap map, l lVar) {
        Integer num = (Integer) map.get(lVar);
        map.put(lVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public static K3.b t(K3.b bVar, l lVar, l lVar2, l lVar3, l lVar4, int i, int i4) {
        float f = i - 0.5f;
        float f3 = i4 - 0.5f;
        return E1.c.n(bVar, i, i4, K3.f.a(0.5f, 0.5f, f, 0.5f, f, f3, 0.5f, f3, lVar.f727a, lVar.f728b, lVar4.f727a, lVar4.f728b, lVar3.f727a, lVar3.f728b, lVar2.f727a, lVar2.f728b));
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2989a) {
            case 0:
                ((q) this.f2990b).a(bVar);
                break;
            case 1:
                ((q) this.f2990b).a(bVar);
                break;
            case 2:
                Dh.a.c((e) this.c, bVar);
                break;
            case 3:
                ((q) this.f2990b).a(bVar);
                break;
            default:
                ((q) this.f2990b).a(bVar);
                break;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f2989a) {
            case 9:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((Ne.d) this.f2990b).b(it, (N9.f) this.c);
                break;
            default:
                List filteredHistoryList = (List) obj;
                kotlin.jvm.internal.j.g(filteredHistoryList, "filteredHistoryList");
                if (!filteredHistoryList.isEmpty()) {
                    ((MayaShopHomePageFragment) ((bc.b) ((Xb.f) this.f2990b).c.get())).Q1(new ShopHomeSectionCarousel(((ShopHomeSectionTemplate) this.c).getName(), ((ShopHomeSectionTemplate) this.c).getListType(), ((ShopHomeSectionTemplate) this.c).getPosition(), filteredHistoryList, 5, "Buy Again"));
                } else {
                    ((MayaShopHomePageFragment) ((bc.b) ((Xb.f) this.f2990b).c.get())).T1("Buy Again");
                }
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        return new Y5.c(((V5.c) this.f2990b).c((A5.f) this.c));
    }

    @Override // D.X
    public void b() {
        n nVar = (n) this.f2990b;
        Ci.b this$0 = (Ci.b) nVar.c;
        kotlin.jvm.internal.j.g(this$0, "this$0");
        Activity activity = (Activity) this.c;
        kotlin.jvm.internal.j.g(activity, "activity");
        boolean z4 = activity instanceof InAppNotificationActivity;
        boolean z5 = nVar.f1956b;
        if (z4) {
            ((InAppNotificationActivity) activity).n1(z5);
            return;
        }
        boolean z8 = InAppNotificationActivity.h;
        if (activity.getClass().equals(InAppNotificationActivity.class)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) InAppNotificationActivity.class);
        intent.putExtra("config", (CleverTapInstanceConfig) this$0.c);
        intent.putExtra("displayPushPermissionPrompt", true);
        intent.putExtra("shouldShowFallbackSettings", z5);
        activity.startActivity(intent);
    }

    @Override // Ui.k
    public boolean c(Object obj, HashMap map, U8.c cVar) {
        Wi.a aVar;
        Wi.a aVarA;
        switch (this.f2989a) {
            case 22:
                return ((Li.b) this.c).getAll().contains((String) this.f2990b);
            default:
                boolean z4 = false;
                Wi.a aVar2 = (Wi.a) this.f2990b;
                if (aVar2 != null && (aVar = (Wi.a) this.c) != null && (obj instanceof String) && (aVarA = Wi.a.a((String) obj)) != null) {
                    if (aVarA.b(aVar2) >= 0 && aVarA.b(aVar) <= 0) {
                        z4 = true;
                    }
                    Ri.a.d(aVar2.f6451g + " <= " + aVarA.f6451g + " <= " + aVar.f6451g + " | Result: " + z4);
                }
                return z4;
        }
    }

    public void e(int i, int[] iArr) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        M3.a aVar = (M3.a) this.f2990b;
        if (i >= size) {
            M3.b bVarG = (M3.b) androidx.camera.core.impl.a.b(1, arrayList);
            for (int size2 = arrayList.size(); size2 <= i; size2++) {
                bVarG = bVarG.g(new M3.b(aVar, new int[]{1, aVar.f3053a[(size2 - 1) + aVar.f3056g]}));
                arrayList.add(bVarG);
            }
        }
        M3.b bVar = (M3.b) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        if (length == 0) {
            throw new IllegalArgumentException();
        }
        if (length > 1 && iArr2[0] == 0) {
            int i4 = 1;
            while (i4 < length && iArr2[i4] == 0) {
                i4++;
            }
            if (i4 == length) {
                iArr2 = new int[]{0};
            } else {
                int i6 = length - i4;
                int[] iArr3 = new int[i6];
                System.arraycopy(iArr2, i4, iArr3, 0, i6);
                iArr2 = iArr3;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2 + i];
        for (int i10 = 0; i10 < length2; i10++) {
            iArr4[i10] = aVar.c(iArr2[i10], 1);
        }
        M3.b bVar2 = new M3.b(aVar, iArr4);
        if (!aVar.equals(bVar.f3057a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.e()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int iB = aVar.b(bVar.c(bVar.d()));
        M3.b bVarA = aVar.c;
        while (bVar2.d() >= bVar.d() && !bVar2.e()) {
            int iD = bVar2.d() - bVar.d();
            int iC = aVar.c(bVar2.c(bVar2.d()), iB);
            M3.b bVarH = bVar.h(iD, iC);
            bVarA = bVarA.a(aVar.a(iD, iC));
            bVar2 = bVar2.a(bVarH);
        }
        int[] iArr5 = new M3.b[]{bVarA, bVar2}[1].f3058b;
        int length3 = i - iArr5.length;
        for (int i11 = 0; i11 < length3; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArr5, 0, iArr, length + length3, iArr5.length);
    }

    public synchronized void f(JSONArray jSONArray) {
        JSONArray jSONArrayI = i();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArrayI.put(jSONArray.getJSONObject(i));
            } catch (Exception e) {
                S.c((String) this.c, "InAppController: Malformed InApp notification: " + e.getMessage());
            }
        }
        Y.d dVar = ((Y.f) this.f2990b).f6709a;
        if (dVar != null) {
            dVar.b(jSONArrayI);
            Unit unit = Unit.f18162a;
        }
    }

    public HashMap g() {
        File[] fileArrListFiles;
        p();
        Vf.a aVar = (Vf.a) this.f2990b;
        T3.l lVar = (T3.l) this.c;
        File file = (File) lVar.f5786b;
        if (file != null) {
            fileArrListFiles = file.listFiles(aVar);
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        } else {
            fileArrListFiles = new File[0];
        }
        HashMap map = new HashMap(fileArrListFiles.length);
        for (File file2 : fileArrListFiles) {
            try {
                String strG = lVar.g(file2.getName());
                if (strG == null || strG.isEmpty()) {
                    String str = "Content of " + file2.getName() + " is invalid.";
                    if (r.f5624b) {
                        Log.w("Glimpse", str, null);
                    }
                    strG = "";
                }
                String name = file2.getName();
                if (strG.endsWith(",")) {
                    strG = strG.substring(0, strG.length() - 1);
                }
                map.put(name, "[" + strG + "]");
            } catch (IOException unused) {
                String str2 = "Could not read analytics from file: " + file2.getName();
                if (r.f5624b) {
                    Log.e("Glimpse", str2, null);
                }
            }
        }
        return map;
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        ((Y) this.f2990b).getClass();
        return new V(2);
    }

    public TreeMap h() {
        TreeMap treeMap = new TreeMap(new B9.a(8));
        ArrayList<p> arrayList = (ArrayList) this.f2990b;
        ((N4.d) this.c).getClass();
        HashMap map = new HashMap();
        for (p pVar : arrayList) {
            List arrayList2 = (List) map.get(pVar.f6669a);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(pVar.f6669a, arrayList2);
            }
            arrayList2.addAll(pVar.f6670b);
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((List) entry.getValue()).size() > 0) {
                map2.put((o) entry.getKey(), new p((o) entry.getKey(), (List) entry.getValue()));
            }
        }
        treeMap.putAll(map2);
        return treeMap;
    }

    public JSONArray i() {
        JSONArray jSONArray;
        Y.d dVar = ((Y.f) this.f2990b).f6709a;
        if (dVar == null) {
            return new JSONArray();
        }
        JSONArray jSONArray2 = dVar.f6706d;
        if (jSONArray2 != null) {
            return jSONArray2;
        }
        String strB = dVar.f6704a.b("inApp", "");
        if (strB == null || C2576A.H(strB)) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = new JSONArray(dVar.f6705b.d(strB, F.e.f1496b));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
        }
        dVar.f6706d = jSONArray;
        return jSONArray;
    }

    public C0196d j() {
        O5.a aVar = (O5.a) this.c;
        com.google.firebase.messaging.r rVarX = aVar.x();
        L lZ = aVar.z();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        return new C0196d(rVarX, lZ, preference, flagConfigurationService);
    }

    public C0197e k() {
        O5.a aVar = (O5.a) this.c;
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        return new C0197e(preference, flagConfigurationService);
    }

    public Zd.h l() {
        O5.a aVar = (O5.a) this.c;
        return new Zd.h((com.paymaya.data.preference.a) aVar.e.get(), aVar.X(), aVar.v(), aVar.c());
    }

    public boolean n(l lVar) {
        float f = lVar.f727a;
        if (f < 0.0f) {
            return false;
        }
        K3.b bVar = (K3.b) this.f2990b;
        if (f >= bVar.f2589a) {
            return false;
        }
        float f3 = lVar.f728b;
        return f3 > 0.0f && f3 < ((float) bVar.f2590b);
    }

    public y o() {
        O5.a aVar = (O5.a) this.c;
        Context context = (Context) aVar.f4709d.get();
        kotlin.jvm.internal.j.g(context, "context");
        V2.c cVar = new V2.c(context, 20);
        kotlin.jvm.internal.j.g((Context) aVar.f4709d.get(), "context");
        E8.k kVar = new E8.k();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        return new y(cVar, kVar, preference, flagConfigurationService);
    }

    @Override // Ah.q, Ah.b
    public void onError(Throwable th2) {
        Object objApply;
        switch (this.f2989a) {
            case 0:
                try {
                    ((d) this.c).c.accept(th2);
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    th2 = new CompositeException(th2, th3);
                }
                ((q) this.f2990b).onError(th2);
                break;
            case 1:
                ((q) this.f2990b).onError(th2);
                break;
            case 2:
                ((q) this.f2990b).onError(th2);
                break;
            case 3:
                ((q) this.f2990b).onError(th2);
                break;
            default:
                i iVar = (i) this.c;
                Ch.f fVar = iVar.f3003b;
                q qVar = (q) this.f2990b;
                if (fVar != null) {
                    try {
                        objApply = fVar.apply(th2);
                    } catch (Throwable th4) {
                        AbstractC0983W.G(th4);
                        qVar.onError(new CompositeException(th2, th4));
                        return;
                    }
                } else {
                    objApply = iVar.c;
                }
                if (objApply != null) {
                    qVar.onSuccess(objApply);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th2);
                    qVar.onError(nullPointerException);
                }
                break;
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        switch (this.f2989a) {
            case 0:
                ((q) this.f2990b).onSuccess(obj);
                break;
            case 1:
                q qVar = (q) this.f2990b;
                try {
                    ((d) this.c).c.accept(obj);
                    qVar.onSuccess(obj);
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    qVar.onError(th2);
                    return;
                }
                break;
            case 2:
                ((q) this.f2990b).onSuccess(obj);
                break;
            case 3:
                try {
                    Object objApply = ((Ch.f) this.c).apply(obj);
                    Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                    ((q) this.f2990b).onSuccess(objApply);
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    onError(th3);
                    return;
                }
                break;
            default:
                ((q) this.f2990b).onSuccess(obj);
                break;
        }
    }

    public void p() {
        T3.l lVar = (T3.l) this.c;
        try {
            String strG = lVar.g("glimpse_analytics.log");
            if (strG == null || strG.isEmpty()) {
                return;
            }
            String str = "glimpse_log_" + System.currentTimeMillis();
            File file = (File) lVar.f5786b;
            new File(file, "glimpse_analytics.log").renameTo(new File(file, str));
        } catch (IOException e) {
            if (r.f5624b) {
                Log.e("Glimpse", "Failed to log rotate.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(R.e r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.c.q(R.e, java.lang.String):boolean");
    }

    public boolean r(String campaignId, ArrayList arrayList) {
        kotlin.jvm.internal.j.g(campaignId, "campaignId");
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!q((R.e) it.next(), campaignId)) {
                return false;
            }
        }
        return true;
    }

    public void s(ByteBuffer byteBuffer, Oa.h hVar) {
        try {
            int i = hVar.c;
            if (i != 0 && i != 90 && i != 180 && i != 270) {
                i = 0;
            }
            int i4 = i;
            int i6 = hVar.f4786a;
            int i10 = hVar.f4787b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C2376a c2376a = new C2376a(byteBuffer, i6, i10, i4);
            zzmu.zza(zzms.zzb("vision-common"), 17, 3, jElapsedRealtime, i10, i6, byteBuffer.limit(), i4);
            ((v3.d) this.f2990b).c(c2376a).addOnSuccessListener(new Oa.e(this)).addOnFailureListener(new Oa.e(this));
        } catch (Exception unused) {
            yk.a.c();
        }
    }

    public P3.a u(l lVar, l lVar2) {
        int i = (int) lVar.f727a;
        int i4 = (int) lVar.f728b;
        int i6 = (int) lVar2.f727a;
        int i10 = (int) lVar2.f728b;
        boolean z4 = Math.abs(i10 - i4) > Math.abs(i6 - i);
        if (z4) {
            i4 = i;
            i = i4;
            i10 = i6;
            i6 = i10;
        }
        int iAbs = Math.abs(i6 - i);
        int iAbs2 = Math.abs(i10 - i4);
        int i11 = (-iAbs) / 2;
        int i12 = i4 < i10 ? 1 : -1;
        int i13 = i >= i6 ? -1 : 1;
        int i14 = z4 ? i4 : i;
        int i15 = z4 ? i : i4;
        K3.b bVar = (K3.b) this.f2990b;
        boolean zB = bVar.b(i14, i15);
        int i16 = 0;
        while (i != i6) {
            int i17 = z4 ? i4 : i;
            int i18 = i;
            if (!z4) {
                i = i4;
            }
            boolean zB2 = bVar.b(i17, i);
            if (zB2 != zB) {
                i16++;
                zB = zB2;
            }
            i11 += iAbs2;
            if (i11 > 0) {
                if (i4 == i10) {
                    break;
                }
                i4 += i12;
                i11 -= iAbs;
            }
            i = i18 + i13;
        }
        return new P3.a(lVar, lVar2, i16);
    }

    public void v(Object obj) {
        Pf.a aVar = (Pf.a) obj;
        T3.l lVar = (T3.l) this.c;
        try {
            String strB = aVar.b();
            if (new File((File) lVar.f5786b, "glimpse_analytics.log").length() >= 7000) {
                p();
            }
            lVar.h(strB + ",");
        } catch (IOException e) {
            e = e;
            e.printStackTrace();
        } catch (JSONException e7) {
            e = e7;
            e.printStackTrace();
        }
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2989a = i;
        this.c = obj;
        this.f2990b = obj2;
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, boolean z4) {
        this.f2989a = i;
        this.f2990b = obj;
        this.c = obj2;
    }

    public c(com.paymaya.data.preference.a mPreference, dc.o oVar) {
        this.f2989a = 28;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f2990b = mPreference;
        this.c = oVar;
    }

    public c(String str, String str2) {
        this.f2989a = 25;
        this.f2990b = Wi.a.a(str);
        this.c = Wi.a.a(str2);
    }

    public c(Ag.l lVar) {
        this.f2989a = 21;
        this.f2990b = lVar;
        this.c = new ArrayList();
    }

    public c(ArrayList arrayList) {
        o oVar;
        this.f2989a = 29;
        N4.d dVar = new N4.d(18);
        this.f2990b = new ArrayList();
        this.c = dVar;
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            oVar = o.f6668b;
            if (!zHasNext) {
                break;
            }
            p pVar = (p) it.next();
            if (pVar != null) {
                o oVar2 = pVar.f6669a;
                hashSet.add(oVar2);
                ArrayList arrayList2 = (ArrayList) this.f2990b;
                if (oVar2 == oVar) {
                    if (!z4) {
                        arrayList2.clear();
                        z4 = true;
                    }
                    arrayList2.add(pVar);
                }
                if (!z4) {
                    arrayList2.add(pVar);
                }
            }
        }
        if (!hashSet.contains(oVar) || hashSet.size() <= 1) {
            return;
        }
        Ri.a.g("SDK Config: The Set filter is exclusive and cannot be used simultaneously with names or prefix filters. Ignoring names and prefixes");
    }

    public c(MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment) {
        this.f2989a = 17;
        this.c = mayaMLKitQRScannerFragment;
        this.f2990b = Xh.i.t(new r3.b(new int[]{1}[0] | 256));
    }

    public c(M3.a aVar) {
        this.f2989a = 5;
        this.f2990b = aVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new M3.b(aVar, new int[]{1}));
    }

    public c(K3.b bVar) {
        this.f2989a = 18;
        this.f2990b = bVar;
        this.c = new L3.a(bVar);
    }

    public c(B2.b bVar) {
        this.f2989a = 26;
        this.c = Collections.synchronizedMap(new HashMap());
        this.f2990b = bVar;
    }
}
