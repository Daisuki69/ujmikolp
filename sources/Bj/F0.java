package Bj;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f588a = new ThreadLocal();

    public static AbstractC0138e0 a() {
        ThreadLocal threadLocal = f588a;
        AbstractC0138e0 abstractC0138e0 = (AbstractC0138e0) threadLocal.get();
        if (abstractC0138e0 != null) {
            return abstractC0138e0;
        }
        C0141g c0141g = new C0141g(Thread.currentThread());
        threadLocal.set(c0141g);
        return c0141g;
    }
}
