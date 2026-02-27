package ag;

import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;

/* JADX INFO: renamed from: ag.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0703m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7217b;
    public final Xf.a c;

    public C0703m(ArrayList arrayList, Xf.a aVar, int i) {
        this.f7216a = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("buek"));
                kotlin.jvm.internal.j.h(aVar, numX49.tnTj78("bueB"));
                this.f7217b = arrayList;
                this.c = aVar;
                break;
            default:
                kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("buer"));
                kotlin.jvm.internal.j.h(aVar, numX49.tnTj78("bueZ"));
                this.f7217b = arrayList;
                this.c = aVar;
                break;
        }
    }

    public final Xf.a a() {
        switch (this.f7216a) {
        }
        return this.c;
    }
}
