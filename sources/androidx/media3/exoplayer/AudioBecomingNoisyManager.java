package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes.dex */
final class AudioBecomingNoisyManager {
    private final Context context;
    private final AudioBecomingNoisyReceiver receiver;
    private boolean receiverRegistered;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        private final Handler eventHandler;
        private final EventListener listener;

        public AudioBecomingNoisyReceiver(Handler handler, EventListener eventListener) {
            this.eventHandler = handler;
            this.listener = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.receiverRegistered) {
                this.listener.onAudioBecomingNoisy();
            }
        }
    }

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.context = context.getApplicationContext();
        this.receiver = new AudioBecomingNoisyReceiver(handler, eventListener);
    }

    public void setEnabled(boolean z4) {
        if (z4 && !this.receiverRegistered) {
            ht2aO8.registerReceiver(this.context, this.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.receiverRegistered = true;
        } else {
            if (z4 || !this.receiverRegistered) {
                return;
            }
            ht2aO8.unregisterReceiver(this.context, this.receiver);
            this.receiverRegistered = false;
        }
    }
}
