package Ag;

import Bj.C0151l;
import Bj.W;
import Bj.o0;
import bj.C1037h;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309b;

    public /* synthetic */ q(Object obj, int i) {
        this.f308a = i;
        this.f309b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f309b;
        switch (this.f308a) {
            case 0:
                ((Call) obj2).cancel();
                break;
            case 1:
                C1037h.a aVar = C1037h.f9166b;
                Unit unit = Unit.f18162a;
                ((C0151l) obj2).resumeWith(unit);
                break;
            case 2:
                ((W) obj2).dispose();
                break;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((o0) obj2).C(new CancellationException(th2.getMessage()));
                }
                break;
        }
        return Unit.f18162a;
    }
}
