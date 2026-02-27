package Vg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.D;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M5.d f6107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1955a f6108b;
    public List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6109d;

    public c(M5.d phase, AbstractC1955a abstractC1955a) {
        kotlin.jvm.internal.j.g(phase, "phase");
        ArrayList arrayList = e;
        kotlin.jvm.internal.j.e(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        List interceptors = D.b(arrayList);
        kotlin.jvm.internal.j.g(interceptors, "interceptors");
        this.f6107a = phase;
        this.f6108b = abstractC1955a;
        this.c = interceptors;
        this.f6109d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final String toString() {
        return "Phase `" + this.f6107a.f3085b + "`, " + this.c.size() + " handlers";
    }
}
