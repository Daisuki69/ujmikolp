package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProcessingNode f7524b;
    public final /* synthetic */ ProcessingNode.InputPacket c;

    public /* synthetic */ f(ProcessingNode processingNode, ProcessingNode.InputPacket inputPacket, int i) {
        this.f7523a = i;
        this.f7524b = processingNode;
        this.c = inputPacket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7523a) {
            case 0:
                this.f7524b.lambda$transform$2(this.c);
                break;
            default:
                this.f7524b.lambda$transform$0(this.c);
                break;
        }
    }
}
