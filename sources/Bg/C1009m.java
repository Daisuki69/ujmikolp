package bg;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import cj.C1110A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1009m extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9095b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9096d;
    public final C0965G0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009m(Context _context, ArrayList _fields, C0965G0 c0965g0, int i) {
        super(c0965g0);
        this.f9095b = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(_context, "_context");
                kotlin.jvm.internal.j.h(_fields, "_fields");
                super(c0965g0);
                this.c = _context;
                this.f9096d = _fields;
                this.e = c0965g0;
                break;
            default:
                kotlin.jvm.internal.j.h(_context, "_context");
                kotlin.jvm.internal.j.h(_fields, "_fields");
                this.c = _context;
                this.f9096d = _fields;
                this.e = c0965g0;
                break;
        }
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        switch (this.f9095b) {
            case 0:
                LinkedList linkedList = new LinkedList();
                Object systemService = this.c.getSystemService("sensor");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
                }
                for (Sensor sensor : ((SensorManager) systemService).getSensorList(-1)) {
                    LinkedList linkedList2 = new LinkedList();
                    Iterator it = this.f9096d.iterator();
                    while (it.hasNext()) {
                        try {
                            Function1 function1 = ((C0960E) it.next()).e;
                            linkedList2.add(function1 != null ? (String) function1.invoke(sensor) : null);
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
                return linkedList;
            default:
                C0965G0 c0965g02 = this.e;
                ArrayList arrayList = this.f9096d;
                LinkedList linkedList3 = new LinkedList();
                try {
                    int i = Build.VERSION.SDK_INT;
                    ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((C0960E) it2.next()).f8727d));
                    }
                    Object objJ = C1110A.J(arrayList2);
                    if (objJ == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    if (i < ((Number) objJ).intValue()) {
                        return linkedList3;
                    }
                    Object systemService2 = this.c.getSystemService("camera");
                    if (systemService2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                    }
                    for (String str : ((CameraManager) systemService2).getCameraIdList()) {
                        LinkedList linkedList4 = new LinkedList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            try {
                                Function1 function12 = ((C0960E) it3.next()).e;
                                linkedList4.add(function12 != null ? (String) function12.invoke(str) : null);
                            } catch (Exception e7) {
                                linkedList4.add(X5.f.c(e7));
                                if (c0965g02 != null) {
                                    c0965g02.b("Core", e7, null);
                                }
                            }
                        }
                        linkedList3.add(linkedList4);
                    }
                    return linkedList3;
                } catch (Exception e10) {
                    if (c0965g02 != null) {
                        c0965g02.b("Core", e10, null);
                    }
                    LinkedList linkedList5 = new LinkedList();
                    linkedList5.add(X5.f.c(e10));
                    return linkedList5;
                }
        }
    }

    @Override // Xf.a
    public final String d() {
        switch (this.f9095b) {
            case 0:
                return "Sensor";
            default:
                return "Camera";
        }
    }
}
