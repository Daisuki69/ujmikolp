package D;

import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: D.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0175h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0176i f912b;
    public final /* synthetic */ ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f913d;

    public /* synthetic */ CallableC0175h(C0176i c0176i, ArrayList arrayList, String str, int i) {
        this.f911a = i;
        this.f912b = c0176i;
        this.c = arrayList;
        this.f913d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f911a) {
            case 0:
                this.f912b.c(this.c, this.f913d, numX49.tnTj78("PeBd"));
                break;
            case 1:
                this.f912b.c(this.c, this.f913d, numX49.tnTj78("PeBj"));
                break;
            default:
                this.f912b.c(this.c, this.f913d, numX49.tnTj78("PeBS"));
                break;
        }
        return null;
    }
}
