package ag;

import Rg.u;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;

/* JADX INFO: renamed from: ag.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0705o extends u {
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y.e f7220d;
    public final C0694d e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7221g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0705o(ArrayList arrayList, Y.e eVar, C0694d c0694d, byte b8) {
        super(c0694d, 1);
        kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("buea"));
        kotlin.jvm.internal.j.h(eVar, numX49.tnTj78("bueX"));
        this.c = arrayList;
        this.f7220d = eVar;
        this.e = c0694d;
    }

    @Override // Xf.a
    public final String d() {
        switch (this.f) {
        }
        return this.f7221g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    @Override // Rg.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList i() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.C0705o.i():java.util.LinkedList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0705o(ArrayList arrayList, Y.e eVar, C0694d c0694d, int i) {
        this(arrayList, eVar, c0694d, (byte) 0);
        this.f = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("buev"));
                kotlin.jvm.internal.j.h(eVar, numX49.tnTj78("bue7"));
                this(arrayList, eVar, c0694d, (byte) 0);
                this.f7221g = numX49.tnTj78("bueA");
                this.h = 4096;
                break;
            default:
                kotlin.jvm.internal.j.h(arrayList, numX49.tnTj78("bueG"));
                kotlin.jvm.internal.j.h(eVar, numX49.tnTj78("bue3"));
                this.f7221g = numX49.tnTj78("buey");
                this.h = 16384;
                break;
        }
    }
}
