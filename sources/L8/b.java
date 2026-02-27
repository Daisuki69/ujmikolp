package L8;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.utility.C1219h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f2854b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(c cVar, int i) {
        this.f2853a = i;
        this.f2854b = (Fragment) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v14, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v18, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v2, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v22, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v26, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v6, types: [L8.c, androidx.fragment.app.Fragment] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1219h event = (C1219h) obj;
        switch (this.f2853a) {
            case 0:
                j.g(event, "event");
                ?? r02 = this.f2854b;
                r02.J().c((FragmentActivity) r02.Q(), event);
                break;
            case 1:
                j.g(event, "event");
                ?? r03 = this.f2854b;
                r03.J().c((FragmentActivity) r03.Q(), event);
                break;
            case 2:
                j.g(event, "event");
                ?? r04 = this.f2854b;
                r04.J().c((FragmentActivity) r04.Q(), event);
                break;
            case 3:
                j.g(event, "event");
                ?? r05 = this.f2854b;
                r05.J().c((FragmentActivity) r05.Q(), event);
                break;
            case 4:
                j.g(event, "event");
                ?? r06 = this.f2854b;
                r06.J().c((FragmentActivity) r06.Q(), event);
                break;
            case 5:
                j.g(event, "event");
                ?? r07 = this.f2854b;
                r07.J().c((FragmentActivity) r07.Q(), event);
                break;
            default:
                j.g(event, "event");
                ?? r08 = this.f2854b;
                r08.J().c((FragmentActivity) r08.Q(), event);
                break;
        }
        return Unit.f18162a;
    }
}
