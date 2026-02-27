package Cg;

import bj.InterfaceC1031b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg.c f764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f765b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A5.j f766d;

    public b(Rg.a key, wg.c client, Object pluginConfig) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(client, "client");
        kotlin.jvm.internal.j.g(pluginConfig, "pluginConfig");
        this.f764a = client;
        this.f765b = pluginConfig;
        this.c = new ArrayList();
        this.f766d = new A5.j(2);
    }

    public final void a(a hook, InterfaceC1031b interfaceC1031b) {
        kotlin.jvm.internal.j.g(hook, "hook");
        this.c.add(new e(hook, interfaceC1031b));
    }
}
