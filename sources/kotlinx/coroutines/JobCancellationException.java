package kotlinx.coroutines;

import Bj.InterfaceC0164w;
import Bj.u0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class JobCancellationException extends CancellationException implements InterfaceC0164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient u0 f18211a;

    public JobCancellationException(String str, Throwable th2, u0 u0Var) {
        super(str);
        this.f18211a = u0Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // Bj.InterfaceC0164w
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return j.b(jobCancellationException.getMessage(), getMessage()) && j.b(jobCancellationException.f18211a, this.f18211a) && j.b(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        j.d(message);
        int iHashCode = (this.f18211a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f18211a;
    }
}
