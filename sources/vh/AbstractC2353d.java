package vh;

import com.dynatrace.android.agent.Global;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: vh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2353d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Qh.d f20501a = new Qh.d("No further exceptions", 2);

    public static boolean a(AtomicReference atomicReference, Throwable th2) {
        while (true) {
            Throwable th3 = (Throwable) atomicReference.get();
            if (th3 == f20501a) {
                return false;
            }
            Throwable compositeException = th3 == null ? th2 : new CompositeException(th3, th2);
            while (!atomicReference.compareAndSet(th3, compositeException)) {
                if (atomicReference.get() != th3) {
                    break;
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th2 = (Throwable) atomicReference.get();
        Qh.d dVar = f20501a;
        return th2 != dVar ? (Throwable) atomicReference.getAndSet(dVar) : th2;
    }

    public static String c(long j, TimeUnit timeUnit) {
        StringBuilder sbS = androidx.camera.core.impl.a.s(j, "The source did not signal an event for ", Global.BLANK);
        sbS.append(timeUnit.toString().toLowerCase());
        sbS.append(" and has been terminated.");
        return sbS.toString();
    }

    public static RuntimeException d(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
