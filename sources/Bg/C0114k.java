package Bg;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Bg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0114k extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Kg.c f538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f539b;
    public int c;
    public /* synthetic */ Object e;

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C0114k c0114k = new C0114k(2, interfaceC1526a);
        c0114k.e = obj;
        return c0114k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0114k) create((Kg.c) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|56|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(2:51|52)(3:21|(1:24)|28)))|25|54|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        r0 = r1;
        r3 = r4;
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.C0114k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
