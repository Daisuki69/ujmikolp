package Rg;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5534b;
    public /* synthetic */ Object c;
    public final /* synthetic */ io.ktor.utils.io.n e;
    public final /* synthetic */ io.ktor.utils.io.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.k f5535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(io.ktor.utils.io.n nVar, io.ktor.utils.io.k kVar, io.ktor.utils.io.k kVar2, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.e = nVar;
        this.f = kVar;
        this.f5535g = kVar2;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        f fVar = new f(this.e, this.f, this.f5535g, interfaceC1526a);
        fVar.c = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (Bj.H.h(r14, r13) == r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:21:0x0049, B:23:0x004f, B:27:0x0060, B:29:0x0068, B:33:0x0098, B:37:0x00aa, B:14:0x002e), top: B:47:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:21:0x0049, B:23:0x004f, B:27:0x0060, B:29:0x0068, B:33:0x0098, B:37:0x00aa, B:14:0x002e), top: B:47:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:21:0x0049, B:23:0x004f, B:27:0x0060, B:29:0x0068, B:33:0x0098, B:37:0x00aa, B:14:0x002e), top: B:47:0x000c }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v5, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0066 -> B:32:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0093 -> B:32:0x0096). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rg.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
