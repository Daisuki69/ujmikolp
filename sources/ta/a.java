package Ta;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.f5817a = i6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 Zj.a, still in use, count: 2, list:
          (r3v3 Zj.a) from 0x0184: MOVE (r15v0 Zj.a) = (r3v3 Zj.a) (LINE:389)
          (r3v3 Zj.a) from 0x017c: MOVE (r15v3 Zj.a) = (r3v3 Zj.a) (LINE:381)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ta.a.invoke():java.lang.Object");
    }
}
