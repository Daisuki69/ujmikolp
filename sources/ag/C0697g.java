package ag;

import Rg.u;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import bj.InterfaceC1033d;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ag.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0697g extends u {
    public final /* synthetic */ int c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7206d;
    public final C0694d e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0697g(ArrayList arrayList, Y.e eVar, C0694d c0694d) {
        super(c0694d, 1);
        kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("buep"));
        kotlin.jvm.internal.j.h(eVar, numX49.tnTj78("bue0"));
        this.f7206d = arrayList;
        this.f = eVar;
        this.e = c0694d;
    }

    @Override // Xf.a
    public final String d() {
        switch (this.c) {
            case 0:
                return numX49.tnTj78("bue1");
            default:
                return numX49.tnTj78("buef");
        }
    }

    @Override // Rg.u
    public final LinkedList i() {
        List<ApplicationInfo> list;
        C0694d c0694d;
        switch (this.c) {
            case 0:
                String strTnTj78 = numX49.tnTj78("buex");
                C0694d c0694d2 = this.e;
                LinkedList linkedList = new LinkedList();
                try {
                    ArrayList arrayListB = new Q6.r((Context) this.f, 21).b();
                    ArrayList<C0700j> arrayList = new ArrayList();
                    for (Object obj : arrayListB) {
                        if (((C0700j) obj).f7210b.length() != 0) {
                            arrayList.add(obj);
                        }
                    }
                    for (C0700j c0700j : arrayList) {
                        LinkedList linkedList2 = new LinkedList();
                        try {
                            Iterator it = this.f7206d.iterator();
                            while (it.hasNext()) {
                                Function1 function1 = ((C0702l) it.next()).e;
                                if (function1 == null) {
                                    kotlin.jvm.internal.j.l();
                                }
                                linkedList2.add(function1.invoke(c0700j));
                            }
                        } catch (Exception e) {
                            if (c0694d2 != null) {
                                c0694d2.b(strTnTj78, e, null);
                            }
                            linkedList2.add(jk.b.a(e));
                        }
                        linkedList.add(linkedList2);
                        break;
                    }
                    return linkedList;
                } catch (Exception e7) {
                    if (c0694d2 != null) {
                        c0694d2.b(strTnTj78, e7, null);
                    }
                    LinkedList linkedList3 = new LinkedList();
                    linkedList3.add(jk.b.a(e7));
                    return linkedList3;
                }
            default:
                LinkedList linkedList4 = new LinkedList();
                Y.e eVar = (Y.e) this.f;
                synchronized (eVar) {
                    Object value = ((InterfaceC1033d) eVar.f6708b).getValue();
                    kotlin.jvm.internal.j.c(value, "apps.value");
                    list = (List) value;
                }
                C0699i c0699i = null;
                for (ApplicationInfo applicationInfo : list) {
                    LinkedList linkedList5 = new LinkedList();
                    try {
                        Y.e eVar2 = (Y.e) this.f;
                        String str = applicationInfo.packageName;
                        kotlin.jvm.internal.j.c(str, "app.packageName");
                        eVar2.getClass();
                        PackageInfo packageInfo = ((Context) eVar2.c).getPackageManager().getPackageInfo(str, 128);
                        kotlin.jvm.internal.j.c(packageInfo, "_context.packageManager.…ckageInfo(name, metadata)");
                        for (C0702l c0702l : this.f7206d) {
                            if (c0699i == null) {
                                try {
                                    C0699i c0699i2 = new C0699i();
                                    c0699i2.f7207a = applicationInfo;
                                    c0699i2.f7208b = packageInfo;
                                    c0699i = c0699i2;
                                } catch (Exception e10) {
                                    linkedList5.add(jk.b.a(e10));
                                    if (!(e10 instanceof IllegalAccessException) && (c0694d = this.e) != null) {
                                        c0694d.b("Application", e10, null);
                                    }
                                }
                            } else {
                                c0699i.f7207a = applicationInfo;
                                c0699i.f7208b = packageInfo;
                            }
                            Function1 function12 = c0702l.e;
                            if (function12 == null) {
                                kotlin.jvm.internal.j.l();
                            }
                            linkedList5.add(function12.invoke(c0699i));
                            break;
                        }
                    } catch (Exception e11) {
                        linkedList5.add(jk.b.a(e11));
                        C0694d c0694d3 = this.e;
                        if (c0694d3 != null) {
                            c0694d3.b(numX49.tnTj78("buen"), e11, null);
                        }
                    }
                    linkedList4.add(linkedList5);
                }
                return linkedList4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0697g(ArrayList arrayList, Context context, C0694d c0694d) {
        super(c0694d, 1);
        kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("bueg"));
        this.f7206d = arrayList;
        this.f = context;
        this.e = c0694d;
    }
}
