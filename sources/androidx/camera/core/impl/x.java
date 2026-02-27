package androidx.camera.core.impl;

import androidx.camera.core.impl.UseCaseAttachState;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements UseCaseAttachState.AttachStateFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7556a;

    public /* synthetic */ x(int i) {
        this.f7556a = i;
    }

    @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
    public final boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        switch (this.f7556a) {
            case 0:
                return useCaseAttachInfo.getAttached();
            case 1:
                return useCaseAttachInfo.getAttached();
            case 2:
                return useCaseAttachInfo.getAttached();
            default:
                return UseCaseAttachState.lambda$getActiveAndAttachedSessionConfigs$3(useCaseAttachInfo);
        }
    }
}
