package Lg;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2982a = new d(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f2983b = new d(9);
    public static final d c = new d(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f2984d = new d(9);
    public static final d e = new d(9);

    public static final Throwable a(Throwable th2) {
        j.g(th2, "<this>");
        Throwable cause = th2;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (j.b(cause, cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th2;
    }
}
