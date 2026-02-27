package B9;

import H9.f;
import We.InterfaceC0604h;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements InterfaceC0604h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f385a;

    public e(f fVar, com.paymaya.data.preference.a mPreference) {
        j.g(mPreference, "mPreference");
        this.f385a = fVar;
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception exc) {
        this.f385a.f2160k.setVisibility(8);
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        this.f385a.f2160k.setVisibility(0);
    }

    public e(f fVar) {
        this.f385a = fVar;
    }
}
