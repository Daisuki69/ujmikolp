package bg;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0964G extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1011o f8804b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f8805d;
    public final ArrayList e;
    public final C0965G0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8806g;
    public final O4.k h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0964G(Context context, ArrayList fields, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(context, "context");
        kotlin.jvm.internal.j.h(fields, "fields");
        this.f8805d = context;
        this.e = fields;
        this.f = c0965g0;
        this.c = new ArrayList();
        this.f8806g = 1;
        this.h = new O4.k(this, 4);
        this.i = "AccelerometerSnapshot";
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        LinkedList linkedList = new LinkedList();
        for (C1014r c1014r : this.c) {
            LinkedList linkedList2 = new LinkedList();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                try {
                    Function1 function1 = ((C0960E) it.next()).e;
                    linkedList2.add(function1 != null ? (String) function1.invoke(c1014r) : null);
                } catch (Exception e) {
                    linkedList2.add(X5.f.c(e));
                    C0965G0 c0965g0 = this.f;
                    if (c0965g0 != null) {
                        c0965g0.b("Core", e, null);
                    }
                }
            }
            linkedList.add(linkedList2);
        }
        return linkedList;
    }

    @Override // Xf.a
    public final String d() {
        return this.i;
    }
}
