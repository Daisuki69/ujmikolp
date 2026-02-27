package bg;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import cj.C1110A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0996e0 extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8943b;
    public final n0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8944d;
    public final C0965G0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0996e0(Context _context, n0 _permissionHelper, ArrayList _fields, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(_context, "_context");
        kotlin.jvm.internal.j.h(_permissionHelper, "_permissionHelper");
        kotlin.jvm.internal.j.h(_fields, "_fields");
        this.f8943b = _context;
        this.c = _permissionHelper;
        this.f8944d = _fields;
        this.e = c0965g0;
    }

    @Override // bg.AbstractC0988a0
    public final Object a() throws IllegalAccessException {
        ArrayList arrayList = this.f8944d;
        this.c.c((String) C1110A.A(((C0960E) C1110A.A(arrayList)).c));
        LinkedList linkedList = new LinkedList();
        Object systemService = this.f8943b.getSystemService("wifi");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
        List<WifiConfiguration> configuredNetworks = ((WifiManager) systemService).getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                LinkedList linkedList2 = new LinkedList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        Function1 function1 = ((C0960E) it.next()).e;
                        linkedList2.add(function1 != null ? (String) function1.invoke(wifiConfiguration) : null);
                    } catch (Exception e) {
                        linkedList2.add(X5.f.c(e));
                        C0965G0 c0965g0 = this.e;
                        if (c0965g0 != null) {
                            c0965g0.b("Core", e, null);
                        }
                    }
                }
                linkedList.add(linkedList2);
            }
        }
        return linkedList;
    }

    @Override // Xf.a
    public final String d() {
        return "WiFiNetworks";
    }
}
