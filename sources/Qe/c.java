package Qe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f5358b;

    public /* synthetic */ c(d dVar, int i) {
        this.f5357a = i;
        this.f5358b = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d dVar = this.f5358b;
        switch (this.f5357a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    dVar.e("onBecomingNoisy", new Object[0]);
                }
                break;
            default:
                dVar.e("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                break;
        }
    }
}
