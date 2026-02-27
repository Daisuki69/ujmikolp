package R2;

import U2.i;
import com.google.firebase.perf.session.gauges.GaugeManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GaugeManager f5440b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f5441d;

    public /* synthetic */ c(GaugeManager gaugeManager, String str, i iVar, int i) {
        this.f5439a = i;
        this.f5440b = gaugeManager;
        this.c = str;
        this.f5441d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5439a) {
            case 0:
                this.f5440b.lambda$stopCollectingGauges$3(this.c, this.f5441d);
                break;
            default:
                this.f5440b.lambda$startCollectingGauges$2(this.c, this.f5441d);
                break;
        }
    }
}
