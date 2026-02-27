package u5;

import I8.f;
import Sb.i;
import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.j;
import n0.e;

/* JADX INFO: renamed from: u5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2302a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f20265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f20266b = new LinkedHashMap();
    public static final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5.a f20267d = new C5.a("appdome_threat");
    public static final ArrayList e;
    public static final InterfaceC1033d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ScheduledExecutorService f20268g;
    public static final f h;

    static {
        b[] bVarArrValues = b.values();
        ArrayList arrayList = new ArrayList();
        for (b bVar : bVarArrValues) {
            if (bVar.f20272b) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b) it.next()).f20271a);
        }
        e = arrayList2;
        f = C1034e.b(new e(3));
        f20268g = Executors.newSingleThreadScheduledExecutor();
        h = new f(6);
    }

    public static List a() {
        List listV;
        LinkedHashMap linkedHashMap = f20266b;
        synchronized (linkedHashMap) {
            listV = C1110A.V(linkedHashMap.values());
            linkedHashMap.clear();
            yk.a.a();
            yk.a.a();
        }
        return listV;
    }

    public static void b(Context context) {
        j.g(context, "context");
        yk.a.a();
        if (f20265a) {
            yk.a.a();
            return;
        }
        yk.a.a();
        C5.a aVar = f20267d;
        aVar.f739a = true;
        Iterator it = e.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            j.f(lowerCase, "toLowerCase(...)");
            "Monitoring start for: ".concat(lowerCase);
            yk.a.a();
            aVar.e(lowerCase);
        }
        ContextCompat.registerReceiver(context, new E5.b(new i(9), 4), (IntentFilter) f.getValue(), null, null, 4);
        f20265a = true;
    }
}
