package S1;

import c2.ExecutorC1068k;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import ki.InterfaceC1782c;
import ng.C1946a;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5629b;
    public final Object c;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f5628a = i;
        this.f5629b = obj;
        this.c = obj2;
    }

    private final void a() {
        P0.f fVar = ((P0.k) this.c).f4976a;
        S0.b bVar = (S0.b) this.f5629b;
        if (fVar.f4936b0 == 2) {
            fVar.f4936b0 = 3;
            Ci.b bVar2 = fVar.f4944q;
            int i = fVar.f4938g.c;
            L l6 = (L) bVar2.f786d;
            if (l6 != null) {
                HashMap map = new HashMap();
                map.put("pages", Integer.valueOf(i));
                ((C1946a) l6.f11367b).f18730b.a("onRender", map, null);
            }
        }
        if (bVar.f5595d) {
            com.google.firebase.messaging.r rVar = fVar.f4937d;
            synchronized (((ArrayList) rVar.f9804d)) {
                while (((ArrayList) rVar.f9804d).size() >= 8) {
                    try {
                        ((S0.b) ((ArrayList) rVar.f9804d).remove(0)).f5594b.recycle();
                    } finally {
                    }
                }
                ArrayList arrayList = (ArrayList) rVar.f9804d;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(bVar);
                        break;
                    } else if (((S0.b) it.next()).equals(bVar)) {
                        bVar.f5594b.recycle();
                        break;
                    }
                }
            }
        } else {
            fVar.f4937d.l(bVar);
        }
        fVar.invalidate();
    }

    private final void b() {
        try {
            c();
        } catch (Error e) {
            synchronized (((ExecutorC1068k) this.c).f9271b) {
                ((ExecutorC1068k) this.c).c = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f5629b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        c2.ExecutorC1068k.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f5629b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f5629b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            c2.k r2 = (c2.ExecutorC1068k) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f9271b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            c2.k r0 = (c2.ExecutorC1068k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f9272d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f9272d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            c2.k r4 = (c2.ExecutorC1068k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f9271b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f5629b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            c2.k r0 = (c2.ExecutorC1068k) r0     // Catch: java.lang.Throwable -> L20
            r0.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f5629b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f5629b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = c2.ExecutorC1068k.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f5629b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f5629b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.v.c():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:308:0x08ce  */
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
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.v.run():void");
    }

    public String toString() {
        switch (this.f5628a) {
            case 0:
                Cg.c cVar = new Cg.c(v.class.getSimpleName(), 17);
                Lh.c cVar2 = new Lh.c(8);
                ((Lh.c) cVar.f769d).c = cVar2;
                cVar.f769d = cVar2;
                cVar2.f2990b = (u) this.c;
                return cVar.toString();
            case 23:
                Runnable runnable = (Runnable) this.f5629b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ExecutorC1068k) this.c).c;
                sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(int i, Object obj, Object obj2, boolean z4) {
        this.f5628a = i;
        this.c = obj;
        this.f5629b = obj2;
    }

    public v(MayaCarousel mayaCarousel, MayaCashInFragment mayaCashInFragment, MayaCarousel mayaCarousel2) {
        this.f5628a = 9;
        this.f5629b = mayaCashInFragment;
        this.c = mayaCarousel2;
    }

    public v(RuleBasedSegmentDao ruleBasedSegmentDao, Ji.a aVar) {
        this.f5628a = 12;
        Objects.requireNonNull(ruleBasedSegmentDao);
        this.f5629b = ruleBasedSegmentDao;
        Objects.requireNonNull(aVar);
        this.c = aVar;
    }

    public v(InterfaceC1782c interfaceC1782c, ki.e eVar) {
        this.f5628a = 26;
        Objects.requireNonNull(interfaceC1782c);
        this.f5629b = interfaceC1782c;
        this.c = new WeakReference(eVar);
    }

    public v(zi.c cVar, A3.i iVar) {
        this.f5628a = 25;
        Objects.requireNonNull(cVar);
        this.f5629b = cVar;
        this.c = iVar;
    }

    public v(ExecutorC1068k executorC1068k) {
        this.f5628a = 23;
        this.c = executorC1068k;
    }
}
