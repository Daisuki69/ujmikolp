package ef;

import java.util.Locale;

/* JADX INFO: renamed from: ef.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC1438a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16660a;

    public AbstractRunnableC1438a(String str, Object... objArr) {
        byte[] bArr = c.f16663a;
        this.f16660a = String.format(Locale.US, str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f16660a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
