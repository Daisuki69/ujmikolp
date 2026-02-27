package Qh;

import com.dynatrace.android.agent.Global;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f5385a = new d("No further exceptions", 0);

    public static boolean a(AtomicReference atomicReference, Throwable th2) {
        while (true) {
            Throwable th3 = (Throwable) atomicReference.get();
            if (th3 == f5385a) {
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

    public static NullPointerException b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static Throwable c(AtomicReference atomicReference) {
        Throwable th2 = (Throwable) atomicReference.get();
        d dVar = f5385a;
        return th2 != dVar ? (Throwable) atomicReference.getAndSet(dVar) : th2;
    }

    public static String d(long j, TimeUnit timeUnit) {
        StringBuilder sbS = androidx.camera.core.impl.a.s(j, "The source did not signal an event for ", Global.BLANK);
        sbS.append(timeUnit.toString().toLowerCase());
        sbS.append(" and has been terminated.");
        return sbS.toString();
    }

    public static RuntimeException e(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
