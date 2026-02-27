package P5;

import android.app.Application;
import android.content.Context;
import cg.InterfaceC1101b;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.paymaya.domain.store.C1282s;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import e2.C1421c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import p0.AbstractC2002a;
import si.C2260b;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5026b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5027d;
    public final Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5028g;
    public Object h;

    public N(U8.c cVar, Li.b bVar, Li.b bVar2, bi.h hVar) {
        C2260b c2260b = C2260b.f20120b;
        si.g gVar = si.g.f20135d;
        si.g gVar2 = si.g.e;
        C2260b c2260b2 = C2260b.f20119a;
        this.f5025a = cVar;
        Objects.requireNonNull(bVar);
        this.f5026b = bVar;
        Objects.requireNonNull(bVar2);
        this.h = bVar2;
        this.c = hVar;
        this.f5027d = c2260b;
        this.e = gVar;
        this.f = gVar2;
        this.f5028g = c2260b2;
    }

    public static void d(String str) {
        D.S.c("variables", str);
    }

    public void a(HashMap map, HashMap map2) {
        d("applyVariableDiffs() called with: diffs = [" + map + "]");
        if (map != null) {
            this.h = map;
            this.f = AbstractC2002a.a((HashMap) this.f5025a, map);
            d("applyVariableDiffs: updated value of merged=[" + this.f + "]");
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                if (((ConcurrentHashMap) this.f5026b).get((String) ((Map.Entry) it.next()).getKey()) != null) {
                    throw new ClassCastException();
                }
            }
        }
    }

    public String b() {
        String strG = D.b0.g((Context) this.c, D.b0.n((CleverTapInstanceConfig) this.e, "variablesKey"), WeJson.EMPTY_MAP);
        d("VarCache loaded cache data:\n" + strG);
        return strG;
    }

    public synchronized void c(Function0 function0) {
        try {
            HashMap mapM = x3.d.m(b());
            HashMap map = new HashMap((ConcurrentHashMap) this.f5026b);
            a(mapM, map);
            e(map, function0);
        } catch (Exception e) {
            D.S.e("variables", "Could not load variable diffs.\n", e);
        }
    }

    public void e(HashMap map, Function0 function0) {
        if (map.isEmpty()) {
            d("There are no variables registered by the client. Not downloading files & posting global callbacks");
            return;
        }
        StringBuilder sb2 = new StringBuilder("Skipped these file vars cause urls are not present :\n");
        StringBuilder sb3 = new StringBuilder("Adding these files to download :\n");
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((ConcurrentHashMap) this.f5026b).get((String) ((Map.Entry) it.next()).getKey()) != null) {
                throw new ClassCastException();
            }
        }
        d(sb2.toString());
        d(sb3.toString());
        if (arrayList.isEmpty()) {
            function0.invoke();
            return;
        }
        La.a aVar = new La.a(6, function0);
        X.d dVar = (X.d) this.f5027d;
        dVar.getClass();
        dVar.b(arrayList, aVar, new Rg.g(16), new Rg.g(17));
    }

    public synchronized void f() {
        androidx.window.layout.adapter.extensions.a aVar = (androidx.window.layout.adapter.extensions.a) this.f5028g;
        if (aVar != null) {
            aVar.run();
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        Application application = (Application) ((InterfaceC1101b) this.f5025a).get();
        com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) ((InterfaceC1101b) this.f5026b).get();
        C1282s c1282s = (C1282s) ((Cg.c) this.h).get();
        B5.l lVar = (B5.l) ((InterfaceC1101b) this.c).get();
        B5.c cVar = (B5.c) ((InterfaceC1101b) this.f5027d).get();
        B5.d dVar = (B5.d) ((InterfaceC1101b) this.e).get();
        return new B5.i(application, aVar, c1282s, lVar, cVar, dVar, (S5.c) ((InterfaceC1101b) this.f5028g).get());
    }

    public N(CleverTapInstanceConfig cleverTapInstanceConfig, Context context, X.d dVar) {
        this.f5025a = new HashMap();
        this.f5026b = new ConcurrentHashMap();
        new HashMap();
        this.f = null;
        this.f5028g = null;
        this.h = new HashMap();
        this.c = context;
        this.e = cleverTapInstanceConfig;
        this.f5027d = dVar;
    }

    public N(G6.v vVar, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, Cg.c cVar, InterfaceC1101b interfaceC1101b3, InterfaceC1101b interfaceC1101b4, InterfaceC1101b interfaceC1101b5, InterfaceC1101b interfaceC1101b6, InterfaceC1101b interfaceC1101b7) {
        this.f5025a = interfaceC1101b;
        this.f5026b = interfaceC1101b2;
        this.h = cVar;
        this.c = interfaceC1101b3;
        this.f5027d = interfaceC1101b4;
        this.e = interfaceC1101b5;
        this.f = interfaceC1101b6;
        this.f5028g = interfaceC1101b7;
    }

    public N(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, C1421c c1421c) {
        this.f5025a = str;
        this.f5026b = str2;
        this.c = arrayList;
        this.f5027d = str3;
        this.e = str4;
        this.f = str5;
        this.f5028g = str6;
        this.h = c1421c;
    }
}
