package b3;

import com.dynatrace.agent.events.enrichment.EventKeys;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: renamed from: b3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0884e implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0884e f8447a = new C0884e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2294b f8448b = C2294b.c(EventKeys.PERFORMANCE);
    public static final C2294b c = C2294b.c("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2294b f8449d = C2294b.c("sessionSamplingRate");

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        C0890k c0890k = (C0890k) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(f8448b, c0890k.f8480a);
        interfaceC2296d.add(c, c0890k.f8481b);
        interfaceC2296d.add(f8449d, c0890k.c);
    }
}
