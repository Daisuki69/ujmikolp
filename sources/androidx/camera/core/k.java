package androidx.camera.core;

import androidx.camera.core.impl.SessionConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements SessionConfig.ErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UseCase f7562b;

    public /* synthetic */ k(UseCase useCase, int i) {
        this.f7561a = i;
        this.f7562b = useCase;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        switch (this.f7561a) {
            case 0:
                ((ImageAnalysis) this.f7562b).lambda$createPipeline$2(sessionConfig, sessionError);
                break;
            case 1:
                ((ImageCapture) this.f7562b).lambda$createPipeline$3(sessionConfig, sessionError);
                break;
            default:
                ((Preview) this.f7562b).lambda$addCameraSurfaceAndErrorListener$1(sessionConfig, sessionError);
                break;
        }
    }
}
