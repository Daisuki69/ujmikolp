package Nh;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Runnable runnable) {
        super(runnable);
        this.f4474a = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0020, code lost:
    
        r1.m();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r3 = this;
            int r0 = r3.f4474a
            switch(r0) {
                case 1: goto L26;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.run()
            return
        L9:
            java.lang.Class<of.d> r0 = of.d.class
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L9
            of.d r1 = of.d.j()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L9
        L14:
            r1 = move-exception
            goto L24
        L16:
            of.d r2 = of.d.j     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto L1f
            r1 = 0
            of.d.j = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r1.m()     // Catch: java.lang.InterruptedException -> L9
            goto L9
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.InterruptedException -> L9
        L26:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.m.run():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f4474a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str) {
        super(str);
        this.f4474a = 2;
    }
}
