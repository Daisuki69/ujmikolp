package D;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC0169b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0171d f897b;

    public /* synthetic */ CallableC0169b(C0171d c0171d, int i) {
        this.f896a = i;
        this.f897b = c0171d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f896a) {
            case 0:
                String strTnTj78 = numX49.tnTj78("Peke");
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                C0171d c0171d = this.f897b;
                B b8 = c0171d.e;
                CleverTapInstanceConfig cleverTapInstanceConfig = c0171d.c;
                if (b8.f > 0) {
                    try {
                        b0.k(c0171d.f904d, iCurrentTimeMillis, b0.n(cleverTapInstanceConfig, "sexe"));
                        S sC = cleverTapInstanceConfig.c();
                        sC.getClass();
                        S.s(cleverTapInstanceConfig.f9439a, strTnTj78 + iCurrentTimeMillis);
                    } catch (Throwable th2) {
                        S sC2 = cleverTapInstanceConfig.c();
                        String str = cleverTapInstanceConfig.f9439a;
                        String str2 = numX49.tnTj78("Pek8") + th2.getMessage();
                        sC2.getClass();
                        S.s(str, str2);
                        return null;
                    }
                }
                break;
            default:
                C0171d c0171d2 = this.f897b;
                B b10 = c0171d2.e;
                if (!b10.f804k && b10.j) {
                    C0171d.a(c0171d2);
                    break;
                }
                break;
        }
        return null;
    }
}
