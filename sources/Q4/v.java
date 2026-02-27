package Q4;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f5255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5255a = wVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new v(this.f5255a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167 A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:26:0x00b2, B:28:0x00c0, B:32:0x00c7, B:34:0x00cd, B:36:0x00de, B:39:0x00e6, B:42:0x00ee, B:43:0x00f4, B:45:0x00fa, B:47:0x0108, B:49:0x0119, B:51:0x011f, B:55:0x0127, B:58:0x012f, B:77:0x0161, B:79:0x0167, B:83:0x0179, B:85:0x0180, B:87:0x0186, B:89:0x018c, B:92:0x0197, B:94:0x01a0, B:76:0x015b, B:95:0x01b5, B:97:0x01bb, B:98:0x01ca), top: B:141:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:26:0x00b2, B:28:0x00c0, B:32:0x00c7, B:34:0x00cd, B:36:0x00de, B:39:0x00e6, B:42:0x00ee, B:43:0x00f4, B:45:0x00fa, B:47:0x0108, B:49:0x0119, B:51:0x011f, B:55:0x0127, B:58:0x012f, B:77:0x0161, B:79:0x0167, B:83:0x0179, B:85:0x0180, B:87:0x0186, B:89:0x018c, B:92:0x0197, B:94:0x01a0, B:76:0x015b, B:95:0x01b5, B:97:0x01bb, B:98:0x01ca), top: B:141:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197 A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:26:0x00b2, B:28:0x00c0, B:32:0x00c7, B:34:0x00cd, B:36:0x00de, B:39:0x00e6, B:42:0x00ee, B:43:0x00f4, B:45:0x00fa, B:47:0x0108, B:49:0x0119, B:51:0x011f, B:55:0x0127, B:58:0x012f, B:77:0x0161, B:79:0x0167, B:83:0x0179, B:85:0x0180, B:87:0x0186, B:89:0x018c, B:92:0x0197, B:94:0x01a0, B:76:0x015b, B:95:0x01b5, B:97:0x01bb, B:98:0x01ca), top: B:141:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
